package k93;

import g73.C15556d;
import j93.InterfaceC21461d;
import j93.InterfaceC21467g;
import java.util.Iterator;
import java.util.List;
import p000.C31931s;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.DescriptorKFunction;
import p715kotlin.reflect.jvm.internal.KClassImpl;
import r93.InterfaceC31132j;
import r93.InterfaceC31162w;
import s93.AbstractC32306h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: k93.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22306c {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC21467g m64099a(InterfaceC21461d interfaceC21461d) {
        Object next;
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        Iterator<T> it = ((KClassImpl) interfaceC21461d).getConstructors().iterator();
        while (it.hasNext()) {
            next = it.next();
            InterfaceC21467g interfaceC21467g = (InterfaceC21467g) next;
            AbstractC22676k.m65748h(interfaceC21467g, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.DescriptorKFunction");
            InterfaceC31162w descriptor = ((DescriptorKFunction) interfaceC21467g).getDescriptor();
            AbstractC22676k.m65748h(descriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((InterfaceC31132j) descriptor).mo95869O()) {
                return (InterfaceC21467g) next;
            }
        }
        next = null;
        return (InterfaceC21467g) next;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m64100b(InterfaceC21461d interfaceC21461d, InterfaceC21461d base) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        AbstractC22676k.m65750j(base, "base");
        if (interfaceC21461d.equals(base)) {
            return true;
        }
        List listM118958J = AbstractC37056f.m118958J(interfaceC21461d);
        C22305b c22305b = C22305b.f87029w;
        return AbstractC32306h.m100569r(listM118958J, new C15556d(), new C31931s(base, 10)).booleanValue();
    }
}
