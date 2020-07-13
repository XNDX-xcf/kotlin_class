package class1

import java.awt.Shape

fun main(){
//    var xw=Student(wife="rose")
//    println("my name is ${xw.name}")
//    xw.name="永远的神"
//    println("my name is ${xw.name}")


    //Child("小王").work()

//    var an=Animal()
//    var dg=Dog()
//     wheresleep(an)
//    wheresleep(dg)

//    test(Button())
//    test(Image())



//    var shape=Shape()
//    shape.name="Circle"
//    println(shape.name)

    var av=Active()
    println(av.data)
    av.show()

}

class Peson{

}

class Person1(){

}

class Person2 constructor(){
    init {
        print("你好！")
    }
}

class Person3(){
    init {
        print("你好，我是猪狗找函数！")
    }
    constructor(name:String):this(){
        print("你好，我是次构造函数1")
    }
    constructor(name: String,age:Int):this(){
        print("你好，我是次构造函数2")
    }
}

//带有参数的构造方法
class Car(brand:String){
    var xc=brand
    init {
        //print("牌照号为：$brand,6666666666")
    }
    //次构造方法
    constructor(brand: String,color:String):this(brand){
        print("牌照号为：$brand，车子的颜色为：$color")
    }
}

//形式参数属性化 以及默认参数
class Student(var name:String="老王",var wife:String=""){

}

//类的继承 只能单继承 可以通过间接继承来实现多继承
//类的继承需要使用关键词open
//想要重写父类中的方法，也需要使用关键词open
open class Father(name:String){

     open fun work(){
        println("我在农村工作")
    }
}

//子类
class Child(name:String):Father(name){
    override
    fun  work(){
        super.work()
        println("我在城市工作")
    }
}


//多态  多态是子类可以向父类转

open class Animal(){
    open fun sleep(){
        println("动物冬眠")
    }
}

class Dog(): Animal(){
    override
    fun sleep(){
        println("狗在家里面冬眠")
    }
}

fun wheresleep(animal:Animal){
    animal.sleep()
}

//接口的多态

interface Onclick{
    fun onclick()
}

class Button:Onclick{
    override fun onclick() {
        println("按钮被点击了")
    }

}

class Image:Onclick{
    override fun onclick() {
        println("图片被点击了")
    }

}

//测试方法
fun test(onclick:Onclick){
    onclick.onclick()
}


//默认定义属性时会自动创建对应的Set或者get方法
//val 常量属性 只有get
// var 变量    get/set
//kotlin类的属性声明时必须有初值 初始化
class Shape(){
    var name:String=""
    //有默认的set/get方法
    //重写set或者get方法
      set(value) {
        field=value.toUpperCase()
    }
      get() = field.toLowerCase()

    //密码
    //不希望外部设置我的值  可以获取我的值  不可以使用val 这是一个常量 内部就不可以设置了
    var password="1234"
       private set


}




//可空类型的使用
class Boy(){
    //？可空类型
    //1.声明变量时 不确定有没有值
    //2.接收java的返回值
    var girlfriend:String? =null

    fun show(){
        //对于可空类型的对象 调用时必须使用？
        println(girlfriend?.length)
        //明确指定这个对象一定不为空
        println(girlfriend!!.length)
    }
}



//程序加载  -> 数据加载 ->界面显示
//程序加载  -> 数据加载
//        -> 界面显示
class Active(){
    //懒加载
    //只有调用这个属性的时候才会有值
    val data:String by lazy {
        "图片"
    }

    //延迟加载
    lateinit var image:String
    fun show(){
        image="安装包"
        println("加载的数据是：$image")
    }
}

