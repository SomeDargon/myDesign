package com.design;

public class Price {

    private MemberStrategy memberStrategy;

    /**
     * 获取优惠后的价格
     * @param price 图书原价
     * @return  打折后的价格
     */
    public double quote(double price) {
       return memberStrategy.calcPrice(price);
    }

    /**
     * 运行时，替换策略
     * @param memberStrategy 具体策略对象
     */
    public void setMemberStrategy(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    /**
     * 创建有参构造函数
     * @param memberStrategy
     */
    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }
}
