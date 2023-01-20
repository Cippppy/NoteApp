import java.util.ArrayList;

/**
 * Tests the methods of the Notebook class
 */
public class NotebookTest {

    public static void main(String[] args) {

        ArrayList<String> ideas = new ArrayList<String>();
        ideas.add("Idea 1");
        ideas.add("Idea 2");

        Notebook unit1 = new Notebook();
        unit1.setNotes(ideas);
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());
        unit1.addNote("Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());
        unit1.deleteNote(2);
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());
        unit1.getNoteNumber("Idea 1");
        unit1.getNote(0);
        unit1.setNote("Not Idea 1", 0);
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());


    }
}
