package ycjdbc0323;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Demo2 {
	static Random random = new Random();

	static Calendar cal = Calendar.getInstance();
	static String s1;
	//static java.util.Date s2;
	 //java.sql.Timestamp 
		public static Timestamp createDate() {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			int month =random.nextInt(9);
			int day=random.nextInt(23);
			int year = random.nextInt(9);
			cal.setTime(new java.util.Date() );//���õ�ǰʱ��
			cal.add(Calendar.YEAR, -year);//�ı�ʱ��
			cal.add(Calendar.MONTH, month);
			cal.add(Calendar.DAY_OF_YEAR, day);
			java.util.Date s2=cal.getTime();//�ı���ʱ��
			long time=s2.getTime();//��ȡ�ı�ʱ���ĺ���ֵ
			java.sql.Timestamp d = new java.sql.Timestamp(time);//��ȡSQL����
			s1 = sdf.format(s2);
			return  d;

		}

}
