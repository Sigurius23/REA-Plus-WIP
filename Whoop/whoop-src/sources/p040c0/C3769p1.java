package p040c0;

import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39133t0;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3769p1 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC39104j1 f15387E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f15388w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f15389x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f15390y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC39133t0 f15391z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3769p1(C3772q1 c3772q1, long j7, int i13, int i14, InterfaceC39133t0 interfaceC39133t0, AbstractC39104j1 abstractC39104j1) {
        super(1);
        this.f15388w = j7;
        this.f15389x = i13;
        this.f15390y = i14;
        this.f15391z = interfaceC39133t0;
        this.f15387E = abstractC39104j1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
        long j7 = (((long) this.f15389x) << 32) | (((long) this.f15390y) & 4294967295L);
        EnumC39181m layoutDirection = this.f15391z.getLayoutDirection();
        long j13 = this.f15388w;
        float f13 = (((int) (j7 >> 32)) - ((int) (j13 >> 32))) / 2.0f;
        float f14 = (((int) (j7 & 4294967295L)) - ((int) (j13 & 4294967295L))) / 2.0f;
        float f15 = layoutDirection == EnumC39181m.f168423w ? -1.0f : (-1) * (-1.0f);
        float f16 = 1;
        float f17 = (f15 + f16) * f13;
        AbstractC39101i1.m124623k(abstractC39101i1, this.f15387E, (((long) Math.round((f16 - 1.0f) * f14)) & 4294967295L) | (((long) Math.round(f17)) << 32));
        return C23454a0.f92919a;
    }
}
