package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1393i1 extends AbstractC1396j1 {
    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: c */
    public final boolean mo4343c(long j7, Object obj) {
        return this.f5917a.getBoolean(obj, j7);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: d */
    public final byte mo4344d(long j7, Object obj) {
        return this.f5917a.getByte(obj, j7);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: e */
    public final double mo4345e(long j7, Object obj) {
        return this.f5917a.getDouble(obj, j7);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: f */
    public final float mo4346f(long j7, Object obj) {
        return this.f5917a.getFloat(obj, j7);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: k */
    public final void mo4347k(Object obj, long j7, boolean z4) {
        this.f5917a.putBoolean(obj, j7, z4);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: l */
    public final void mo4348l(Object obj, long j7, byte b) {
        this.f5917a.putByte(obj, j7, b);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: m */
    public final void mo4349m(Object obj, long j7, double d3) {
        this.f5917a.putDouble(obj, j7, d3);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: n */
    public final void mo4350n(Object obj, long j7, float f13) {
        this.f5917a.putFloat(obj, j7, f13);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: r */
    public final boolean mo4355r() {
        if (!super.mo4355r()) {
            return false;
        }
        try {
            Class<?> cls = this.f5917a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th3) {
            AbstractC1399k1.m4408a(th3);
            return false;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1396j1
    /* JADX INFO: renamed from: s */
    public final boolean mo4351s() {
        Unsafe unsafe = this.f5917a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC1399k1.m4412e() != null) {
                    try {
                        Class<?> cls3 = this.f5917a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th3) {
                        AbstractC1399k1.m4408a(th3);
                        return false;
                    }
                }
            } catch (Throwable th4) {
                AbstractC1399k1.m4408a(th4);
            }
        }
        return false;
    }
}
