import java.util.ArrayList;

/**
 * Tests the methods of the Notebook class
 * 
 * @author Christian Cipolletta
 * @version 1/20/23
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

        unit1.addNote("Eat");
        unit1.addNote("Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        unit1.moveNoteDown("Idea 2");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        unit1.moveNoteUp("Idea 2");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        moveNoteUpMultiple(unit1, "Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        moveNoteDownMultiple(unit1, "Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        moveNoteToTop(unit1, "Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        moveNoteToBottom(unit1, "Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());
    }

    /**
     * Moves the selected note up multiple spots
     * 
     * @param uut the notebook object
     * @param note the note to be moved
     */
    public static void moveNoteUpMultiple(Notebook uut, String note) {
        for (int i=0; i<2; i++) {
            uut.moveNoteUp(note);
        }
    }

    /**
     * Moves the selected note down multiple spots
     * 
     * @param uut the notebook object
     * @param note the note to be moved
     */
    public static void moveNoteDownMultiple(Notebook uut, String note) {
        for (int i=0; i<2; i++) {
            uut.moveNoteDown(note);
        }
    }

    /**
     * Moves the selected note to the top of the list
     * 
     * @param uut the notebook object
     * @param note the note to be moved
     */
    public static void moveNoteToTop(Notebook uut, String note) {
        int spotsToMove = uut.getNoteNumber(note);
        for (int i=0; i<spotsToMove; i++) {
            uut.moveNoteUp(note);
        }
    }

    /**
     * Moves the selected note to the bottome of the list
     * 
     * @param uut the notebook object
     * @param note the note to be moved
     */
    public static void moveNoteToBottom(Notebook uut, String note) {
        int spotsToMove = uut.numberOfNotes()-1;
        for (int i=0; i<spotsToMove; i++) {
            uut.moveNoteDown(note);
        }
    }
}
