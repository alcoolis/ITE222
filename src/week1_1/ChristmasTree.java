package week1_1;

public class ChristmasTree
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int indice1 = 3;
		int indice2 = 5;
		
		String[] result=new String[9];

		for(int i=0;i<9;i++ )
		{
			if(i==0)
				result[i]=replaceTextChar('|', 4,indice1,indice2,makeTextRow(9,' ','|'));
			else if(i<4)
				result[i]=replaceTextChar('|', 4,indice1,indice2,result[i-1]);
			else if(i<8)
				result[i]=makeTextRow(9,' ','|');
			else
				result[i]=makeTextRow(9,'X','X');
				
			indice1--;
			indice2++;
		}

		StringBuilder builder = new StringBuilder();
		
		for (String s : result)
			builder.append(s+"\n");
		
		System.out.println(builder.toString());

	}

	private static String makeTextRow(int numberOfCharacters, char ch1, char ch2)
	{
		String str= "";
		
		for(int i=0; i<numberOfCharacters; i++)
			str+=ch1;
		
		return str.substring(0,4)+ch2+str.substring(5);
	}

	
	private static String replaceTextChar(char ch, int indexCh, int firstChar, int secondeChar, String str)
	{
		return str.substring(0, firstChar)+"*"+str.substring(firstChar+1,indexCh)+ch+str.substring(indexCh+1, secondeChar)+"*"+str.substring(secondeChar+1);
	}

}
