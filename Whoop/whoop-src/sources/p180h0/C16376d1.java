package p180h0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16376d1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C16406j0 f62967w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f62968x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC16387f1 f62969y;

    /* JADX INFO: renamed from: z */
    public int f62970z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16376d1(AbstractC16387f1 abstractC16387f1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f62969y = abstractC16387f1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f62968x = obj;
        this.f62970z |= Integer.MIN_VALUE;
        return AbstractC16387f1.m46579c1(this.f62969y, null, this);
    }
}
