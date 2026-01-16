import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        boolean escolha = true;

        while (escolha) {

            System.out.print("Digite o 1 para usar a calculadora e 0 para sair: ");
            
            int opcao = leitor.nextInt();
            
            if (opcao == 1){

                System.out.print("Digite o primeiro número: ");
                double numeroUm = leitor.nextDouble();

                System.out.print("Digite o operador:\n'+'[Adicao]\n'-'[Subtracao]\n'/'[Divisao]\n'*'[Multiplicacao])\n");
                char operador = leitor.next().charAt(0);

                
                System.out.print("Digite o segundo número: ");
                double numeroDois = leitor.nextDouble();

                double resultado = 0;
                
                switch (operador) {
                    case '+':
                        resultado = calc.somar(numeroUm,numeroDois);
                        break;
                    case '-':
                        resultado = calc.subtrair(numeroUm, numeroDois);
                        break;
                    case '*':
                        resultado = calc.multiplicar(numeroUm, numeroDois);
                        break;
                    case '/':
                        resultado = calc.dividir(numeroUm, numeroDois);
                        break;
                    default:
                        System.out.println("Operador inválido!");
                        continue;
                }if(resultado == 0 && operador == '/'){
                    System.out.println("O resultado da sua conta é: 'indefined'");
                    }else{
                        System.out.printf("O resultado da sua conta é: %.2f%n", resultado);
                    }
            }else if(opcao == 0){
                
                System.out.println("Saindo...");
                break;
                
            }else{
                
                System.out.println("Digite um valor correto por favor!");
                
            }
        }
    }
}