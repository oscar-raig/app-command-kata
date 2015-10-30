package raig.org.application;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class CommandEx2 extends CommandBase implements CommandInterface {


  private  Application application;

  public CommandEx2(String cmdInfo) {
   super(cmdInfo);
  }


  @Override
  public void execute() {
    String fileName = application.getFileName();
  }

  @Override
  public String getCommandInfo() {
    return super.getCommandInfo();
  }

  private void executeLinuxCommandCatFile(String fileName) {
    String line;
    Process process;
    try {
      process = Runtime.getRuntime().exec("cat " +  fileName);
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
