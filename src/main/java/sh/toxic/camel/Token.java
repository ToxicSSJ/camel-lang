package sh.toxic.camel;

public class Token {

    public String id;
    public String contenido;

    public Token(String id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "\nid=" + id + "  " + contenido ;
    }
    
}
