import java.util.*;

public class Main {
  public static void main(String[] args) {
    String pal;
    Scanner sc = new Scanner(System.in);

    Stack<Character> fre = new Stack<Character>();
    Queue<Character> tras = new LinkedList<Character>();

    System.out.println("Digite uma frase");
    pal = sc.nextLine();

    for (int i = 0; i < pal.length(); i++) {
      fre.push(pal.charAt(i));
      tras.add(pal.charAt(i));
    }
    while (!fre.isEmpty()) {
      if (fre.pop() != tras.remove()) {
        System.out.println("Não é palindromo");
        System.exit(0);
      }
    }
    System.out.println("É palindromo");
  }
}