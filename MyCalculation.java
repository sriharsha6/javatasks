class Calculation
	{
	void add()
		{
		System.out.println("addition");
		}
		}	
		class Maths extends Calculation
		{
		void sub()
		{
		System.out.println("subtraction");
		}
		}
		class MyCalculation
		{
		public static void main(String args[])
		{
		Maths m=new Maths();
		m.sub();
		m.add();
		}
	}