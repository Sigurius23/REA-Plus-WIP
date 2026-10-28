package p545v6;

import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25267u;
import p335n6.AbstractC26394k;
import p335n6.C26396m;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;

/* JADX INFO: renamed from: v6.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C35722k extends AbstractC26394k {

    /* JADX INFO: renamed from: c */
    public InterfaceC26398o f151964c;

    /* JADX INFO: renamed from: d */
    public int f151965d;

    /* JADX INFO: renamed from: e */
    public int f151966e;

    public C35722k() {
        super(0, 3);
        this.f151964c = C26396m.f104850a;
        this.f151965d = 0;
        this.f151966e = 0;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: a */
    public final InterfaceC26392i mo78103a() {
        C35722k c35722k = new C35722k();
        c35722k.f151964c = this.f151964c;
        c35722k.f151965d = this.f151965d;
        c35722k.f151966e = this.f151966e;
        ArrayList arrayList = this.f104849b;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC26392i) it.next()).mo78103a());
        }
        c35722k.f104849b.addAll(arrayList2);
        return c35722k;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: b */
    public final void mo78104b(InterfaceC26398o interfaceC26398o) {
        this.f151964c = interfaceC26398o;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: c */
    public final InterfaceC26398o mo78105c() {
        return this.f151964c;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.f151964c + ", verticalAlignment=" + ((Object) C35713b.m113186b(this.f151965d)) + ", horizontalAlignment=" + ((Object) C35712a.m113184b(this.f151966e)) + ", children=[\n" + m78106d() + "\n])";
    }
}
