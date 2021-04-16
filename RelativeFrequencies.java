package hw1;

public class RelativeFrequencies
{
	private int[] frequency = new int[26];

	public RelativeFrequencies()
	{
		for (int i = 0; i < frequency.length; i++)
		{
			frequency[i] = 0;
		}
	}

	public void frequencyCounter(String text)
	{
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < text.length(); i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (text.charAt(i) == (arr[j]))
				{
					frequency[j]++;
					break;
				}
			}
		}
	}

	public void frequencyPrinter()
	{
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < frequency.length; i++)
		{
			System.out.println(arr[i] + ": " + frequency[i]);
		}
	}
}
