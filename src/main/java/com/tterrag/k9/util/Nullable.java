package com.tterrag.k9.util;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD, PARAMETER, LOCAL_VARIABLE, PACKAGE })
public @interface Nullable {

}
