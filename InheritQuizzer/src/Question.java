
public class Question
	{
		String construct;
		String stem;
		String answer;
		public Question(String c, String s, String a)
		{
			construct = c;
			stem = s;
			answer = a;
		}
		public String getConstruct()
			{
				return construct;
			}
		public void setConstruct(String construct)
			{
				this.construct = construct;
			}
		public String getStem()
			{
				return stem;
			}
		public void setStem(String stem)
			{
				this.stem = stem;
			}
		public String getAnswer()
			{
				return answer;
			}
		public void setAnswer(String answer)
			{
				this.answer = answer;
			}
	}
