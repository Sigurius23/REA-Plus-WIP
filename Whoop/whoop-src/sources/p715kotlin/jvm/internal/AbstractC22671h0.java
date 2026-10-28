package p715kotlin.jvm.internal;

import j93.C21462d0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import p715kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* JADX INFO: renamed from: kotlin.jvm.internal.h0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22671h0 {

    /* JADX INFO: renamed from: a */
    public static final C22673i0 f89337a;

    static {
        C22673i0 c22673i0 = null;
        try {
            c22673i0 = (C22673i0) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c22673i0 == null) {
            c22673i0 = new C22673i0();
        }
        f89337a = c22673i0;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC21461d m65688a(Class cls) {
        return f89337a.getOrCreateKotlinClass(cls);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC21456a0 m65689b(Class cls) {
        C22673i0 c22673i0 = f89337a;
        return c22673i0.typeOf(c22673i0.getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, true);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC21456a0 m65690c(C21462d0 c21462d0, C21462d0 c21462d1) {
        C22673i0 c22673i0 = f89337a;
        return c22673i0.typeOf(c22673i0.getOrCreateKotlinClass(Map.class), Arrays.asList(c21462d0, c21462d1), false);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC21456a0 m65691d(Class cls) {
        C22673i0 c22673i0 = f89337a;
        return c22673i0.typeOf(c22673i0.getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, false);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC21456a0 m65692e(Class cls, C21462d0 c21462d0) {
        C22673i0 c22673i0 = f89337a;
        return c22673i0.typeOf(c22673i0.getOrCreateKotlinClass(cls), Collections.singletonList(c21462d0), false);
    }
}
