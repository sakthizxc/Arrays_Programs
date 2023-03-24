package Array120;

public class Array12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array12 obj=new Array12();
obj.small_num();
	}

	private void small_num() {
		// TODO Auto-generated method stub
		int[] a={4,7,3,2,8};
		int Fsmall=a[0],Ssmall=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(Fsmall>a[i])
			{
				Ssmall=Fsmall;
				Fsmall=a[i];
			}
			else if(Ssmall>a[i])
			{
				Ssmall=a[i];
			}
		}
		System.out.println("First small = "+Fsmall+" Second small "+Ssmall);
	}

}
