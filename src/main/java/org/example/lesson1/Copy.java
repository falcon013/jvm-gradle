package org.example.lesson1;

public class Copy implements Cloneable {

    public Integer a;
    public Integer b;

    @Override
    public Copy clone() throws CloneNotSupportedException {
        return (Copy) super.clone();
    }

    public Copy(Integer a, Integer b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public String toString() {
        return "Copy{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
