package p240j2;

import e93.AbstractC12889b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: j2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C21235p extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81068w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21236q f81069x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21235p(C21236q c21236q, int i13) {
        super(1);
        this.f81068w = i13;
        this.f81069x = c21236q;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f81068w) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                C21236q c21236q = this.f81069x;
                return Double.valueOf(c21236q.f81081n.mo56647i(AbstractC12889b.m36282l(dDoubleValue, c21236q.f81072e, c21236q.f81073f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                C21236q c21236q2 = this.f81069x;
                return Double.valueOf(AbstractC12889b.m36282l(c21236q2.f81078k.mo56647i(dDoubleValue2), c21236q2.f81072e, c21236q2.f81073f));
        }
    }
}
