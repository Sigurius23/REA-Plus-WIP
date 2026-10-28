package p134f2;

import l83.C23454a0;
import p208i2.AbstractC17918w0;
import p208i2.C17907r;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: f2.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14012a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f50029w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f50030x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f50031y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f50032z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14012a(float f13, float f14, int i13, boolean z4) {
        super(1);
        this.f50029w = f13;
        this.f50030x = f14;
        this.f50031y = i13;
        this.f50032z = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C17920x0 c17920x0 = (C17920x0) ((InterfaceC17886g0) obj);
        float density = c17920x0.f69654S.getDensity() * this.f50029w;
        float density2 = c17920x0.f69654S.getDensity() * this.f50030x;
        c17920x0.m51556g((density <= 0.0f || density2 <= 0.0f) ? null : new C17907r(density, density2, this.f50031y));
        c17920x0.m51563t(AbstractC17918w0.f69621a);
        c17920x0.m51554e(this.f50032z);
        return C23454a0.f92919a;
    }
}
