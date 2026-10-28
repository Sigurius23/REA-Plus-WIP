package g40;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.t2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15425t2 extends AbstractC15321a3 {

    /* JADX INFO: renamed from: b */
    public final List f57975b;

    /* JADX INFO: renamed from: c */
    public final C15420s2 f57976c;

    /* JADX INFO: renamed from: d */
    public final boolean f57977d;

    public C15425t2(IdentifierSpec identifierSpec, List list, C15420s2 c15420s2) {
        super(identifierSpec);
        this.f57975b = list;
        this.f57976c = c15420s2;
        List list2 = list;
        boolean z4 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((AbstractC15327b3) it.next()).mo43533d()) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f57977d = z4;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: b */
    public final void mo43537b(boolean z4) {
        Iterator it = this.f57975b.iterator();
        while (it.hasNext()) {
            ((AbstractC15327b3) it.next()).mo43537b(z4);
        }
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        return this.f57977d;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43535e() {
        List list = this.f57975b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC15327b3) it.next()).mo43535e());
        }
        return new C26318e(arrayList.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25267u.m74164j0(AbstractC25265s.m74093D1(C25271y.f99162w))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), 6), new C15335d(arrayList, 6));
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43538f() {
        List list = this.f57975b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC15327b3) it.next()).mo43538f());
        }
        return (InterfaceC13037f2) AbstractC25265s.m74112P0(arrayList);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: h */
    public final void mo43539h(Map rawValuesMap) {
        AbstractC22676k.m65750j(rawValuesMap, "rawValuesMap");
        Iterator it = this.f57975b.iterator();
        while (it.hasNext()) {
            ((AbstractC15327b3) it.next()).mo43539h(rawValuesMap);
        }
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: i */
    public final InterfaceC15455z2 mo43540i() {
        return this.f57976c;
    }
}
