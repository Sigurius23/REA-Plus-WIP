package p545v6;

import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25267u;
import p335n6.AbstractC26394k;
import p335n6.C26396m;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;

/* JADX INFO: renamed from: v6.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C35721j extends AbstractC26394k {

    /* JADX INFO: renamed from: c */
    public InterfaceC26398o f151962c;

    /* JADX INFO: renamed from: d */
    public C35714c f151963d;

    public C35721j() {
        super(0, 3);
        this.f151962c = C26396m.f104850a;
        this.f151963d = C35714c.f151947c;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: a */
    public final InterfaceC26392i mo78103a() {
        C35721j c35721j = new C35721j();
        c35721j.f151962c = this.f151962c;
        c35721j.f151963d = this.f151963d;
        ArrayList arrayList = this.f104849b;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC26392i) it.next()).mo78103a());
        }
        c35721j.f104849b.addAll(arrayList2);
        return c35721j;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: b */
    public final void mo78104b(InterfaceC26398o interfaceC26398o) {
        this.f151962c = interfaceC26398o;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: c */
    public final InterfaceC26398o mo78105c() {
        return this.f151962c;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.f151962c + ", contentAlignment=" + this.f151963d + "children=[\n" + m78106d() + "\n])";
    }
}
