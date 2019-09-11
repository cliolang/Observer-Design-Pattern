//An ArrayList of subjects that perform observer actions and issue warnings
import java.util.ArrayList;
public class Watchman implements Subject {
	int warning;
	ArrayList<Observer> observers;
	
	
	public Watchman() {
		observers = new ArrayList<Observer>();
	}

	/* 
	 * Takes the given observer and adds to the ArrayList
	 * @param The observer that needs to be added
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);		
	}

	/*
	 * Removes the given observer from the ArrayList
	 * @param The observer that is going to be removed
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);		
	}

	/*
	 * Assign the correct warning String to each observer
	 */
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(warning);
		}
		
	}
	
	/*
	 * Issues a warning string and calls notifyObservers()
	 * @param integer, either one or two, that signals which kind of warning needs to be displayed
	 */
	public void issueWarning(int warning) {
		this.warning = warning;
		if(warning == 1)
			System.out.println("WARNING: 1 trumpet was played!");
		else if(warning == 2)
			System.out.println("WARNING: 2 trumpets were played!");
		notifyObservers();
				
	}

}
