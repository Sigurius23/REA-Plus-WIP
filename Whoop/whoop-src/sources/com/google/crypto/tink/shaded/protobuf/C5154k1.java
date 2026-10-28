package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5154k1 extends AbstractC5157l1 {
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: c */
    public final boolean mo16186c(long j7, Object obj) {
        return this.f21542a.getBoolean(obj, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: d */
    public final byte mo16187d(long j7, Object obj) {
        return this.f21542a.getByte(obj, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: e */
    public final double mo16188e(long j7, Object obj) {
        return this.f21542a.getDouble(obj, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: f */
    public final float mo16189f(long j7, Object obj) {
        return this.f21542a.getFloat(obj, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: k */
    public final void mo16190k(Object obj, long j7, boolean z4) {
        this.f21542a.putBoolean(obj, j7, z4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: l */
    public final void mo16191l(Object obj, long j7, byte b) {
        this.f21542a.putByte(obj, j7, b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: m */
    public final void mo16192m(Object obj, long j7, double d3) {
        this.f21542a.putDouble(obj, j7, d3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: n */
    public final void mo16193n(Object obj, long j7, float f13) {
        this.f21542a.putFloat(obj, j7, f13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: r */
    public final boolean mo16216r() {
        if (!super.mo16216r()) {
            return false;
        }
        try {
            Class<?> cls = this.f21542a.getClass();
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
            AbstractC5160m1.m16277a(th3);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5157l1
    /* JADX INFO: renamed from: s */
    public final boolean mo16194s() {
        Unsafe unsafe = this.f21542a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC5160m1.m16281e() != null) {
                    try {
                        Class<?> cls3 = this.f21542a.getClass();
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
                        AbstractC5160m1.m16277a(th3);
                        return false;
                    }
                }
            } catch (Throwable th4) {
                AbstractC5160m1.m16277a(th4);
            }
        }
        return false;
    }
}
