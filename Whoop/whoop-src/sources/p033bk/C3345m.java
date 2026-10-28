package p033bk;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: bk.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C3345m extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Long f12987E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f12988F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C3346n f12989G;

    /* JADX INFO: renamed from: H */
    public int f12990H;

    /* JADX INFO: renamed from: w */
    public C3346n f12991w;

    /* JADX INFO: renamed from: x */
    public Long f12992x;

    /* JADX INFO: renamed from: y */
    public Long f12993y;

    /* JADX INFO: renamed from: z */
    public Long f12994z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3345m(C3346n c3346n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12989G = c3346n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12988F = obj;
        this.f12990H |= Integer.MIN_VALUE;
        return this.f12989G.m9657h(this);
    }
}
