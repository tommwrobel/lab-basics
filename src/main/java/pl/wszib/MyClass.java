package pl.wszib;

public class MyClass extends MyAbstractClass implements IMyInterface {

    @Override
    public void doCalculations() {
        System.out.println("Calculations done!");
    }

    @Override
    public void doRun() {
        System.out.println("MyClass running!");
    }
}
