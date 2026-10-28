package p180h0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.e2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16383e2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f62989w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16398h2 f62990x;

    /* JADX INFO: renamed from: y */
    public int f62991y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16383e2(C16398h2 c16398h2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f62990x = c16398h2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f62989w = obj;
        this.f62991y |= Integer.MIN_VALUE;
        return this.f62990x.m46586a(this);
    }
}
