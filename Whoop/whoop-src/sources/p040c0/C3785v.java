package p040c0;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C3785v extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15436w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f15437x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3789x f15438y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3785v(Function1 function1, C3789x c3789x, int i13) {
        super(1);
        this.f15436w = i13;
        this.f15437x = function1;
        this.f15438y = c3789x;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15436w) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C3789x c3789x = this.f15438y;
                long j7 = iIntValue;
                return (Integer) this.f15437x.invoke(Integer.valueOf(((int) (C3789x.m11594f(c3789x) >> 32)) - ((int) (C3789x.m11593e(c3789x, (j7 & 4294967295L) | (j7 << 32), C3789x.m11594f(c3789x)) >> 32))));
            default:
                int iIntValue2 = ((Number) obj).intValue();
                long j13 = iIntValue2;
                long j14 = (j13 & 4294967295L) | (j13 << 32);
                C3789x c3789x2 = this.f15438y;
                return (Integer) this.f15437x.invoke(Integer.valueOf((-((int) (C3789x.m11593e(c3789x2, j14, C3789x.m11594f(c3789x2)) >> 32))) - iIntValue2));
        }
    }
}
