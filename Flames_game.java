package Array120;

import java.util.Scanner;

class Flames_game{
    public static void main(String[] args) {
       Flames_game obj = new Flames_game();

        // getting input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("============   FLAMES   ============");
        System.out.println();
        System.out.println("Enter Your Name");
        String name1 = sc.nextLine();
        System.out.println("Enter Your Partner Name");
        String name2 = sc.nextLine();
        sc.close();
        System.out.println();
        System.out.println("============   FLAMES   ============");

        // passing arguments to the flames method
        obj.flames(name1,name2);
    }

    // flames method
    void flames(String n1,String n2){
        
        // creating char arrays using given inputs
        char[] name1 = n1.toCharArray();      
        char[] name2 = n2.toCharArray();      
        boolean[] check = new boolean[name1.length];
        
        // getting remaining count of name
        int count = 0;
        for(int i=0;i<name1.length;i++){
            for(int j=0;j<name2.length;j++){
                if(name1[i]==name2[j] && check[j]==false){
                    check[j] = true;
                    count+=2;
                    break;
                }
            }
        }
        int flame_check = (name1.length + name2.length) - count;
        
        //checking flames
      char[] fl_array = {'F','L','A','M','E','S'};
      int ch = 0,length = 6;
      char result=fl_array[0];
      while(length!=1){
        for (int i = 0; i < fl_array.length; i++) {
            if(fl_array[i]!='@'){
                ch++;
                result = fl_array[i];
            }
            if(ch==flame_check){
                fl_array[i] = '@';
                ch = 0;
                length--;
            }
        }
      }

    System.out.println();

    //printing results
      switch (result) {
          
          case 'F':
              System.out.println(n1 + " is FRIEND to " + n2);
              break;
          case 'L':
              System.out.println(n1 + " is in LOVE with " + n2);
              break;
          case 'A':
              System.out.println(n1 + " has more AFFECTION on " + n2);
              break;
          case 'M':
              System.out.println(n1 + " is going to MARRY " + n2);
              break;
          case 'E':
              System.out.println(n1 + " is ENEMY to " + n2);
              break;
          default:
              System.out.println(n1 + " and " + n2 + " are SISTERS/BROTHERS ");
              break;
      }
      System.out.println();
      System.out.println("============   FLAMES   ============");

        }
}