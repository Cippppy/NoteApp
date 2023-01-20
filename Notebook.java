import java.util.ArrayList;

/**
 * Creates a notebook object that holds different notes
 * 
 * @author Christian Cipolletta
 */
public class Notebook {

    private ArrayList<String> notes;

    /**
     * Lists the notes inside of the Notebook object
     * 
     * @return notes 
     */
    public ArrayList<String> getNotes() {
        return notes;
    }

    /**
     * Adds the notes to the Notebook object
     * 
     * @param newNotes the notes to be added
     */
    public void setNotes(ArrayList<String> newNotes) {
        this.notes = newNotes;
    }

}

