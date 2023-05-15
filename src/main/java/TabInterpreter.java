public class TabInterpreter implements TextInterpreter{
    String text;

    public TabInterpreter(String text) {
        this.text = text;
    }

    @Override
    public String interpret(String text) {
        return text.replaceAll("\\t+", " ");
    }
}
