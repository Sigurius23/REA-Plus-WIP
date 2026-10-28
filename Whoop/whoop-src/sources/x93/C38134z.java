package x93;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import ma3.InterfaceC25376e;
import p481s6.AbstractC32229a;
import p715kotlin.jvm.internal.AbstractC22676k;
import so.C32800q;

/* JADX INFO: renamed from: x93.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C38134z extends AbstractC38130v {

    /* JADX INFO: renamed from: a */
    public final Object f163243a;

    public C38134z(Object recordComponent) {
        AbstractC22676k.m65750j(recordComponent, "recordComponent");
        this.f163243a = recordComponent;
    }

    @Override // x93.AbstractC38130v
    /* JADX INFO: renamed from: c */
    public final Member mo122112c() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f163243a;
        AbstractC22676k.m65750j(recordComponent, "recordComponent");
        C32800q c32800q = AbstractC32229a.f133445x;
        Method method = null;
        if (c32800q == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                c32800q = new C32800q(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c32800q = new C32800q(method, method);
            }
            AbstractC32229a.f133445x = c32800q;
        }
        Method method2 = (Method) c32800q.f136505x;
        if (method2 != null) {
            Object objInvoke = method2.invoke(recordComponent, null);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC25376e m122130j() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f163243a;
        AbstractC22676k.m65750j(recordComponent, "recordComponent");
        C32800q c32800q = AbstractC32229a.f133445x;
        Class cls = null;
        if (c32800q == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                c32800q = new C32800q(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c32800q = new C32800q(cls, cls);
            }
            AbstractC32229a.f133445x = c32800q;
        }
        Method method = (Method) c32800q.f136504w;
        if (method != null) {
            Object objInvoke = method.invoke(recordComponent, null);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new C38124p(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
