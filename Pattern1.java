import java.sql.SQLOutput;

public class Pattern1 {
    public static void main(String[] args) {

        int n=10;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
            // Alphabet I
                if (i==0 || i== n-1 || j == (n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // Alphabet N
            for (int j=0; j<n; j++) {
                if (j==0 || j==n-1 || (i==j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // Alphabet E
            for (int j = 0; j < n; j++) {
                if (i==0 || i== n-1 || j==0 || (i== (n-1)/2 && j <= (3*n/4))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // Alphabet U
            for (int j=0; j<n; j++) {
                if ((j==0 && (i<n-1) || (i==n-1 && j >0 && j<n-1) || (j==n-1 && i<n-1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // Alphabet R
            for (int j=0; j<n; j++) {
                if ((j==0) || (i==0 && j< n-1) || (i==(n-1)/2 && j<n-1 ) || (j==(n-1) && i >0 && i < (n-1)/2)
                || (i>= (n-1)/2 && i==j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // Alphabet O
            for (int j=0; j<n; j++) {
                if (((j==0 || j==n-1) && i>0 && i<n-1) || ((i==0 || i== n-1) && j >0 & j < n-1) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // Alphabet N
            for (int j=0; j<n; j++) {
                if (j==0 || j==n-1 || (i==j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
