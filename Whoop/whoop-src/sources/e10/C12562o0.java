package e10;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e10.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12562o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42899w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12568r0 f42900x;

    /* JADX INFO: renamed from: y */
    public int f42901y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12562o0(C12568r0 c12568r0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42900x = c12568r0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f42899w = obj;
        this.f42901y |= Integer.MIN_VALUE;
        return this.f42900x.m35246b(this);
    }
}
