package p395p6;

import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p335n6.AbstractC26394k;
import p335n6.C26396m;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;
import p477s2.AbstractC32072d;
import p636y3.C39176h;

/* JADX INFO: renamed from: p6.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C28927w extends AbstractC26394k {

    /* JADX INFO: renamed from: c */
    public long f117042c;

    /* JADX INFO: renamed from: d */
    public InterfaceC28923u1 f117043d;

    public C28927w() {
        super(0, 3);
        this.f117042c = 9205357640488583168L;
        this.f117043d = C28920t1.f117030a;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: a */
    public final InterfaceC26392i mo78103a() {
        C28927w c28927w = new C28927w();
        c28927w.f117042c = this.f117042c;
        c28927w.f117043d = this.f117043d;
        ArrayList arrayList = this.f104849b;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC26392i) it.next()).mo78103a());
        }
        c28927w.f104849b.addAll(arrayList2);
        return c28927w;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: b */
    public final void mo78104b(InterfaceC26398o interfaceC26398o) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: c */
    public final InterfaceC26398o mo78105c() {
        InterfaceC26398o interfaceC26398oMo78105c;
        InterfaceC26392i interfaceC26392i = (InterfaceC26392i) AbstractC25265s.m74146r1(this.f104849b);
        return (interfaceC26392i == null || (interfaceC26398oMo78105c = interfaceC26392i.mo78105c()) == null) ? AbstractC32072d.m99702k(C26396m.f104850a) : interfaceC26398oMo78105c;
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) C39176h.m124788d(this.f117042c)) + ", sizeMode=" + this.f117043d + ", children=[\n" + m78106d() + "\n])";
    }
}
