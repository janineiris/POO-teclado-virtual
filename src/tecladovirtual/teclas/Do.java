package tecladovirtual.teclas;

public class Do extends Tecla{
    public Do(int oitava, String cifra) {
        super(
            cifra,
            "src/tecladovirtual/assets/sound/"+ oitava + "/" + cifra + ".mp3"
        );
    }
}
