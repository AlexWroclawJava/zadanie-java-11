import java.util.Scanner;

public class WspolrzednePunktu {

    int [][] tablica = new int [4][];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj X: ");
        int wspolrzednaX = scan.nextInt();

        System.out.println("Podaj Y: ");
        int wspolrzednaY = scan.nextInt();

        if (wspolrzednaX > 0 && wspolrzednaY > 0) {
            System.out.println("Punkt(" + wspolrzednaX + "," + wspolrzednaY + ")" + "leży w I ćwiartce układu współrzędnych");
        } else if (wspolrzednaX > 0 && wspolrzednaY < 0) {
            System.out.println("Punkt(" + wspolrzednaX + "," + wspolrzednaY + ")" + "leży w IV ćwiartce układu współrzędnych");
        } else if (wspolrzednaX < 0 && wspolrzednaY > 0) {
            System.out.println("Punkt(" + wspolrzednaX + "," + wspolrzednaY + ")" + "leży w II ćwiartce układu współrzędnych");
        } else if (wspolrzednaX < 0 && wspolrzednaY < 0) {
            System.out.println("Punkt(" + wspolrzednaX + "," + wspolrzednaY + ")" + "leży w III ćwiartce układu współrzędnych");
        } else {
            System.out.println("Punkt(" + wspolrzednaX + "," + wspolrzednaY + ")" + "znajduje się na środku układu współrzędnych");
        }
    }
}
