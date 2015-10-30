package raig.org.application;

public class ListOfCommands {

  CommandInterface[] list;

  public ListOfCommands(CommandInterface ... commands) {
    this.list = commands;
  }

  public void printOptions() {
    int cntCommand = 0;
    for (CommandInterface command  : list ) {
      System.out.println(cntCommand + " " + command.getCommandInfo());
      cntCommand ++;
    }
    System.out.println(cntCommand + " " + "Quit.");
  }

  public int getNumberOfCommands() {
    return list.length;
  }

  public void execute(int commandToExecute) throws Exception {
    if (commandToExecute < list.length && commandToExecute >= 0 ) {
      list[commandToExecute].execute();
    } else {
      throw new Exception();
    }
  }

}
