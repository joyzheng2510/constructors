class Main {
  public static void main(String[] args) {
    Notepad spiralNotepad = new Notepad("yellow",50,50," ");
    spiralNotepad.write("Sample text");
    spiralNotepad.listProperty();
    spiralNotepad.tearOff(1);
    
    System.out.println(" "); //just for spacing in console

    Notepad stickyNotes = new Notepad("blue",100,100,"Shopping");
    stickyNotes.listProperty();
    stickyNotes.tearOff(5);
    stickyNotes.write("i will buy 10 boxes of ice cream sandwiches");

    System.out.println(" "); //just for spacing in console

    Notepad indexPaper = new Notepad("white",125,125," ");
    indexPaper.listProperty();
    indexPaper.write("DON'T buy 10 boxes of ice cream sandwiches");
    indexPaper.tearOff(1);
  }
}