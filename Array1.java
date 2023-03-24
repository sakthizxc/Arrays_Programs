package Array120;

public class Array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array1 obj=new Array1();
obj.arrayDec();
	}

	private void arrayDec() {
		// TODO Auto-generated method stub
	int a[]={1,2,3,4,5};
	int b[]=new int[5];
	b[0]=5;
	b[1]=4;
	b[2]=3;
	b[3]=2;
	b[4]=1;
	//System.out.println(a);
	for(int i=0;i<b.length;i++){
		System.out.println(b[i]);
		System.out.println(a[i]);
	}
	}

}
