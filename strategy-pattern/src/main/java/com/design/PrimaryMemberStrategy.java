package com.design;


public class PrimaryMemberStrategy  implements MemberStrategy {

    public double calcPrice(double bookPrice) {
        System.out.println("对于初级会员没有打折");
        return bookPrice;
    }
}
