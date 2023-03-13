package revisaosobrecarga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroDeProdutos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos você vai registrar?");
        int number = sc.nextInt();
        List <DadosDosProdutos> produtos = new ArrayList<DadosDosProdutos>();
        List <DadosDosProdutos> produtosListTwo = new ArrayList<DadosDosProdutos>();
        List <DadosDosProdutos> produtosListThree = new ArrayList<DadosDosProdutos>();

        
        for(int i = 0; i < number;i++){
            System.out.print("Id:");
            int id = sc.nextInt();
            System.out.print("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();
            
            System.out.print("preço:");
            double preco = sc.nextDouble();
            System.out.print("Quantidade:");
            int quantidade = sc.nextInt();
    
            

            DadosDosProdutos dadosOne = new DadosDosProdutos(id, nome, preco, quantidade);
            DadosDosProdutos dadosTwo = new DadosDosProdutos(nome, preco);
            DadosDosProdutos dadosThree = new DadosDosProdutos(quantidade, nome);

            produtos.add(dadosOne);
            produtosListTwo.add(dadosTwo);
            produtosListThree.add(dadosThree);

            
            }

            System.out.println("Escolha quais dados você quer ver:");
            System.out.println("1-TODOS");
            System.out.println("2-nome,preço");
            System.out.println("3- quantidade,nome");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                for(DadosDosProdutos x: produtos){
                    System.out.println(x);
                    System.out.println("-----------------");
                }
                
                break;
                case 2:
                for(DadosDosProdutos x: produtosListTwo){
                    System.out.println("Nome: "+x.getNome());
                    System.out.println("Preço: R$ "+x.getPreco());
                    System.out.println("--------------------");
                }
                break;
                case 3:
                for(DadosDosProdutos x: produtos){
                    System.out.println("Nome: "+x.getNome());
                    System.out.println("Quantidade: "+x.getQuantidade());
                    System.out.println("----------------------");
                }
                break;
            }


           
    
    

           // inverter a ordem!
            






        
       
       
        
         




        sc.close();


    

    }
}
