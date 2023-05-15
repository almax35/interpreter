public class QuoteInterpreter implements TextInterpreter{
    String text;

    public QuoteInterpreter(String text) {
        this.text = text;
    }

    @Override
    public String interpret(String text) {
        return text.replaceAll("\"([^\"]+)\"","«$1»" );
    }
}
