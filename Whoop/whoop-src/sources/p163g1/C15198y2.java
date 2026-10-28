package p163g1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.y2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15198y2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f57056w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15208z2 f57057x;

    /* JADX INFO: renamed from: y */
    public int f57058y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15198y2(C15208z2 c15208z2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f57057x = c15208z2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f57056w = obj;
        this.f57058y |= Integer.MIN_VALUE;
        return this.f57057x.m43227b(this);
    }
}
