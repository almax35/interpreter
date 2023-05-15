public class Context {
    public TextInterpreter[] getContext(String text){
        TextInterpreter[] interpreters = {
                new SpacesInterpreter(text),
                new DefisIntepreter(text),
                new NewLineInterpreter(text),
                new SpaceWithMarks(text),
                new StapleInterpreter(text),
                new QuoteInterpreter(text),
                new TabInterpreter(text)
        };
        return interpreters;
    }

}
