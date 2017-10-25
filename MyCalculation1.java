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
		class M2 extends M1
		{
		void multi()
		{
		System.out.println("multiplication");
		}
		}
		class MyCalculation1
		{
		public static void main(String args[])
		{
		M2 m=new M2();
		m.multi();
		m.sub();
		m.add();
		}
	}