package s10;

import c93.InterfaceC4339a;
import p20.C28747i;
import p537ux.C35363y;
import v03.InterfaceC35517d;

/* JADX INFO: renamed from: s10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32062d implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132964w;

    /* JADX INFO: renamed from: x */
    public final C28747i f132965x;

    public /* synthetic */ C32062d(C28747i c28747i, int i13) {
        this.f132964w = i13;
        this.f132965x = c28747i;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f132964w) {
            case 0:
                final int i13 = 0;
                final C28747i c28747i = this.f132965x;
                return new InterfaceC4339a() { // from class: s10.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return ((C35363y) c28747i.get()).f150633w;
                            default:
                                return ((C35363y) c28747i.get()).f150634x;
                        }
                    }
                };
            default:
                final int i14 = 1;
                final C28747i c28747i2 = this.f132965x;
                return new InterfaceC4339a() { // from class: s10.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return ((C35363y) c28747i2.get()).f150633w;
                            default:
                                return ((C35363y) c28747i2.get()).f150634x;
                        }
                    }
                };
        }
    }
}
