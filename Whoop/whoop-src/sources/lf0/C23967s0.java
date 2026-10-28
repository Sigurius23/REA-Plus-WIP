package lf0;

import ny0.C27259i0;
import ny0.C27273p0;
import p715kotlin.jvm.functions.Function1;
import p736sz0.AbstractC33181g0;
import q21.AbstractC29848g;

/* JADX INFO: renamed from: lf0.s0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C23967s0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94649w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27273p0 f94650x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f94651y;

    public /* synthetic */ C23967s0(Function1 function1, C27273p0 c27273p0, int i13) {
        this.f94649w = i13;
        this.f94651y = function1;
        this.f94650x = c27273p0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94649w) {
            case 0:
                return AbstractC23971t0.m70706q(this.f94651y, this.f94650x, obj);
            case 1:
                return C27259i0.m82181h(this.f94650x, this.f94651y, obj);
            case 2:
                return AbstractC29848g.m91393h(this.f94651y, this.f94650x, obj);
            case 3:
                return AbstractC33181g0.m105134n(this.f94651y, this.f94650x, obj);
            default:
                return AbstractC33181g0.m105138r(this.f94650x, this.f94651y, obj);
        }
    }

    public /* synthetic */ C23967s0(C27273p0 c27273p0, Function1 function1, int i13) {
        this.f94649w = i13;
        this.f94650x = c27273p0;
        this.f94651y = function1;
    }
}
