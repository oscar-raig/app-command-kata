package raig.org.application;

import org.junit.Assert;
import org.junit.Test;

public class CommandEx1Test {
  @Test
  public void createCommandEx1WithDescriptionShouldreturnDescriptionWithGet() {
    String expectedDescription = "Dummy Value";
    CommandEx1 commandEx1 = new CommandEx1(expectedDescription);

    Assert.assertEquals(expectedDescription, commandEx1.getCommandInfo());
  }
}
