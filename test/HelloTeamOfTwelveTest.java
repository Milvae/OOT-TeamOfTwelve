import org.junit.Test;

/**
 * Dont forget this comment in all of your files! ;-)
 * @author Kristian Kraljic
 */
public class HelloTeamOfTwelveTest {
	@Test
	/**
	 * Test for main method
	 * @auhtor Kristian Kraljic
	 */
	public void testMain() {
		HelloTeamOfTwelve.main(null);
		HelloTeamOfTwelve.main(new String[0]);
		HelloTeamOfTwelve.main(new String[]{"Hello","Team","Of","Twelve"});
	}
}
