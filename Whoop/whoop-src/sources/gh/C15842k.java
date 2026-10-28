package gh;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: gh.k */
/* JADX INFO: loaded from: classes.dex */
public final class C15842k extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f59832w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15844m f59833x;

    /* JADX INFO: renamed from: y */
    public int f59834y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15842k(C15844m c15844m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f59833x = c15844m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f59832w = obj;
        this.f59834y |= Integer.MIN_VALUE;
        return this.f59833x.m44675b(null, this);
    }
}
