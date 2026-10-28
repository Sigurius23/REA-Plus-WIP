package androidx.health.platform.client.proto;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.m3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1497m3 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f6069a;

    public AbstractC1497m3(Unsafe unsafe) {
        this.f6069a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m4707a(Class cls) {
        return this.f6069a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m4708b(Class cls) {
        return this.f6069a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo4686c(long j7, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract byte mo4687d(long j7, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract double mo4688e(long j7, Object obj);

    /* JADX INFO: renamed from: f */
    public abstract float mo4689f(long j7, Object obj);

    /* JADX INFO: renamed from: g */
    public final int m4709g(long j7, Object obj) {
        return this.f6069a.getInt(obj, j7);
    }

    /* JADX INFO: renamed from: h */
    public final long m4710h(long j7, Object obj) {
        return this.f6069a.getLong(obj, j7);
    }

    /* JADX INFO: renamed from: i */
    public final Object m4711i(long j7, Object obj) {
        return this.f6069a.getObject(obj, j7);
    }

    /* JADX INFO: renamed from: j */
    public final long m4712j(Field field) {
        return this.f6069a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo4690k(Object obj, long j7, boolean z4);

    /* JADX INFO: renamed from: l */
    public abstract void mo4691l(Object obj, long j7, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo4692m(Object obj, long j7, double d3);

    /* JADX INFO: renamed from: n */
    public abstract void mo4693n(Object obj, long j7, float f13);

    /* JADX INFO: renamed from: o */
    public final void m4713o(long j7, Object obj, int i13) {
        this.f6069a.putInt(obj, j7, i13);
    }

    /* JADX INFO: renamed from: p */
    public final void m4714p(Object obj, long j7, long j13) {
        this.f6069a.putLong(obj, j7, j13);
    }

    /* JADX INFO: renamed from: q */
    public final void m4715q(long j7, Object obj, Object obj2) {
        this.f6069a.putObject(obj, j7, obj2);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo4696r() {
        Unsafe unsafe = this.f6069a;
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
            AbstractC1502n3.m4719a(th3);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo4694s();
}
