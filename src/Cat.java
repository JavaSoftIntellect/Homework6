
public class Cat {
	private String name;
	private int years;
	public Cat(String name,int years){
		this.name=name;
		this.years=years;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public void say(){
		System.out.println(name+" is "+years+" years old!");
	}

}
