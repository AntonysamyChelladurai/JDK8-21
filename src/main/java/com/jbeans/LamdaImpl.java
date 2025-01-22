package com.jbeans;

interface GST{
    double calc(double cost,double gstpr);
}

public class LamdaImpl {

   double getPrice(double cost,double pst){
       GST gst =(amount, prs)->(amount*prs)/100;
       FunctionInFace fi=(val,per)->(val*per);
       double gstamount =gst.calc(cost,pst);
       double luxtax=fi.luxCalc(cost,pst);
       System.out.println("gstamount :: "+gstamount);
       System.out.println("luxtax :: "+luxtax);

       return cost + gstamount + luxtax;
    }



}
