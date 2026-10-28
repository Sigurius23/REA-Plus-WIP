package p631xz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C38728j extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166681w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38747x f166682x;

    /* JADX INFO: renamed from: y */
    public int f166683y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38728j(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166682x = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166681w = obj;
        this.f166683y |= Integer.MIN_VALUE;
        return this.f166682x.m124159j(null, null, this);
    }
}
