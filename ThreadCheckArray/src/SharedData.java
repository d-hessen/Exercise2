import java.util.ArrayList;

/**
 * Class SharedData 
 * All the data that will shared between the threads
 */

public class SharedData 
{
	/**
	 * Parameters:
	 * array - user's array
	 * winArray - binary array to show final result
	 * flag - if there's an option for number show true
	 * b - sum that thread's will look for
	 */
	private ArrayList<Integer> array;
	private boolean[] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * SharedData Constructor
	 * @param array
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
	
	/*
	 * Method will return array final result
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	
	/*
	 * Method:
	 * Fills result array with 1 or 0 according to change
	 * @param winArray
	 */

	public void setWinArray(boolean[] winArray) 
	{
		this.winArray = winArray;
	}
	
	/*
	 * Method:
	 * Will return user's array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
	
	/**
	 * Method:
	 * Will return wanted sum by user
	 */
	public int getB() 
	{
		return b;
	}
	
	/**
	 * Method:
	 * Will return the flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}
	
	/**
	 * Method:
	 * Will change flag state
	 * @param flag
	 */

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
