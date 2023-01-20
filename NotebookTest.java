import java.util.ArrayList;

public class NotebookTest {

    public static void main(String[] args) {

        ArrayList<String> ideas = new ArrayList<String>();
        ideas.add("Idea 1");
        ideas.add("Idea 2");

        Notebook unit1 = new Notebook();
        unit1.setNotes(ideas);
        System.out.print(unit1.getNotes());
    }
}
