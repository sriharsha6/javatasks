class Player1
	{
		int id;
		String name;
		static String cricket="bcci";

		static void change()
		{
		cricket="icc";
		}
		Player1(int i,String n)
		{
			id=i;
			name=n;
		}  
		void display ()
		{
			System.out.println(id+" "+name+" "+cricket);
		}
			public static void main(String args[])
		{
			Player1.change();
		 	Player1 p1=new Player1(7,"dhoni");
			Player1 p2=new Player1(18,"kohli");
			Player1 p3=new Player1(10,"tendulkar");
			p1.display();
			p2.display();
			p3.display();

		}
	}
