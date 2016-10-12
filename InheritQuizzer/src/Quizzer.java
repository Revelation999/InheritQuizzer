import javax.swing.*;
import java.util.Scanner;
public class Quizzer
	{
		static Scanner userInput = new Scanner(System.in);
		static JFrame frame = new JFrame();
		public static void main(String[]arg)
		{
			int point = 0;
			Generate.generate();
			Object option[] = {"The star lives.", "The star dies.", "The dwarf star lives.", "The dwarf star dies.", "ERROR"};
			System.out.println("Input number of questions you want.(From 1 to 12)");
			int times = Math.max(1,Math.min(Generate.list.size(), userInput.nextInt()));
			for (int i = 0; i < times; i++)
				{
					int getAnswer = JOptionPane.showOptionDialog(frame, Generate.list.get(i).getConstruct()+" "+Generate.list.get(i).getStem(), "What will the output be?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
					if (option[getAnswer].equals(Generate.list.get(i).getAnswer()))
						{
							System.out.println("You got it.");
							point++;
						}
					else
						{
							System.out.println("Wrong!");
						}
				}
			System.out.println("your point is "+point);
		}
	}
