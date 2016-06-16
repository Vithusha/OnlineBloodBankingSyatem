package controller;

import com.twilio.sdk.Twilio;
import com.twilio.sdk.type.PhoneNumber;
import com.twilio.sdk.resource.api.v2010.account.Message;
import com.twilio.sdk.creator.api.v2010.account.MessageCreator;

public class Example {
    
  // Find your Account Sid and Token at twilio.com/console
  public static final String ACCOUNT_SID = "AC0af83f9b3e4e13bcd3a2b789a715b026";
  public static final String AUTH_TOKEN = "445420ad6fa48bf864f3b03635d3d099";
  
  public void sendSMS(String phone_num,String accept_num,String bank,String name ) {
   Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
      System.out.println("im in");
    Message message = new MessageCreator(
      ACCOUNT_SID,
      new PhoneNumber(phone_num), // TO number
      new PhoneNumber("+15073966757"), // From Twilio number
      "Person named "+name+" is in urgent of your blood group at "+ bank+". Their contact number is "+accept_num+"."
              + "Contact them if you wish to donate blood.Thank you.").execute();

    System.out.println(message.getSid());
  }
}

