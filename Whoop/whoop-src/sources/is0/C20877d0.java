package is0;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28690z0;

/* JADX INFO: renamed from: is0.d0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20877d0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78540w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20895m0 f78541x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f78542y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28690z0 f78543z;

    public /* synthetic */ C20877d0(float f13, C20895m0 c20895m0, InterfaceC28690z0 interfaceC28690z0) {
        this.f78542y = f13;
        this.f78541x = c20895m0;
        this.f78543z = interfaceC28690z0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f78540w) {
            case 0:
                return AbstractC20889j0.m57758a0(this.f78542y, this.f78541x, this.f78543z);
            default:
                return AbstractC20889j0.m57766e0(this.f78541x, this.f78542y, this.f78543z);
        }
    }

    public /* synthetic */ C20877d0(C20895m0 c20895m0, float f13, InterfaceC28690z0 interfaceC28690z0) {
        this.f78541x = c20895m0;
        this.f78542y = f13;
        this.f78543z = interfaceC28690z0;
    }
}
