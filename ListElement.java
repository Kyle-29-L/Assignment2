public class ListElement
{
	private ListElement next;
	private int data;
	
	public ListElement()
	{
		this.data = 0;
		this.next = null;
	}
	public ListElement(int d, ListElement n)
    {
        next = n;
        data = d;
    }
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}

	public void setNext(ListElement n) 
    {
        next = n;
    }	
	
	public ListElement getNext() 
    {
        return next;
    }

	public void print()
	{
		System.out.print(data + " ");
	}
}
