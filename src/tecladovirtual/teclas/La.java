package tecladovirtual.teclas;

public class La extends Tecla{
    public La(int oitava, String cifra) {
        super(
            cifra,
            "src/tecladovirtual/assets/sound/"+ oitava + "/" + cifra + ".mp3"
        );
    }
}
