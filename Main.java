/**
 * Every line of code that runs in Java must be inside a class
 * Java is case-sensitive: "MyClass" and "myclass" has different meaning
 * println() methods as you want. Note that it will add a new line for each method
 *There is also a print() method, which is similar to println().

  The only difference is that it does not insert a new line at the end of the output
 */

 import java.util.Scanner;
 import java.time.LocalDate;

 public class Main {
    public static void main(String[] args) {
        int num1 = 1;
        float num2 = 3.5f;
        double num3 = 3.4;
        String name = "John";
        char item = 'c';
        boolean isLoggedIn = true;
        int x = 3, y =2, z = 3;
        System.out.println(item);
        System.out.println(x+y+z);
        System.out.println(num3);
        System.out.println("hello world");
        System.out.print("hello world");
        System.out.println(3.6+3);

        String data[] = {"a", "abc"};

        for(String itemData: data) {
            System.out.printf("%s is a item", itemData.toUpperCase());
            System.out.println(itemData.indexOf("b"));
            System.out.println(itemData.isEmpty());
            System.out.println(itemData.equals(item));
        }

        Scanner scanner = new Scanner(System.in);
        String itemFromUser = scanner.nextLine();
        System.out.println(itemFromUser);
        System.out.println(Main.getResult(1,2));

        UserInfo userInfo = new UserInfo("Salahuddin", "1989-11-05");
        System.out.printf("%s is born in %s and he is now %s years old", userInfo.name, userInfo.birthDay.toString(), userInfo.getAge());
    }

    public static int getResult(int item1, int item2) {
        return item1 + item2;
    }

    /**
     *  javac UserInfo.java
     *  javac Main.java
     *  java Main
     */
}
