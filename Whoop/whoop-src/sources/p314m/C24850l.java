package p314m;

import p161g.AbstractActivityC14909l;
import p205i.InterfaceC17822b;

/* JADX INFO: renamed from: m.l */
/* JADX INFO: loaded from: classes.dex */
public final class C24850l implements InterfaceC17822b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractActivityC24852m f97343a;

    public C24850l(AbstractActivityC24852m abstractActivityC24852m) {
        this.f97343a = abstractActivityC24852m;
    }

    @Override // p205i.InterfaceC17822b
    /* JADX INFO: renamed from: a */
    public final void mo4199a(AbstractActivityC14909l abstractActivityC14909l) {
        AbstractActivityC24852m abstractActivityC24852m = this.f97343a;
        AbstractC24858q delegate = abstractActivityC24852m.getDelegate();
        delegate.mo72796f();
        abstractActivityC24852m.getSavedStateRegistry().m88291a("androidx:appcompat");
        delegate.mo72798i();
    }
}
