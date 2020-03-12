package KKconverter;

import org.apache.commons.lang3.RandomStringUtils;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

class BaseClassUtils {

    static String DriverForBD = "oracle.jdbc.driver.OracleDriver";
    static String BDurl = "jdbc:oracle:thin:@ADINSURE-DB-V:1521/";
    static String BDlogin = "CC_INTEGR";
    static String BDpassword = "rdw7WvFG";
    static String queue = "ccache.sys.out.queue.jms";


    protected String generatedString = RandomStringUtils.random(7, false, true);

    public void checkValues(String actualValue, String expectedValue){
        try {
            assertThat(actualValue, containsString( expectedValue));
        } catch (Exception excep) {
            System.out.println(excep);
        }
    }

}
