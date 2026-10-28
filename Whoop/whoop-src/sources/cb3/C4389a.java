package cb3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import m83.AbstractC25267u;
import m83.C25271y;
import r93.InterfaceC31107a1;
import r93.InterfaceC31111c;
import u93.C34709w0;
import ub3.InterfaceC34747a;

/* JADX INFO: renamed from: cb3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4389a implements InterfaceC34747a {

    /* JADX INFO: renamed from: x */
    public static final C4389a f17729x = new C4389a(0);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17730w;

    public /* synthetic */ C4389a(int i13) {
        this.f17730w = i13;
    }

    @Override // ub3.InterfaceC34747a
    /* JADX INFO: renamed from: r */
    public final Iterable mo13799r(Object obj) {
        Collection collectionMo78673h;
        switch (this.f17730w) {
            case 0:
                int i13 = AbstractC4393e.f17737a;
                Collection collectionMo78673h2 = ((C34709w0) ((InterfaceC31107a1) obj)).mo78673h();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collectionMo78673h2, 10));
                Iterator it = ((ArrayList) collectionMo78673h2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C34709w0) ((InterfaceC31107a1) it.next())).mo78660a());
                }
                return arrayList;
            default:
                InterfaceC31111c interfaceC31111c = (InterfaceC31111c) obj;
                return (interfaceC31111c == null || (collectionMo78673h = interfaceC31111c.mo78673h()) == null) ? C25271y.f99162w : collectionMo78673h;
        }
    }
}
