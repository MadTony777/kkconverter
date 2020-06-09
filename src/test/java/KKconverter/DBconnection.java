package kkconverter;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


class DBconnection extends BaseClass {
    static String dbStepStatus(String policyId, String environment) {
        String result="";
        String dB="";
        switch (environment){
            case "stage": dB = "ADTEST1";
                break;
            case "test": dB = "ADTEST2";
                break;
        }
        try{
            //step1 load the driver class
            Class.forName(driverForBD);
            //step2 create  the connection object
            Connection con = DriverManager.getConnection(
                    bDurl + dB, bDlogin, bDpassword);
            //step3 create the statement object
            Statement stmt = con.createStatement();
            //step4 execute query
            ResultSet rs = stmt.executeQuery("SELECT ss.ID,\n" +
                    "ss.POLICY_STATUS_ID,\n" +
                    "ss.STEP_ID,\n" +
                    "ss.STEP_STATUS_ID,\n" +
                    "ss.ERR_CODE,\n" +
                    "ss.ERR_MESSAGE,\n" +
                    "ss.ERR_DETAILS,\n" +
                    "ss.DATE_CREATED,\n" +
                    "ss.DATE_MODIFIED\n" +
                    "FROM CC_INTEGR.STEP_STATUS ss\n" +
                    "INNER JOIN POLICY_STATUS ps ON ps.id = ss.POLICY_STATUS_ID\n" +
                    "WHERE ps.POLICY_ID = '" + policyId +"'\n" +
                    "order by date_created desc");
            String result1="";
            while (rs.next()) {
                result1 = (rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(6));
                result = result1 + "\n"+ result;}
            con.close();
        }catch(Exception e){ System.out.println(e);}
        return result;
    }
}