package ja3;

import fa3.EnumC14301a;
import ia3.C18295a;
import ia3.C18297c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lb3.AbstractC23767d1;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.EnumC23761b1;
import lb3.EnumC23776g1;
import lg3.C24055q;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import na3.C26527n;
import p005a3.C0237p;
import p249jc.C21567b;
import p547v8.AbstractC35785b;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31138l;
import u93.AbstractC34668c;
import va3.C35850h;
import wb3.AbstractC37056f;
import x93.C38108b0;
import x93.C38124p;

/* JADX INFO: renamed from: ja3.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21510f0 extends AbstractC34668c {

    /* JADX INFO: renamed from: L */
    public final C41113q f82499L;

    /* JADX INFO: renamed from: M */
    public final C38108b0 f82500M;

    /* JADX WARN: Illegal instructions before constructor call */
    public C21510f0(C41113q c41113q, C38108b0 javaTypeParameter, int i13, InterfaceC31138l interfaceC31138l) {
        AbstractC22676k.m65750j(javaTypeParameter, "javaTypeParameter");
        C18295a c18295a = (C18295a) c41113q.f177224x;
        super(c18295a.f71223a, interfaceC31138l, new C18297c(c41113q, javaTypeParameter, false), C35850h.m113814e(javaTypeParameter.f163210a.getName()), EnumC23776g1.INVARIANT, false, i13, c18295a.f71235m);
        this.f82499L = c41113q;
        this.f82500M = javaTypeParameter;
    }

    @Override // u93.AbstractC34680i
    /* JADX INFO: renamed from: J0 */
    public final List mo60482J0(List list) {
        C21567b c21567b;
        AbstractC23811y abstractC23811y;
        AbstractC23811y abstractC23811yM60614m;
        C41113q c41113q = this.f82499L;
        C21567b c21567b2 = ((C18295a) c41113q.f177224x).f71240r;
        c21567b2.getClass();
        List<AbstractC23811y> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (AbstractC23811y abstractC23811y2 : list2) {
            C26527n c26527n = C26527n.f105459z;
            AbstractC22676k.m65750j(abstractC23811y2, "<this>");
            if (AbstractC23767d1.m69847c(abstractC23811y2, c26527n, null)) {
                c21567b = c21567b2;
                abstractC23811y = abstractC23811y2;
            } else {
                c21567b = c21567b2;
                abstractC23811y = abstractC23811y2;
                abstractC23811yM60614m = c21567b.m60614m(new C24055q(this, false, c41113q, EnumC14301a.TYPE_PARAMETER_BOUNDS, false), abstractC23811y, C25271y.f99162w, null, false);
                if (abstractC23811yM60614m == null) {
                }
                arrayList.add(abstractC23811yM60614m);
                c21567b2 = c21567b;
            }
            abstractC23811yM60614m = abstractC23811y;
            arrayList.add(abstractC23811yM60614m);
            c21567b2 = c21567b;
        }
        return arrayList;
    }

    @Override // u93.AbstractC34680i
    /* JADX INFO: renamed from: K0 */
    public final List mo60483K0() {
        Type[] bounds = this.f82500M.f163210a.getBounds();
        AbstractC22676k.m65749i(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C38124p(type));
        }
        C38124p c38124p = (C38124p) AbstractC25265s.m74146r1(arrayList);
        Collection collection = arrayList;
        if (AbstractC22676k.m65745e(c38124p != null ? c38124p.f163234a : null, Object.class)) {
            collection = C25271y.f99162w;
        }
        Collection collection2 = collection;
        boolean zIsEmpty = collection2.isEmpty();
        C41113q c41113q = this.f82499L;
        if (zIsEmpty) {
            return AbstractC37056f.m118958J(AbstractC23791o.m69883b(((C18295a) c41113q.f177224x).f71237o.mo78661c().m83817e(), ((C18295a) c41113q.f177224x).f71237o.mo78661c().m83828p()));
        }
        Collection collection3 = collection2;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(collection3, 10));
        Iterator it = collection3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0237p) c41113q.f177222E).m695Z((C38124p) it.next(), AbstractC35785b.m113400W(EnumC23761b1.f94124x, false, this, 3)));
        }
        return arrayList2;
    }
}
