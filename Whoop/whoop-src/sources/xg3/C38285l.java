package xg3;

import bh3.InterfaceC3255b;

/* JADX INFO: renamed from: xg3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C38285l extends AbstractC38291r {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC3255b f164083x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC3255b f164084y;

    public C38285l(InterfaceC3255b interfaceC3255b, InterfaceC3255b interfaceC3255b2) {
        this.f164083x = interfaceC3255b;
        this.f164084y = interfaceC3255b2;
    }

    @Override // xg3.AbstractC38291r
    /* JADX INFO: renamed from: d */
    public final void mo14742d(Throwable th3) {
        try {
            this.f164083x.mo9472b(th3);
        } finally {
            mo14750b();
        }
    }

    @Override // xg3.AbstractC38291r
    /* JADX INFO: renamed from: e */
    public final void mo14743e(Object obj) {
        try {
            this.f164084y.mo9472b(obj);
        } finally {
            mo14750b();
        }
    }
}
