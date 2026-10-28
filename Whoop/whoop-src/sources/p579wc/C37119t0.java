package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37119t0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f158798E;

    /* JADX INFO: renamed from: w */
    public C37113q0 f158799w;

    /* JADX INFO: renamed from: x */
    public Object f158800x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f158801y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37127x0 f158802z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37119t0(C37127x0 c37127x0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158802z = c37127x0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158801y = obj;
        this.f158798E |= Integer.MIN_VALUE;
        return this.f158802z.m119041c(null, this);
    }
}
