import java.util.Scanner;
class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1);

        Scanner sc2 = new Scanner(System.in);
        System.out.printf("정수를 입력하세요: ");
        int num2 = sc2.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1+num2);

        Scanner sc3 = new Scanner(System.in);
        System.out.printf("정수를 입력하세요: ");
        int num3 = sc3.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1+num2+num3);

        Scanner sc4 = new Scanner(System.in);
        System.out.printf("정수를 입력하세요: ");
        int num4 = sc4.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1+num2+num3+num4);

        Scanner sc5 = new Scanner(System.in);
        System.out.printf("정수를 입력하세요: ");
        int num5 = sc5.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1+num2+num3+num4+num5);

        }
    }
