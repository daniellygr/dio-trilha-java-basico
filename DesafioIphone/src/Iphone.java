public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música!");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando música!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }
}