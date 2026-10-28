package wa3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: wa3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C37010o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v f158360a;

    /* JADX INFO: renamed from: b */
    public final Object f158361b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC37019v f158362c;

    /* JADX INFO: renamed from: d */
    public final C37008n f158363d;

    /* JADX INFO: renamed from: e */
    public final Method f158364e;

    public C37010o(InterfaceC37019v interfaceC37019v, Object obj, InterfaceC37019v interfaceC37019v2, C37008n c37008n, Class cls) {
        if (interfaceC37019v == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c37008n.f158358x == EnumC37011o0.f158366F && interfaceC37019v2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f158360a = interfaceC37019v;
        this.f158361b = obj;
        this.f158362c = interfaceC37019v2;
        this.f158363d = c37008n;
        if (!InterfaceC37014q.class.isAssignableFrom(cls)) {
            this.f158364e = null;
            return;
        }
        try {
            this.f158364e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e5) {
            String name = cls.getName();
            throw new RuntimeException(AbstractC2875y.m8304q(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m118825a(Object obj) {
        if (this.f158363d.f158358x.f158371w != EnumC37013p0.ENUM) {
            return obj;
        }
        try {
            return this.f158364e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m118826b(Object obj) {
        return this.f158363d.f158358x.f158371w == EnumC37013p0.ENUM ? Integer.valueOf(((InterfaceC37014q) obj).mo92274a()) : obj;
    }
}
