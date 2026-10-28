package p180h0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.f2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16388f2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f63015w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16398h2 f63016x;

    /* JADX INFO: renamed from: y */
    public int f63017y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16388f2(C16398h2 c16398h2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f63016x = c16398h2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f63015w = obj;
        this.f63017y |= Integer.MIN_VALUE;
        return this.f63016x.m46589e(this);
    }
}
