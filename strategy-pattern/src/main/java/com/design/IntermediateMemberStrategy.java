package com.design;

public class IntermediateMemberStrategy implements MemberStrategy{

    public double calcPrice(double bookPrice) {
        System.out.println("中级会员打折10%");
        return bookPrice*0.9;
    }
}
