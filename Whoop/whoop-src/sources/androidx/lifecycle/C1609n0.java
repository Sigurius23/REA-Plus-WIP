package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1609n0 extends AbstractC1612o0 implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: E */
    public final InterfaceC1585g0 f6285E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC1615p0 f6286F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609n0(AbstractC1615p0 abstractC1615p0, InterfaceC1585g0 interfaceC1585g0, InterfaceC1633v0 interfaceC1633v0) {
        super(abstractC1615p0, interfaceC1633v0);
        this.f6286F = abstractC1615p0;
        this.f6285E = interfaceC1585g0;
    }

    @Override // androidx.lifecycle.AbstractC1612o0
    /* JADX INFO: renamed from: b */
    public final void mo5008b() {
        this.f6285E.getLifecycle().mo4988d(this);
    }

    @Override // androidx.lifecycle.AbstractC1612o0
    /* JADX INFO: renamed from: c */
    public final boolean mo5009c(InterfaceC1585g0 interfaceC1585g0) {
        return this.f6285E == interfaceC1585g0;
    }

    @Override // androidx.lifecycle.AbstractC1612o0
    /* JADX INFO: renamed from: d */
    public final boolean mo5005d() {
        return this.f6285E.getLifecycle().getCurrentState().compareTo(EnumC1635w.f6328z) >= 0;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v) {
        InterfaceC1585g0 interfaceC1585g1 = this.f6285E;
        EnumC1635w enumC1635wMo4987b = interfaceC1585g1.getLifecycle().getCurrentState();
        if (enumC1635wMo4987b == EnumC1635w.f6325w) {
            this.f6286F.removeObserver(this.f6287w);
            return;
        }
        EnumC1635w enumC1635w = null;
        while (enumC1635w != enumC1635wMo4987b) {
            m5010a(mo5005d());
            enumC1635w = enumC1635wMo4987b;
            enumC1635wMo4987b = interfaceC1585g1.getLifecycle().getCurrentState();
        }
    }
}
