
import java.util.*;
public class Subject implements ISubject {      
	public Subject(){
		
	}
	private int myValue;                 
	public int getMyValue(){
		return myValue;                
		}
     public void setMyValue(int i) {
    	 this.myValue = i;           
    	  notifyObservers(myValue);
    	}
     List<IObserver> observersList=new ArrayList<>(); 
     
	@Override
	public void register(IObserver o) {
		 observersList.add(o);
	}

	@Override
	public void unregister(IObserver o) {
		  observersList.remove(o); 
	}

	@Override
	public void notifyObservers(int updatedValue) {
		 for(int i=0;i<observersList.size();i++){
			 observersList.get(i).update(updatedValue);                
			 } 
	}

}
