package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.m1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5160m1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f21549a;

    /* JADX INFO: renamed from: b */
    public static final Class f21550b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC5157l1 f21551c;

    /* JADX INFO: renamed from: d */
    public static final boolean f21552d;

    /* JADX INFO: renamed from: e */
    public static final boolean f21553e;

    /* JADX INFO: renamed from: f */
    public static final long f21554f;

    /* JADX INFO: renamed from: g */
    public static final boolean f21555g;

    static {
        Unsafe unsafeM16286j = m16286j();
        f21549a = unsafeM16286j;
        f21550b = AbstractC5128c.f21484a;
        boolean zM16282f = m16282f(Long.TYPE);
        boolean zM16282f2 = m16282f(Integer.TYPE);
        AbstractC5157l1 c5154k1 = null;
        if (unsafeM16286j != null) {
            if (!AbstractC5128c.m16150a()) {
                c5154k1 = new C5154k1(unsafeM16286j);
            } else if (zM16282f) {
                c5154k1 = new C5151j1(unsafeM16286j, 1);
            } else if (zM16282f2) {
                c5154k1 = new C5151j1(unsafeM16286j, 0);
            }
        }
        f21551c = c5154k1;
        f21552d = c5154k1 == null ? false : c5154k1.mo16194s();
        f21553e = c5154k1 == null ? false : c5154k1.mo16216r();
        f21554f = m16279c(byte[].class);
        m16279c(boolean[].class);
        m16280d(boolean[].class);
        m16279c(int[].class);
        m16280d(int[].class);
        m16279c(long[].class);
        m16280d(long[].class);
        m16279c(float[].class);
        m16280d(float[].class);
        m16279c(double[].class);
        m16280d(double[].class);
        m16279c(Object[].class);
        m16280d(Object[].class);
        Field fieldM16281e = m16281e();
        if (fieldM16281e != null && c5154k1 != null) {
            c5154k1.m16250j(fieldM16281e);
        }
        f21555g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m16277a(Throwable th3) {
        Logger.getLogger(AbstractC5160m1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
    }

    /* JADX INFO: renamed from: b */
    public static Object m16278b(Class cls) {
        try {
            return f21549a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m16279c(Class cls) {
        if (f21553e) {
            return f21551c.m16245a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m16280d(Class cls) {
        if (f21553e) {
            f21551c.m16246b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m16281e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC5128c.m16150a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16282f(Class cls) {
        if (!AbstractC5128c.m16150a()) {
            return false;
        }
        try {
            Class cls2 = f21550b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte m16283g(long j7, byte[] bArr) {
        return f21551c.mo16187d(f21554f + j7, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte m16284h(long j7, Object obj) {
        return (byte) ((f21551c.m16247g((-4) & j7, obj) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m16285i(long j7, Object obj) {
        return (byte) ((f21551c.m16247g((-4) & j7, obj) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m16286j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5148i1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m16287k(byte[] bArr, long j7, byte b) {
        f21551c.mo16191l(bArr, f21554f + j7, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m16288l(Object obj, long j7, byte b) {
        long j13 = (-4) & j7;
        int iM16247g = f21551c.m16247g(j13, obj);
        int i13 = ((~((int) j7)) & 3) << 3;
        m16290n(j13, obj, ((255 & b) << i13) | (iM16247g & (~(255 << i13))));
    }

    /* JADX INFO: renamed from: m */
    public static void m16289m(Object obj, long j7, byte b) {
        long j13 = (-4) & j7;
        int i13 = (((int) j7) & 3) << 3;
        m16290n(j13, obj, ((255 & b) << i13) | (f21551c.m16247g(j13, obj) & (~(255 << i13))));
    }

    /* JADX INFO: renamed from: n */
    public static void m16290n(long j7, Object obj, int i13) {
        f21551c.m16251o(j7, obj, i13);
    }

    /* JADX INFO: renamed from: o */
    public static void m16291o(Object obj, long j7, long j13) {
        f21551c.m16252p(obj, j7, j13);
    }

    /* JADX INFO: renamed from: p */
    public static void m16292p(long j7, Object obj, Object obj2) {
        f21551c.m16253q(j7, obj, obj2);
    }
}
