package x93;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;

/* JADX INFO: renamed from: x93.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C38111d extends AbstractC38126r {

    /* JADX INFO: renamed from: a */
    public final Annotation f163219a;

    public C38111d(Annotation annotation) {
        AbstractC22676k.m65750j(annotation, "annotation");
        this.f163219a = annotation;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m122096b() throws IllegalAccessException, InvocationTargetException {
        Object c38123o;
        Annotation annotation = this.f163219a;
        Method[] declaredMethods = AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation)).getDeclaredMethods();
        AbstractC22676k.m65749i(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            AbstractC22676k.m65749i(objInvoke, "invoke(...)");
            C35850h c35850hM113814e = C35850h.m113814e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = AbstractC38109c.f163211a;
            if (Enum.class.isAssignableFrom(cls)) {
                c38123o = new C38127s(c35850hM113814e, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                c38123o = new C38114f(c35850hM113814e, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                c38123o = new C38115g(c35850hM113814e, (Object[]) objInvoke);
            } else {
                c38123o = objInvoke instanceof Class ? new C38123o(c35850hM113814e, (Class) objInvoke) : new C38129u(c35850hM113814e, objInvoke);
            }
            arrayList.add(c38123o);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C38111d) {
            return this.f163219a == ((C38111d) obj).f163219a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f163219a);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        AbstractC11266d.m30443A(C38111d.class, sb4, ": ");
        sb4.append(this.f163219a);
        return sb4.toString();
    }
}
