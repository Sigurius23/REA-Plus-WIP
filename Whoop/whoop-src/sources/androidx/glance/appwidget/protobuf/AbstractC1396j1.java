package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.j1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1396j1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f5917a;

    public AbstractC1396j1(Unsafe unsafe) {
        this.f5917a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m4385a(Class cls) {
        return this.f5917a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m4386b(Class cls) {
        return this.f5917a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo4343c(long j7, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract byte mo4344d(long j7, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract double mo4345e(long j7, Object obj);

    /* JADX INFO: renamed from: f */
    public abstract float mo4346f(long j7, Object obj);

    /* JADX INFO: renamed from: g */
    public final int m4387g(long j7, Object obj) {
        return this.f5917a.getInt(obj, j7);
    }

    /* JADX INFO: renamed from: h */
    public final long m4388h(long j7, Object obj) {
        return this.f5917a.getLong(obj, j7);
    }

    /* JADX INFO: renamed from: i */
    public final Object m4389i(long j7, Object obj) {
        return this.f5917a.getObject(obj, j7);
    }

    /* JADX INFO: renamed from: j */
    public final long m4390j(Field field) {
        return this.f5917a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo4347k(Object obj, long j7, boolean z4);

    /* JADX INFO: renamed from: l */
    public abstract void mo4348l(Object obj, long j7, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo4349m(Object obj, long j7, double d3);

    /* JADX INFO: renamed from: n */
    public abstract void mo4350n(Object obj, long j7, float f13);

    /* JADX INFO: renamed from: o */
    public final void m4391o(long j7, Object obj, int i13) {
        this.f5917a.putInt(obj, j7, i13);
    }

    /* JADX INFO: renamed from: p */
    public final void m4392p(Object obj, long j7, long j13) {
        this.f5917a.putLong(obj, j7, j13);
    }

    /* JADX INFO: renamed from: q */
    public final void m4393q(long j7, Object obj, Object obj2) {
        this.f5917a.putObject(obj, j7, obj2);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo4355r() {
        Unsafe unsafe = this.f5917a;
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
            AbstractC1399k1.m4408a(th3);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo4351s();
}
