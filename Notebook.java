import java.util.ArrayList;

/**
 * Creates a notebook object that holds different notes
 * 
 * @author Christian Cipolletta
 * @version 1/20/23
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

    /**
     * Tells the number of notes inside the Notebook object
     * 
     * @return numNotes the number of notes
     */
    public int numberOfNotes() {
        return notes.size();
    }

    /**
     * Adds an indvidual note to the Notebook Object
     * 
     * @param indiNote The note to be added
     */
    public void addNote(String indiNote) {
        if(!notes.contains(indiNote))
            notes.add(indiNote);
    }

    /**
     * Removes an individual note by the position it is in
     * 
     * @param position the index of the note to be removed
     */
    public void deleteNote(int position) {
        notes.remove(position);
    }

    /**
     * Tells the position of a specific note based on its string value
     * 
     * @param noteText the string to be found
     * @return postion the position of the specific note
     */
    public int getNoteNumber(String noteText) {
        return notes.indexOf(noteText);
    } 

    /**
     * Tells the string value of a note based on its position
     * 
     * @param position the index of the wanted note
     * @return note the string inside the desired note
     */
    public String getNote(int position) {
        return notes.get(position);
    }

    /**
     * Replaces the string at the given index with the given string value
     * 
     * @param note the string value to be used to replace
     * @param position the position of the string to be replaced
     */
    public void setNote(String note, int position) {
        notes.set(position, note);
    }

    /**
     * Moves the note of interest up one index
     * 
     * @param note the value of the note to be moved
     */
    public void moveNoteUp(String note) {
        int tempIndex = notes.indexOf(note);
        String tempNote = notes.get(tempIndex-1);
        notes.set(tempIndex-1, note);
        notes.set(tempIndex, tempNote);
    }

    /**
     * Moves the note of interest down one index
     * 
     * @param note the value of the note to be moved
     */
    public void moveNoteDown(String note) {
        int tempIndex = notes.indexOf(note);
        String tempNote = notes.get(tempIndex+1);
        notes.set(tempIndex+1, note);
        notes.set(tempIndex, tempNote);
    }
}

