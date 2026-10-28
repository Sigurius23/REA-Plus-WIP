package wg3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: wg3.h */
/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC37277h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
