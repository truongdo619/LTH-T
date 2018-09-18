public class StudentManagement {
	private Student[] students = new Student[100];
	private static int size = 0;
	
	public void studentsByGroup()
	{
		boolean[] Checked = new boolean[size];
		for (int i=0;i<size;i++)
			if (!Checked[i])
			{
				separator();
				System.out.println("Danh sach sinh vien lop " + students[i].getGroup() + ":");
				for (int j=i;j<size;j++)
					if (sameGroup(students[i],students[j]))
					{
						System.out.println(students[j].getName() + " " +students[j].getId() + " " + students[j].getEmail() );
						Checked[j] = true;
					}
			}
	}
	
	public static boolean sameGroup(Student s1 , Student s2)
	{
		return s1.getGroup() == s2.getGroup();
	}
	
	private void removeStudent(String id)
	{
		for (int i=0;i<size;i++)
			if (students[i].getId() == id)
			{
				for (int j=i;j<size;j++)
					students[j] = students[j+1];
				size--;
				i--;
			}
	}
	
	public static void separator()
	{
		System.out.println("-------------------------------------");
	}
	
	public static void main(String[] args)
	{
		StudentManagement manage = new StudentManagement();
		
		Student student1 = new Student();
		System.out.println(student1.getInfo());
		separator();
		Student toi = new Student("Do Dinh Truong","17021090","17021090@vnu.edu.vn");
		System.out.println(toi.getInfo());
		separator();
		Student copy = new Student(toi);
		copy.setName("Do Dinh Duc");
		System.out.println(copy.getInfo());
		separator();
		Student studentNew = new Student("Tran Van A","17028190","17028190@vnu.edu.vn");
		studentNew.setGroup("INT22042");
		System.out.println(studentNew.getInfo());
		manage.students[size++] = student1;
		manage.students[size++] = toi;
		manage.students[size++] = copy;
		manage.students[size++] = studentNew;
		
		System.out.println(sameGroup(studentNew,toi));
		manage.removeStudent("000");
		manage.studentsByGroup();
	}
}
