package com.yc.java.d1226.�ܾ�����Ϸ;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	Person p=new Person();
		p.name="�ܾ�";
		p.age=20;
		p.gender="��";
		p.show();
		ְҵ s=new ְҵ();
		s.liliang=20;
		s.minjie=20;
		s.zhili=10;
		s.naili=10;
		/**
		 * תְ����
		 */
		Scanner h=new Scanner(System.in);
		while(true) {
		if(s.liliang>=10 && s.zhili>=10 && s.minjie>=10 && s.naili>=10) {
			 if(s.zhili>=16 && s.liliang>=16 && s.minjie>=16) {
				 System.out.println(p.name+"���������תְ��ʦ��սʿ��������������ѡ��1 ��ʦ��2սʿ,3������");
				 int a=h.nextInt();
				 if(a==1) {
					 ��ʦ b=new ��ʦ();
					 b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p);
					 break;
				 }if(a==2) {
					 սʿ b=new սʿ();
					 b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p);
					 break;
				 }if(a==3) {
					 ���� b=new ����();
					 b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p);
					 break;
				 }
			}else if(s.liliang>=16 &&s.zhili>=16) {
				System.out.println(p.name+"���������תְ��ʦ��սʿ��������ѡ��1 ��ʦ��2սʿ��");
				int a=h.nextInt();
				 if(a==2) {
					 սʿ b=new սʿ();
					 b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p);
					 break;
				 }if(a==1) {
					 ��ʦ b=new ��ʦ();
					 b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p); 
					 break;
				 }
			}else if(s.liliang>=16 && s.minjie>=16 ) {
				System.out.println(p.name+"���������תְ������սʿ��������ѡ��1 ������2սʿ��");
				int a=h.nextInt();
				if(a==2) {
					 սʿ b=new սʿ();
					 b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p);
					 break;
				 }if(a==1) {
					 ���� b=new ����();
					 b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p);
					 break;
				 }
			}else if(s.minjie>=16&&s.zhili>=16) {
				System.out.println(p.name+"���������תְ�����ͷ�ʦ��������ѡ��1 ������2��ʦ��");
				int a=h.nextInt();
				if(a==2) {
					��ʦ b=new ��ʦ();
					b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p); 
					 break;
				 }if(a==1) {
					 ���� b=new ����();
					 b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p);
					 break;
				 }
			}else if(s.minjie>=16) {
				System.out.println(p.name+"���������תְ����������ѡ��1 ȷ����");
				int a=h.nextInt();
				if(a==1) {
					 ���� b=new ����();
					 b.liliang=s.liliang;
					 b.minjie=s.minjie;
					 b.zhili=s.zhili;
					 b.naili=s.naili;
					 b.choose(p);
					 break;
				 }
		}else if(s.liliang>=16) {
			System.out.println(p.name+"���������תְսʿ������ѡ��1 ȷ����");
			int a=h.nextInt();
			if(a==1) {
				 սʿ b=new սʿ();
				 b.liliang=s.liliang;
				 b.minjie=s.minjie;
				 b.zhili=s.zhili;
				 b.naili=s.naili;
				 b.choose(p);
				 break;
			 }
		}else if(s.zhili>=16) {
			System.out.println(p.name+"���������תְ��ʦ������ѡ��1 ȷ����");
			int a=h.nextInt();
			if(a==1) {
				��ʦ b=new ��ʦ();
				b.liliang=s.liliang;
				 b.minjie=s.minjie;
				 b.zhili=s.zhili;
				 b.naili=s.naili;
				 b.choose(p); 
				 break;
			 }
		}	 
		}
		}
		/**
		 * ��������
		 */
		b:while(true) {
		System.out.println("ѡ������1��������2�ڶ���תְ����");
		int j=h.nextInt();
		if(j==1) {
		while(true) {
		System.out.println("��ѡ����ս����1����ɽ��2����3���֣�4ɳĮ");
		int a=h.nextInt();
		System.out.println();
		while(true) {
		if(a==1) {
			System.out.println("���ѽ������ɽ��");
			System.out.println("ǰ�����ֻ����ѡ���Ƿ���ս��5������6����");
		    int b=h.nextInt();
		    if(b==5) {
			    System.out.println("���ѻ�ɱ�����");
			    s.liliang+=2;s.zhili++;s.naili++;s.minjie++;
			    System.out.println("�Ƿ�������룺1������2�س�");
			    int c=h.nextInt();if(c==1) {
			    	for(int i=0;i<=9;i++) {
			    		System.out.println("ǰ�����ֻ����ѡ����ս��5����");
			    		if(b==5) {
			    			System.out.println("���ѻ�ɱ�����");
						    s.liliang+=2;s.zhili++;s.naili++;s.minjie++;
			    		}
			    	}
			    	System.out.println("ǰ�����ֻ������ѡ����ս��5����");
			    	System.out.println("���ѻ�ɱ�������");
				    s.liliang+=10;s.zhili+=3;s.naili+=3;s.minjie+=3;
				    continue b;
			    }if(c==2) {continue b;}
			    
			    
		 }if(b==6) {
			  System.out.println("���ܳɹ���");
			  continue b;
		  }
		} if(a==2) {
			System.out.println("���ѽ������ɽ��");
			System.out.println("ǰ�����ּ���ѡ���Ƿ���ս��5������6����");
			int b=h.nextInt();
			  if(b==5) {
				  System.out.println("���ѻ�ɱ���ܣ�");
				  s.liliang++;s.zhili+=2;s.naili++;s.minjie++;
				  System.out.println("�Ƿ�������룺1������2�س�");
				    int c=h.nextInt();if(c==1) {
				    	for(int i=0;i<=9;i++) {
				    		System.out.println("ǰ�����ּ���ѡ����ս��5����");
				    		if(b==5) {
				    			System.out.println("���ѻ�ɱ����");
							    s.liliang++;s.zhili+=2;s.naili++;s.minjie++;
				    		}
				    	}
				    	System.out.println("ǰ�����ּ�����ѡ����ս��5����");
				    	System.out.println("���ѻ�ɱ������");
					    s.liliang+=3;s.zhili+=10;s.naili+=3;s.minjie+=3;
					    continue b;
				    }if(c==2) {continue b;}
			  }if(b==6) {
				  System.out.println("���ܳɹ���");
				  continue b;
			  }
		} if(a==3) {
			System.out.println("���ѽ������֣�");
			System.out.println("ǰ��������Ҷ��ѡ���Ƿ���ս��5������6����");
			int b=h.nextInt();
			  if(b==5) {
				  System.out.println("���ѻ�ɱ��Ҷ��");
				  s.liliang++;s.zhili++;s.naili++;s.minjie+=2;
				  System.out.println("�Ƿ�������룺1������2�س�");
				    int c=h.nextInt();if(c==1) {
				    	for(int i=0;i<=9;i++) {
				    		System.out.println("ǰ��������Ҷ��ѡ����ս��5����");
				    		if(b==5) {
				    			System.out.println("���ѻ�ɱ��Ҷ��");
							    s.liliang++;s.zhili++;s.naili++;s.minjie+=2;
				    		}
				    	}
				    	System.out.println("ǰ��������Ҷ����ѡ����ս��5����");
				    	System.out.println("���ѻ�ɱ��Ҷ����");
					    s.liliang+=3;s.zhili+=3;s.naili+=3;s.minjie+=10;
					    continue b;
				    }if(c==2) {continue b;}
			  }if(b==6) {
				  System.out.println("���ܳɹ���");
				  continue b;
			  }
		} if(a==4) {
			System.out.println("���ѽ���ɳĮ��");
			System.out.println("ǰ������ɳЫѡ���Ƿ���ս��5������6����");
			int b=h.nextInt();
			  if(b==5) {
				  System.out.println("���ѻ�ɱɳЫ");
				  s.liliang++;s.zhili++;s.naili+=2;s.minjie++;
				  System.out.println("�Ƿ�������룺1������2�س�");
				    int c=h.nextInt();if(c==1) {
				    	for(int i=0;i<=9;i++) {
				    		System.out.println("ǰ������ɳЫѡ����ս��5����");
				    		if(b==5) {
				    			System.out.println("���ѻ�ɱɳЫ");
							    s.liliang+=2;s.zhili++;s.naili++;s.minjie++;
				    		}
				    	}
				    	System.out.println("ǰ������ɳЫ��ѡ����ս��5����");
				    	System.out.println("���ѻ�ɱɳЫ��");
					    s.liliang+=10;s.zhili+=3;s.naili+=3;s.minjie+=3;
					    continue b;
				    }if(c==2) {continue b;}
			  }if(b==6) {
				  System.out.println("���ܳɹ���");
				  continue b;
			  }
		}}}
		}
		/**
		 * �ڶ���תְ
		 */
		if(j==2) {
			System.out.println("���ѽ���ڶ���תְ����");
			System.out.println("�������"+s.zhili);
		    System.out.println("�������"+s.liliang);
		    System.out.println("�������"+s.minjie);
		    System.out.println("�������"+s.naili);
		    if(s.liliang>=24 && s.zhili>=24 && s.minjie>=24 && s.naili>=24) {
		    	if(s.liliang>50) {
		    		System.out.println("ѡ����Ķ�תְҵ��1��սʿ��2ʥ��ʿ��3��ʥ");
		    		int g=h.nextInt();
		    		if(g==1) {
		    			��սʿ p1=new ��սʿ();
		    			p1.liliang=s.liliang;
						 p1.minjie=s.minjie;
						 p1.zhili=s.zhili;
						 p1.naili=s.naili;
						 p1.choose();
						 break;
		    		}if(g==2) {
		    			ʥ��ʿ p1=new ʥ��ʿ();
		    			p1.liliang=s.liliang;
						 p1.minjie=s.minjie;
						 p1.zhili=s.zhili;
						 p1.naili=s.naili;
						 p1.choose();
						 break;
		    		}if(g==3) {
		    			��ʥ p1=new ��ʥ();
		    			p1.liliang=s.liliang;
						 p1.minjie=s.minjie;
						 p1.zhili=s.zhili;
						 p1.naili=s.naili;
						 p1.choose();
						 break;
		    		}
		    	}else if(s.zhili>50) {
		    		System.out.println("ѡ����Ķ�תְҵ��1�ٻ�ʦ��2��ʦ��3��ʦ");
		    		int g=h.nextInt();
		    		if(g==1) {
		    			�ٻ�ʦ p1=new �ٻ�ʦ();
		    			p1.liliang=s.liliang;
						 p1.minjie=s.minjie;
						 p1.zhili=s.zhili;
						 p1.naili=s.naili;
						 p1.choose();
						 break;
		    		}if(g==2) {
		    			��ʦ p1=new ��ʦ();
		    			p1.liliang=s.liliang;
						 p1.minjie=s.minjie;
						 p1.zhili=s.zhili;
						 p1.naili=s.naili;
						 p1.choose();
						 break;
		    		}if(g==3) {
		    			��ʦ p1=new ��ʦ();
		    			p1.liliang=s.liliang;
						 p1.minjie=s.minjie;
						 p1.zhili=s.zhili;
						 p1.naili=s.naili;
						 p1.choose();
						 break;
		    		}
		    		
		    	}else if(s.minjie>50) {
		    		System.out.println("ѡ����Ķ�תְҵ��1������2����֣�3��ɮ");
		    		int g=h.nextInt();
		    		if(g==1) {
		    			���� p1=new ����();
		    			p1.liliang=s.liliang;
						 p1.minjie=s.minjie;
						 p1.zhili=s.zhili;
						 p1.naili=s.naili;
						 p1.choose();
						 break;
		    		}if(g==2) {
		    			����� p1=new �����();
		    			p1.liliang=s.liliang;
						 p1.minjie=s.minjie;
						 p1.zhili=s.zhili;
						 p1.naili=s.naili;
						 p1.choose();
						 break;
		    		}if(g==3) {
		    			��ɮ p1=new ��ɮ();
		    			p1.liliang=s.liliang;
						 p1.minjie=s.minjie;
						 p1.zhili=s.zhili;
						 p1.naili=s.naili;
						 p1.choose();
						 break;
		    		}
		    	}
		    }else {
		    	System.out.println("��û�ﵽתְҪ��");
		    	continue b;
		    }
		}
		
		}
		
    }
}

