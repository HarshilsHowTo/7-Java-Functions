public class JavaFunctions {

    public static void main(String[] args) {

//        int sum1 = add(7,8);
//        int sum = add(5,6);

        boolean isBiggerThanTen = isBiggerThanTen(6);

        String strings = concat("Hello ", "World");
        printing();

    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static boolean isBiggerThanTen(int x){
        return x > 10;
    }

    public static String concat(String stringAdd1, String stringAdd2){
        return stringAdd1 + stringAdd2;
    }

    public static void printing(){
        System.out.println("Hello");
    }



}
