package z22;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import x22.C37864c;

/* JADX INFO: renamed from: z22.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C40024c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172706w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37864c.b f172707x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f172708y;

    public /* synthetic */ C40024c(Function1 function1, C37864c.b bVar) {
        this.f172706w = 4;
        this.f172708y = function1;
        this.f172707x = bVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f172706w) {
            case 0:
                return AbstractC40025d.m128308n(this.f172707x, this.f172708y);
            case 1:
                return AbstractC40025d.m128309o(this.f172707x, this.f172708y);
            case 2:
                return AbstractC40025d.m128310p(this.f172707x, this.f172708y);
            case 3:
                return AbstractC40025d.m128311q(this.f172707x, this.f172708y);
            default:
                return AbstractC40025d.m128304j(this.f172708y, this.f172707x);
        }
    }

    public /* synthetic */ C40024c(C37864c.b bVar, Function1 function1, int i13) {
        this.f172706w = i13;
        this.f172707x = bVar;
        this.f172708y = function1;
    }
}
