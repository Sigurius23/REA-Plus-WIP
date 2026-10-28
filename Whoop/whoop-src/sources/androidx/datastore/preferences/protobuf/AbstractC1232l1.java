package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1232l1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f5426a;

    public AbstractC1232l1(Unsafe unsafe) {
        this.f5426a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m3879a(Class cls) {
        return this.f5426a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m3880b(Class cls) {
        return this.f5426a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo3812c(long j7, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract double mo3813d(long j7, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract float mo3814e(long j7, Object obj);

    /* JADX INFO: renamed from: f */
    public final int m3881f(long j7, Object obj) {
        return this.f5426a.getInt(obj, j7);
    }

    /* JADX INFO: renamed from: g */
    public final long m3882g(long j7, Object obj) {
        return this.f5426a.getLong(obj, j7);
    }

    /* JADX INFO: renamed from: h */
    public final Object m3883h(long j7, Object obj) {
        return this.f5426a.getObject(obj, j7);
    }

    /* JADX INFO: renamed from: i */
    public final long m3884i(Field field) {
        return this.f5426a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo3815j(Object obj, long j7, boolean z4);

    /* JADX INFO: renamed from: k */
    public abstract void mo3816k(Object obj, long j7, byte b);

    /* JADX INFO: renamed from: l */
    public abstract void mo3817l(Object obj, long j7, double d3);

    /* JADX INFO: renamed from: m */
    public abstract void mo3818m(Object obj, long j7, float f13);

    /* JADX INFO: renamed from: n */
    public final void m3885n(long j7, Object obj, int i13) {
        this.f5426a.putInt(obj, j7, i13);
    }

    /* JADX INFO: renamed from: o */
    public final void m3886o(Object obj, long j7, long j13) {
        this.f5426a.putLong(obj, j7, j13);
    }

    /* JADX INFO: renamed from: p */
    public final void m3887p(long j7, Object obj, Object obj2) {
        this.f5426a.putObject(obj, j7, obj2);
    }

    /* JADX INFO: renamed from: q */
    public boolean mo3865q() {
        Unsafe unsafe = this.f5426a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th3) {
            AbstractC1235m1.m3915a(th3);
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo3819r();
}
