class Calculation
	{
	void add()
		{
		System.out.println("addition");
		}
		}	
		class M1 extends Calculation
		{
		void sub()
		{
		System.out.println("subtraction");
		}
		}
		class M2 extends Calculation
		{
		void multi()
		{
		System.out.println("multiplication");
		}
		}
		class MyCalculation2
		{
		public static void main(String args[])
		{
			M2 m=new M2();
			m.multi();
			m.add();
			M1 m1=new M1();
			m1.sub();
			m1.add();
		}
	}