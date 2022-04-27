package src;

public class NestedIf {
    public static void main(String[] args) {
        int age = 25;

/*        if(age >= 10) {
            if(age < 20) {
                System.out.println("10대");
            } else {
                System.out.println("10대 아님");
            }
        } else {
            System.out.println("10대 아님2");
        }*/


/*        if(age >= 10 && age < 20) {
            System.out.println("10대");
        } else {
            System.out.println("10대 아님");
        }*/


/*        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true && false);*/


/*        if(age < 10 || age >= 20) {
            System.out.println("10대 아님");
        } else {
            System.out.println("10대");
        }*/


        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(true || false);
    }
}
