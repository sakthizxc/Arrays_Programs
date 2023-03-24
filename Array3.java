package Array120;

public class Array3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array3 obj=new Array3();
obj.reverse();
	}

	private void reverse() {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
