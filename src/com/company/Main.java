package com.company;
@FunctionalInterface
interface functionalinterface
{
    void abstractmethod();
}
public class Main implements functionalinterface{
    public void abstractmethod()
    {
        System.out.println("This is abstract method");
    }
    public static void main(String[] args) {
	Main f = new Main();
    f.abstractmethod();
    }
}
