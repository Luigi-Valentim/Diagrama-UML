public class Phone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Estado do reprodutor
    private String musicaAtual;
    private boolean tocando;

    // Estado do navegador
    private String urlAtual;
    private int abas = 1;

    // Estado do telefone
    private boolean chamadaEmAndamento;

    public Phone() {}

    // --- ReprodutorMusical ---
    @Override
    public void tocar() {
        if (musicaAtual == null) {
            System.out.println("[Música] Nenhuma música selecionada.");
            return;
        }
        if (tocando) {
            System.out.println("[Música] Já está tocando: " + musicaAtual);
        } else {
            tocando = true;
            System.out.println("[Música] Tocando: " + musicaAtual);
        }
    }

    @Override
    public void pausar() {
        if (!tocando) {
            System.out.println("[Música] Já está pausado.");
        } else {
            tocando = false;
            System.out.println("[Música] Pausado: " + musicaAtual);
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (musica == null || musica.isBlank()) {
            System.out.println("[Música] Título inválido.");
            return;
        }
        musicaAtual = musica;
        tocando = false;
        System.out.println("[Música] Selecionada: " + musicaAtual);
    }

    // --- AparelhoTelefonico ---
    @Override
    public void ligar(String numero) {
        if (chamadaEmAndamento) {
            System.out.println("[Telefone] Já existe uma chamada em andamento.");
            return;
        }
        if (numero == null || numero.isBlank()) {
            System.out.println("[Telefone] Número inválido.");
            return;
        }
        chamadaEmAndamento = true;
        System.out.println("[Telefone] Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        if (chamadaEmAndamento) {
            System.out.println("[Telefone] Chamada atendida.");
        } else {
            chamadaEmAndamento = true;
            System.out.println("[Telefone] Atendendo chamada recebida.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("[Telefone] Iniciando correio de voz...");
    }

    // --- NavegadorInternet ---
    @Override
    public void exibirPagina(String url) {
        if (url == null || url.isBlank()) {
            System.out.println("[Navegador] URL inválida.");
            return;
        }
        urlAtual = url.trim();
        System.out.println("[Navegador] Exibindo: " + urlAtual);
    }

    @Override
    public void adicionarNovaAba() {
        abas++;
        System.out.println("[Navegador] Nova aba aberta. Total de abas: " + abas);
    }

    @Override
    public void atualizarPagina() {
        if (urlAtual == null) {
            System.out.println("[Navegador] Nenhuma página para atualizar.");
        } else {
            System.out.println("[Navegador] Atualizando: " + urlAtual);
        }
    }
}

