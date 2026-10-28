package ec3;

import a63.C0493j;
import c93.InterfaceC4352n;
import c93.InterfaceC4354p;
import fc3.AbstractC14371b;
import l83.C23454a0;
import l83.InterfaceC23459e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ec3.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13052j1 implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45108w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f45109x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f45110y;

    public /* synthetic */ C13052j1(Object obj, InterfaceC23459e interfaceC23459e, int i13) {
        this.f45108w = i13;
        this.f45109x = obj;
        this.f45110y = interfaceC23459e;
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        switch (this.f45108w) {
            case 0:
                Object objCollect = ((InterfaceC13058l) this.f45109x).collect(new C13031e0(2, interfaceC13062m, this.f45110y), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            case 1:
                Object objM41038a = AbstractC14371b.m41038a(C13068n1.f45159w, interfaceC13062m, new C0493j((InterfaceC30057d) null, (InterfaceC4352n) this.f45110y, 6), interfaceC30057d, (InterfaceC13058l[]) this.f45109x);
                return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
            default:
                Object objM41038a2 = AbstractC14371b.m41038a(C13068n1.f45159w, interfaceC13062m, new C0493j((InterfaceC30057d) null, (InterfaceC4354p) this.f45110y, 7), interfaceC30057d, (InterfaceC13058l[]) this.f45109x);
                return objM41038a2 == EnumC31071a.f128113w ? objM41038a2 : C23454a0.f92919a;
        }
    }
}
