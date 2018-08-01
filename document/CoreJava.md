### Java核心技术
> 记录

#### 反射
1. 什么叫反射
    1. 能够分析类能力的程序叫做反射.
2. 反射可以用来干嘛
    1. 在运行时分析类的能力
    2. 在运行时查看对象
    3. 实现通用的数组操作代码
    4. 利用Method对象, 这个对象很像C++中的函数指针.
3. 反射的几种方法
   
    ``` java
    // 第一种
    Employee e = new Employee();
    Class c1 = e.getClass();
    
    //第二种
    String className = "java.util.Random";
    Class c2 = Class.forName(className);
    
    //第三种动态加载
    Object o = e.getClass().newInstance();
    ```