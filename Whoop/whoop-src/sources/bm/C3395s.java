package bm;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: bm.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C3395s extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C3396t f13247w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f13248x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3396t f13249y;

    /* JADX INFO: renamed from: z */
    public int f13250z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3395s(C3396t c3396t, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f13249y = c3396t;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f13248x = obj;
        this.f13250z |= Integer.MIN_VALUE;
        return this.f13249y.m9775o(0, this);
    }
}
