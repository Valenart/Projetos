package Principal;


import java.util.Scanner;

public class Informacoes {
    //--------------------------------------------------------------------------
    private static int contador = 6;
    public static int contadorArray = 0;
    public static int terceirocontador = 0;
    //--------------------------------------------------------------------------
    private String nome;
    private double preco;
    private String cor;
    private String marca;
    private int quantiaDeEstoque;
    public  static int ID;
    //--------------------------------------------------------------------------
    public Informacoes() {
    }

    public Informacoes(String nome, double preco, String cor, String marca, int quantiaDeEstoque, int ID) {
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
        this.marca = marca;
        this.quantiaDeEstoque = quantiaDeEstoque;
        this.ID = ID;
    }

    //--------------------------------------------------------------------------
    @Override
    public String toString() {
        return " Nome do Produto: " + nome
                + "\n" + " Preco do Produto: R$" + preco
                + "\n" + " Cor do Produto: " + cor
                + "\n" + " Marca do Produto: " + marca
                + "\n" + " Quantia em Estoque do Produto: " + quantiaDeEstoque
                + "\n" + " ID do Produto: " + ID;
    }

    //--------------------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setQuantiaDeEstoque(int quantiaDeEstoque) {
        this.quantiaDeEstoque = quantiaDeEstoque;
    }

    public int getQuantiaDeEstoque() {
        return quantiaDeEstoque;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

   //---------------------------------------------------------------------------
    
    public static Informacoes[] produtos() {
        Informacoes[] produtos = new Informacoes[7];

        produtos[0] = new Informacoes("Iphone", 12000, "Branco", "Apple", 15, 100);
        produtos[1] = new Informacoes("Galaxy", 11000, "Preto", "Samsung", 21, 200);
        produtos[2] = new Informacoes("Ipad", 10000, "Branco", "Apple", 18, 300);
        produtos[3] = new Informacoes("Galaxy tab", 5000, "Preto", "Samsung", 25, 400);
        produtos[4] = new Informacoes("Notebook Dell", 4000, "Cinza", "Dell", 16, 500);
        produtos[5] = new Informacoes("Apple Watch", 6000, "Branco", "Apple", 19, 600);
        produtos[6] = new Informacoes("Galaxy Watch", 3000, "Preto", "Samsung", 24, 700);

        return produtos;
    }

    public static Informacoes[] redimensionarArray(Informacoes[] produtos) {
        if (contadorArray == produtos.length) {
            Informacoes[] novoArray = new Informacoes[produtos.length + 1];
            for (int i = 0; i < novoArray.length; i++) {
                novoArray[i] = new Informacoes();
            }

            for (int i = 0; i < produtos.length; i++) {
                novoArray[i] = produtos[i];
            }

            return novoArray;
        } else {
            Informacoes[] novoArray = new Informacoes[contadorArray + 1];

            for (int i = 0; i < novoArray.length; i++) {
                novoArray[i] = new Informacoes();
            }

            for (int i = 0; i < contadorArray; i++) {
                novoArray[i] = produtos[i];
            }

            return novoArray;
        }
    }
    //--------------------------------------------------------------------------
    public static Informacoes[] arrayDeBackup(Informacoes[] novoArray) {
        Informacoes[] arrayBackup = new Informacoes[novoArray.length];

        for (int i = 0; i < arrayBackup.length; i++) {
            arrayBackup[i] = new Informacoes();
        }

        for (int i = 0; i < novoArray.length; i++) {
            arrayBackup[i] = novoArray[i];
        }

        return arrayBackup;
    }
    //--------------------------------------------------------------------------
    public static void adicionarProduto(Informacoes[] novoArray, Informacoes[] arrayBackup) {
        Scanner entrada = new Scanner(System.in);
        arrayBackup = arrayDeBackup(novoArray);
        System.out.println("Insira um nome:");
        novoArray[contadorArray].setNome(entrada.nextLine());

        System.out.println("Insira um Preco:");
        novoArray[contadorArray].setPreco(entrada.nextDouble());

        System.out.println("Insira uma Cor:");
        entrada.nextLine(); // Limpar o buffer
        novoArray[contadorArray].setCor(entrada.nextLine());

        System.out.println("Insira uma Marca:");
        novoArray[contadorArray].setMarca(entrada.nextLine());

        System.out.println("Insira uma Quantia em Estoque:");
        novoArray[contadorArray].setQuantiaDeEstoque(entrada.nextInt());

        System.out.println("Insira um ID:");
        novoArray[contadorArray].setID(entrada.nextInt());

        System.out.println("Nome: " + novoArray[contadorArray].getNome()
                + "\nPreco: R$" + novoArray[contadorArray].getPreco()
                + "\nCor: " + novoArray[contadorArray].getCor()
                + "\nMarca: " + novoArray[contadorArray].getMarca()
                + "\nQuantia em Estoque: " + novoArray[contadorArray].getQuantiaDeEstoque()
                + "\nID: " + novoArray[contadorArray].getID());

        contador++;
        contadorArray++;
        terceirocontador++;
        for (int i = 0; i < novoArray.length; i++) {
            System.out.println("\n PRODUTO "
                    + ":\n" + novoArray[i]
                    + "\n");
        }

        System.out.println("Lista atualizada com sucesso!");
    }
}  
//------------------------------------------------------------------------------
  /*public static void removerProduto(Informacoes[] produtos) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o ID do produto que deseja remover:");
        int idRemover = entrada.nextInt();
        entrada.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getID() == idRemover) {
                encontrado = true;
                produtos[i] = null;
                if (produtos[])
                break;
            }
        }

        if (encontrado) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }*/
