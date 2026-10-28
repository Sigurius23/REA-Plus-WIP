package d33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11601h0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37418w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37419x;

    /* JADX INFO: renamed from: y */
    public int f37420y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11601h0(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37419x = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37418w = obj;
        this.f37420y |= Integer.MIN_VALUE;
        return this.f37419x.m31046v(null, this);
    }
}
