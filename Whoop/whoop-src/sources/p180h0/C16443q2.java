package p180h0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.q2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16443q2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public long f63181w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f63182x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16448r2 f63183y;

    /* JADX INFO: renamed from: z */
    public int f63184z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16443q2(C16448r2 c16448r2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f63183y = c16448r2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f63182x = obj;
        this.f63184z |= Integer.MIN_VALUE;
        return this.f63183y.mo9762V(0L, 0L, this);
    }
}
