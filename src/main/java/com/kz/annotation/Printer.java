package com.kz.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Printer {

    public String value() default "";

    public String name() default "";

    public String date() default "";
}
