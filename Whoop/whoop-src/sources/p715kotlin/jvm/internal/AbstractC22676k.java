package p715kotlin.jvm.internal;

import android.net.Uri;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p088dc.AbstractC11895b;
import p715kotlin.UninitializedPropertyAccessException;

/* JADX INFO: renamed from: kotlin.jvm.internal.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22676k {

    /* JADX INFO: renamed from: a */
    public static final Object[] f89338a = new Object[0];

    /* JADX INFO: renamed from: a */
    public static boolean m65741a(Double d3, double d14) {
        return d3 != null && d3.doubleValue() == d14;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m65742b(Double d3, Double d14) {
        if (d3 == null) {
            return d14 == null;
        }
        return d14 != null && d3.doubleValue() == d14.doubleValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m65743c(Float f13, float f14) {
        return f13 != null && f13.floatValue() == f14;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m65744d(Float f13, Float f14) {
        if (f13 == null) {
            return f14 == null;
        }
        return f14 != null && f13.floatValue() == f14.floatValue();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m65745e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: f */
    public static void m65746f(Uri uri) {
        if (uri != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Uri.parse(this) must not be null");
        m65754n(illegalStateException, AbstractC22676k.class.getName());
        throw illegalStateException;
    }

    /* JADX INFO: renamed from: g */
    public static void m65747g(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m65754n(nullPointerException, AbstractC22676k.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: h */
    public static void m65748h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m65754n(nullPointerException, AbstractC22676k.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: i */
    public static void m65749i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m65754n(nullPointerException, AbstractC22676k.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: j */
    public static void m65750j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m65753m(str));
        m65754n(nullPointerException, AbstractC22676k.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: k */
    public static int m65751k(int i13, int i14) {
        if (i13 < i14) {
            return -1;
        }
        return i13 == i14 ? 0 : 1;
    }

    /* JADX INFO: renamed from: l */
    public static int m65752l(long j7, long j13) {
        if (j7 < j13) {
            return -1;
        }
        return j7 == j13 ? 0 : 1;
    }

    /* JADX INFO: renamed from: m */
    public static String m65753m(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC22676k.class.getName();
        int i13 = 0;
        while (!stackTrace[i13].getClassName().equals(name)) {
            i13++;
        }
        while (stackTrace[i13].getClassName().equals(name)) {
            i13++;
        }
        StackTraceElement stackTraceElement = stackTrace[i13];
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM32001t.append(str);
        return sbM32001t.toString();
    }

    /* JADX INFO: renamed from: n */
    public static void m65754n(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i13 = -1;
        for (int i14 = 0; i14 < length; i14++) {
            if (str.equals(stackTrace[i14].getClassName())) {
                i13 = i14;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i13 + 1, length));
    }

    /* JADX INFO: renamed from: o */
    public static String m65755o(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: p */
    public static void m65756p() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: q */
    public static void m65757q(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(AbstractC11895b.m31996o("lateinit property ", str, " has not been initialized"));
        m65754n(uninitializedPropertyAccessException, AbstractC22676k.class.getName());
        throw uninitializedPropertyAccessException;
    }

    /* JADX INFO: renamed from: r */
    public static final Object[] m65758r(Collection collection) {
        m65750j(collection, "collection");
        int size = collection.size();
        Object[] objArr = f89338a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            objArrCopyOf[i13] = it.next();
            if (i14 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i15 = ((i14 * 3) + 1) >>> 1;
                if (i15 <= i14) {
                    i15 = 2147483645;
                    if (i14 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i15);
                m65749i(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i14);
                m65749i(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final Object[] m65759s(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        m65750j(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i13 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    m65748h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i14 = i13 + 1;
                    objArrCopyOf[i13] = it.next();
                    if (i14 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i15 = ((i14 * 3) + 1) >>> 1;
                        if (i15 <= i14) {
                            i15 = 2147483645;
                            if (i14 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i15);
                        m65749i(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i14] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i14);
                        m65749i(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i13 = i14;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
