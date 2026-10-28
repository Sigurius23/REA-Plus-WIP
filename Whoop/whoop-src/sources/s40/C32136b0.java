package s40;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: s40.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32136b0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f133162w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32142d0 f133163x;

    /* JADX INFO: renamed from: y */
    public int f133164y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32136b0(C32142d0 c32142d0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f133163x = c32142d0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f133162w = obj;
        this.f133164y |= Integer.MIN_VALUE;
        return C32142d0.m100092g(this.f133163x, this);
    }
}
