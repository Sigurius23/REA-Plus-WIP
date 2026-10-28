package o93;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kb3.C22333b;
import kb3.C22342k;
import lb3.C23779i;
import lb3.EnumC23776g1;
import nb3.C26555l;
import r93.AbstractC31150q;
import r93.C31148p;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31162w;
import u93.C34675f0;
import u93.C34682j;
import u93.C34696q;
import u93.C34705u0;
import va3.C35850h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: o93.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC27743o {

    /* JADX INFO: renamed from: a */
    public static final C34675f0 f111893a;

    static {
        C26555l c26555l = C26555l.f105564a;
        C34696q c34696q = new C34696q(C26555l.f105565b, AbstractC27742n.f111881f);
        EnumC31120f enumC31120f = EnumC31120f.f128328w;
        C35850h c35850hM113796g = AbstractC27742n.f111882g.f152613a.m113796g();
        C22333b c22333b = C22342k.f87183e;
        C34675f0 c34675f0 = new C34675f0(c34696q, c35850hM113796g, c22333b);
        c34675f0.f146056H = EnumC31106a0.f128307E;
        C31148p c31148p = AbstractC31150q.f128353e;
        if (c31148p == null) {
            C34675f0.m109560E(9);
            throw null;
        }
        c34675f0.f146057I = c31148p;
        List listM118958J = AbstractC37056f.m118958J(C34705u0.m109618N0(c34675f0, EnumC23776g1.IN_VARIANCE, C35850h.m113814e("T"), 0, c22333b));
        if (c34675f0.f146059K != null) {
            throw new IllegalStateException("Type parameters are already set for " + c34675f0.getName());
        }
        ArrayList arrayList = new ArrayList(listM118958J);
        c34675f0.f146059K = arrayList;
        c34675f0.f146058J = new C23779i(c34675f0, arrayList, c34675f0.f146060L, c34675f0.f146061M);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C34675f0.m109560E(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C34682j) ((InterfaceC31162w) it.next())).f146194H = c34675f0.mo60594i();
        }
        f111893a = c34675f0;
    }
}
