package p110e7;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C12796q extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43792w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12797r f43793x;

    /* JADX INFO: renamed from: y */
    public int f43794y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12796q(C12797r c12797r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43793x = c12797r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43792w = obj;
        this.f43794y |= Integer.MIN_VALUE;
        return this.f43793x.m35834h(null, this);
    }
}
