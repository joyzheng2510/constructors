public class Notepad{
  String color;
  int paperTotal;
  int paperLeft;
  String content;

  Notepad(){

  }

  Notepad(String color, int paperTotal, int paperLeft, String content){
    this.color = color;
    this.paperTotal = paperTotal;
    this.paperLeft = paperLeft;
    this.content = content;
  }

  public void listProperty(){
    System.out.println("Color of paper: " + color);
    System.out.println("Total amount of paper: " + paperTotal);
    System.out.println("Paper left: " + paperLeft);
    System.out.println("Content: " + content);
  }

  public void write(String message){
    content = message;
    System.out.println("You wrote: " + content);
  }

  public void tearOff(int n){
    if(n <= paperLeft){
      content = " ";
      for(int i = 0; i < n; i++){
        paperLeft--;
        System.out.println("Note torn off.");
        System.out.println("paper left: " + paperLeft);
      }
    } else System.out.println("no more paper!");
  }
}