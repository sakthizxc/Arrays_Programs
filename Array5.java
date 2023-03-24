package Array120;

public class Array5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array5 obj=new Array5();
obj.findIndex();
	}

	private void findIndex() {
		// TODO Auto-generated method stub
		int[] a={10,20,40,30,60,50};
		int num=30;
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println("The index value of the given number is "+i);	
			}
			
		}
	}

}
