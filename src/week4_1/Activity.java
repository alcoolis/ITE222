package week4_1;

public class Activity
{
	public void onCreate()
	{
		System.out.println("Activity onCreate() method.");
	}

	public void onStart()
	{
		System.out.println("Activity onStart() method.");
	}

	public void Resume()
	{
		System.out.println("Activity onResume() method.");
	}

	public void onPause()
	{
		System.out.println("Activity onPause() method.");
	}

	public void onStop()
	{
		System.out.println("Activity onStop() method.");
	}

	public void onRestart()
	{
		System.out.println("Activity onRestart() method.");
	}

	public void onDestroy()
	{
		System.out.println("Activity onDestroy() method.");
	}
}
