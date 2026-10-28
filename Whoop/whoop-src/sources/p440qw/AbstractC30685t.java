package p440qw;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: qw.t */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30685t {

    /* JADX INFO: renamed from: a */
    public static final AbstractC30685t f126250a;

    static {
        AbstractC30685t c30684s;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c30684s = new C30681p(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    c30684s = new C30684s();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                c30684s = new C30683r(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            c30684s = new C30682q(declaredMethod3, iIntValue);
        }
        f126250a = c30684s;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo94285a(Class cls);
}
