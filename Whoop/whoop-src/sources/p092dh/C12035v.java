package p092dh;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: dh.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C12035v extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f39801w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12036w f39802x;

    /* JADX INFO: renamed from: y */
    public int f39803y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12035v(C12036w c12036w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f39802x = c12036w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f39801w = obj;
        this.f39803y |= Integer.MIN_VALUE;
        return this.f39802x.m33155c(null, this);
    }
}
