import java.util.Scanner;
public class Main{
  public static void main(String args[])
  {
    Scanner texto = new Scanner(System.in);
    Pilha p = new Pilha();
    Pilha f = new Pilha();
    p.push(10);
    p.push(20);
    p.push(30);
    p.pop();
    p.pop();
    f.push(40);
    f.push(50);
    p.pushMultPilha(f);
    System.out.print("O topo da pilha é: "+ p.top() + "\n");
    System.out.print("Digite quantos elementos deseja inserir: ");
    int e = texto.nextInt();
    p.multpush(e);
    p.print();
  }
}
