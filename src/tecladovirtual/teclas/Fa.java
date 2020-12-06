package tecladovirtual.teclas;

public class Fa extends Tecla{
    public Fa(int oitava, String cifra) {
        super(
            cifra,
            "src/tecladovirtual/assets/sound/"+ oitava + "/" + cifra + ".mp3"
        );
    }
}
