package p043c4;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p636y3.C39179k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22667f0;

/* JADX INFO: renamed from: c4.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3956e0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f16118E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C22667f0 f16119w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3958f0 f16120x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C39179k f16121y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f16122z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3956e0(C22667f0 c22667f0, C3958f0 c3958f0, C39179k c39179k, long j7, long j13) {
        super(0);
        this.f16119w = c22667f0;
        this.f16120x = c3958f0;
        this.f16121y = c39179k;
        this.f16122z = j7;
        this.f16118E = j13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C3958f0 c3958f0 = this.f16120x;
        this.f16119w.f89335w = c3958f0.getPositionProvider().mo11994i(this.f16121y, this.f16122z, c3958f0.getParentLayoutDirection(), this.f16118E);
        return C23454a0.f92919a;
    }
}
