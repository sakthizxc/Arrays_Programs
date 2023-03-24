package Array120;

public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task1 obj=new Task1();
obj.theater();

	}

	private void theater() {
		// TODO Auto-generated method stub
	char[] a={'g','b','b','b','g','g'};
	for(int i=1;i<a.length-1;i++)
	{
//		if(a[i]=='g')
//		{
//			
//		}
		if(a[i]==a[i+1] && a[i]!=a[i-1])
		{
			char c=a[i+1];
			
		}
		System.out.println(a[i]);
	}
	
	
	}
		
	}

