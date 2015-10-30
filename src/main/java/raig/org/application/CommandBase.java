package raig.org.application;

public class CommandBase  {

  private final String cmdInfo;


  public CommandBase(String cmdInfo) {
    this.cmdInfo = cmdInfo;
  }

  public String getCommandInfo() {
    return cmdInfo;
  }
}
