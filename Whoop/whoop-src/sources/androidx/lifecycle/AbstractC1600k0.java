package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import nh3.AbstractC26725a;
import p002a0.C0030i1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: androidx.lifecycle.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1600k0 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f6266a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f6267b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m4998a(Constructor constructor, InterfaceC1581f0 interfaceC1581f0) {
        try {
            Object objNewInstance = constructor.newInstance(interfaceC1581f0);
            AbstractC22676k.m65747g(objNewInstance);
            AbstractC26725a.m79511o(objNewInstance);
            throw null;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e13) {
            throw new RuntimeException(e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException(e14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX INFO: renamed from: b */
    public static int m4999b(Class cls) {
        Constructor<?> declaredConstructor;
        C0030i1 c0030i1M65777h;
        Class cls2;
        HashMap map = f6266a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i13 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r10 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r10 != null ? r10.getName() : "";
                AbstractC22676k.m65747g(name);
                if (name.length() != 0) {
                    AbstractC22676k.m65747g(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC22676k.m65749i(canonicalName, "substring(...)");
                }
                AbstractC22676k.m65747g(canonicalName);
                String strConcat = AbstractC39421y.m125926K(canonicalName, ".", "_", false).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException(e5);
            }
            HashMap map2 = f6267b;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC37056f.m118958J(declaredConstructor));
            } else if (!C1580f.f6215c.m4978b(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass == null || !InterfaceC1581f0.class.isAssignableFrom(superclass)) {
                    c0030i1M65777h = AbstractC22681m0.m65777h(cls.getInterfaces());
                    while (c0030i1M65777h.hasNext()) {
                        cls2 = (Class) c0030i1M65777h.next();
                        if (cls2 == null && InterfaceC1581f0.class.isAssignableFrom(cls2)) {
                            AbstractC22676k.m65747g(cls2);
                            if (m4999b(cls2) != 1) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj = map2.get(cls2);
                                AbstractC22676k.m65747g(obj);
                                arrayList.addAll((Collection) obj);
                            }
                        }
                    }
                    if (arrayList != null) {
                        map2.put(cls, arrayList);
                    }
                } else {
                    AbstractC22676k.m65747g(superclass);
                    if (m4999b(superclass) != 1) {
                        Object obj2 = map2.get(superclass);
                        AbstractC22676k.m65747g(obj2);
                        arrayList = new ArrayList((Collection) obj2);
                        c0030i1M65777h = AbstractC22681m0.m65777h(cls.getInterfaces());
                        while (c0030i1M65777h.hasNext()) {
                            cls2 = (Class) c0030i1M65777h.next();
                            if (cls2 == null) {
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i13 = 2;
        }
        map.put(cls, Integer.valueOf(i13));
        return i13;
    }
}
