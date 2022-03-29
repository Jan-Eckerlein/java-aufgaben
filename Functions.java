public class Functions {

    public static void PrimeTest() {
        myMath primzahl = new myMath();
        Input input = new Input();

        System.out.println("Primecheck");

        long inputNumber = input.readLong(
                "Please enter the number to determin if it is a prime: ");
        boolean result = primzahl.longIsPrim(inputNumber);

        String printText;
        if (result) {
            printText = " is a prime";
        } else {
            printText = " is not a prime";
        }
        System.out.println(inputNumber + printText);
        System.out.println("End of Primecheck");
    }

    public static void sumA() {
        Input input = new Input();

        System.out.println("SumA");
        System.out.println("Calculation of the sum 1+2+3+4+... up to the limit value");

        int limit = input.readInt("Limit value: ");
        int result = 0;
        int i = 0;
        for (; result < limit; i++) {
            result += i;
        }

        System.out.println(
                "After " + (--i) + " links, " + limit + " is reached. The sum is " + result + ".");

    }

    public static void sumB() {
        Input input = new Input();

        System.out.println("SumA");
        System.out.println("Calculation of the sum e 1-2+3-4+... up to the limit value");

        int limit = input.readInt("Limit value: ");
        boolean operator = false;
        int result = 0;
        int i = 0;
        for (; result < limit; i++) {
            if (operator) {
                result += i;
            } else {
                result -= i;
            }
            operator = !operator;
        }

        System.out.println(
                "After " + (--i) + " links, " + limit + " is reached. The sum is " + result + ".");

    }

    public static void sumC() {
        Input input = new Input();

        System.out.println("SumA");
        System.out.println("Calculation of the sum e e 1 +(1/2)+(1/3)+(1/4) +... up to the limit value");

        float limit = input.readFloat("Limit value: ");
        float result = 0;
        float i = 1; // incrementer starting at 1 to allow for fraquants
        for (; result < limit; i++) {
            result += 1 / i;
        }

        System.out.println(
                "After " + (--i) + " links, " + limit + " is reached. The sum is " + result + ".");

    }

    public static void ProdAdd() {
        Input input = new Input();

        System.out.println("SumA");
        System.out.println("Calculation of the product via addition");

        int multiplicator = input.readInt("Multiplicator: ");
        int multiplicant = input.readInt("Multiplicant: ");
        int result = 0;

        for (int i = 1; i <= multiplicator; i++) {
            result += multiplicant;
        }

        System.out.println("The Product is " + result + ".");
    }
}
