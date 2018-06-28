# 设计模式

学习设计模式笔记

为什么要用这种模式呢？
以鸭子为例，当需要给鸭子添加飞行的功能的时候，你可能想到会在父类里面加上 fly()方法，这样所有的子类都会有fly()方法，
    
    // 鸭子父类
    public class Duck {
        private String name;
        private Integer age;
        public void fly(){
            System.out.println("fly...")
        }
    }

但是当继承鸭子父类的时候，有些鸭梨是不能飞的，比如：塑料鸭。但是这个时候所有父类都有fly()这个方法，当然后我们可以重写这个方法例如：
  
    public class PlasticDuck extends Duck {
        public void fly() {
            // 什么也不做
        }
    }

但是当子类过多的时候，我们我每个都需要覆盖父类的方法，这样不是显得很麻烦？
这个我们可能会想到用接口来定义具体的行为
    
    // 飞行接口
    public interface FlyInterface {
        void fly();
    }
    
    // 恢复成原样
    public class Duck {
        private String name;
        private Integer age;
    }
    
    public class YellowDock extends Duck implement fly {
        
        @Override
        public void fly(){
            System.out.println("yello fly"); 
        }
    }

这个比上一个继承看起来是好了很多，但是当行为过多的时候，就需要实现很多接口，而且不同的子类实现接口也不一样。一旦多了代码就显得很冗余。
这个时候就需要用到设计模式了。




## 六种原则 

1. 单一职责原则
    
    说明：不要存在多于一个导致类变更的原因

2. 里氏替换原则

    说明：子类可以扩展父类的功能，但不能改变父类原有的功能

3. 依赖倒置原则

    说明：高层模块不应该依赖底层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象
    
4. 接口隔离原则

    说明：客户端不应该被强迫地依赖那些根本用不上的方法
    
5. 迪米特原则

    说明：一个对象应该对其他对象保持最少的了解

6. 开闭关原则

    说明： 一个软件实体如类、模块和函数应该对扩展开放，对修改关闭

7. 组合/类聚复用原则
    
    说明： 尽量使用合成和聚合，而不是集成来达到服用的目的
    ps: 类可以由任意数量，任意类型的其他对象一任意可以实现新的类中想要的功能的方式所组成。因为实在使用现有的类合成新的类，所以这种概念被称为组合（composition） ,如果组合是动态发生的，那么它通常被称为聚合(aggregation)
    
    --- 来自 thinking in java 第一章 
