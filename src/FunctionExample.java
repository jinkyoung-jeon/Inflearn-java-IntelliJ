package src;

public class FunctionExample {
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Chicken");
        printSum(3, 5);
        int result = sum(2, 4);
        System.out.println(result);

        int[] sumAndProduct = addAndMultiply(2, 3);
        System.out.println("sum: " + sumAndProduct[0]);
        System.out.println("product: " + sumAndProduct[1]);
        
        sayHola("자바");
        sayHola("바보");

        boolean saidHola = sayHola2("바보");
    }
    /*
    인사를 했다면 true 를 반환하고
    그렇지 않다면 false 를 반환한다.
     */
    public static boolean sayHola2(String name) {
        if (name.equals("바보")) {
            System.out.println("바르고 고운 말을 사용해주세요.");
            return false;
        }
        System.out.println(name + "님, 안녕하세요?");
        return true;
    }
    public static void sayHola(String name) {
        if (name.equals("바보")) {
            System.out.println("바르고 고운 말을 사용해주세요.");
            return;
        }
//        } else {
        System.out.println(name + "님, 안녕하세요?");
//        }
    }
    // 두 정수를 더한 값과 곱한 값을 반환한다.
    public static int[] addAndMultiply(int a, int b) {
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};

        return result;
    }
    // 두 정수를 더한 값을 반환한다.
    public static int sum(int a, int b) {
        return a + b;
    }
    // 1 + 2 = 3 의 형태로 덧셈을 출력한다.
    public static void printSum(int a, int b) {
//        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " + " + b + " = " + sum(a, b));
    }
    public static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }
    public static void sayHello() {
        System.out.println("Hello");
    }
}
