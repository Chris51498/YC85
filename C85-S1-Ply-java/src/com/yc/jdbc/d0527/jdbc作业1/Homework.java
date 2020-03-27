package ycjdbc0320;

import java.sql.*;
import java.util.Scanner;

import studentutil.IOhelp;

public class Homework {
	/**
	 * ������
	 */
	public void createtable() {
		Connection conn = null;
		Statement stat = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);
			stat = conn.createStatement();
			String sql = "create table porduct(productcode int primary key,pname varchar2(32),quantity int)";
			stat.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}
	}

	/**
	 * ��������
	 * 
	 * @param productcode
	 * @param pname
	 * @param quentity
	 */
	public void insertdate(int productcode, String pname, int quentity) {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "insert into porduct values(?,?,?)";
			stat = conn.prepareStatement(sql);
			stat.setInt(1, productcode);
			stat.setString(2, pname);
			stat.setInt(3, quentity);
			stat.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	/**
	 * �������
	 * 
	 * @param pname
	 */
	public void checkdate(String pname) {
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select * from porduct ";
			stat = conn.prepareStatement(sql);
			rs = stat.executeQuery();
			while (rs.next()) {
				int porductcode = rs.getInt("PRODUCTCODE");
				String name = rs.getString("PNAME");
				int quentity = rs.getInt("QUANTITY");
				if (pname.equals(name)) {
					System.out.println("�Ѵ��ڴ˲�Ʒ������Ĳ�Ʒ����");
					System.out.println("ԭ��������Ϊ" + quentity);
				} else {

				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	/**
	 * ɾ������
	 * 
	 * @param pname
	 */
	public void deletedate(int productcode) {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "delete  from porduct where productcode=? ";
			stat = conn.prepareStatement(sql);
			stat.setInt(1, productcode);
			stat.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	/**
	 * ���ݲ�Ʒ����ɾ����������
	 */
	public void deletesdate(String name1, String name2) {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "delete  from porduct where pname =? or pname=?";
			stat = conn.prepareStatement(sql);
			stat.setString(1, name1);
			stat.setString(2, name2);
			stat.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	/**
	 * ��������
	 */
	public void query() {
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select *  from porduct  ";
			stat = conn.prepareStatement(sql);
			rs = stat.executeQuery();
			while (rs.next()) {
				int porductcode = rs.getInt("PRODUCTCODE");
				String name = rs.getString("PNAME");
				int quentity = rs.getInt("QUANTITY");
				System.out.printf("��Ʒ��ţ�%s\t��Ʒ���ƣ�%s\t��Ʒ������%s\t\n", porductcode, name, quentity);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	/**
	 * ��������
	 * 
	 * @param pname
	 */
	public void querydate(String pname) {
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select *  from porduct where pname=? ";
			stat = conn.prepareStatement(sql);
			stat.setString(1, pname);
			rs = stat.executeQuery();
			while (rs.next()) {
				int porductcode = rs.getInt("PRODUCTCODE");
				String name = rs.getString("PNAME");
				int quentity = rs.getInt("QUANTITY");
				System.out.printf("��Ʒ��ţ�%s\t��Ʒ���ƣ�%s\t��Ʒ������%s\t\n", porductcode, name, quentity);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	/**
	 * �޸�����
	 * 
	 * @param pname
	 */
	public void update(int productcode, String pname, int quentity) {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);
			String sql = "update porduct set pname=?,quantity= ? where productcode=?";
			stat = conn.prepareStatement(sql);
			stat.setString(1, pname);
			stat.setInt(2, quentity);
			stat.setInt(3, productcode);
			stat.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	/**
	 * ��ҳ��ѯ select * from( select rownum as rn,productcode,pname,quantity from
	 * (select * from porduct) where rownum<=5) where rn>=1;
	 * 
	 * @param string
	 */
	public void selectdate(int max, int min) {
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from(\r\n" + "select rownum as rn,productcode,pname,quantity\r\n"
					+ "from (select * from porduct)\r\n" + "where rownum<=?)\r\n" + "where rn>=? ";
			stat = conn.prepareStatement(sql);
			stat.setInt(1, max);
			stat.setInt(2, min);
			rs = stat.executeQuery();
			while (rs.next()) {
				int rn = rs.getInt("RN");
				int porductcode = rs.getInt("PRODUCTCODE");
				String name = rs.getString("PNAME");
				int quentity = rs.getInt("QUANTITY");
				System.out.printf("RN:%s\t��Ʒ��ţ�%s\t��Ʒ���ƣ�%s\t��Ʒ������%s\t\n", rn, porductcode, name, quentity);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	/**
	 * ģ����ѯ
	 * 
	 * @param args
	 */

	public void querylikedate(String string) {
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select *  from porduct where pname like ? ";
			stat = conn.prepareStatement(sql);
			stat.setString(1, string);
			rs = stat.executeQuery();
			while (rs.next()) {
				int porductcode = rs.getInt("PRODUCTCODE");
				String name = rs.getString("PNAME");
				int quentity = rs.getInt("QUANTITY");
				System.out.printf("��Ʒ��ţ�%s\t��Ʒ���ƣ�%s\t��Ʒ������%s\t\n", porductcode, name, quentity);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	/**
	 * ���ݱ�ž�ȷ����
	 * 
	 * @param args
	 */
	public void querydate(int productcode) {
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "a";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select *  from porduct where productcode=? ";
			stat = conn.prepareStatement(sql);
			stat.setInt(1, productcode);
			rs = stat.executeQuery();
			while (rs.next()) {
				int porductcode = rs.getInt("PRODUCTCODE");
				String name = rs.getString("PNAME");
				int quentity = rs.getInt("QUANTITY");
				System.out.printf("��Ʒ��ţ�%s\t��Ʒ���ƣ�%s\t��Ʒ������%s\t\n", porductcode, name, quentity);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IOhelp.close(stat);
			IOhelp.close(conn);
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String pname = null;
		Homework h = new Homework();
		// h.createtable();
		for (int k=0;;k++) {
			System.out.println("�Ƿ�鿴���ݣ�Y/N");
			String cc = s.next();
			if (cc.equals("Y")) {
				h.query();
				for (int k1=0;;k1++) {
					System.out.println("��ɽ������²���:");
					System.out.println("1.����2.ɾ��3.��ҳ��ѯ4.����ɾ��5.��Ʒ����ѯ6.��Ʒ��Ų�ѯ7.�޸�8.ģ����ѯ9.�˳�");
					String c = s.next();
					if (c.equals("����")) {
						System.out.println("�������Ʒ��");
						pname = s.nextLine();
						h.checkdate(pname);
						System.out.println("�������Ʒ������");
						int quantity = s.nextInt();
						System.out.println("�������Ʒ���");
						int i = s.nextInt();
						h.insertdate(i, pname, quantity);
						System.out.println("����ɹ�");
					} else if (c.equals("ɾ��")) {
						System.out.println("��������Ҫɾ���Ĳ�Ʒ���");
						int a = s.nextInt();
						h.deletedate(a);
						System.out.println("ɾ���ɹ�");
					} else if (c.equals("��ҳ��ѯ")) {
						System.out.println("�������ҳ�������");
						int a1 = s.nextInt();
						System.out.println("�������ҳ����С���");
						int a2 = s.nextInt();
						h.selectdate(a1, a2);
					} else if (c.equals("����ɾ��")) {
						System.out.println("��������Ҫɾ���Ĳ�Ʒ����1");
						String s1 = s.next();
						System.out.println("��������Ҫɾ���Ĳ�Ʒ����2");
						String s2 = s.next();
						h.deletesdate(s1, s2);
						System.out.println("ɾ���ɹ�");
					} else if (c.equals("��Ʒ����ѯ")) {
						System.out.println("��������Ҫ���ҵĲ�Ʒ��");
						pname = s.nextLine();
						h.querydate(pname);
					} else if (c.equals("��Ʒ��Ų�ѯ")) {
						System.out.println("��������Ҫ���ҵĲ�Ʒ���");
						int a = s.nextInt();
						h.querydate(a);
					} else if (c.equals("�޸�")) {
						System.out.println("��������Ҫ�޸ĵĲ�Ʒ���");
						int num = s.nextInt();
						System.out.println("�޸Ĳ�Ʒ����Ϊ��");
						pname = s.next();
						System.out.println("�޸Ĳ�Ʒ����Ϊ��");
						int quantity = s.nextInt();
						h.update(num, pname, quantity);
						System.out.println("�޸ĳɹ�");
					} else if (c.equals("ģ����ѯ")) {
						System.out.println("��������Ҫ���ҵĲ�Ʒ��       ���磺ƻ_  ");
						pname = s.nextLine();
						h.querylikedate(pname);
					} else if (c.equals("�˳�")) {
						break;
					}

				}
			} else if (cc.equals("N")){
				break;
			}
		}

	}

}
