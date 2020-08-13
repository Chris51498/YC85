package com.yc.spring.bank.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void save(int id, double money) {
		// ʡ�Բ���У��
		adao.update(id, money);

		int i = 1 / 0;

		odao.insert(id, money);
	}

	// ���� transfar �쳽
	public void transfer(int id1, int id2, double money) {
		save(id1, -money);
		save(id2, money);
	}

}
