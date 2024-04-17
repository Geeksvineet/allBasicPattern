//all patterns printing

import java.util.Scanner;

public class Main {

    public static void optionShow() {
        System.out.println("- Choose which pattern should be print -");
        System.out.println("Basic Patterns :-");
        System.out.println("1. Solid Rectengle");
        System.out.println("2. Hollow Rectengle");
        System.out.println("3. Half Pyramid");
        System.out.println("4. Inverted Half Pyramid");
        System.out.println("5. Inverted Half Pyramid Rotated by 180 degree");
        System.out.println("6. Half Pyramid with number");
        System.out.println("7. Inverted Half Pyramid with number");
        System.out.println("8. Floyd's Tringle");
        System.out.println("9. Binary Pattern");
        System.out.println("Advance Patterns :-");
        System.out.println("10. Butterfly Pattern");
        System.out.println("11. Solid Rhombus");
        System.out.println("12. Number Pyramid");
        System.out.println("13. Pailaindromic Pattern");
        System.out.println("14. Daimond Pattern");
        System.out.println("And many more Coming Soon...");
        System.out.println("----------------------------------------------");
    }

    public static void solidRectengle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void hollowRectengle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (i == 1 || i == n || j == 1 || j == n + 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=n;j>=i;j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid_180_Deg(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=n;j>=1;j--) {
                if(j>i) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramidWithNumber(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumber(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=n;j>=i;j--) {
                System.out.print(n-(j-1)+" ");
            }
            System.out.println();
        }
    }

    public static void floydsTringle(int n) {
        int count = 1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(count<10) {
                    System.out.print(count+"  ");
                }
                else {
                    System.out.print(count+" ");
                }
                count++;
            }
            System.out.println();
        }
    }

    public static void binaryPattern(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if((i+j)%2 == 0) {
                    System.out.print(" 1");
                }
                else {
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" *");
            }
            for(int k=i;k<=n-1;k++) {
                System.out.print("  ");
            }
            for(int k=i;k<=n-1;k++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            for(int j=n;j>=i;j--) {
                System.out.print(" *");
            }
            for(int k=1;k<i;k++) {
                System.out.print("  ");
            }
            for(int k=1;k<i;k++) {
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=n-1;j>=i;j--) {
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        for(int i=1;i<=n;i++) {
            for(int k=n-1;k>=i;k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }

    public static void pailaindromicPattern(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=n-1;j>=i;j--) {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--) {
                System.out.print(" "+k);
            }
            for(int l=2;l<=i;l++) {
                System.out.print(" "+l);
            }
            System.out.println();
        }
    }

    public static void daimondPattern(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=n-1;j>=i;j--) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(" *");
            }
            for(int j=2;j<=i;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            for(int j=2;j<=i;j++) {
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--) {
                System.out.print(" *");
            }
            for(int j=n-1;j>=i;j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        optionShow();

        Scanner sc = new Scanner(System.in);
        int n, ch;
        while (true) {
            System.out.print("Enter the which number should be pattern : ");
            n = sc.nextInt();
            System.out.print("Enter the serial number of you print the pattern : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    solidRectengle(n);
                    break;
                case 2:
                    hollowRectengle(n);
                    break;
                case 3:
                    halfPyramid(n);
                    break;
                case 4:
                    invertedHalfPyramid(n);
                    break;
                case 5:
                    invertedHalfPyramid_180_Deg(n);
                    break;
                case 6:
                    halfPyramidWithNumber(n);
                    break;
                case 7:
                    invertedHalfPyramidWithNumber(n);
                    break;
                case 8:
                    floydsTringle(n);
                    break;
                case 9:
                    binaryPattern(n);
                    break;
                case 10:
                    butterflyPattern(n);
                    break;
                case 11:
                    solidRhombus(n);
                    break;
                case 12:
                    numberPyramid(n);
                    break;
                case 13:
                    pailaindromicPattern(n);
                    break;
                case 14:
                    daimondPattern(n);
                    break;
                default:
                    System.out.println("You entered invaild choice...");
                    break;
            }
            System.out.print("Do you print more patterns : ");
            String str1 = sc.next();
            String str2 = str1.toUpperCase();
            if (str2.equals("YES")) {
            } else {
                break;
            }
        }
        sc.close();
    }
}