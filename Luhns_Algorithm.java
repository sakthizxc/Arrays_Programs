package Array120;

public class Luhns_Algorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Luhns_Algorithm obj=new Luhns_Algorithm();
		obj.credadd();
		//obj.sumofnumber();
	}
	private void credadd() {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,6,1,2,3,4};
		//int j=1;
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			total=total+a[i];
			//total=total+a[j];
		}
		//j++;
		//System.out.println(total);
		if(total%9==0)
		{
			System.out.println("Credit card is Valid "+total);
		}
		else
		{
			System.out.println("Credit card is not Valid = "+total);
		}
	
	  }

	}

