package KKconverter;


public class kkTestadi {
    public static String converter(String policyId, String filename, String environment) throws Exception {

        JMSworker jmsworker = new JMSworker();
        jmsworker.jmsPublisher(policyId, filename, environment);
        DBconnection dbconnection = new DBconnection();
        pauseMethod();

        String stepStatus = dbconnection.dbStepStatus(policyId, environment);
        return stepStatus;
    }
    public static void pauseMethod() {
        try {
            Thread.sleep(50000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}