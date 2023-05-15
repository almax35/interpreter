public class NewLineInterpreter implements TextInterpreter {
    String text;
    public NewLineInterpreter(String text) {
        this.text=text;
    }
    @Override
    public String interpret(String text) {
        return text.replaceAll("\\n+", "\n");
    }
}
