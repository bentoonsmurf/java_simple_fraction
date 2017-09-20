

public class fraction{
	private int dessus;
	private int dessous;
	
	public String toString()
	{
		return "dessus : "+this.dessus+" dessous : "+this.dessous;
	}
	public fraction()
	{
		this.dessus = 1;
		this.dessous = 1;
	}
	public fraction(int dessus, int dessous)
	{
		this.dessus = dessus;
		this.dessous = dessous;
	}
}
