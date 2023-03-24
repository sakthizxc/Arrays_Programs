package Array120;

public class Array6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array6 obj=new Array6();
obj.remove_num();
	}

	private void remove_num() {
		// TODO Auto-generated method stub
		int[] a={10,20,40,60,30};
		int remove=20;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(remove==a[i])
			{
				count++;
			}
		}
			int[] b=new int[a.length-count];
			int j=0;
			for(int i=0;i<a.length;i++)
			{
				if(remove!=a[i])
				{
					b[j]=a[i];
					j++;
				}
				
		}
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
			
	}

}
