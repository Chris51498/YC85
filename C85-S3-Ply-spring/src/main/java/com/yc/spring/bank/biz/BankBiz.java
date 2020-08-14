package com.yc.spring.bank.biz;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.spring.bank.dao.AccountDao;
import com.yc.spring.bank.dao.OprecordDao;

/**
 *	����ҵ����
 *	����:		��Account�����һ����¼(����)
 *	��ȡ��:	�޸� Account �����(�޸�), ��¼��ˮ��(����)
 *	ת��	:	A �˺ż���(ȡ��), B�˺�����(���)
 *	��ѯ	: 	���ݿ��ò����
 */
@Service
@Transactional(rollbackFor = { IOException.class, SQLException.class})
public class BankBiz {

	@Autowired
	private AccountDao adao;
	// @Resource java1.5 û�и�ע��
	@Autowired
	private OprecordDao odao;

	// ����
	public void register(int id, String pwd, double money) {
		/**
		 * jdbcTemplate ÿ�� update ���� �������������
		 * try{
		 * 		ҵ�����  ==> �ص�
		 * 		�ύ����
		 * } catch (Exception e) {
		 * 		�ع�����
		 * } finally {
		 * 		�ر�����
		 * }
		 * 
		 * 
		 */
		// ʡ�Բ���У��
		adao.insert(id, pwd, money);
		odao.insert(id, money);
	}

	// ��ȡ��
	@Transactional(rollbackFor = { BizException.class})
	public void save(int id, double money) throws BizException {
		// ʡ�Բ���У��
		adao.update(id, money);

		/*try {*/
		if (money > 999) {
			throw new BizException("��ȡ����ܴ��� 999 !");
		}
		/*} catch (BizException e) {
			// ���ñ������쳣ת��Ϊ�������쳣
			throw new DataAccessResourceFailureException("�쳣ת��", e);
		}*/

		odao.insert(id, money);
	}

	// ���� transfar �쳽
	public void transfer(int id1, int id2, double money) throws BizException {
		save(id1, -money);
		save(id2, money);
	}

}
