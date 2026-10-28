package m93;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23470p;
import m83.AbstractC25260n;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: renamed from: m93.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C25334d implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Class f99352a;

    /* JADX INFO: renamed from: b */
    public final Map f99353b;

    /* JADX INFO: renamed from: c */
    public final C23470p f99354c;

    /* JADX INFO: renamed from: d */
    public final C23470p f99355d;

    /* JADX INFO: renamed from: e */
    public final List f99356e;

    public C25334d(Class cls, Map map, C23470p c23470p, C23470p c23470p2, List list) {
        this.f99352a = cls;
        this.f99353b = map;
        this.f99354c = c23470p;
        this.f99355d = c23470p2;
        this.f99356e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zM65745e;
        boolean z4;
        String name = method.getName();
        Class cls = this.f99352a;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f99355d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f99354c.getValue();
            }
        }
        boolean zM65745e2 = AbstractC22676k.m65745e(name, "equals");
        Map map = this.f99353b;
        boolean z13 = false;
        if (!zM65745e2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb4 = new StringBuilder("Method is not supported: ");
            sb4.append(method);
            sb4.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb4.append(AbstractC25260n.m74049W0(objArr));
            sb4.append(')');
            throw new KotlinReflectionInternalError(sb4.toString());
        }
        Object objM74037M0 = AbstractC25260n.m74037M0(objArr);
        Annotation annotation = objM74037M0 instanceof Annotation ? (Annotation) objM74037M0 : null;
        if (AbstractC22676k.m65745e(annotation != null ? AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation)) : null, cls)) {
            List list = this.f99356e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = true;
                        break;
                    }
                    Method method2 = (Method) it.next();
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objM74037M0, null);
                    if (obj2 instanceof boolean[]) {
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zM65745e = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zM65745e = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zM65745e = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zM65745e = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zM65745e = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zM65745e = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zM65745e = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zM65745e = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zM65745e = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zM65745e = AbstractC22676k.m65745e(obj2, objInvoke);
                    }
                    if (!zM65745e) {
                        z4 = false;
                        break;
                    }
                }
            } else {
                z4 = true;
                break;
            }
            if (z4) {
                z13 = true;
            }
        }
        return Boolean.valueOf(z13);
    }
}
