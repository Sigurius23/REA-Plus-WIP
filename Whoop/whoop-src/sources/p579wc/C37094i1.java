package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37094i1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f158687w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37097j1 f158688x;

    /* JADX INFO: renamed from: y */
    public int f158689y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37094i1(C37097j1 c37097j1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158688x = c37097j1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158687w = obj;
        this.f158689y |= Integer.MIN_VALUE;
        return this.f158688x.mo79294b(null, this);
    }
}
