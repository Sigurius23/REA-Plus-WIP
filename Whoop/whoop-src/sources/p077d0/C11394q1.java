package p077d0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.q1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11394q1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36536w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11421z1 f36537x;

    public /* synthetic */ C11394q1(C11421z1 c11421z1, int i13) {
        this.f36536w = i13;
        this.f36537x = c11421z1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f36536w) {
            case 0:
                C11421z1 c11421z1 = this.f36537x;
                return Boolean.valueOf((AbstractC22676k.m65745e(c11421z1.f36633d.getValue(), c11421z1.f36630a.mo2428y0()) && c11421z1.f36636g.m87032x() == Long.MIN_VALUE && !((Boolean) c11421z1.f36637h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.f36537x.m30660b());
        }
    }
}
