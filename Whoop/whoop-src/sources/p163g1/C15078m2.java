package p163g1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.m2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15078m2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public long f56449w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f56450x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15098o2 f56451y;

    /* JADX INFO: renamed from: z */
    public int f56452z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15078m2(C15098o2 c15098o2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f56451y = c15098o2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f56450x = obj;
        this.f56452z |= Integer.MIN_VALUE;
        return this.f56451y.mo9762V(0L, 0L, this);
    }
}
