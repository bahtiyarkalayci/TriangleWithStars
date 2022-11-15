public class TriangleStar {
    public static void main(String[] args) {
        int number =10;

        for (int i=0;i<=number;i++){

            for(int j=1;j<=i;j++) {
                System.out.print(" ");

            }
            for (int k=1;k<=((2*number)-(2*i-1));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
