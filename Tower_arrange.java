package Array120;

public class Tower_arrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tower_arrange obj=new Tower_arrange();
int no=3;
towerOfHanoi(no,'a','b','c');
	}

	public static void towerOfHanoi(int N, char from_rod, char to_rod,
            char aux_rod)
	{
        if (N == 0) {
        	return;
        }
        towerOfHanoi(N - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + N + " from rod "
                           + from_rod + " to rod "
                           + to_rod);
        towerOfHanoi(N- 1, aux_rod, to_rod, from_rod);
    }
}
