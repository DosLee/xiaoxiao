### lil专属仓库

> 此仓库用于记录lil学习进度

##### 注意!
1. 每天学习完毕, 上传学习笔记或是学习记录, 作为存档.
2. 想起来再说!

##### 计划

### 2018年07月27日

1. Lambda表达式

### 2018年07月28日
1. Lambda表达式
    1. 学习了Predicate接口
        1. 一个断言方法, boolean test(T t);
    2. 学习了Consumer接口
        1. 执行一个没有返回值得操作, void accept(T t);
    3. 学习了Function接口
        1. 执行一个操作, 返回一个结果, R apply(T t);
        
### 2018年07月29日
1. Lambda表达式
    1. 学习了stream流
        1. 使source作为数据源, 返回一个有序流
    2. 学习了filter函数式接口
        1. 对有序流的元素, 使用断言进行筛选, 返回一个新的有序流
        2. Stream Filter(Predicate<? super P_OUT> predicate)
    3. 学习了Map函数式接口
        1. 对已筛选元素（已筛选对象）执行转化操作，返回一个新的有序流，
           新有序流中的元素是经过转化的元素(已映射对象).
        2. Stream map(Function<? super P_OUT, ? extends R> mapper)
    4. 学习了ForEach函数式接口
        1. 对已转化的元素（已映射对象）执行一个操作，该方法没有返回值，
           不再有新的有序流产生，流结束了，方法 foreach 是个终止操作.
        2. void forEach(Consumer<? super E_OUT> action)