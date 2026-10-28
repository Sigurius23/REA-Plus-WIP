package bm;

import ec3.InterfaceC13062m;
import l83.C23454a0;
import p329n0.C26062o;
import p329n0.InterfaceC26054g;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: bm.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C3381e implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13204w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3396t f13205x;

    public /* synthetic */ C3381e(C3396t c3396t, int i13) {
        this.f13204w = i13;
        this.f13205x = c3396t;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        int index;
        switch (this.f13204w) {
            case 0:
                ((Boolean) obj).getClass();
                this.f13205x.m9776p(null);
                break;
            default:
                C3396t c3396t = this.f13205x;
                InterfaceC26054g interfaceC26054gM9771j = c3396t.m9771j();
                if (interfaceC26054gM9771j != null && (index = ((C26062o) interfaceC26054gM9771j).getIndex()) != c3396t.m9774m()) {
                    c3396t.f13253b.setValue(Integer.valueOf(index));
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
