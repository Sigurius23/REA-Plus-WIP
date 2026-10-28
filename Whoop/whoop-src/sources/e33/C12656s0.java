package e33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12656s0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C12662v0 f43244w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f43245x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12662v0 f43246y;

    /* JADX INFO: renamed from: z */
    public int f43247z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12656s0(C12662v0 c12662v0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43246y = c12662v0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43245x = obj;
        this.f43247z |= Integer.MIN_VALUE;
        return this.f43246y.m35426p(this);
    }
}
