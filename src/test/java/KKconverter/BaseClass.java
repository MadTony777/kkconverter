package kkconverter;

import org.apache.commons.lang3.RandomStringUtils;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

class BaseClass {

    static String driverForBD = "oracle.jdbc.driver.OracleDriver";
    static String bDurl = "jdbc:oracle:thin:@ADINSURE-DB-V:1521/";
    static String bDlogin = "CC_INTEGR";
    static String bDpassword = "rdw7WvFG";
    static String queue = "ccache.sys.out.queue.jms";


    protected String generatedString = RandomStringUtils.random(9, false, true);

    public void checkValues(String actualValue, String expectedValue){
        try {
            assertThat(actualValue, containsString( expectedValue));
        } catch (Exception excep) {
            System.out.println(excep);
        }
    }

}
