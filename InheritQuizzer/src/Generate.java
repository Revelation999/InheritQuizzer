import java.util.ArrayList;
public class Generate
	{
		static ArrayList <Question> list = new ArrayList <Question>();
		static String answer[] = {"The star lives.", "The star dies.", "The dwarf star lives.", "The dwarf star dies.", "ERROR"};
		public static void generate()
		{
			String construct[] = {"Star x = new Star();", "Dwarfstar x = new Dwarfstar();", "Star x = new Dwarfstar();", "Dwarfstar x = new Star();"};
			String stem[] = {"x.starLive();", "x.starDie();", "x.dwarfLive();"};
			for (int a = 0; a < construct.length; a++)
				{
					String c = construct[a];
					for (int b = 0; b < stem.length; b++)
						{
							String s = stem[b];
							String an = null;
							switch (a)
							{
								case 3:{an = answer[4];break;}
								case 2:{if (b==0) an = answer[0]; else if (b==1) an = answer[3]; else if (b==2) an = answer[2];break;}
								case 1:{if (b==0) an = answer[0]; else if (b==1) an = answer[3]; else if (b==2) an = answer[2];break;}
								case 0:{if (b==0) an = answer[0]; else if (b==1) an = answer[1]; else if (b==2) an = answer[4];break;}
							}
							list.add(new Question(c, s, an));
						}
				}
		}
	}
