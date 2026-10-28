package u83;

import java.lang.reflect.Method;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u83.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC34651a {

    /* JADX INFO: renamed from: a */
    public static final Method f145961a;

    /* JADX INFO: renamed from: b */
    public static final Method f145962b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        AbstractC22676k.m65747g(methods);
        int length = methods.length;
        int i13 = 0;
        while (true) {
            method = null;
            if (i13 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i13];
            if (AbstractC22676k.m65745e(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC22676k.m65749i(parameterTypes, "getParameterTypes(...)");
                if (AbstractC22676k.m65745e(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i13++;
        }
        f145961a = method2;
        for (Method method3 : methods) {
            if (AbstractC22676k.m65745e(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        f145962b = method;
    }
}
