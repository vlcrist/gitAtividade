/*

__ Enunciado:

Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. 
Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. 
Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. 
Informe para o usuário se este valor informado se encontra cadastrado no vetor.

__ Análise: OK

__ Gorduras: Faça um programa que

__ Entradas:

ler(numeroIndices)

double vetorReais[] = new double[numeroIndices];

__ Processos:

*/

import java.util.Scanner;

public class ExercicioCompleto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("->Insira a quantidade de indíces do vetor:");
        
        // Definir o número de indíces do vetor
        int numeroIndices = sc.nextInt();

        // Vetor definido
        double vetorReais[] = new double[numeroIndices];

        // Laço para adicionar todos os valores:
        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Insira o valor real ao vetor:");
            vetorReais[i] = sc.nextDouble();

        }

        for(int i = 0; i < vetorReais.length; i++){ // Aqui ele percorre o vetor analisando todo o conteúdo.
              
            System.out.println("->Digite o valor que deseja encontrar:");
            double encontrar = sc.nextDouble(); // Aqui ele le o valor que o usuário deseja encontrar.

            if( encontrar == vetorReais[i]){ // Condição para comparar o valor desejado com os que existem no vetor.
                
                System.out.println("!!Valor " +encontrar+" encontrado no vetor!!"); // Mensagem caso o valor seja encontrado.

            }
            else {
                System.out.println("!!Valor "+encontrar+" não encontrado no vetor!!"); // mensagem caso o valor não seja encontrado.
            }
        }


        
        


        sc.close();
    }
/*
entrada :
numero de índices = 10
numeros adicionados no vetor = de 1 a 10
numero para encontrar = 6

saida = !!Valor 6 encontrado no vetor!!

entrada:
numero de índices = 10
numeros adicionados ao vetor = de 1 a 10
numero para encontrar = 11

saida = !!Valor 11 não encontrado no vetor

*/
}