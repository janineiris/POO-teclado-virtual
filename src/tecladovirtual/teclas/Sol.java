package tecladovirtual.teclas;

public class Sol extends Tecla{
    
    public Sol(int oitava, String cifra) {
        super(
            cifra,
            "src/tecladovirtual/assets/sound/"+ oitava + "/" + cifra + ".mp3"
        );
    }
}
