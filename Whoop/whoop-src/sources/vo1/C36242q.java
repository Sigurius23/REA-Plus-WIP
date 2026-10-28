package vo1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import so1.AbstractC32807c0;

/* JADX INFO: renamed from: vo1.q */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36242q implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155204w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f155205x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC32807c0 f155206y;

    public /* synthetic */ C36242q(Function1 function1, AbstractC32807c0 abstractC32807c0, int i13) {
        this.f155204w = i13;
        this.f155205x = function1;
        this.f155206y = abstractC32807c0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f155204w) {
            case 0:
                return AbstractC36243r.m115532h0(this.f155205x, this.f155206y);
            default:
                return AbstractC36245t.m115593u(this.f155205x, this.f155206y);
        }
    }
}
