class Player
	{
		int id;
		String name;
		static String cricket="bcci";

		Player(int i,String n)
		{
			id=i;
			name=n;
		}  
		void display ()
		{
			System.out.println(id+" "+name+" "+cricket);
		}
			public static void main(String[] args)
		 {
			Player p1=new Player(7,"dhoni");
			Player p2=new Player(18,"kohli");
			p1.display();
			p2.display();

		}
	}
