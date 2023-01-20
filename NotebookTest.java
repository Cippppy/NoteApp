import java.util.ArrayList;

/**
 * Tests the methods of the Notebook class
 * 
 * @author Christian Cipolletta
 * @version 1/20/23
 */
public class NotebookTest {

    public static void main(String[] args) {

        /**
         * Creates an arraylist called ideas that is used to create a notebook object
         * Fills the arraylist with strings "Idea 1" and "Idea 2"
         */
        ArrayList<String> ideas = new ArrayList<String>();
        ideas.add("Idea 1");
        ideas.add("Idea 2");

        /**
         * Creates a notebook object called unit1
         * Sets ideas as the notes inside the notebook
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
        Notebook unit1 = new Notebook();
        unit1.setNotes(ideas);
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the addNote method by adding "Eat" to the notebook
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
        unit1.addNote("Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the deleteNote method by deleting "Eat" from the notebook
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
        unit1.deleteNote(2);
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the getNoteNumber, getNote, and SetNote methods
         * Prints out the getNoteNumber, getNote, getNotes and numberOfNotes functions to ensure proper results
         */
        System.out.println(unit1.getNoteNumber("Idea 1"));
        System.out.println(unit1.getNote(0));
        unit1.setNote("Not Idea 1", 0);
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the addNote method to make sure duplicates cannot be added by trying to add "Eat" twice
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
        unit1.addNote("Eat");
        unit1.addNote("Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the moveNoteDown method by moving "Idea 2" down one place
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
        unit1.moveNoteDown("Idea 2");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the moveNoteUp method by moving "Idea 2" up one place
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
        unit1.moveNoteUp("Idea 2");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the moveNoteUpMulitple method by moving "Eat" up 2 places
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
        moveNoteUpMultiple(unit1, "Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the moveNoteDownMulitple method by moving "Eat" down 2 places
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
        moveNoteDownMultiple(unit1, "Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the moveNoteToTop method by moving "Eat" to index 0
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
        moveNoteToTop(unit1, "Eat");
        System.out.println(unit1.getNotes());
        System.out.println(unit1.numberOfNotes());

        /**
         * Tests the moveNoteToBottom method by moving "Eat" to the last index of the notebook
         * Prints out the getNotes and numberOfNotes functions to ensure proper results
         */
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
