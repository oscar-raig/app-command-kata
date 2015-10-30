package raig.org.application;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class SystemIo {

  int getUserIoOption() throws IOException {

    String line = printDescriptionAndGetLine("Should get option");

    if (line == null) {
      throw new IOException("Error getting line");
    }
    int option = Character.getNumericValue(line.charAt(0));
    return option;
  }



  private String readLine()  {
    String line;
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        System.in));

    try {
      line = reader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
      line = "";
    }

    return line;
  }


  public String gefFileName() {
    return printDescriptionAndGetLine("Write file name");
  }

  private String printDescriptionAndGetLine(String description) {
    System.out.println(description);
    String line = readLine();
    return line;
  }
}
