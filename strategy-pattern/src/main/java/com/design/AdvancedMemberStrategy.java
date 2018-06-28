package com.design;

public class AdvancedMemberStrategy implements MemberStrategy {

    public double calcPrice(double bookPrice) {
        System.out.println("高级会员享受20%折扣");
        return bookPrice*0.8;
    }
}
