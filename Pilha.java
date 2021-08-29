import java.util.Scanner;
public class Pilha{
  
  private static int TAM_MAX = 1000;
  private int valores[];
  private int topo;

  public Pilha()
  {
    valores = new int[TAM_MAX];
    topo=-1;
  }
  
  public void push(int e)
  {
    if(isfull())
    {
      throw new RuntimeException("A pilha está cheia!\n");
    }
    topo++;
    valores[topo] = e;
    System.out.print("O número "+ e + " foi adicionado na pilha!\n");
  }

  public void multpush(int ct)
  {
    Scanner texto = new Scanner(System.in);
    while(ct != 0 && topo != 999)
    {
      if(isfull())
      {
      throw new RuntimeException("A pilha está cheia");
      }
      System.out.print("Digite o elemento que deseja inserir: ");
      int e = texto.nextInt();
      push(e);
      ct--;
    }
    
  }

  public void pushMultPilha(Pilha f)
  {
    if(isfull())
    {
      throw new RuntimeException("A pilha está cheia");
    }
    while(f.topo != -1)
    {
      topo++;
      valores[topo] = f.valores[f.topo];
      f.pop;
    }
  }
  
  public int pop()
  {
    if(empty())
    {
      throw new RuntimeException("A pilha está vazia");
    }
    int e;
    e = valores[topo];
    topo--;
    System.out.print("O número "+ e + " foi removido na pilha!\n");
    return e;
  }

  public void multpop(int ct)
  {
    if(empty())
    {
      throw new RuntimeException("A pilha está vazia");
    }
    while(ct != 0 && topo != -1)
    {
      pop()
      ct--;
    }
  }

  

  public boolean empty()
  {
    return (topo == -1);
  }

  public boolean isfull()
  {
    return (topo == 999);
  }

  public int top()
  {
    return valores[topo];
  }

  public void print()
  {
    int ct = 0;
    while(ct <= topo)
    {
      System.out.print("O " + (ct+1) + "º elemento é: " + valores[ct] + "\n");
      ct++;
    }
  }
}
