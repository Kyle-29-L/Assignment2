class List
{
	public static void main(String[] args)
	{
		ListElement le = new ListElement();
		LinkedList tmp = new LinkedList();
		le.setData(5);
		tmp.addElement(le);
		le.setData(1);
		tmp.addElement(le);
		le.setData(7);
		tmp.addElement(le);
		le.setData(8);
		tmp.addElement(le);
		le.setData(4);
		System.out.print("Printing from tail: ");
		tmp.printLinkedListTail();
	}
}
	