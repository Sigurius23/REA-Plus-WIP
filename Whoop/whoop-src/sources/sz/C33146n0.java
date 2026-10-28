package sz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: sz.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33146n0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f138233w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33150p0 f138234x;

    /* JADX INFO: renamed from: y */
    public int f138235y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33146n0(C33150p0 c33150p0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138234x = c33150p0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138233w = obj;
        this.f138235y |= Integer.MIN_VALUE;
        return this.f138234x.m105017g(null, this);
    }
}
