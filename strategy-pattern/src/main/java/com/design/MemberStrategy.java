package com.design;


/**
 * 会员优惠策略
 */
public interface MemberStrategy  {

    /**
     * 计算图书的价格
     *
     * @param bookPrice 图书的原价
     * @return 打折后的价格
     */
    double calcPrice(double bookPrice) ;

}
