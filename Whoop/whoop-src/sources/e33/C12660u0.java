package e33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12660u0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43283w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12662v0 f43284x;

    /* JADX INFO: renamed from: y */
    public int f43285y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12660u0(C12662v0 c12662v0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43284x = c12662v0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43283w = obj;
        this.f43285y |= Integer.MIN_VALUE;
        return this.f43284x.m35428r(this);
    }
}
