package week4_1;

public class MainActivity extends Activity implements OnClickListener, OnTouchListener
{
	Button btn1;
	RatingBar rtbr1;

	public static void main(String[] args)
	{
		MainActivity mainProgram = new MainActivity();

		mainProgram.onClick();
		mainProgram.onTouch();
	}
	
	private MainActivity()
	{
		this.onCreate();
	}
	
	public void onCreate()
	{
		btn1 = new Button("id1","MyButton");
		rtbr1= new RatingBar("id2",5);
		
		System.out.println("Activity onCreate() method.");
	}

	@Override
	public void onClick()
	{
		// TODO Auto-generated method stub
		
		System.out.println(btn1.getTitle()+" is clicked.");
	}

	@Override
	public void onTouch()
	{
		// TODO Auto-generated method stub
		
		System.out.println("You have touched "+this.rtbr1);
	}
}
