package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37078d0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f158622w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37084f0 f158623x;

    /* JADX INFO: renamed from: y */
    public int f158624y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37078d0(C37084f0 c37084f0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158623x = c37084f0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158622w = obj;
        this.f158624y |= Integer.MIN_VALUE;
        return this.f158623x.mo79294b(null, this);
    }
}
