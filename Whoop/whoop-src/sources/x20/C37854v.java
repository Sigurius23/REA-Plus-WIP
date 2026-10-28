package x20;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: x20.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C37854v extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C37855w f162047w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f162048x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37855w f162049y;

    /* JADX INFO: renamed from: z */
    public int f162050z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37854v(C37855w c37855w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f162049y = c37855w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162048x = obj;
        this.f162050z |= Integer.MIN_VALUE;
        return this.f162049y.m121380l(this);
    }
}
