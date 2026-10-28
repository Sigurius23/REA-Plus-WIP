package d33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11625r0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37536w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37537x;

    /* JADX INFO: renamed from: y */
    public int f37538y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11625r0(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37537x = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37536w = obj;
        this.f37538y |= Integer.MIN_VALUE;
        return C11602h1.m31019e(this.f37537x, null, this);
    }
}
