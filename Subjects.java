class Subjects
	{
		int id;
		String name;
		int book;
		Subjects(int i,String n)
		{
			id=i;
			name=n;
		}
			Subjects(int i,String n,int b)
			{
				id=i;
				name=n;
				book=b;
			}
			void display()
			{
				System.out.println(id+" "+name+" "+book);
			}
			public static void main(String[] args)
			{
				Subjects s1=new Subjects(1,"physics");
				Subjects s2=new Subjects(2,"maths",3);
				s1.display();
				s2.display();
			}

	}