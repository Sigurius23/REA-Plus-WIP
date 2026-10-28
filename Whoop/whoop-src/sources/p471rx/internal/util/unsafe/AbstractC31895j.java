package p471rx.internal.util.unsafe;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: rx.internal.util.unsafe.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31895j {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f132402a;

    /* JADX INFO: renamed from: b */
    public static final boolean f132403b;

    static {
        f132403b = System.getProperty("rx.unsafe-disable") != null;
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        f132402a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public static long m99143a(Class cls, String str) {
        try {
            return f132402a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e5) {
            InternalError internalError = new InternalError();
            internalError.initCause(e5);
            throw internalError;
        }
    }
}
