public class LinkedList 
{
    private ListElement head;
	private ListElement tail;
    
    public LinkedList()
    {
        this.head = null;
		this.tail = null;
    }	
	public boolean isEmpty()
	{
		return head == null && tail == null;
	}
	public void addElement(ListElement le)
	{	
		ListElement tmpList = new ListElement(le.getData(),null);
		if (isEmpty())
		{
			head = tmpList;
			tail = head;
		}
		else
		{
			head.setNext(tmpList);
			head = tmpList;
		}
	}
		/*
	public ListElement getElement (int index)
	{
		
	}
	public ListElement deleteElement (int index)
	{
		
	}
	*/
	public void printLinkedListTail()
	{
		ListElement listData = new ListElement();
		listData = tail;
		while (listData != null)
		{
			listData.print();
			listData = listData.getNext();
		}
	}
}


	