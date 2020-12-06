package tecladovirtual.teclas;

public class Mi extends Tecla{
    public Mi(int oitava, String cifra) {
        super(
            cifra,
            "src/tecladovirtual/assets/sound/"+ oitava + "/" + cifra + ".mp3"
        );
    }
}
