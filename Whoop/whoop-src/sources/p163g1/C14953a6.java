package p163g1;

import l83.C23454a0;
import p077d0.C11344e;
import p180h0.InterfaceC16392g1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22663d0;

/* JADX INFO: renamed from: g1.a6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14953a6 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55784w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC16392g1 f55785x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22663d0 f55786y;

    public /* synthetic */ C14953a6(InterfaceC16392g1 interfaceC16392g1, C22663d0 c22663d0, int i13) {
        this.f55784w = i13;
        this.f55785x = interfaceC16392g1;
        this.f55786y = c22663d0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C11344e c11344e = (C11344e) obj;
        switch (this.f55784w) {
            case 0:
                float fFloatValue = ((Number) c11344e.m30549e()).floatValue();
                C22663d0 c22663d0 = this.f55786y;
                this.f55785x.mo29024a(fFloatValue - c22663d0.f89331w);
                c22663d0.f89331w = ((Number) c11344e.m30549e()).floatValue();
                break;
            default:
                float fFloatValue2 = ((Number) c11344e.m30549e()).floatValue();
                C22663d0 c22663d1 = this.f55786y;
                this.f55785x.mo29024a(fFloatValue2 - c22663d1.f89331w);
                c22663d1.f89331w = ((Number) c11344e.m30549e()).floatValue();
                break;
        }
        return C23454a0.f92919a;
    }
}
