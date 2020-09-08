package kkconverter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnitTests extends BaseClass {
    kkTestadi kktest = new kkTestadi();
    String arg = System.getProperty("arg", "test");
    public String environment = arg;
    Logger log = LoggerFactory.getLogger(UnitTests.class);

    @BeforeEach
    public void executedBeforeEach(TestInfo testInfo) {
        log.info("Starting test: "+ testInfo.getDisplayName());
    }

    @AfterEach
    public void executedAfterEach() {
        log.info("End test\n");
    }
    @Test
    public void KKadinsure_110001() throws Exception {
        String steps = kktest.converter(generatedString, "110001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_110002() throws Exception {
        String steps = kktest.converter(generatedString,"110002.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_110003() throws Exception {
        String steps = kktest.converter(generatedString,"110003.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_110004() throws Exception {
        String steps = kktest.converter(generatedString,"110004.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_140001() throws Exception {
        String steps = kktest.converter(generatedString,"140001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_11001() throws Exception {
        String steps = kktest.converter(generatedString,"11001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_110105() throws Exception {
        String steps = kktest.converter(generatedString,"110105.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_12001() throws Exception {
        String steps = kktest.converter(generatedString,"12001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_70001() throws Exception {
        String steps = kktest.converter(generatedString,"70001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_70002() throws Exception {
        String steps = kktest.converter(generatedString,"70002.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_120001() throws Exception {
        String steps = kktest.converter(generatedString,"120001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_30001() throws Exception {
        String steps = kktest.converter(generatedString,"30001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_30002() throws Exception {
        String steps = kktest.converter(generatedString,"30002.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_30003() throws Exception {
        String steps = kktest.converter(generatedString,"30003.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_30004() throws Exception {
        String steps = kktest.converter(generatedString,"30004.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_30005() throws Exception {
        String steps = kktest.converter(generatedString,"30005.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_30006() throws Exception {
        String steps = kktest.converter(generatedString,"30006.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_30007() throws Exception {
        String steps = kktest.converter(generatedString,"30007.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_30008() throws Exception {
        String steps = kktest.converter(generatedString,"30008.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_30009() throws Exception {
        String steps = kktest.converter(generatedString,"30009.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_80001() throws Exception {
        String steps = kktest.converter(generatedString,"80001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_80002() throws Exception {
        String steps = kktest.converter(generatedString,"80002.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_80003() throws Exception {
        String steps = kktest.converter(generatedString,"80003.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_80004() throws Exception {
        String steps = kktest.converter(generatedString,"80004.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_80005() throws Exception {
        String steps = kktest.converter(generatedString,"80005.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_1() throws Exception {
        String steps = kktest.converter(generatedString,"1.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_2() throws Exception {
        String steps = kktest.converter(generatedString,"2.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_3() throws Exception {
        String steps = kktest.converter(generatedString,"3.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_4() throws Exception {
        String steps = kktest.converter(generatedString,"4.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_5() throws Exception {
        String steps = kktest.converter(generatedString,"5.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_6() throws Exception {
        String steps = kktest.converter(generatedString,"6.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_7() throws Exception {
        String steps = kktest.converter(generatedString,"7.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_8() throws Exception {
        String steps = kktest.converter(generatedString,"8.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_20001() throws Exception {
        String steps = kktest.converter(generatedString,"20001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_20002() throws Exception {
        String steps = kktest.converter(generatedString,"20002.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_20003() throws Exception {
        String steps = kktest.converter(generatedString,"20003.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_20004() throws Exception {
        String steps = kktest.converter(generatedString,"20004.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_20005() throws Exception {
        String steps = kktest.converter(generatedString,"20005.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_20006() throws Exception {
        String steps = kktest.converter(generatedString,"20006.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }



    @Test
    public void KKadinsure_140002() throws Exception {
        String steps = kktest.converter(generatedString,"140002.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }


    @Test
    public void KKadinsure_150000() throws Exception {
        String steps = kktest.converter(generatedString,"150000.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_150001() throws Exception {
        String steps = kktest.converter(generatedString,"150001.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_150002() throws Exception {
        String steps = kktest.converter(generatedString,"150002.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }

    @Test
    public void KKadinsure_140001_new() throws Exception {
        String steps = kktest.converter(generatedString,"140001_new.xml", environment);
        log.info("Steps are: \n" + steps);
        checkValues(steps, "10");
        checkValues(steps, "20");
        checkValues(steps, "30");
        checkValues(steps, "40");
        checkValues(steps, "50");
        checkValues(steps, "60");
    }
}
