package Array120;

public class Array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array2 obj=new Array2();
//System.out.println(obj);
int a[]={1,2,3,4,5};
obj.printarray(a);
int[] result=obj.argumentpass();
for(int i=0;i<result.length;i++)
{
	System.out.println(result[i]);
}
	}

	private void printarray(int[] b) {
		// TODO Auto-generated method stub
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	
	}
	private int[] argumentpass()
	{
		int c[]={1,2,3,4,5};
		return c;
	}

}
