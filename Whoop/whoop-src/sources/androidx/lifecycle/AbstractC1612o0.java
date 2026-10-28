package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1612o0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC1633v0 f6287w;

    /* JADX INFO: renamed from: x */
    public boolean f6288x;

    /* JADX INFO: renamed from: y */
    public int f6289y = -1;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC1615p0 f6290z;

    public AbstractC1612o0(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 interfaceC1633v0) {
        this.f6290z = abstractC1615p0;
        this.f6287w = interfaceC1633v0;
    }

    /* JADX INFO: renamed from: a */
    public final void m5010a(boolean z4) {
        if (z4 == this.f6288x) {
            return;
        }
        this.f6288x = z4;
        int i13 = z4 ? 1 : -1;
        AbstractC1615p0 abstractC1615p0 = this.f6290z;
        abstractC1615p0.changeActiveCounter(i13);
        if (this.f6288x) {
            abstractC1615p0.dispatchingValue(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo5008b() {
    }

    /* JADX INFO: renamed from: c */
    public boolean mo5009c(InterfaceC1585g0 interfaceC1585g0) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo5005d();
}
