public class MensagemTexto extends Mensagem {
    public MensagemTexto(Contato remetente, String conteudo) {
        super(remetente, conteudo, new TipoMensagem("Texto"));
    }

    @Override
    public void exibir() {
        System.out.println(remetente.getNome() + ": " + conteudo);
    }
}