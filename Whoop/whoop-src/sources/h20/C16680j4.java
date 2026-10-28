package h20;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h20.j4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16680j4 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C16686k4 f64142w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f64143x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16686k4 f64144y;

    /* JADX INFO: renamed from: z */
    public int f64145z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16680j4(C16686k4 c16686k4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64144y = c16686k4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64143x = obj;
        this.f64145z |= Integer.MIN_VALUE;
        return C16686k4.m47235A(this.f64144y, this);
    }
}
