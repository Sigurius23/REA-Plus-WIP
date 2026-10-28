package tw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import s30.AbstractC32100b;

/* JADX INFO: renamed from: tw.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C34213b extends AbstractC32100b {

    /* JADX INFO: renamed from: w */
    public final Method f143518w = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: x */
    public final Method f143519x = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: y */
    public final Method f143520y;

    /* JADX INFO: renamed from: z */
    public final Method f143521z;

    public C34213b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f143520y = cls.getMethod("getName", null);
        this.f143521z = cls.getMethod("getType", null);
    }

    @Override // s30.AbstractC32100b
    /* JADX INFO: renamed from: j */
    public final Method mo99875j(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }

    @Override // s30.AbstractC32100b
    /* JADX INFO: renamed from: k */
    public final Constructor mo99876k(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f143519x.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i13 = 0; i13 < objArr.length; i13++) {
                clsArr[i13] = (Class) this.f143521z.invoke(objArr[i13], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }

    @Override // s30.AbstractC32100b
    /* JADX INFO: renamed from: n */
    public final String[] mo99877n(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f143519x.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i13 = 0; i13 < objArr.length; i13++) {
                strArr[i13] = (String) this.f143520y.invoke(objArr[i13], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }

    @Override // s30.AbstractC32100b
    /* JADX INFO: renamed from: q */
    public final boolean mo99878q(Class cls) {
        try {
            return ((Boolean) this.f143518w.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }
}
