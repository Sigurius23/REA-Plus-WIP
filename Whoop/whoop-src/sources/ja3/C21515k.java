package ja3;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import x93.C38107b;
import x93.C38128t;
import xb3.AbstractC38176k;
import xb3.C38171f;

/* JADX INFO: renamed from: ja3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C21515k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82525w;

    /* JADX INFO: renamed from: x */
    public final C21519o f82526x;

    public /* synthetic */ C21515k(C21519o c21519o, int i13) {
        this.f82525w = i13;
        this.f82526x = c21519o;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f82525w) {
            case 0:
                Class<?>[] declaredClasses = this.f82526x.f82540o.f163232a.getDeclaredClasses();
                AbstractC22676k.m65749i(declaredClasses, "getDeclaredClasses(...)");
                return AbstractC25265s.m74103I1(AbstractC38176k.m122276E(AbstractC38176k.m122273B(new C38171f(AbstractC25260n.m74050X(declaredClasses), false, C38107b.f163208z), C38107b.f163205E)));
            default:
                Collection collectionM122101b = this.f82526x.f82540o.m122101b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionM122101b) {
                    if (((C38128t) obj).m122117l()) {
                        arrayList.add(obj);
                    }
                }
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((C38128t) obj2).m122119d(), obj2);
                }
                return linkedHashMap;
        }
    }
}
