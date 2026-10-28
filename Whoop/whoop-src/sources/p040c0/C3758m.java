package p040c0;

import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3758m extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC39104j1[] f15356w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3761n f15357x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f15358y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f15359z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3758m(AbstractC39104j1[] abstractC39104j1Arr, C3761n c3761n, int i13, int i14) {
        super(1);
        this.f15356w = abstractC39104j1Arr;
        this.f15357x = c3761n;
        this.f15358y = i13;
        this.f15359z = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
        for (AbstractC39104j1 abstractC39104j1 : this.f15356w) {
            if (abstractC39104j1 != null) {
                long jMo7156a = this.f15357x.f15368a.f15448b.mo7156a((((long) abstractC39104j1.f168211w) << 32) | (((long) abstractC39104j1.f168212x) & 4294967295L), (((long) this.f15358y) << 32) | (((long) this.f15359z) & 4294967295L), EnumC39181m.f168423w);
                abstractC39101i1.m124632f(abstractC39104j1, (int) (jMo7156a >> 32), (int) (jMo7156a & 4294967295L), 0.0f);
            }
        }
        return C23454a0.f92919a;
    }
}
