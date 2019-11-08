import Lab1DelA.CarTest;
import Lab1DelA.Saab95Test;
import Lab1DelA.Volvo240Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CarTest.class, Volvo240Test.class, Saab95Test.class})
public class testSuit {
}
