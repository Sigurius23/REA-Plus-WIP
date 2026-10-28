package p639y6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: y6.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C39252d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f168765w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39254f f168766x;

    /* JADX INFO: renamed from: y */
    public int f168767y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39252d(C39254f c39254f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168766x = c39254f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168765w = obj;
        this.f168767y |= Integer.MIN_VALUE;
        return this.f168766x.m125028c(null, null, null, this);
    }
}
