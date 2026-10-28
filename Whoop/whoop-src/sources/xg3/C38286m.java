package xg3;

/* JADX INFO: renamed from: xg3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C38286m extends AbstractC38291r {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38287n f164085x;

    public C38286m(C38287n c38287n) {
        this.f164085x = c38287n;
    }

    @Override // xg3.AbstractC38291r
    /* JADX INFO: renamed from: d */
    public final void mo14742d(Throwable th3) {
        C38287n c38287n = this.f164085x;
        AbstractC38283j abstractC38283j = c38287n.f164087x;
        try {
            c38287n.f164086w.mo14742d(th3);
        } finally {
            abstractC38283j.mo14750b();
        }
    }

    @Override // xg3.AbstractC38291r
    /* JADX INFO: renamed from: e */
    public final void mo14743e(Object obj) {
        C38287n c38287n = this.f164085x;
        try {
            c38287n.f164086w.mo14743e(obj);
        } finally {
            c38287n.f164087x.mo14750b();
        }
    }
}
