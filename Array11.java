package Array120;

public class Array11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array11 obj=new Array11();
obj.first2_big();
	}

	private void first2_big() {
		// TODO Auto-generated method stub
		int[] a={2,5,10,8,15,20};
		int first=0,second=0;
		for(int i=0;i<a.length;i++)
		{
			if(first<a[i])
			{
				second=first;
				first=a[i];
			}
			else if(second<a[i])
			{
				second=a[i];
			}
		}
		System.out.println("First big= "+first+" Second big= "+second);
	}

}
