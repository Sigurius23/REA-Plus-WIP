package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1235m1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f5431a;

    /* JADX INFO: renamed from: b */
    public static final Class f5432b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC1232l1 f5433c;

    /* JADX INFO: renamed from: d */
    public static final boolean f5434d;

    /* JADX INFO: renamed from: e */
    public static final boolean f5435e;

    /* JADX INFO: renamed from: f */
    public static final long f5436f;

    /* JADX INFO: renamed from: g */
    public static final boolean f5437g;

    static {
        Unsafe unsafeM3923i = m3923i();
        f5431a = unsafeM3923i;
        f5432b = AbstractC1203c.f5360a;
        boolean zM3922h = m3922h(Long.TYPE);
        boolean zM3922h2 = m3922h(Integer.TYPE);
        AbstractC1232l1 c1229k1 = null;
        if (unsafeM3923i != null) {
            if (!AbstractC1203c.m3787a()) {
                c1229k1 = new C1229k1(unsafeM3923i);
            } else if (zM3922h) {
                c1229k1 = new C1226j1(unsafeM3923i);
            } else if (zM3922h2) {
                c1229k1 = new C1223i1(unsafeM3923i);
            }
        }
        f5433c = c1229k1;
        f5434d = c1229k1 == null ? false : c1229k1.mo3819r();
        f5435e = c1229k1 == null ? false : c1229k1.mo3865q();
        f5436f = m3919e(byte[].class);
        m3919e(boolean[].class);
        m3920f(boolean[].class);
        m3919e(int[].class);
        m3920f(int[].class);
        m3919e(long[].class);
        m3920f(long[].class);
        m3919e(float[].class);
        m3920f(float[].class);
        m3919e(double[].class);
        m3920f(double[].class);
        m3919e(Object[].class);
        m3920f(Object[].class);
        Field fieldM3921g = m3921g();
        if (fieldM3921g != null && c1229k1 != null) {
            c1229k1.m3884i(fieldM3921g);
        }
        f5437g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m3915a(Throwable th3) {
        Logger.getLogger(AbstractC1235m1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3916b(long j7, Object obj) {
        return ((byte) ((f5433c.m3881f((-4) & j7, obj) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3917c(long j7, Object obj) {
        return ((byte) ((f5433c.m3881f((-4) & j7, obj) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static Object m3918d(Class cls) {
        try {
            return f5431a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m3919e(Class cls) {
        if (f5435e) {
            return f5433c.m3879a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m3920f(Class cls) {
        if (f5435e) {
            f5433c.m3880b(cls);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Field m3921g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1203c.m3787a()) {
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

    /* JADX INFO: renamed from: h */
    public static boolean m3922h(Class cls) {
        if (!AbstractC1203c.m3787a()) {
            return false;
        }
        try {
            Class cls2 = f5432b;
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

    /* JADX INFO: renamed from: i */
    public static Unsafe m3923i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1220h1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m3924j(byte[] bArr, long j7, byte b) {
        f5433c.mo3816k(bArr, f5436f + j7, b);
    }

    /* JADX INFO: renamed from: k */
    public static void m3925k(Object obj, long j7, byte b) {
        long j13 = (-4) & j7;
        int iM3881f = f5433c.m3881f(j13, obj);
        int i13 = ((~((int) j7)) & 3) << 3;
        m3927m(j13, obj, ((255 & b) << i13) | (iM3881f & (~(255 << i13))));
    }

    /* JADX INFO: renamed from: l */
    public static void m3926l(Object obj, long j7, byte b) {
        long j13 = (-4) & j7;
        int i13 = (((int) j7) & 3) << 3;
        m3927m(j13, obj, ((255 & b) << i13) | (f5433c.m3881f(j13, obj) & (~(255 << i13))));
    }

    /* JADX INFO: renamed from: m */
    public static void m3927m(long j7, Object obj, int i13) {
        f5433c.m3885n(j7, obj, i13);
    }

    /* JADX INFO: renamed from: n */
    public static void m3928n(Object obj, long j7, long j13) {
        f5433c.m3886o(obj, j7, j13);
    }

    /* JADX INFO: renamed from: o */
    public static void m3929o(long j7, Object obj, Object obj2) {
        f5433c.m3887p(j7, obj, obj2);
    }
}
