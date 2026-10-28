package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import m83.AbstractC25260n;
import p000.AbstractC11266d;
import p002a0.C0030i1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: androidx.lifecycle.t1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1628t1 {

    /* JADX INFO: renamed from: a */
    public static final List f6314a = AbstractC37056f.m118959K(Application.class, C1601k1.class);

    /* JADX INFO: renamed from: b */
    public static final List f6315b = AbstractC37056f.m118958J(C1601k1.class);

    /* JADX INFO: renamed from: a */
    public static final Constructor m5037a(Class modelClass, List signature) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        AbstractC22676k.m65750j(signature, "signature");
        C0030i1 c0030i1M65777h = AbstractC22681m0.m65777h(modelClass.getConstructors());
        while (c0030i1M65777h.hasNext()) {
            Constructor constructor = (Constructor) c0030i1M65777h.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC22676k.m65749i(parameterTypes, "getParameterTypes(...)");
            List listM74049W0 = AbstractC25260n.m74049W0(parameterTypes);
            if (signature.equals(listM74049W0)) {
                return constructor;
            }
            if (signature.size() == listM74049W0.size() && listM74049W0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC1637w1 m5038b(Class modelClass, Constructor constructor, Object... objArr) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        try {
            return (AbstractC1637w1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(AbstractC11266d.m30459m(modelClass, "Failed to access "), e5);
        } catch (InstantiationException e13) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException(AbstractC11266d.m30459m(modelClass, "An exception happened in constructor of "), e14.getCause());
        }
    }
}
