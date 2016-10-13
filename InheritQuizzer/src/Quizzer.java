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
			Object[] option = (Object[]) Generate.answer;
			System.out.println(
			"public class Star\n"
			+"	{\n"
			+"		public Star()\n"
			+"		{\n"
			+"		}\n"
			+"		public void starLive()\n"
			+"		{\n"
			+"			System.out.println(\"The star lives.\");\n"
			+"		}\n"
			+"		public void starDie()\n"
			+"		{\n"
			+"			System.out.println(\"The star dies.\");\n"
			+"		}\n"
			+"	}\n");
			System.out.println(
			"public class Dwarfstar extends Star\n"
			+"	{\n"
			+"		public Dwarfstar()\n"
			+"		{\n"
			+"		}\n"
			+"		public void dwaftLive()\n"
			+"		{\n"
			+"			System.out.println(\"The dwarf star lives.\");\n"
			+"		}\n"
			+"		public void starDie()\n"
			+"		{\n"
			+"			System.out.println(\"The dwarf star dies.\");\n"
			+"		}\n"
			+"	}\n");
			System.out.println("Input number of questions you want.(From 1 to 12)");
			int times = Math.max(1,Math.min(Generate.list.size(), userInput.nextInt()));
			do
				{
					int i = (int)(Math.random()*Generate.list.size());
					int getAnswer = JOptionPane.showOptionDialog(frame, Generate.list.get(i).getConstruct()+" "+Generate.list.get(i).getStem(), "What will the output be?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
					if (option[getAnswer].equals(Generate.list.get(i).getAnswer()))
						{
							JOptionPane.showMessageDialog(frame, "You got it.");
							point++;
						}
					else
						{
							JOptionPane.showMessageDialog(frame, "Wrong! The correct answer is "+Generate.list.get(i).getAnswer());
						}
					Generate.list.remove(i);
				}while(Generate.list.size()>12-times);
			JOptionPane.showMessageDialog(frame, "Your point is "+point);
			System.exit(0);
		}
	}
