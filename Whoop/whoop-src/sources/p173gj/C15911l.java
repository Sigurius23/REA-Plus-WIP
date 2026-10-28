package p173gj;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: gj.l */
/* JADX INFO: loaded from: classes.dex */
public final class C15911l extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f60192w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15912m f60193x;

    /* JADX INFO: renamed from: y */
    public int f60194y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15911l(C15912m c15912m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f60193x = c15912m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f60192w = obj;
        this.f60194y |= Integer.MIN_VALUE;
        return this.f60193x.m44894h0(0L, this);
    }
}
