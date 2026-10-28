package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1229k1 extends AbstractC1232l1 {
    public C1229k1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: c */
    public final boolean mo3812c(long j7, Object obj) {
        return this.f5426a.getBoolean(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: d */
    public final double mo3813d(long j7, Object obj) {
        return this.f5426a.getDouble(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: e */
    public final float mo3814e(long j7, Object obj) {
        return this.f5426a.getFloat(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: j */
    public final void mo3815j(Object obj, long j7, boolean z4) {
        this.f5426a.putBoolean(obj, j7, z4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: k */
    public final void mo3816k(Object obj, long j7, byte b) {
        this.f5426a.putByte(obj, j7, b);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: l */
    public final void mo3817l(Object obj, long j7, double d3) {
        this.f5426a.putDouble(obj, j7, d3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: m */
    public final void mo3818m(Object obj, long j7, float f13) {
        this.f5426a.putFloat(obj, j7, f13);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: q */
    public final boolean mo3865q() {
        if (!super.mo3865q()) {
            return false;
        }
        try {
            Class<?> cls = this.f5426a.getClass();
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
            AbstractC1235m1.m3915a(th3);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1232l1
    /* JADX INFO: renamed from: r */
    public final boolean mo3819r() {
        Unsafe unsafe = this.f5426a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC1235m1.m3921g() != null) {
                    try {
                        Class<?> cls3 = this.f5426a.getClass();
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
                        AbstractC1235m1.m3915a(th3);
                        return false;
                    }
                }
            } catch (Throwable th4) {
                AbstractC1235m1.m3915a(th4);
            }
        }
        return false;
    }
}
