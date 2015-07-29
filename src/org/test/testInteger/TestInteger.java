package src.org.test.testinteger;

/**
 * Created with IntelliJ IDEA.
 * User: jinju
 * Date: 2015/7/29
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer i = new Integer(0);
        Clazz c = new Clazz(i);

        if(c.i == i){
            System.out.println("c.i 和 i 是同一个对象");
        }else{
            System.out.println("c.i 和 i 不是同一个对象");
        }

        c.i++;
        Integer ci1 = c.i;
        c.i--;
        if(c.i == i){
            System.out.println("c.i 和 i 是同一个对象");
        }else{
            System.out.println("c.i 和 i 不是同一个对象");
        }

        if(0 == c.i.compareTo(i)){
            System.out.println("c.i 和 i 值相同");
        }else{
            System.out.println("c.i 和 i 值不同");
        }

        if(c.i == ci1){
            System.out.println("c.i 的对象没有改变");
        }else{
            System.out.println("c.i 的对象改变了");
        }
    }
}

class Clazz {
    public Integer i ;
    public Clazz(Integer i) {
        this.i = i;
    }
}
