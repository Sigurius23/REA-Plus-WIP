package mb3;

import androidx.room.C1832u;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23797r;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23809x;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m83.AbstractC25267u;
import ob3.EnumC27792b;
import ob3.InterfaceC27797g;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import za3.C40248c;

/* JADX INFO: renamed from: mb3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C25388e {

    /* JADX INFO: renamed from: a */
    public static final C25388e f99473a = new C25388e();

    /* JADX INFO: renamed from: b */
    public static AbstractC23763c0 m74462b(AbstractC23763c0 abstractC23763c0) {
        AbstractC23811y abstractC23811yMo69868b;
        InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23763c0.mo69844i0();
        C23809x c23809x = null;
        abstractC23773f1Mo69863p0 = null;
        AbstractC23773f1 abstractC23773f1Mo69863p0 = null;
        if (interfaceC23796q0Mo69844i0 instanceof C40248c) {
            C40248c c40248c = (C40248c) interfaceC23796q0Mo69844i0;
            AbstractC23804u0 abstractC23804u0 = c40248c.f174039w;
            AbstractC23804u0 abstractC23804u1 = abstractC23804u0.mo69867a() == EnumC23776g1.IN_VARIANCE ? abstractC23804u0 : null;
            if (abstractC23804u1 != null && (abstractC23811yMo69868b = abstractC23804u1.mo69868b()) != null) {
                abstractC23773f1Mo69863p0 = abstractC23811yMo69868b.mo69863p0();
            }
            AbstractC23773f1 abstractC23773f1 = abstractC23773f1Mo69863p0;
            if (c40248c.f174040x == null) {
                Collection supertypes = c40248c.getSupertypes();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(supertypes, 10));
                Iterator it = supertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC23811y) it.next()).mo69863p0());
                }
                c40248c.f174040x = new C25392i(abstractC23804u0, arrayList);
            }
            EnumC27792b enumC27792b = EnumC27792b.f112043w;
            C25392i c25392i = c40248c.f174040x;
            AbstractC22676k.m65747g(c25392i);
            return new C25391h(enumC27792b, c25392i, abstractC23773f1, abstractC23763c0.mo69843Y(), abstractC23763c0.mo69814k0(), 32);
        }
        if (!(interfaceC23796q0Mo69844i0 instanceof C23809x) || !abstractC23763c0.mo69814k0()) {
            return abstractC23763c0;
        }
        C23809x c23809x2 = (C23809x) interfaceC23796q0Mo69844i0;
        LinkedHashSet linkedHashSet = c23809x2.f94205x;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(linkedHashSet, 10));
        Iterator it3 = linkedHashSet.iterator();
        boolean z4 = false;
        while (it3.hasNext()) {
            arrayList2.add(AbstractC20301a.m56318Q((AbstractC23811y) it3.next()));
            z4 = true;
        }
        if (z4) {
            AbstractC23811y abstractC23811y = c23809x2.f94204w;
            AbstractC23773f1 abstractC23773f1M56318Q = abstractC23811y != null ? AbstractC20301a.m56318Q(abstractC23811y) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C23809x c23809x3 = new C23809x(linkedHashSet2);
            c23809x3.f94204w = abstractC23773f1M56318Q;
            c23809x = c23809x3;
        }
        if (c23809x != null) {
            c23809x2 = c23809x;
        }
        return c23809x2.m69912a();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC23773f1 m74463a(InterfaceC27797g type) {
        AbstractC23773f1 abstractC23773f1M69883b;
        AbstractC22676k.m65750j(type, "type");
        if (!(type instanceof AbstractC23811y)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC23773f1 abstractC23773f1Mo69863p0 = ((AbstractC23811y) type).mo69863p0();
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23763c0) {
            abstractC23773f1M69883b = m74462b((AbstractC23763c0) abstractC23773f1Mo69863p0);
        } else {
            if (!(abstractC23773f1Mo69863p0 instanceof AbstractC23797r)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC23797r abstractC23797r = (AbstractC23797r) abstractC23773f1Mo69863p0;
            AbstractC23763c0 abstractC23763c0 = abstractC23797r.f94188y;
            AbstractC23763c0 abstractC23763c1 = abstractC23797r.f94187x;
            AbstractC23763c0 abstractC23763c0M74462b = m74462b(abstractC23763c1);
            AbstractC23763c0 abstractC23763c0M74462b2 = m74462b(abstractC23763c0);
            abstractC23773f1M69883b = (abstractC23763c0M74462b == abstractC23763c1 && abstractC23763c0M74462b2 == abstractC23763c0) ? abstractC23773f1Mo69863p0 : AbstractC23791o.m69883b(abstractC23763c0M74462b, abstractC23763c0M74462b2);
        }
        C1832u c1832u = new C1832u(1, this, C25388e.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0, 18);
        AbstractC23811y abstractC23811yM69884c = AbstractC23791o.m69884c(abstractC23773f1Mo69863p0);
        return AbstractC23791o.m69897p(abstractC23773f1M69883b, abstractC23811yM69884c != null ? (AbstractC23811y) c1832u.invoke(abstractC23811yM69884c) : null);
    }
}
