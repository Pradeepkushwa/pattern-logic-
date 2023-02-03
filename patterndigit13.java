/*
01 02 03 04 05
06 07 08 09 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/
/*
public class patterndigit13 {
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i < 5; i++) {

           for(int j=0;j<5;j++){
             if(count<10){
                 System.out.print("0");
             }
               System.out.print(count++ +" ");
           }
            System.out.println();
        }
    }
}
*/
/*
01 02 03 04 05
02 04 06 08 10
03 06 09 12 15
04 08 12 16 20
05 10 15 20 25
 */
/*
public class patterndigit13 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i*j)<10){
                    System.out.print("0");
                }
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
*/
/*
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
 */
public class patterndigit13 {
    public static void main(String[] args) {
        int n=5;
        int count;
        for(int i=0;i<n;i++){
            count=i+1;
            for(int j=0;j<n;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}