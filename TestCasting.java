/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elecboard;

/**
 *
 * @author anuradha.ravi
 */
class animal{
    int var=10;
    void walk(){
        System.out.println("In Animal-walk");
    }
}
class mammal extends animal{
    @Override
    void walk(){
        System.out.println("In mammal-Walk");
    }
}
class dog extends mammal{
    int var=20;
    long rear=30;
    @Override
    void walk(){
        super.walk();
        System.out.println("In Dog-Walk");
    }
    void bark(){
        System.out.println("In Dog - Barks");
    }
}
class cat extends mammal{
    @Override
    void walk(){
        System.out.println("In Cat-Walk");
    }
    void meow(){
        System.out.println("Meow");
    }
    
}
public class TestCasting {
    
    public static void main(String args[])
    {
        animal a = new animal();
        a.walk();
        System.out.println("Variable in a : "+a.var);
        animal a1 = new dog();
        System.out.println("Variable in dog using animal : "+a1.var);
        a1.walk();
        mammal m = new cat();
        m.walk();
        animal as=new animal();
        cat ca=new cat();
        ca=(cat)(animal) as;
        System.out.println("\\\\\\\"\\\\\\Upcasting ca to animal"+ca.var);
        dog d1=null;
        try{
        d1 = (dog)new mammal();
        }
        catch(ClassCastException c){
            System.out.println(c.toString());
            try{
            d1=(dog)m;
            }
            catch(ClassCastException c1){
                System.out.println(c1.toString());
                mammal m1 = new dog();
                //m1.bark();
                d1 = (dog)m1;
            }
        }
        d1.walk();
        d1.bark();
        dog d = (dog)a1;
        d.bark();
        d.walk();
        animal ac = new cat();
        cat c = (cat) ac;
        c.walk();
        c.meow();
    }
}
