package x93;

import java.lang.reflect.Type;
import java.util.Iterator;
import ma3.InterfaceC25376e;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;

/* JADX INFO: renamed from: x93.a0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC38106a0 implements InterfaceC25376e {
    @Override // ma3.InterfaceC25373b
    /* JADX INFO: renamed from: a */
    public C38111d mo74422a(C35847e fqName) {
        Object next;
        AbstractC22676k.m65750j(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC22676k.m65745e(AbstractC38109c.m122089a(AbstractC21598x.m60663S(AbstractC21598x.m60655K(((C38111d) next).f163219a))).m113773a(), fqName)) {
                return (C38111d) next;
            }
        }
        next = null;
        return (C38111d) next;
    }

    /* JADX INFO: renamed from: b */
    public abstract Type mo122088b();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC38106a0) && AbstractC22676k.m65745e(mo122088b(), ((AbstractC38106a0) obj).mo122088b());
    }

    public final int hashCode() {
        return mo122088b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo122088b();
    }
}
