//An arraylist of subjects that perform observer actions and issue warnings
import java.util.ArrayList;
public class Watchman implements Subject {
	int warning;
	ArrayList<Observer> observers;
	
	
	public Watchman() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(warning);
		}
		
	}
	
	public void issueWarning(int warning) {
		this.warning = warning;
		if(warning == 1)
			System.out.println("WARNING: 1 trumpet was played!");
		else if(warning == 2)
			System.out.println("WARNING: 2 trumpets were played!");
		notifyObservers();
				
	}

}
