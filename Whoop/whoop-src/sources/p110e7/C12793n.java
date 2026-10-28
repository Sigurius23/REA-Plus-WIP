package p110e7;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C12793n extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43782w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12797r f43783x;

    /* JADX INFO: renamed from: y */
    public int f43784y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12793n(C12797r c12797r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43783x = c12797r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43782w = obj;
        this.f43784y |= Integer.MIN_VALUE;
        return this.f43783x.mo7839c(null, this);
    }
}
