package hw1;

public class FrequencyTester
{
	public static void main(String[] args)
	{
		String text = "thskyisblue";
		RelativeFrequencies Rf = new RelativeFrequencies();
		Rf.frequencyCounter(text);
		Rf.frequencyPrinter();
	}
}
