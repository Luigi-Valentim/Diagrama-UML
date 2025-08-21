public class Main {
 public static void main(String[] args) {
        Phone iphone = new Phone();

        // Reprodutor Musical
        iphone.selecionarMusica("U2 - Vertigo");
        iphone.tocar();
        iphone.pausar();

        // Aparelho Telefônico
        iphone.ligar("+55 11 99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador na Internet
        iphone.exibirPagina(" https://www.apple.com ");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
