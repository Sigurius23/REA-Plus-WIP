package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37121u0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f158808w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37127x0 f158809x;

    /* JADX INFO: renamed from: y */
    public int f158810y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37121u0(C37127x0 c37127x0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158809x = c37127x0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158808w = obj;
        this.f158810y |= Integer.MIN_VALUE;
        return C37127x0.m119040a(this.f158809x, this);
    }
}
