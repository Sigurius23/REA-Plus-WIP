package p180h0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16364b1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f62905w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC16387f1 f62906x;

    /* JADX INFO: renamed from: y */
    public int f62907y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16364b1(AbstractC16387f1 abstractC16387f1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f62906x = abstractC16387f1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f62905w = obj;
        this.f62907y |= Integer.MIN_VALUE;
        return AbstractC16387f1.m46577a1(this.f62906x, this);
    }
}
