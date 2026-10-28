package p160fz;

import c20.C3879g;
import c93.InterfaceC4339a;
import p537ux.C35363y;
import v03.InterfaceC35517d;

/* JADX INFO: renamed from: fz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C14885c implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55544w;

    /* JADX INFO: renamed from: x */
    public final C3879g f55545x;

    public /* synthetic */ C14885c(C3879g c3879g, int i13) {
        this.f55544w = i13;
        this.f55545x = c3879g;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f55544w) {
            case 0:
                final int i13 = 1;
                final C3879g c3879g = this.f55545x;
                return new InterfaceC4339a() { // from class: fz.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return ((C35363y) c3879g.get()).f150634x;
                            default:
                                return ((C35363y) c3879g.get()).f150633w;
                        }
                    }
                };
            default:
                final int i14 = 0;
                final C3879g c3879g2 = this.f55545x;
                return new InterfaceC4339a() { // from class: fz.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return ((C35363y) c3879g2.get()).f150634x;
                            default:
                                return ((C35363y) c3879g2.get()).f150633w;
                        }
                    }
                };
        }
    }
}
