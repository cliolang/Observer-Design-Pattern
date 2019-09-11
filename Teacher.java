//An Observer with its own unique task depending on the warning
public class Teacher implements Observer{
	Subject watchMan;
	public Teacher(Subject watchMan) {
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
			System.out.println("Teacher: Helps get every kid home safe");
		else if(warning == 2)
			System.out.println("Teacher: Brings all students to the underground shelter");
		
	}
	
}