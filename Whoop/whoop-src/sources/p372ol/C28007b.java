package p372ol;

import java.util.ArrayList;
import java.util.List;
import p119ej.C13224a;
import p502ti.AbstractC33821d;
import p502ti.C33826i;
import p502ti.C33829l;
import p616xi.InterfaceC38318f;

/* JADX INFO: renamed from: ol.b */
/* JADX INFO: loaded from: classes.dex */
public final class C28007b implements InterfaceC38318f {

    /* JADX INFO: renamed from: w */
    public final ArrayList f112939w;

    public C28007b() {
        this.f112939w = new ArrayList();
    }

    @Override // p616xi.InterfaceC38318f
    /* JADX INFO: renamed from: k0 */
    public AbstractC33821d mo84473k0() {
        ArrayList arrayList = this.f112939w;
        return ((C13224a) arrayList.get(0)).m37125c() ? new C33826i(arrayList, 1) : new C33829l(arrayList);
    }

    @Override // p616xi.InterfaceC38318f
    /* JADX INFO: renamed from: m0 */
    public List mo2420m0() {
        return this.f112939w;
    }

    @Override // p616xi.InterfaceC38318f
    /* JADX INFO: renamed from: p0 */
    public boolean mo2421p0() {
        ArrayList arrayList = this.f112939w;
        return arrayList.size() == 1 && ((C13224a) arrayList.get(0)).m37125c();
    }

    public C28007b(ArrayList arrayList) {
        this.f112939w = arrayList;
    }
}
