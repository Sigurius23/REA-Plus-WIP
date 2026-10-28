package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C37083f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f158640w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37092i f158641x;

    /* JADX INFO: renamed from: y */
    public int f158642y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37083f(C37092i c37092i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158641x = c37092i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158640w = obj;
        this.f158642y |= Integer.MIN_VALUE;
        return this.f158641x.m119015i(null, this);
    }
}
