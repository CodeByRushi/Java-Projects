package in.Rushikesh.binding;


public class User {
	private Integer age;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Integer count;
	
	@Override
	public String toString() {
		return "User [age=" + age + ", count=" + count + ", name=" + name + "]";
	}
	private String name;
}
