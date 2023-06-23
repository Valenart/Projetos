package Principal;

    import java.util.Scanner;

    public class MostraEmTela extends Informacoes{
        
    public MostraEmTela(){
    }
    
    public static void mostrarEmTela() {
    ID metodos = new ID();
    Informacoes[] novoArray = produtos();
    Informacoes[] produtos = produtos();
    Informacoes[] arrayBackup = produtos();

    Scanner entrada = new Scanner(System.in);
        System.out.println("----------------TABELA DE PRODUTOS----------------");
    
        for (int i = 0; i < produtos.length; i++) {
        System.out.println("\n PRODUTO " + ":\n" + produtos[i] + "\n");
    }
           
    while (true) {
        System.out.println("--------------------------------------------------");
        System.out.println("| O QUE VOCE PRETENDE FAZER?                     |\n"
                         + "| [1] Atualizar um produto já cadastrado         |\n"
                         + "| [2] Cadastrar um novo Produto                  |\n"
                         + "| [3] Buscar um produto pelo seu ID              |\n"
                         + "| [4] Fechar o programa                          |");
        System.out.println("--------------------------------------------------");
        System.out.println();

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                metodos.atualizaPorID(produtos, novoArray);
                break;

            case 2:
                adicionarProduto(produtos, arrayBackup); //não pode receber parametro
                break;

            case 3:
                metodos.buscarID(produtos, novoArray);
                break;

            case 4:
                System.out.println("Programa fechado. Muito obrigado por testá-lo! :D");
                return;

            default:
                System.out.println("Número fora dos parâmetros pedidos. Tente novamente! \n"
                        + "---------------------------------------------------\n");
                break;
        }

        System.out.println("VOCE PRETENDE FAZER MAIS ALGO? \n"
                + "[1] Sim \n"
                + "[2] Não \n");
        int escolhaIf = entrada.nextInt();

        if (escolhaIf != 1) {
            System.out.println("\nPrograma fechado. Muito obrigado por testá-lo! :D\n");
            return;
        }
    }
}
 
}
