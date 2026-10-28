package qu2;

import bm.C3396t;
import c93.InterfaceC4339a;
import l83.InterfaceC23462h;

/* JADX INFO: renamed from: qu2.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C30641i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f126046w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f126047x;

    public /* synthetic */ C30641i(Object obj, int i13) {
        this.f126046w = i13;
        this.f126047x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f126046w) {
            case 0:
                return Integer.valueOf(AbstractC30640h.b.m94171h((C3396t) this.f126047x));
            default:
                return AbstractC30640h.m94073I0((InterfaceC23462h) this.f126047x);
        }
    }
}
