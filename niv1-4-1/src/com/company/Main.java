import algorea.Scanner;

class Main {

    static Scanner entrée = new Scanner(System.in);

    public static void main(String[] args) {
        int longueur = entrée.nextInt();

        System.out.println(longueur * longueur * 23);
    }
}
