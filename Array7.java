package Array120;

public class Array7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array7 obj=new Array7();
obj.place_num();
	}

	private void place_num() {
		// TODO Auto-generated method stub
		int[] a={10,15,20,25};
		a[a.length-1]=20;
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	}

}
