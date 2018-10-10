# 后台API

[![Travis](https://img.shields.io/travis/rust-lang/rust.svg)]()
[![Maven metadata URI](https://img.shields.io/maven-metadata/v/http/central.maven.org/maven2/com/google/code/gson/gson/maven-metadata.xml.svg)]()

## user

- getUserByOpenid
- getUserById
- getAllUsers
- updateWXUser

## student

- getStudentByOpenid
- getStudentById
- getStudentsByBj
- getStudentsByZy
- getStudentsByNj
- getStudentsByKch
- getAllStudents

## kcinfo

- getKcinfoBykch
- getKcinfosByJsh
- getKcinfosByXh
- updataKcqdNotAllow
- updataKcqdAllow
- changeAllowOrNot

## kcqd

- signIn
- getKcqdInfosByKch

## feedback

- addFeedback
- getFeedback

## qddd

- getQdddByKch
- addQddd

# 开发总结

## mybatis参数绑定
- 单个参数
  - 基本类型（int，String等） 
    - mapper配置文件中直接使用dao成员函数中的参数名。#{param}
    - 使用@param注解参数，在mapper配置文件中使用指定的参数名。
  - 复杂类型（一般为实体类）
    - mapper配置文件中直接使用实体的属性，传递实体的属性值。#{property}
    - 使用@param注解参数，在mapper配置文件中使用指定的参数名引导属性名传递参数值。
- 多个参数
  - 基本类型（int，String等）
    - 使用参数序号传递参数。#{id}
    - 使用@param注解多个参数。
    - 使用HashMap封装
  - 复杂类型（一般为实体类）
    - 使用@param注解多个复杂参数，在mapper配置文件中使用"注解参数.属性名"传递参数。
    - 使用HashMap封装
  - 组合式（包含基本参数和复杂参数）
    - 注解参数。
    - 封装在HashMap中。
- list参数
  - foreach标签访问
  
## collection和associattion关系表映射

- 一对一
  - 使用associattion
  1. 实体类包含属性->关联的类。
  2. 两个关联对象的mapper配置文件配置findBy主键的select。
  3. 配置resultmap，在association标签中相互引用第二步中对方配置的select。
- 多对多
  - 使用collection
  1. 实体类中包含属性->关联的类的list。
  2. 两个关联对象的mapper配置文件配置findBy关联对象的主键的select。涉及到第三张表。
  3. 配置resultmap，在association标签中相互引用第二步中对方配置的select。
- 一对多
  - 使用associattion和collection配置，结合上述两种关系映射的配置方法。
- 踩坑
  - 参数传递：被调用的select使用类型为HashMap的paramtype。如果直接使用基本类型的参数传递方法，会出现"org.apache.ibatis.reflection.ReflectionException: There is no getter for property named 'name' in 'class java.lang.String'"错误。
  - 栈溢出：mapper的配置均映射到设定的resultmap，导致查询死循环，关联查找时栈溢出。所以关联查找时配置文件中相互引用的
select不能同时映射到自定义的resultmap，其中一个要设定resulttype到自身的实体对象，打破循环。、

## mybatis关联关系时传递常量

讲常量值select as到指定的参数名即可。如果不这样做，直接在column属性里定义参数值，会报从结果集中找不到名称为常量的列的错。