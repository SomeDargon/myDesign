# 抽象工厂类

## 介绍
抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
简单来说就是工厂管理的地方

### 意图
提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

<p align="center">
   <img src="http://www.runoob.com/wp-content/uploads/2014/08/abstractfactory_pattern_uml_diagram.jpg" width="650"/>
</p>

