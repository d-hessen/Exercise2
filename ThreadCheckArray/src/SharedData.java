import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> array;
	private ArrayList<Boolean> winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(ArrayList<Integer> array, int b) {
		
		array = new ArrayList<Integer>();
		this.b = b;
	}

	public ArrayList<Boolean> getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(ArrayList<Boolean> winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
