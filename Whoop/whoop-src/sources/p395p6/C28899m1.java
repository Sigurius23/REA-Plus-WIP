package p395p6;

import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25267u;
import p335n6.AbstractC26394k;
import p335n6.C26396m;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;

/* JADX INFO: renamed from: p6.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28899m1 extends AbstractC26394k {

    /* JADX INFO: renamed from: c */
    public final int f116979c;

    /* JADX INFO: renamed from: d */
    public InterfaceC26398o f116980d;

    public C28899m1(int i13) {
        super(i13, 2);
        this.f116979c = i13;
        this.f116980d = C26396m.f104850a;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: a */
    public final InterfaceC26392i mo78103a() {
        C28899m1 c28899m1 = new C28899m1(this.f116979c);
        c28899m1.f116980d = this.f116980d;
        ArrayList arrayList = this.f104849b;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC26392i) it.next()).mo78103a());
        }
        c28899m1.f104849b.addAll(arrayList2);
        return c28899m1;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: b */
    public final void mo78104b(InterfaceC26398o interfaceC26398o) {
        this.f116980d = interfaceC26398o;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: c */
    public final InterfaceC26398o mo78105c() {
        return this.f116980d;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.f116980d + ", children=[\n" + m78106d() + "\n])";
    }
}
