//An Observer with its own unique task depending on the warning
public class ShopOwner implements Observer{
	Subject watchMan;
	public ShopOwner(Subject watchMan) {
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
			System.out.println("Shop Owner: Close down shop and head home");
		else if(warning == 2)
			System.out.println("Shop Owner: Drops everything and find the nearest hideout");
		
	}
	
}
