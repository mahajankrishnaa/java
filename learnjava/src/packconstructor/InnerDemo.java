
package packconstructor;
class newclass;
class Outer {
    int a = 100;

    class Inner {
        void toprint() {
            System.out.println("a = " + a);
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer.Inner innerobj = new Outer().new Inner();
        innerobj.toprint();
    }
}
