package Array120;

public class Array4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array4 obj=new Array4();
obj.linear();
	}

	private void linear() {
		// TODO Auto-generated method stub
		int[] a={11,21,31,41,51};
		int b=21;
		boolean c=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
			System.out.println("Linear search "+a[i]);
			c=true;
			break;
		}
		}
			if(c==false)
			{
				System.out.println("Linear search not found");
			}
			
	}

}
