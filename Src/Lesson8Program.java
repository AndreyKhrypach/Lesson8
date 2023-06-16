import java.util.Scanner;

public class Lesson8Program {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true)
//        {
//            menuCalculator();
//            int choice = scanner.nextInt();
//            switch (choice){
//                case 1:
//                    int a = scanner.nextInt();
//                    int b = scanner.nextInt();
//                    System.out.println("sum = " + a + b);
//                    break;
//                case 5:
//                    return;
//                default:
//                    System.out.println("wrong choice");
//            }
//        }

        Person person2 = new Person();
        Person person1 = new Person("Illya", 33, "male", "green", false);
        Person person3 = new Person("Illya", 33, "male", "green", false);

        String str2 = new String("Hello world");
        String str1 = "Hello world";

        boolean strCompare = str1.equals(str2);
        boolean strCompare2= person1.equals(person3);

        person1.age = 30;
        person1.sex = "female";
        person1.name = "Olga";
        person1.colourEyes = "blue";
        person1.scars = false;
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(strCompare);
        System.out.println(strCompare2);
    }
    public static void menuCalculator(){
        System.out.println("1. додавання");
        System.out.println("2. вфднімання");
        System.out.println("3. множення");
        System.out.println("4. ділення");
        System.out.println("5. вихід з програми");
    }

}
