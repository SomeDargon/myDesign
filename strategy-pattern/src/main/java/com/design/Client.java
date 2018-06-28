package com.design;

public class Client {

    public static void main(String[] args) {
        MemberStrategy memberStrategy = new AdvancedMemberStrategy();
        Price price = new Price(memberStrategy);
        System.out.println("高级会员打折价：" + price.quote(100));
        price.setMemberStrategy(new PrimaryMemberStrategy());
        System.out.println("初级会员打折价：" + price.quote(100));
        price.setMemberStrategy(new IntermediateMemberStrategy());
        System.out.println("中级会员打折价：" + price.quote(100));
    }
}
