package com.litle.sdk.samples;
import com.litle.sdk.*;
import com.litle.sdk.generate.*;
 
public class CapturePartialExample {
    public static void main(String[] args) {
        Capture capture = new Capture();
        //litleTxnId contains the Litle Transaction Id returned on the authorization
        capture.setLitleTxnId(100000000000000001L);
        capture.setAmount(1200L); //Capture $12 dollars of a previous authorization
        CaptureResponse response = new LitleOnline().capture(capture);
        //Display Results
        System.out.println("Response: " + response.getResponse());
        System.out.println("Message: " + response.getMessage());
        System.out.println("Litle Transaction ID: " + response.getLitleTxnId());
	if(!response.getMessage().equals("Approved"))
        throw new RuntimeException(" The CapturePartialExample does not give the right response");
    }
}

