package app;

import java.util.Scanner;

public class BancoTerminal {
  int Agencia;
  String Numero;
  String NomeCliente;
  float Saldo;


  public void start(){
    Scanner input = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência !");
    this.Agencia = input.nextInt();

    System.out.println("Por favor, digite o número da Conta !");
    this.Numero = input.next();

    System.out.println("Por favor, digite o seu Nome !");
    this.NomeCliente = input.next();

    System.out.println("Por favor, digite o seu Saldo !");
    this.Saldo = input.nextFloat();

    System.out.println(
            String.format(
                    "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %f já está disponível para saque",
                    this.NomeCliente, this.Agencia, this.Numero, this.Saldo
            ));

  }


  public void run(){
    this.start();
  }
}
