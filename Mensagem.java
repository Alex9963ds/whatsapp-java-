public abstract class Mensagem {
    protected Contato remetente;
    protected String conteudo;
    protected TipoMensagem tipo;

    public Mensagem(Contato remetente, String conteudo, TipoMensagem tipo) {
        this.remetente = remetente;
        this.conteudo = conteudo;
        this.tipo = tipo;
    }

    public abstract void exibir();
}