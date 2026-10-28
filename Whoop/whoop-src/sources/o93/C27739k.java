package o93;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import q93.C30085i;
import r93.AbstractC31166y;
import r93.InterfaceC31133j0;
import u93.C34665a0;
import u93.C34671d0;
import u93.C34673e0;
import u93.C34688m;

/* JADX INFO: renamed from: o93.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C27739k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111810w;

    /* JADX INFO: renamed from: x */
    public final C34673e0 f111811x;

    public /* synthetic */ C27739k(C34673e0 c34673e0, int i13) {
        this.f111810w = i13;
        this.f111811x = c34673e0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f111810w) {
            case 0:
                return ((C34665a0) this.f111811x.mo78658F(AbstractC27742n.f111884i)).f146031H;
            case 1:
                return new C30085i(this.f111811x);
            default:
                C34673e0 c34673e0 = this.f111811x;
                C34671d0 c34671d0 = c34673e0.f146048H;
                if (c34671d0 == null) {
                    StringBuilder sb4 = new StringBuilder("Dependencies of module ");
                    String str = c34673e0.getName().f152620w;
                    AbstractC22676k.m65749i(str, "toString(...)");
                    sb4.append(str);
                    sb4.append(" were not set before querying module content");
                    throw new AssertionError(sb4.toString());
                }
                List list = (List) c34671d0.f146043w;
                if (!c34673e0.f146050J) {
                    AbstractC31166y.m95885c(c34673e0);
                    throw null;
                }
                list.contains(c34673e0);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((C34673e0) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    InterfaceC31133j0 interfaceC31133j0 = ((C34673e0) it3.next()).f146049I;
                    AbstractC22676k.m65747g(interfaceC31133j0);
                    arrayList.add(interfaceC31133j0);
                }
                return new C34688m(arrayList, "CompositeProvider@ModuleDescriptor for " + c34673e0.getName());
        }
    }
}
