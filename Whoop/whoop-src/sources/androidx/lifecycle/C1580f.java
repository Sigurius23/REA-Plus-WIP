package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C1580f {

    /* JADX INFO: renamed from: c */
    public static final C1580f f6215c = new C1580f();

    /* JADX INFO: renamed from: a */
    public final HashMap f6216a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f6217b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static void m4976c(HashMap map, C1576e c1576e, EnumC1632v enumC1632v, Class cls) {
        EnumC1632v enumC1632v2 = (EnumC1632v) map.get(c1576e);
        if (enumC1632v2 == null || enumC1632v == enumC1632v2) {
            if (enumC1632v2 == null) {
                map.put(c1576e, enumC1632v);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c1576e.f6207b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1632v2 + ", new value " + enumC1632v);
    }

    /* JADX INFO: renamed from: a */
    public final C1572d m4977a(Class cls, Method[] methodArr) {
        int i13;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f6216a;
        if (superclass != null) {
            C1572d c1572dM4977a = (C1572d) map2.get(superclass);
            if (c1572dM4977a == null) {
                c1572dM4977a = m4977a(superclass, null);
            }
            map.putAll(c1572dM4977a.f6198b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C1572d c1572dM4977a2 = (C1572d) map2.get(cls2);
            if (c1572dM4977a2 == null) {
                c1572dM4977a2 = m4977a(cls2, null);
            }
            for (Map.Entry entry : c1572dM4977a2.f6198b.entrySet()) {
                m4976c(map, (C1576e) entry.getKey(), (EnumC1632v) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e5) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
            }
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            InterfaceC1636w0 interfaceC1636w0 = (InterfaceC1636w0) method.getAnnotation(InterfaceC1636w0.class);
            if (interfaceC1636w0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i13 = 0;
                } else {
                    if (!InterfaceC1585g0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i13 = 1;
                }
                EnumC1632v enumC1632vValue = interfaceC1636w0.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1632v.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1632vValue != EnumC1632v.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i13 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m4976c(map, new C1576e(method, i13), enumC1632vValue, cls);
                z4 = true;
            }
        }
        C1572d c1572d = new C1572d(map);
        map2.put(cls, c1572d);
        this.f6217b.put(cls, Boolean.valueOf(z4));
        return c1572d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4978b(Class cls) {
        HashMap map = this.f6217b;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((InterfaceC1636w0) method.getAnnotation(InterfaceC1636w0.class)) != null) {
                    m4977a(cls, declaredMethods);
                    return true;
                }
            }
            map.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e5) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
        }
    }
}
