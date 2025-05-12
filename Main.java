public class Main {
    public static void main(String[] args) {
        Whatsapp app = new Whatsapp();

        Contato joao = new Contato("João", "9999-9999");
        app.adicionarContato(joao);

        Mensagem texto = new MensagemTexto(joao, "Olá, tudo bem?");
        app.enviarMensagem(texto);
    }
}