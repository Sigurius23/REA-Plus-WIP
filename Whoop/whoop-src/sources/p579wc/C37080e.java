package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C37080e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f158629w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37092i f158630x;

    /* JADX INFO: renamed from: y */
    public int f158631y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37080e(C37092i c37092i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158630x = c37092i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158629w = obj;
        this.f158631y |= Integer.MIN_VALUE;
        return this.f158630x.m119014h(this);
    }
}
