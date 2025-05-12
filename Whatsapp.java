import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private List<Contato> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp() {
        contatos = new ArrayList<>();
        mensagens = new ArrayList<>();
    }

    public void adicionarContato(Contato c) {
        contatos.add(c);
    }

    public void enviarMensagem(Mensagem m) {
        mensagens.add(m);
        m.exibir();
    }
}