package raig.org;

import raig.org.application.Application;
import raig.org.application.CommandEx1;
import raig.org.application.CommandEx2;
import raig.org.application.ListOfCommands;
import raig.org.application.SystemIo;

public class ConsoleApp {


  public static void main(String [] args) {

    ListOfCommands listOfCommands = new ListOfCommands(new CommandEx1("Command Ex1 :ls"),
        new CommandEx2("Command Ex2 : cat file"));
    Application application = new Application(new SystemIo(),listOfCommands);
    application.run();
  }

}
