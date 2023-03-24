package Array120;

public class Array8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array8 obj=new Array8();
obj.hw_manyTime();
	}

	private void hw_manyTime() {
		// TODO Auto-generated method stub
		int[] a={5,10,5,15,20,5,30};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==5)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
