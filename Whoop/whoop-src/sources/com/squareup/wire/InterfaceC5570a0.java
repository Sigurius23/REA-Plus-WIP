package com.squareup.wire;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.squareup.wire.a0 */
/* JADX INFO: loaded from: classes6.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC5570a0 {
    String adapter();

    String declaredName() default "";

    String jsonName() default "";

    String keyAdapter() default "";

    EnumC5595z label() default EnumC5595z.f22135x;

    String oneofName() default "";

    boolean redacted() default false;

    int schemaIndex() default -1;

    int tag();
}
