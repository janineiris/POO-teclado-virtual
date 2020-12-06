package tecladovirtual.teclas;

public class Si extends Tecla{
    public Si(int oitava, String cifra) {
        super(
            cifra,
            "src/tecladovirtual/assets/sound/"+ oitava + "/" + cifra + ".mp3"
        );
    }
}
