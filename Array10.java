package Array120;

public class Array10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array10 obj=new Array10();
obj.find_small();
	}

	private void find_small() {
		// TODO Auto-generated method stub
		int[] a={5,10,15,3};
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println(small);
	}

}
