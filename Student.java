package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {
    private double gpa;
    protected int credits;

    // Constructor for Student with name, age, and credits
    public Student(String name, short age, int credits) { // Changed age to short in the parameter
        super(name, age);
        this.credits = credits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void setAddress(String address) {
        updateAddress(address);
    }

    @Override
    public String getAddress() {
        return getAddress(); // Assuming 'getAddress()' is defined in Human
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", credits=" + credits + ", gpa=" + gpa + ", address=" + getAddress() + "}";
    }

    public static class Senior extends Student {
        public Senior(String name, int age, int credits) {
            super(name, (short) age, credits); // Cast age to short here
            if (credits < 85) {
                throw new IllegalArgumentException("Seniors have at least 85 credits.");
            }
        }

        @Override
        public String toString() {
            return "Senior{" + super.toString() + "}";
        }
    }

    public static class Freshman extends Student {
        public Freshman(String name, int age, int credits) {
            super(name, (short) age, credits); // Cast age to short here
        }

        @Override
        public String toString() {
            return "Freshman{" + super.toString() + "}";
        }
    }
}
