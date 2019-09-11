//An Observer with its own unique task depending on the warning
public class Knight implements Observer{
	Subject watchMan;
	public Knight(Subject watchMan) {
		this.watchMan = watchMan;
		watchMan.registerObserver(this);
	}
	
	/*
	 * Assigns the proper message depending on the given warning
	 * @param the value of the warning, 1 or 2
	 */
	@Override
	public void update(int warning) {
		if(warning == 1)
			System.out.println("Knight: Helps everyone get home safe");
		else if(warning == 2)
			System.out.println("Knight: Prepares for battle");
		
	}
	
}