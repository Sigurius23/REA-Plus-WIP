package p461rh;

import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import ki.AbstractC22497i;
import ki.InterfaceC22490b;
import ki.InterfaceC22491c;
import l83.C23465k;
import m83.AbstractC25265s;
import p441qx.C30706d0;
import p523uh.InterfaceC34959e;
import p715kotlin.jvm.internal.AbstractC22676k;
import th.AbstractC33811i;
import th.InterfaceC33803a;

/* JADX INFO: renamed from: rh.l */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C31423l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f129290w;

    public /* synthetic */ C31423l(int i13) {
        this.f129290w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f129290w) {
            case 0:
                return (InterfaceC33803a) AbstractC33811i.f141613a.getValue();
            case 1:
                List listM74152u1 = AbstractC25265s.m74152u1((List) AbstractC22497i.f88195a.getValue(), new C30706d0(1));
                ArrayList arrayList = new ArrayList();
                int size = listM74152u1.size();
                for (int i13 = 0; i13 < size; i13++) {
                    InterfaceC22491c interfaceC22491c = (InterfaceC22491c) listM74152u1.get(i13);
                    AbstractC22676k.m65748h(interfaceC22491c, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
                    InterfaceC34959e interfaceC34959eMo37115a = interfaceC22491c.mo37115a();
                    InterfaceC21461d interfaceC21461dType = interfaceC22491c.type();
                    C23465k c23465k = interfaceC21461dType == null ? null : new C23465k(interfaceC34959eMo37115a, interfaceC21461dType);
                    if (c23465k != null) {
                        arrayList.add(c23465k);
                    }
                }
                return arrayList;
            default:
                List listM74152u2 = AbstractC25265s.m74152u1((List) AbstractC22497i.f88196b.getValue(), new C30706d0(2));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listM74152u2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    arrayList2.add(((InterfaceC22490b) listM74152u2.get(i14)).mo64991a());
                }
                return arrayList2;
        }
    }
}
