package e33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C12649p extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C12659u f43212w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f43213x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12659u f43214y;

    /* JADX INFO: renamed from: z */
    public int f43215z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12649p(C12659u c12659u, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43214y = c12659u;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43213x = obj;
        this.f43215z |= Integer.MIN_VALUE;
        return this.f43214y.m35414c(null, this);
    }
}
