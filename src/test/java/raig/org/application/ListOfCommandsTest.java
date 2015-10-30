package raig.org.application;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ListOfCommandsTest {
  @Test(expected = Exception.class)
  public void executeInvalidCommandShouldGenerateException() throws Exception {
    CommandEx1 dummyCommand = new CommandEx1("Dummy Description");
    ListOfCommands listOfCommands = new ListOfCommands(dummyCommand);

    listOfCommands.execute(2);

  }

  @Test
  public void executeValidCommandShouldCallCommand() throws Exception {
    CommandEx1 mockCommand = Mockito.mock(CommandEx1.class);
    ListOfCommands listOfCommands = new ListOfCommands(mockCommand);

    listOfCommands.execute(0);

    verify(mockCommand,times(1)).execute();
  }
}
