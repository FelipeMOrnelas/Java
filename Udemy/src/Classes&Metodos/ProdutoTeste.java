package ClasseseMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4360.12;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        Double precofinal1 = p1.preco * (1 - p1.desconto);
        Double precofinal2 = p2.preco * (1 - p2.desconto);
        Double mediadocarrinho = (precofinal1 + precofinal2) / 2;

        System.out.printf("Media do carrinho: R$%.2f.", mediadocarrinho);
    }
}
