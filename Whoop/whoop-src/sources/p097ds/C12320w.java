package p097ds;

/* JADX INFO: renamed from: ds.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C12320w extends AbstractC12311n implements InterfaceC12304g {
    @Override // p097ds.AbstractC12311n, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f41235w instanceof C12298a;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m34349l(Object obj) {
        if (obj == null) {
            obj = AbstractC12311n.f41233G;
        }
        if (!AbstractC12311n.f41232F.mo9534k(this, null, obj)) {
            return false;
        }
        AbstractC12311n.m34239e(this, false);
        return true;
    }
}
