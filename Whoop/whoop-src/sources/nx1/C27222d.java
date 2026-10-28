package nx1;

import c93.InterfaceC4339a;
import jx1.AbstractC22025o;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: nx1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27222d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f108937w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC22025o f108938x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f108939y;

    public /* synthetic */ C27222d(AbstractC22025o abstractC22025o, Function1 function1) {
        this.f108937w = 2;
        this.f108939y = function1;
        this.f108938x = abstractC22025o;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f108937w) {
            case 0:
                return AbstractC27223e.m81991k(this.f108938x, this.f108939y);
            case 1:
                return AbstractC27223e.m81993m(this.f108938x, this.f108939y);
            default:
                return AbstractC27223e.m81994n(this.f108939y, this.f108938x);
        }
    }

    public /* synthetic */ C27222d(AbstractC22025o abstractC22025o, Function1 function1, int i13) {
        this.f108937w = i13;
        this.f108938x = abstractC22025o;
        this.f108939y = function1;
    }
}
