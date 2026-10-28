package p163g1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.u3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15159u3 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public long f56856w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f56857x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15169v3 f56858y;

    /* JADX INFO: renamed from: z */
    public int f56859z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15159u3(C15169v3 c15169v3, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f56858y = c15169v3;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f56857x = obj;
        this.f56859z |= Integer.MIN_VALUE;
        return this.f56858y.mo29342p0(0L, this);
    }
}
