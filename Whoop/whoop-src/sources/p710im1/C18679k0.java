package p710im1;

import c93.InterfaceC4339a;
import em1.C13348v;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: im1.k0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18679k0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73287w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f73288x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13348v f73289y;

    public /* synthetic */ C18679k0(Function1 function1, C13348v c13348v, int i13) {
        this.f73287w = i13;
        this.f73288x = function1;
        this.f73289y = c13348v;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73287w) {
            case 0:
                return AbstractC18697t0.m54302V0(this.f73288x, this.f73289y);
            case 1:
                return AbstractC18697t0.m54351n0(this.f73288x, this.f73289y);
            default:
                return AbstractC18697t0.m54354o0(this.f73288x, this.f73289y);
        }
    }
}
