package p239j1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: j1.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C21191i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f80748w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21192j f80749x;

    /* JADX INFO: renamed from: y */
    public int f80750y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21191i(C21192j c21192j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f80749x = c21192j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f80748w = obj;
        this.f80750y |= Integer.MIN_VALUE;
        return this.f80749x.mo29342p0(0L, this);
    }
}
