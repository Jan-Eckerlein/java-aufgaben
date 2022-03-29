import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public long readLong(String text) {
        System.out.print(text);
        return scanner.nextLong();
    }

    public int readInt(String text) {
        System.out.print(text);
        return scanner.nextInt();
    }

    public float readFloat(String text) {
        System.out.print(text);
        return scanner.nextFloat();
    }
}
