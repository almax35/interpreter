public class SpaceWithMarks implements TextInterpreter{

    String text;

    public SpaceWithMarks(String text) {
        this.text = text;
    }

    @Override
    public String interpret(String text) {
        return text.replaceAll(" ,",", ").replaceAll(" \\.",".");
    }
}
