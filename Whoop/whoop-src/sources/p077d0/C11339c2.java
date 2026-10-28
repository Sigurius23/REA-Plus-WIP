package p077d0;

import p390p1.InterfaceC28620h0;

/* JADX INFO: renamed from: d0.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11339c2 implements InterfaceC28620h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11421z1 f36332b;

    public /* synthetic */ C11339c2(C11421z1 c11421z1, int i13) {
        this.f36331a = i13;
        this.f36332b = c11421z1;
    }

    @Override // p390p1.InterfaceC28620h0
    public final void dispose() {
        switch (this.f36331a) {
            case 0:
                C11421z1 c11421z1 = this.f36332b;
                c11421z1.m30667i();
                c11421z1.f36630a.mo2416D0();
                break;
            default:
                C11421z1 c11421z2 = this.f36332b;
                c11421z2.m30667i();
                c11421z2.f36630a.mo2416D0();
                break;
        }
    }
}
