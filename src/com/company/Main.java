package com.company;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
	Student student = new Student();
	Object obj = new Object();
	System.out.println(student.getClass().cast(obj));

    }
}
