package week4_1;

public class Button
{
	private String id;
	private String title;

	public Button()
	{
		// TODO Auto-generated constructor stub
	}

	public Button(String id, String title)
	{
		super();
		this.id = id;
		this.title = title;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	@Override
	public String toString()
	{
		return "Button [id=" + id + ", title=" + title + "]";
	}
}
