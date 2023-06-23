package Principal;

import java.util.Scanner;

public class ID extends Informacoes {
 public ID(){
}    

public static boolean verificar() {
    Informacoes[] novoArray = produtos();
    int valor = 0;
    do{
        for (Informacoes informacoes : novoArray) {
            if (informacoes.getID() == ID) {
                valor = 1;
                return true; // Valor encontrado
            } else {
                System.out.println("Valor não encontrado! tente novamente!");
            }
            
        }
    
    } while (valor == 1);
    return false; // Valor não encontrado
}
 
 
public static void buscarPorID(Informacoes[] produtos, Informacoes[] novoArray) {

    
    
    Scanner entrada = new Scanner(System.in);
    int ID;

    System.out.println();

    do {
      System.out.println("Insira o ID do item que busca: ");
      ID = entrada.nextInt();
    //if (contadorArray == produtos.length) {
      if (!(ID == 100 || ID == 200 || ID == 300 || ID == 400 || ID == 500 || ID == 600 || ID == 700)) {
        System.out.println("Entrada Inválida!");
      } else if (ID == 100) {
        System.out.println(produtos[0]);
      } else if (ID == 200) {
        System.out.println(produtos[1]);
      } else if (ID == 300) {
        System.out.println(produtos[2]);
      } else if (ID == 400) {
        System.out.println(produtos[3]);
      } else if (ID == 500) {
        System.out.println(produtos[4]);
      } else if (ID == 600) {
        System.out.println(produtos[5]);
      } else {
        System.out.println(produtos[6]);
      }
    } while (!(ID == 100 || ID == 200 || ID == 300 || ID == 400 || ID == 500 || ID == 600 || ID == 700));
    /*} else {
    
    for (Informacoes informacoes : novoArray) {
            if (informacoes.getID() == ID) {
                
                
            }
        }
    }*/
}

//------------------------------------------------------------------------------

  public static void buscarID(Informacoes[] produtos, Informacoes[] novoArray) {

    Scanner entrada = new Scanner(System.in);
    int iD;

    System.out.println();
    if (terceirocontador == 0) {
        do {
            System.out.println("Insira um ID: ");
            iD = entrada.nextInt();

            if (!(iD == 100 || iD == 200 || iD == 300 || iD == 400 || iD == 500 || iD == 600 || iD == 700)) {
              System.out.println("Entrada Inválida");
            } else {
              System.out.println("O Produto está na posição " + ((iD / 100) - 1) + " da array");
            }

        } while (!(iD == 100 || iD == 200 || iD == 300 || iD == 400 || iD == 500 || iD == 600 || iD == 700));
    }
    
    else {
        do {
            System.out.println("Insira um ID: ");
            iD = entrada.nextInt();
            
            if (verificar() || iD == ID) {              
              System.out.println("O Produto está na posição " + ((iD / 100) - 1) + " da array");
            } else {
              System.out.println("Entrada Inválida");
            }

        } while (verificar());
    }
}

//------------------------------------------------------------------------------
  
  public static void atualizaPorID(Informacoes[] produtos, Informacoes[] novoArray) {
    Scanner entrada = new Scanner(System.in);
    int iD;

    System.out.println();
    if (terceirocontador == 0){
        do {
          System.out.println("Insira o ID do item: ");
          iD = entrada.nextInt();

          if (!(iD == 100 || iD == 200 || iD == 300 || iD == 400 || iD == 500 || iD == 600 || iD == 700)) {
            System.out.println("Entrada Inválida!");
          } else {
            boolean produtoEncontrado = false;

            for (Informacoes produto : produtos) {
              if (iD == 100 || iD == 200 || iD == 300 || iD == 400 || iD == 500 || iD == 600 || iD == 700) {
                produtoEncontrado = true;

                System.out.println("Que informação deseja atualizar deste produto ?");
                System.out.println("Digite [1] para o Nome do Produto");
                System.out.println("Digite [2] para o Preço do Produto");
                System.out.println("Digite [3] para a Cor do Produto");
                System.out.println("Digite [4] para a Marca do Produto");
                System.out.println("Digite [5] para a Quantia em Estoque do Produto");

                int numero = entrada.nextInt();
                entrada.nextLine(); // Consumir a nova linha pendente

                if (!(numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5)) {
                  System.out.println("Entrada Inválida");
                } else {
                  switch (numero) {
                    case 1 :
                        System.out.println("Insira um novo nome: ");
                        produto.setNome(entrada.nextLine());
                        break;

                    case 2 :
                        System.out.println("Insira um novo preço: ");
                        produto.setPreco(entrada.nextDouble());
                        entrada.nextLine();
                        break;

                    case 3 :
                        System.out.println("Insira uma nova cor: ");
                        produto.setCor(entrada.nextLine());
                        break;

                    case 4 :
                        System.out.println("Insira uma nova marca: ");
                        produto.setMarca(entrada.nextLine());
                        break;

                    case 5:
                        System.out.println("Insira a quantia em estoque: ");
                        produto.setQuantiaDeEstoque(entrada.nextInt());
                        entrada.nextLine();
                        break;

                    default:
                        System.out.println("Opção inválida");
                        break;
                    }
                }
              }
            }

            if (!produtoEncontrado) {
              System.out.println("Erro! Tente novamente! ");
            }
          }
        } while (iD == 100 || iD == 200 || iD == 300 || iD == 400 || iD == 500 || iD == 600 || iD == 700);
    }    
//------------------------------------------------------------------------------  
    else {
        do {
          System.out.println("Insira o ID do item: ");
          iD = entrada.nextInt();

          if (verificar()) {
            System.out.println("Entrada Inválida!");
          } else {
            boolean produtoEncontrado1 = false;

            for (Informacoes informacoes : novoArray) {
              if (verificar()) {
                produtoEncontrado1 = true;

                System.out.println("Que informação deseja atualizar deste produto ?");
                System.out.println("Digite [1] para o Nome do Produto");
                System.out.println("Digite [2] para o Preço do Produto");
                System.out.println("Digite [3] para a Cor do Produto");
                System.out.println("Digite [4] para a Marca do Produto");
                System.out.println("Digite [5] para a Quantia em Estoque do Produto");

                int numero = entrada.nextInt();
                entrada.nextLine(); // Consumir a nova linha pendente

                if (!(numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 5)) {
                  System.out.println("Entrada Inválida");
                } else {
                  switch (numero) {
                    case 1 :
                        System.out.println("Insira um novo nome: ");
                        informacoes.setNome(entrada.nextLine());
                        break;

                    case 2 :
                        System.out.println("Insira um novo preço: ");
                        informacoes.setPreco(entrada.nextDouble());
                        entrada.nextLine();
                        break;

                    case 3 :
                        System.out.println("Insira uma nova cor: ");
                        informacoes.setCor(entrada.nextLine());
                        break;

                    case 4 :
                        System.out.println("Insira uma nova marca: ");
                        informacoes.setMarca(entrada.nextLine());
                        break;

                    case 5:
                        System.out.println("Insira a quantia em estoque: ");
                        informacoes.setQuantiaDeEstoque(entrada.nextInt());
                        entrada.nextLine();
                        break;

                    default:
                        System.out.println("Opção inválida");
                        break;
                    }
                }
              }
            }

            if (!produtoEncontrado1) {
              System.out.println("Erro! Tente novamente! ");
            }
          }
        } while (verificar());    
    }
     
    }
        
    private static boolean iDValido(int ID) {
        return ID == 100 || ID == 200 || ID == 300 || ID == 400 || ID == 500 || ID == 600 || ID == 700;
    }    

    
}
