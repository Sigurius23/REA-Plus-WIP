package n10;

import c93.InterfaceC4339a;
import k83.InterfaceC22297a;
import p537ux.C35363y;

/* JADX INFO: renamed from: n10.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C26135j0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103541w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC22297a f103542x;

    public /* synthetic */ C26135j0(InterfaceC22297a interfaceC22297a, int i13) {
        this.f103541w = i13;
        this.f103542x = interfaceC22297a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f103541w) {
            case 0:
                return ((C35363y) this.f103542x.get()).f150633w;
            case 1:
                return ((C35363y) this.f103542x.get()).f150634x;
            case 2:
                return ((C35363y) this.f103542x.get()).f150633w;
            default:
                return ((C35363y) this.f103542x.get()).f150634x;
        }
    }
}
