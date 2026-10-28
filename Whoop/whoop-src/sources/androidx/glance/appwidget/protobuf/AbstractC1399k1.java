package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.k1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1399k1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f5926a;

    /* JADX INFO: renamed from: b */
    public static final Class f5927b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC1396j1 f5928c;

    /* JADX INFO: renamed from: d */
    public static final boolean f5929d;

    /* JADX INFO: renamed from: e */
    public static final boolean f5930e;

    /* JADX INFO: renamed from: f */
    public static final long f5931f;

    /* JADX INFO: renamed from: g */
    public static final boolean f5932g;

    static {
        Unsafe unsafeM4417j = m4417j();
        f5926a = unsafeM4417j;
        f5927b = AbstractC1373c.f5871a;
        boolean zM4413f = m4413f(Long.TYPE);
        boolean zM4413f2 = m4413f(Integer.TYPE);
        AbstractC1396j1 c1393i1 = null;
        if (unsafeM4417j != null) {
            if (!AbstractC1373c.m4297a()) {
                c1393i1 = new C1393i1(unsafeM4417j);
            } else if (zM4413f) {
                c1393i1 = new C1390h1(unsafeM4417j, 1);
            } else if (zM4413f2) {
                c1393i1 = new C1390h1(unsafeM4417j, 0);
            }
        }
        f5928c = c1393i1;
        f5929d = c1393i1 == null ? false : c1393i1.mo4351s();
        f5930e = c1393i1 == null ? false : c1393i1.mo4355r();
        f5931f = m4410c(byte[].class);
        m4410c(boolean[].class);
        m4411d(boolean[].class);
        m4410c(int[].class);
        m4411d(int[].class);
        m4410c(long[].class);
        m4411d(long[].class);
        m4410c(float[].class);
        m4411d(float[].class);
        m4410c(double[].class);
        m4411d(double[].class);
        m4410c(Object[].class);
        m4411d(Object[].class);
        Field fieldM4412e = m4412e();
        if (fieldM4412e != null && c1393i1 != null) {
            c1393i1.m4390j(fieldM4412e);
        }
        f5932g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m4408a(Throwable th3) {
        Logger.getLogger(AbstractC1399k1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
    }

    /* JADX INFO: renamed from: b */
    public static Object m4409b(Class cls) {
        try {
            return f5926a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m4410c(Class cls) {
        if (f5930e) {
            return f5928c.m4385a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m4411d(Class cls) {
        if (f5930e) {
            f5928c.m4386b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m4412e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1373c.m4297a()) {
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
    public static boolean m4413f(Class cls) {
        if (!AbstractC1373c.m4297a()) {
            return false;
        }
        try {
            Class cls2 = f5927b;
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
    public static byte m4414g(long j7, byte[] bArr) {
        return f5928c.mo4344d(f5931f + j7, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte m4415h(long j7, Object obj) {
        return (byte) ((f5928c.m4387g((-4) & j7, obj) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m4416i(long j7, Object obj) {
        return (byte) ((f5928c.m4387g((-4) & j7, obj) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m4417j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1387g1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m4418k(byte[] bArr, long j7, byte b) {
        f5928c.mo4348l(bArr, f5931f + j7, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m4419l(Object obj, long j7, byte b) {
        long j13 = (-4) & j7;
        int iM4387g = f5928c.m4387g(j13, obj);
        int i13 = ((~((int) j7)) & 3) << 3;
        m4421n(j13, obj, ((255 & b) << i13) | (iM4387g & (~(255 << i13))));
    }

    /* JADX INFO: renamed from: m */
    public static void m4420m(Object obj, long j7, byte b) {
        long j13 = (-4) & j7;
        int i13 = (((int) j7) & 3) << 3;
        m4421n(j13, obj, ((255 & b) << i13) | (f5928c.m4387g(j13, obj) & (~(255 << i13))));
    }

    /* JADX INFO: renamed from: n */
    public static void m4421n(long j7, Object obj, int i13) {
        f5928c.m4391o(j7, obj, i13);
    }

    /* JADX INFO: renamed from: o */
    public static void m4422o(Object obj, long j7, long j13) {
        f5928c.m4392p(obj, j7, j13);
    }

    /* JADX INFO: renamed from: p */
    public static void m4423p(long j7, Object obj, Object obj2) {
        f5928c.m4393q(j7, obj, obj2);
    }
}
