package raig.org.application;



import java.io.IOException;



public class  Application {

  private int option;
  private ListOfCommands listOfCommands;

  private SystemIo systemIo;

  public static final int option_end = 0;
  public static final int option_initial = -1;


  public Application(SystemIo systemIo, ListOfCommands listOfCommands) {
    this.systemIo = systemIo;
    option = option_initial;
    this.listOfCommands = listOfCommands;

  }

  public void run() {
    System.out.println("Running");
    while ( !isEnd()) {
      executeOption();
      try {
        getUserOption();
      } catch (IOException e) {
        e.printStackTrace();
      }


    }
    System.out.println("We are out of the app");
  }

  private boolean isEnd() {

    return getOption() == listOfCommands.getNumberOfCommands();

  }

  public void getUserOption() throws IOException {

    printOptions();
    option = systemIo.getUserIoOption();
    System.out.println("Getting user Option:" + option);
  }

  private void printOptions() {
    listOfCommands.printOptions();
  }

  public int getOption() {
    return option;
  }

  public void executeOption() {

    switch (option) {
      case ( option_initial):
        //silenci
        break;
      default:
        executeCommand();
        System.out.println("Default option selected");
        break;
    }
  }

  private void executeCommand() {
    try {
      listOfCommands.execute(option);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setOption(int option) {
    this.option = option;
  }


  public String getFileName() {
    return systemIo.gefFileName();
  }
}
