package p077d0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d0.a1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11330a1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f36297w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11350f1 f36298x;

    /* JADX INFO: renamed from: y */
    public int f36299y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11330a1(C11350f1 c11350f1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36298x = c11350f1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36297w = obj;
        this.f36299y |= Integer.MIN_VALUE;
        return C11350f1.m30578I0(this.f36298x, this);
    }
}
