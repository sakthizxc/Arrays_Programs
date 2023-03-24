package Array120;

public class Array9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array9 obj=new Array9();
obj.find_big();
	}

	private void find_big() {
		// TODO Auto-generated method stub
		int[] a={5,10,4,13,8};
		int big=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(big<a[i])
			{
			big=a[i];
				
			}
			
		}
		System.out.println(big);
	}

}
