/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nic;
/**
 *
 * @author shiyam
 */
import java.util.Calendar;
import java.util.Date;
public class NicCalculator
{
    String year, day, month,status = "MALE";
    String nic_no;
    public NicCalculator(String num)
    {
       this.nic_no = num;
    }
    public void calculate()
    {
        String bday = nic_no;
        year = bday.substring(0, 2);
        int year1= Integer.parseInt(year);
        year1=year1+1900; 
        year = Integer.toString(year1);
        String days = bday.substring(2,5);
        int days1=Integer.parseInt(days);

        if(days1>500)
        {
            status = "FEMALE";
        days1= days1-500;
        }
        Calendar c = Calendar.getInstance();
        c.set(c.DAY_OF_YEAR,days1);
        int mon= c.get(c.MONTH)+1;
        int mydate = c.get(c.DATE)-1; 
        
        month = Integer.toString(mon);
        day = Integer.toString(mydate);
        
    }
    public String getYear()
    {
        return year;
    }
    public String getDay()
    {
        return day;
    }
    public String getMonth()
    {
        return month;
    }
    public String getStatus()
    {
        return status;
    }
    public boolean isVoter()
    {
        Date date = new Date();
        String d = date.toString();
        String x[] = d.split(" ");
        String year1 = x[5];
        
        int voter = Integer.parseInt(year1) - Integer.parseInt(year);
        if(voter>=18)
            return true;
        else 
            return false;
    }
}
