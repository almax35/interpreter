public class Client {
    public static void main(String[] args) {
        String text = "\t\tword\tword - word      \"word\" ( word ) , word .\n\nend";
        TextInterpreter[] interpreters=new Context().getContext(text);
        System.out.println(text);
        System.out.println("**************");
        StringBuilder sb = new StringBuilder(text);
        for (TextInterpreter interpreter : interpreters) {
            sb = new StringBuilder(interpreter.interpret(sb.toString()));
            System.out.println(interpreter.getClass().getSimpleName());
            System.out.println(sb);
            System.out.println("**************");
        }


    }
}
