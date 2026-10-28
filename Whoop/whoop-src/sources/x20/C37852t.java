package x20;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: x20.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C37852t extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C37855w f162040w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f162041x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37855w f162042y;

    /* JADX INFO: renamed from: z */
    public int f162043z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37852t(C37855w c37855w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f162042y = c37855w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162041x = obj;
        this.f162043z |= Integer.MIN_VALUE;
        return C37855w.m121378g(this.f162042y, this);
    }
}
