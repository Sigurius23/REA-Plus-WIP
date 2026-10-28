package p110e7;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C12790k extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43772w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12797r f43773x;

    /* JADX INFO: renamed from: y */
    public int f43774y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12790k(C12797r c12797r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43773x = c12797r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43772w = obj;
        this.f43774y |= Integer.MIN_VALUE;
        return this.f43773x.mo7838b(null, this);
    }
}
