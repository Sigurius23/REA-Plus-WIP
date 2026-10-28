package androidx.health.platform.client.proto;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.l3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1492l3 extends AbstractC1497m3 {
    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: c */
    public final boolean mo4686c(long j7, Object obj) {
        return this.f6069a.getBoolean(obj, j7);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: d */
    public final byte mo4687d(long j7, Object obj) {
        return this.f6069a.getByte(obj, j7);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: e */
    public final double mo4688e(long j7, Object obj) {
        return this.f6069a.getDouble(obj, j7);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: f */
    public final float mo4689f(long j7, Object obj) {
        return this.f6069a.getFloat(obj, j7);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: k */
    public final void mo4690k(Object obj, long j7, boolean z4) {
        this.f6069a.putBoolean(obj, j7, z4);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: l */
    public final void mo4691l(Object obj, long j7, byte b) {
        this.f6069a.putByte(obj, j7, b);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: m */
    public final void mo4692m(Object obj, long j7, double d3) {
        this.f6069a.putDouble(obj, j7, d3);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: n */
    public final void mo4693n(Object obj, long j7, float f13) {
        this.f6069a.putFloat(obj, j7, f13);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: r */
    public final boolean mo4696r() {
        if (!super.mo4696r()) {
            return false;
        }
        try {
            Class<?> cls = this.f6069a.getClass();
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
            AbstractC1502n3.m4719a(th3);
            return false;
        }
    }

    @Override // androidx.health.platform.client.proto.AbstractC1497m3
    /* JADX INFO: renamed from: s */
    public final boolean mo4694s() {
        Unsafe unsafe = this.f6069a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC1502n3.m4723e() != null) {
                    try {
                        Class<?> cls3 = this.f6069a.getClass();
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
                        AbstractC1502n3.m4719a(th3);
                        return false;
                    }
                }
            } catch (Throwable th4) {
                AbstractC1502n3.m4719a(th4);
            }
        }
        return false;
    }
}
