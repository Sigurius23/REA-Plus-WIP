package p163g1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.n2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15088n2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public long f56491w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f56492x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15098o2 f56493y;

    /* JADX INFO: renamed from: z */
    public int f56494z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15088n2(C15098o2 c15098o2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f56493y = c15098o2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f56492x = obj;
        this.f56494z |= Integer.MIN_VALUE;
        return this.f56493y.mo29342p0(0L, this);
    }
}
