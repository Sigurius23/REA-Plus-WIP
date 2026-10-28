package p040c0;

import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3792y0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC39104j1 f15457w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f15458x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f15459y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3743h f15460z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3792y0(AbstractC39104j1 abstractC39104j1, long j7, long j13, C3743h c3743h) {
        super(1);
        this.f15457w = abstractC39104j1;
        this.f15458x = j7;
        this.f15459y = j13;
        this.f15460z = c3743h;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j7 = this.f15458x;
        long j13 = this.f15459y;
        ((AbstractC39101i1) obj).m124633r(this.f15457w, ((int) (j7 >> 32)) + ((int) (j13 >> 32)), ((int) (j7 & 4294967295L)) + ((int) (j13 & 4294967295L)), 0.0f, this.f15460z);
        return C23454a0.f92919a;
    }
}
