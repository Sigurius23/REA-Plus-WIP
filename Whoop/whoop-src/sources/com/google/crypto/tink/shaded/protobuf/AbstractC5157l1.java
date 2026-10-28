package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5157l1 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f21542a;

    public AbstractC5157l1(Unsafe unsafe) {
        this.f21542a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m16245a(Class cls) {
        return this.f21542a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m16246b(Class cls) {
        return this.f21542a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo16186c(long j7, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract byte mo16187d(long j7, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract double mo16188e(long j7, Object obj);

    /* JADX INFO: renamed from: f */
    public abstract float mo16189f(long j7, Object obj);

    /* JADX INFO: renamed from: g */
    public final int m16247g(long j7, Object obj) {
        return this.f21542a.getInt(obj, j7);
    }

    /* JADX INFO: renamed from: h */
    public final long m16248h(long j7, Object obj) {
        return this.f21542a.getLong(obj, j7);
    }

    /* JADX INFO: renamed from: i */
    public final Object m16249i(long j7, Object obj) {
        return this.f21542a.getObject(obj, j7);
    }

    /* JADX INFO: renamed from: j */
    public final long m16250j(Field field) {
        return this.f21542a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo16190k(Object obj, long j7, boolean z4);

    /* JADX INFO: renamed from: l */
    public abstract void mo16191l(Object obj, long j7, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo16192m(Object obj, long j7, double d3);

    /* JADX INFO: renamed from: n */
    public abstract void mo16193n(Object obj, long j7, float f13);

    /* JADX INFO: renamed from: o */
    public final void m16251o(long j7, Object obj, int i13) {
        this.f21542a.putInt(obj, j7, i13);
    }

    /* JADX INFO: renamed from: p */
    public final void m16252p(Object obj, long j7, long j13) {
        this.f21542a.putLong(obj, j7, j13);
    }

    /* JADX INFO: renamed from: q */
    public final void m16253q(long j7, Object obj, Object obj2) {
        this.f21542a.putObject(obj, j7, obj2);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo16216r() {
        Unsafe unsafe = this.f21542a;
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
            AbstractC5160m1.m16277a(th3);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo16194s();
}
