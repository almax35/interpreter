public class StapleInterpreter implements TextInterpreter{
    String text;

    public StapleInterpreter(String text) {
        this.text = text;
    }

    @Override
    public String interpret(String text) {
        return text.replaceAll("\\( ","(").replaceAll(" \\)",")");
    }
}
