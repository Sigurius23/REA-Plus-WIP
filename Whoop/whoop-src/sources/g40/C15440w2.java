package g40;

import a33.C0352d;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import p088dc.AbstractC11895b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.w2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15440w2 implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f58024a;

    /* JADX INFO: renamed from: b */
    public final List f58025b;

    /* JADX INFO: renamed from: c */
    public final C0352d f58026c;

    /* JADX INFO: renamed from: d */
    public final boolean f58027d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41211c f58028e;

    public C15440w2(IdentifierSpec identifierSpec, List list, C0352d c0352d) {
        InterfaceC41211c interfaceC41211cMo43532c;
        this.f58024a = identifierSpec;
        this.f58025b = list;
        this.f58026c = c0352d;
        List list2 = list;
        boolean z4 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((InterfaceC15450y2) it.next()).mo43533d()) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f58027d = z4;
        Iterator it3 = this.f58025b.iterator();
        while (it3.hasNext()) {
            interfaceC41211cMo43532c = ((InterfaceC15450y2) it3.next()).mo43532c();
            if (interfaceC41211cMo43532c != null) {
                this.f58028e = interfaceC41211cMo43532c;
            }
        }
        interfaceC41211cMo43532c = null;
        this.f58028e = interfaceC41211cMo43532c;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f58024a;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: b */
    public final void mo43548b(boolean z4) {
        Iterator it = this.f58025b.iterator();
        while (it.hasNext()) {
            ((InterfaceC15450y2) it.next()).mo43537b(z4);
        }
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43549c() {
        return this.f58028e;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: d */
    public final boolean mo43550d() {
        return this.f58027d;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43551e() {
        List list = this.f58025b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC15450y2) it.next()).mo43535e());
        }
        return new C26318e(arrayList.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25267u.m74164j0(AbstractC25265s.m74093D1(C25271y.f99162w))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), 7), new C15335d(arrayList, 7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15440w2)) {
            return false;
        }
        C15440w2 c15440w2 = (C15440w2) obj;
        return AbstractC22676k.m65745e(this.f58024a, c15440w2.f58024a) && AbstractC22676k.m65745e(this.f58025b, c15440w2.f58025b) && AbstractC22676k.m65745e(this.f58026c, c15440w2.f58026c);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        List list = this.f58025b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC15450y2) it.next()).mo43538f());
        }
        return new C26318e(arrayList.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25267u.m74164j0(AbstractC25265s.m74093D1(C25271y.f99162w))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), 8), new C15335d(arrayList, 8));
    }

    public final int hashCode() {
        return this.f58026c.hashCode() + AbstractC11895b.m31983b(this.f58024a.hashCode() * 31, 31, this.f58025b);
    }

    public final String toString() {
        return "SectionElement(identifier=" + this.f58024a + ", fields=" + this.f58025b + ", controller=" + this.f58026c + ")";
    }
}
