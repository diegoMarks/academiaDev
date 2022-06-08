public class App {

    public static void main(String[] args) {
        String filme = "Vingadores"; //%s
        int anoLancamento = 2015; //%d
        int duracao = 240;//%d
        float notaCritica = 8.7f;//%f
        char letraInicial = 'V';//%c
        boolean foiSucesso = true;//%b


        System.out.println("O filme " + filme);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Com duração de " + duracao + " minutos");
        System.out.println("Nota média: " + notaCritica);
        System.out.println("Letra inicial: " + letraInicial);
        System.out.println("Foi sucesso? " + foiSucesso);

        System.out.println("O filme " + filme + " lançado em " + anoLancamento + " tem duração de " + duracao + " minutos.");
        System.out.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme,anoLancamento,duracao);

        String texto = "O filme " + filme + " lançado em " + anoLancamento + " tem duração de " + duracao + " minutos.";
        String texto2 = String.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme,anoLancamento,duracao);
        System.out.println(texto);
        System.out.println(texto2);

        String nome = "Diego";
        String mensagem = "Olá";
        String mensagem2 = "Estudante Java";
        
        String mensagemFinal = String.format("%s %s %s",mensagem,nome,mensagem2);
        System.out.println(mensagemFinal);

    }
    
}