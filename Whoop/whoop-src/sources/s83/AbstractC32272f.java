package s83;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import q30.C29938w0;

/* JADX INFO: renamed from: s83.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC32272f {

    /* JADX INFO: renamed from: a */
    public static final C29938w0 f133571a;

    /* JADX INFO: renamed from: b */
    public static C29938w0 f133572b;

    static {
        Object obj = null;
        f133571a = new C29938w0(obj, obj, obj, 8);
    }

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement m100434a(AbstractC32267a abstractC32267a) {
        int iIntValue;
        String strM100429c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC32271e interfaceC32271e = (InterfaceC32271e) abstractC32267a.getClass().getAnnotation(InterfaceC32271e.class);
        String str = null;
        if (interfaceC32271e == null || interfaceC32271e.m100433v() < 1) {
            return null;
        }
        try {
            Field declaredField = abstractC32267a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC32267a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i13 = iIntValue >= 0 ? interfaceC32271e.m100431l()[iIntValue] : -1;
        C29938w0 c29938w0 = f133572b;
        C29938w0 c29938w1 = f133571a;
        if (c29938w0 == null) {
            try {
                C29938w0 c29938w2 = new C29938w0(Class.class.getDeclaredMethod("getModule", null), abstractC32267a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC32267a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 8);
                f133572b = c29938w2;
                c29938w0 = c29938w2;
            } catch (Exception unused2) {
                f133572b = c29938w1;
                c29938w0 = c29938w1;
            }
        }
        if (c29938w0 != c29938w1 && (method = (Method) c29938w0.f122260x) != null && (objInvoke = method.invoke(abstractC32267a.getClass(), null)) != null && (method2 = (Method) c29938w0.f122261y) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c29938w0.f122262z;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM100429c = interfaceC32271e.m100429c();
        } else {
            strM100429c = str + '/' + interfaceC32271e.m100429c();
        }
        return new StackTraceElement(strM100429c, interfaceC32271e.m100432m(), interfaceC32271e.m100430f(), i13);
    }
}
