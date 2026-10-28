package androidx.health.platform.client.proto;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.n3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1502n3 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f6073a;

    /* JADX INFO: renamed from: b */
    public static final Class f6074b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC1497m3 f6075c;

    /* JADX INFO: renamed from: d */
    public static final boolean f6076d;

    /* JADX INFO: renamed from: e */
    public static final boolean f6077e;

    /* JADX INFO: renamed from: f */
    public static final long f6078f;

    /* JADX INFO: renamed from: g */
    public static final boolean f6079g;

    static {
        Unsafe unsafeM4728j = m4728j();
        f6073a = unsafeM4728j;
        f6074b = AbstractC1443c.f6023a;
        boolean zM4724f = m4724f(Long.TYPE);
        boolean zM4724f2 = m4724f(Integer.TYPE);
        AbstractC1497m3 c1492l3 = null;
        if (unsafeM4728j != null) {
            if (!AbstractC1443c.m4578a()) {
                c1492l3 = new C1492l3(unsafeM4728j);
            } else if (zM4724f) {
                c1492l3 = new C1487k3(unsafeM4728j, 1);
            } else if (zM4724f2) {
                c1492l3 = new C1487k3(unsafeM4728j, 0);
            }
        }
        f6075c = c1492l3;
        f6076d = c1492l3 == null ? false : c1492l3.mo4694s();
        f6077e = c1492l3 == null ? false : c1492l3.mo4696r();
        f6078f = m4721c(byte[].class);
        m4721c(boolean[].class);
        m4722d(boolean[].class);
        m4721c(int[].class);
        m4722d(int[].class);
        m4721c(long[].class);
        m4722d(long[].class);
        m4721c(float[].class);
        m4722d(float[].class);
        m4721c(double[].class);
        m4722d(double[].class);
        m4721c(Object[].class);
        m4722d(Object[].class);
        Field fieldM4723e = m4723e();
        if (fieldM4723e != null && c1492l3 != null) {
            c1492l3.m4712j(fieldM4723e);
        }
        f6079g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m4719a(Throwable th3) {
        Logger.getLogger(AbstractC1502n3.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
    }

    /* JADX INFO: renamed from: b */
    public static Object m4720b(Class cls) {
        try {
            return f6073a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m4721c(Class cls) {
        if (f6077e) {
            return f6075c.m4707a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m4722d(Class cls) {
        if (f6077e) {
            f6075c.m4708b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m4723e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1443c.m4578a()) {
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
    public static boolean m4724f(Class cls) {
        if (!AbstractC1443c.m4578a()) {
            return false;
        }
        try {
            Class cls2 = f6074b;
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
    public static byte m4725g(long j7, byte[] bArr) {
        return f6075c.mo4687d(f6078f + j7, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte m4726h(long j7, Object obj) {
        return (byte) ((f6075c.m4709g((-4) & j7, obj) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m4727i(long j7, Object obj) {
        return (byte) ((f6075c.m4709g((-4) & j7, obj) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m4728j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1482j3());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m4729k(byte[] bArr, long j7, byte b) {
        f6075c.mo4691l(bArr, f6078f + j7, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m4730l(Object obj, long j7, byte b) {
        long j13 = (-4) & j7;
        int iM4709g = f6075c.m4709g(j13, obj);
        int i13 = ((~((int) j7)) & 3) << 3;
        m4732n(j13, obj, ((255 & b) << i13) | (iM4709g & (~(255 << i13))));
    }

    /* JADX INFO: renamed from: m */
    public static void m4731m(Object obj, long j7, byte b) {
        long j13 = (-4) & j7;
        int i13 = (((int) j7) & 3) << 3;
        m4732n(j13, obj, ((255 & b) << i13) | (f6075c.m4709g(j13, obj) & (~(255 << i13))));
    }

    /* JADX INFO: renamed from: n */
    public static void m4732n(long j7, Object obj, int i13) {
        f6075c.m4713o(j7, obj, i13);
    }

    /* JADX INFO: renamed from: o */
    public static void m4733o(long j7, Object obj, Object obj2) {
        f6075c.m4715q(j7, obj, obj2);
    }
}
