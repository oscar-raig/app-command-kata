package raig.org.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandEx1 extends CommandBase implements CommandInterface {

  private  Application application;

  public CommandEx1(String cmdInfo) {
    super(cmdInfo);
  }


  @Override
  public void execute() {
    executeLinuxCommand();
  }

  @Override
  public String getCommandInfo() {
    return super.getCommandInfo();
  }

  private void executeLinuxCommand() {
    String line;
    Process process;
    try {
      process = Runtime.getRuntime().exec("ls -aF");
      BufferedReader br = new BufferedReader(
          new InputStreamReader(process.getInputStream()));
      while ((line = br.readLine()) != null) {
        System.out.println("line: " + line);
      }
      process.waitFor();
      System.out.println("exit: " + process.exitValue());
      process.destroy();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
