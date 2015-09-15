/**
 * Created by fredrick on 9/15/15.
 */
class MyClass {
    private int myPrivateVar;
    public int myPublicVar;
    protected int myProtectedVar;

    private void myPrivateMethod(){
        myPrivateVar++;

    }
    public void myPublicVar(){

    }
    protected void myProtectedVar(){

    }
}
class MySubClass extends MyClass{

   private void MySubClassMethod(){
       myProtectedVar++;
       myPublicVar++;
   }


}

class AnotherClass{
    public void anotherClassMethod(){
        MyClass myClass=new MyClass();
        myClass.myProtectedVar();
        myClass.myPublicVar++;
    }


}


