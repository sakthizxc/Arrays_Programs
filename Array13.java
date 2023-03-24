package Array120;

public class Array13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array13 obj=new Array13();
obj.count_dupElements();
	}

	private void count_dupElements() {
		// TODO Auto-generated method stub
		int[] a={2,5,4,7,5,5,8};
		int count=0;
		
		//while(repeat<a.length)
	//	{
			for(int i=a[0];i<6;i++)
		{
				for(int j=a[1];j<7;j++)
				{
					if(a[j]==a[i])
					{
						count++;
					System.out.println("Duplicate elemnt is "+a[i]+" "+a[j]);
				}
			
			}
			
		}
				System.out.print("Duplicate elemnt count is "+count);
			
			
	}
		
//	}
}
