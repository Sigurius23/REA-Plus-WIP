package p545v6;

import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25267u;
import p335n6.AbstractC26394k;
import p335n6.C26396m;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;

/* JADX INFO: renamed from: v6.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C35723l extends AbstractC26394k {

    /* JADX INFO: renamed from: c */
    public InterfaceC26398o f151967c;

    /* JADX INFO: renamed from: d */
    public int f151968d;

    /* JADX INFO: renamed from: e */
    public int f151969e;

    public C35723l() {
        super(0, 3);
        this.f151967c = C26396m.f104850a;
        this.f151968d = 0;
        this.f151969e = 0;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: a */
    public final InterfaceC26392i mo78103a() {
        C35723l c35723l = new C35723l();
        c35723l.f151967c = this.f151967c;
        c35723l.f151968d = this.f151968d;
        c35723l.f151969e = this.f151969e;
        ArrayList arrayList = this.f104849b;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC26392i) it.next()).mo78103a());
        }
        c35723l.f104849b.addAll(arrayList2);
        return c35723l;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: b */
    public final void mo78104b(InterfaceC26398o interfaceC26398o) {
        this.f151967c = interfaceC26398o;
    }

    @Override // p335n6.InterfaceC26392i
    /* JADX INFO: renamed from: c */
    public final InterfaceC26398o mo78105c() {
        return this.f151967c;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.f151967c + ", horizontalAlignment=" + ((Object) C35712a.m113184b(this.f151968d)) + ", verticalAlignment=" + ((Object) C35713b.m113186b(this.f151969e)) + ", children=[\n" + m78106d() + "\n])";
    }
}
