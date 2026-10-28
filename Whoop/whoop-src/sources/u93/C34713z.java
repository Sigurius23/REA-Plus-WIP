package u93;

import androidx.room.AbstractC1772c1;
import c93.InterfaceC4339a;
import j93.AbstractC21478l0;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb3.C22340i;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import pf.AbstractC29125c;
import r93.AbstractC31166y;
import r93.InterfaceC31124g0;
import va3.C35847e;

/* JADX INFO: renamed from: u93.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C34713z implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f146220w;

    /* JADX INFO: renamed from: x */
    public final C34665a0 f146221x;

    public /* synthetic */ C34713z(C34665a0 c34665a0, int i13) {
        this.f146220w = i13;
        this.f146221x = c34665a0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f146220w) {
            case 0:
                C34665a0 c34665a0 = this.f146221x;
                C34673e0 c34673e0 = c34665a0.f146032z;
                if (c34673e0.f146050J) {
                    return AbstractC21478l0.m60412R((C34688m) c34673e0.f146052L.getValue(), c34665a0.f146028E);
                }
                AbstractC31166y.m95885c(c34673e0);
                throw null;
            case 1:
                C34665a0 c34665a1 = this.f146221x;
                C34673e0 c34673e1 = c34665a1.f146032z;
                if (c34673e1.f146050J) {
                    return Boolean.valueOf(AbstractC21478l0.m60408N((C34688m) c34673e1.f146052L.getValue(), c34665a1.f146028E));
                }
                AbstractC31166y.m95885c(c34673e1);
                throw null;
            default:
                C34665a0 c34665a2 = this.f146221x;
                C22340i c22340i = c34665a2.f146030G;
                InterfaceC21493z[] interfaceC21493zArr = C34665a0.f146027I;
                boolean zBooleanValue = ((Boolean) AbstractC29125c.m88494C(c22340i, interfaceC21493zArr[1])).booleanValue();
                C35847e c35847e = c34665a2.f146028E;
                C34673e0 c34673e2 = c34665a2.f146032z;
                if (zBooleanValue) {
                    return C22711n.f89378b;
                }
                List list = (List) AbstractC29125c.m88494C(c34665a2.f146029F, interfaceC21493zArr[0]);
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC31124g0) it.next()).mo52852u());
                }
                return AbstractC1772c1.m5395m("package view scope for " + c35847e + " in " + c34673e2.getName(), AbstractC25265s.m74128f1(new C34699r0(c34673e2, c35847e), arrayList));
        }
    }
}
