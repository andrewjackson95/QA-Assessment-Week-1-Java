package Person;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String title) {
		this.name = name;
		this.age = age;
		this.jobTitle = title;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getTitle() {
		return jobTitle;
	}
	
	public void setTitle(String title) {
		this.jobTitle = title;
	}

	@Override
	public String toString() {
		return "Person [Name = " + name + ", Age = " + age + ", Job Title = " + jobTitle + " ]";
	}
	
}
