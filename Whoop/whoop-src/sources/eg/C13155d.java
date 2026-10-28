package eg;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: eg.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C13155d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45573w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13157f f45574x;

    /* JADX INFO: renamed from: y */
    public int f45575y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13155d(C13157f c13157f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f45574x = c13157f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45573w = obj;
        this.f45575y |= Integer.MIN_VALUE;
        return this.f45574x.mo36842b(this);
    }
}
