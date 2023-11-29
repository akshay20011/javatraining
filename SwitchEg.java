import java.util.Scanner;
class SwitchEg{
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);
        System.out.println("Enter your input");
       char input =scanner.next().charAt(0);
       switch(input){
        case 'a':
          System.out.println("a is a vowel");
             break;
         case 'e':
           System.out.println("e is a vowel");
             break;
         case 'i':
           System.out.println("i is a vowel");
             break;
          case 'o':
            System.out.println("o is a vowel");
              break;
           case 'u':
             System.out.println("u is a vowel");
              break;
             default:
              System.out.println("%s is not a vowel");
               break;

       } 
         scanner.close();
    }
}