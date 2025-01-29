public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando funcionalidades
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.pausar();

        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
