package p027b3;

import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: b3.m2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2409m2 implements InterfaceC2394j2 {

    /* JADX INFO: renamed from: w */
    public C2404l2 f9464w;

    @Override // p027b3.InterfaceC2394j2
    public final InterfaceC38174i getInspectableElements() {
        C2404l2 c2404l2 = this.f9464w;
        if (c2404l2 == null) {
            c2404l2 = new C2404l2();
        }
        this.f9464w = c2404l2;
        return c2404l2.m7400b();
    }

    @Override // p027b3.InterfaceC2394j2
    public final String getNameFallback() {
        C2404l2 c2404l2 = this.f9464w;
        if (c2404l2 == null) {
            c2404l2 = new C2404l2();
        }
        this.f9464w = c2404l2;
        return c2404l2.m7399a();
    }
}
