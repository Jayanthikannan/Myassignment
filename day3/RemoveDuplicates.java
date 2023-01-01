package week1.day3;

//Assignment 4
public class RemoveDuplicates {
	
	
	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] splittext = text.split(" ");
		System.out.println("The lenght of the text is " + splittext.length);
		for (int i = 0; i < splittext.length; i++) {
			if (splittext[i] != null) {
				for (int j = i + 1; j < splittext.length; j++) {
					if (splittext[i].equals(splittext[j]))

					{
						splittext[j] = null;
					}

				}

			}
		}
		for (int k = 0; k < splittext.length; k++) {

			{
				if (splittext[k] != null)
					System.out.print(splittext[k] + " ");
			}

		}

	}

}
