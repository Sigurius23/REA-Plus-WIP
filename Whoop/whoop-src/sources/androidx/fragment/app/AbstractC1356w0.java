package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import p002a0.C0021f1;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: androidx.fragment.app.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1356w0 {

    /* JADX INFO: renamed from: a */
    public static final C0021f1 f5823a = new C0021f1(0);

    /* JADX INFO: renamed from: b */
    public static Class m4242b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0021f1 c0021f1 = f5823a;
        C0021f1 c0021f2 = (C0021f1) c0021f1.get(classLoader);
        if (c0021f2 == null) {
            c0021f2 = new C0021f1(0);
            c0021f1.put(classLoader, c0021f2);
        }
        Class cls = (Class) c0021f2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0021f2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m4243c(ClassLoader classLoader, String str) {
        try {
            return m4242b(classLoader, str);
        } catch (ClassCastException e5) {
            throw new Fragment$InstantiationException(e5, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"));
        } catch (ClassNotFoundException e13) {
            throw new Fragment$InstantiationException(e13, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": make sure class name exists"));
        }
    }

    /* JADX INFO: renamed from: a */
    public AbstractComponentCallbacksC1320m0 mo4083a(ClassLoader classLoader, String str) {
        try {
            return (AbstractComponentCallbacksC1320m0) m4243c(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e5) {
            throw new Fragment$InstantiationException(e5, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (InstantiationException e13) {
            throw new Fragment$InstantiationException(e13, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (NoSuchMethodException e14) {
            throw new Fragment$InstantiationException(e14, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"));
        } catch (InvocationTargetException e15) {
            throw new Fragment$InstantiationException(e15, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"));
        }
    }
}
