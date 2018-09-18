
public class Student {
	private String name, id, group, email;
	
	// Contructors
	
	public Student()
	{
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.vn";
	}
	public Student(String name, String id, String email)
	{
		this.name = name;
		this.id = id;
		this.group = "INT22041";
		this.email = email;
	}
	
	public Student(Student s)
	{
		name = s.name;
		id = s.id;
		group = s.group;
		email = s.email;
	}
	
	// set methods
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public void setGroup(String group)
	{
		this.group = group;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	//get methods
	
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public String getGroup()
	{
		return group;
	}
	public String getEmail()
	{
		return email;
	}
	
	//Get information student
	
	public String getInfo()
	{
		return "Ten sinh vien: " + name + "\n" + "Ma sinh vien: " + id + "\n" + "Lop: " + group + "\n" + "Dia chi email: " + email;
	}
}
