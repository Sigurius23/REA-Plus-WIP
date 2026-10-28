package bi;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: bi.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C3276n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C3277o f12791E;

    /* JADX INFO: renamed from: F */
    public int f12792F;

    /* JADX INFO: renamed from: w */
    public Object f12793w;

    /* JADX INFO: renamed from: x */
    public Object f12794x;

    /* JADX INFO: renamed from: y */
    public Object f12795y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f12796z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3276n(C3277o c3277o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12791E = c3277o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12796z = obj;
        this.f12792F |= Integer.MIN_VALUE;
        return C3277o.m9538c(this.f12791E, null, null, null, this);
    }
}
