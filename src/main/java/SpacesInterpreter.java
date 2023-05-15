public class SpacesInterpreter implements TextInterpreter{
    String text;
    public SpacesInterpreter(String text) {
        this.text=text;
    }
    @Override
    public String interpret(String text) {
         return text.replaceAll("\\s+", " ");
    }
}
