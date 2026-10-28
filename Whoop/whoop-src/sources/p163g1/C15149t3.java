package p163g1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.t3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15149t3 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public long f56817w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f56818x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15169v3 f56819y;

    /* JADX INFO: renamed from: z */
    public int f56820z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15149t3(C15169v3 c15169v3, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f56819y = c15169v3;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f56818x = obj;
        this.f56820z |= Integer.MIN_VALUE;
        return this.f56819y.mo9762V(0L, 0L, this);
    }
}
