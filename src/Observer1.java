

public class Observer1 implements IObserver {
public  Observer1(){
	}
	@Override
	public void update(int i) {
		 System.out.println("Observer1: myValue in Subject is now: "+i); 

	}

}
