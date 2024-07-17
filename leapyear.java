

class a {

    public static void main(String[] args) {
        int n = 12;

        if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0)) {
            System.out.println("leap");
        } else {
            System.out.println("no leap");
        }
    }
}
