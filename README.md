# laiju
来聚，年轻人的聚会
--------






工程目录划分
---
*	app-api
*	app-impl
*	app-parent
*	app-web
*	common-api  
*	common-impl

common-api是公共核心类和接口
common-impl是公共核心类的实现类（后续公共抽象）
app-api是业务层接口,依赖common-api
app-impl是业务层具体实现
app-web是web层,依赖app-api
app-parent是是app工程的聚合功能

项目构建
spring+springmvc4.1.1+mybatis3.2.8+maven





