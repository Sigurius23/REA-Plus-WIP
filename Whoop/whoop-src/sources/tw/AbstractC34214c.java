package tw;

import com.nimbusds.jose.shaded.gson.JsonIOException;
import ih0.AbstractC18489d0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import s30.AbstractC32100b;

/* JADX INFO: renamed from: tw.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC34214c {

    /* JADX INFO: renamed from: a */
    public static final AbstractC32100b f143522a;

    static {
        AbstractC32100b c34212a;
        try {
            c34212a = new C34213b();
        } catch (ReflectiveOperationException unused) {
            c34212a = new C34212a();
        }
        f143522a = c34212a;
    }

    /* JADX INFO: renamed from: a */
    public static void m108136a(AccessibleObject accessibleObject, StringBuilder sb4) {
        sb4.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i13 = 0; i13 < parameterTypes.length; i13++) {
            if (i13 > 0) {
                sb4.append(", ");
            }
            sb4.append(parameterTypes[i13].getSimpleName());
        }
        sb4.append(')');
    }

    /* JADX INFO: renamed from: b */
    public static String m108137b(Constructor constructor) {
        StringBuilder sb4 = new StringBuilder(constructor.getDeclaringClass().getName());
        m108136a(constructor, sb4);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m108138c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* JADX INFO: renamed from: d */
    public static String m108139d(AccessibleObject accessibleObject, boolean z4) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m108138c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb4 = new StringBuilder(method.getName());
            m108136a(method, sb4);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb4.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m108137b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z4 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* JADX INFO: renamed from: e */
    public static String m108140e(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    /* JADX INFO: renamed from: f */
    public static void m108141f(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e5) {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Failed making ", m108139d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            sbM53375p.append(m108140e(e5));
            throw new JsonIOException(sbM53375p.toString(), e5);
        }
    }
}
