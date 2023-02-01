import java.util.ArrayList;

/**
 * Creates a notebook object that holds different notes
 * 
 * @author Christian Cipolletta
 * @version 2/1/23
 */
public class Notebook {

    /**
     * This creates the arraylist that holds the notes for the Notebook object
     */
    private ArrayList<String> notes = new ArrayList<String>();

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

        if(position >= notes.size())
            System.out.println("The position " + position + " is not valid.");

        else if(position < 0)
            System.out.println("The position " + position + " is not valid.");

        else
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

        if(position >= notes.size())
            return "Invalid";

        else if(position < 0)
            return "Invalid";

        else
            return notes.get(position);

    }

    /**
     * Replaces the string at the given index with the given string value
     * 
     * @param note the string value to be used to replace
     * @param position the position of the string to be replaced
     */
    public void setNote(String note, int position) {

        if(position >= notes.size())
            System.out.println("The position " + position + " is not valid.");

        else if(position < 0)
            System.out.println("The position " + position + " is not valid.");

        else
            notes.set(position, note);

    }

    /**
     * Moves the note of interest up one index
     * 
     * @param note the value of the note to be moved
     */
    public void moveNoteUp(String note) {
        
        int tempIndex = notes.indexOf(note);

        if(tempIndex <= 0)
            System.out.println("The note \"" + note + "\" is at the top.");

        else {   
            String tempNote = notes.get(tempIndex-1);
            notes.set(tempIndex-1, note);
            notes.set(tempIndex, tempNote);
        }

    }

    /**
     * Moves the note of interest down one index
     * 
     * @param note the value of the note to be moved
     */
    public void moveNoteDown(String note) {

        int tempIndex = notes.indexOf(note);

        if(tempIndex == notes.size()-1)
            System.out.println("The note \"" + note + "\" is at the bottom");
        
        else { 
            String tempNote = notes.get(tempIndex+1);
            notes.set(tempIndex+1, note);
            notes.set(tempIndex, tempNote);
        }

    }

    /**
     * Moves the selected note to the top of the list
     * 
     * @param note the note to be moved
     */
    public void moveNoteToTop(String note) {
        notes.remove(note);
        notes.add(0, note);
    }

    /**
     * Moves the selected note to the bottom of the list
     * 
     * @param note the note to be moved
     */
    public void moveNoteToBottom(String note) {
        int tempLength = notes.size()-1;
        notes.remove(note);
        notes.add(tempLength, note);
    }
}

