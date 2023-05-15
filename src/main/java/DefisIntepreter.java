public class DefisIntepreter implements TextInterpreter{

    String text;
    public DefisIntepreter(String text) {
        this.text=text;
    }
    @Override
    public String interpret(String text) {
        return text.replaceAll("-","--");
    }
}
