
public class Main {

	public static void main(String[] args) {
		Cat cats[]=new Cat[10];
		for(int i=0;i<10;i++){
			cats[i]=new Cat("Cat"+(i+1), i+1);
		}
		for(int i=0;i<10;i++)
		{
			cats[i].say();
		}
	}

}