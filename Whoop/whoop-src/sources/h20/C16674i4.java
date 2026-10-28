package h20;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h20.i4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16674i4 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C16686k4 f64124w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f64125x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16686k4 f64126y;

    /* JADX INFO: renamed from: z */
    public int f64127z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16674i4(C16686k4 c16686k4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64126y = c16686k4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64125x = obj;
        this.f64127z |= Integer.MIN_VALUE;
        return this.f64126y.m47241G(null, this);
    }
}
