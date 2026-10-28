package j00;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: j00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C21097e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C21103h f79992w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f79993x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21103h f79994y;

    /* JADX INFO: renamed from: z */
    public int f79995z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21097e(C21103h c21103h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f79994y = c21103h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f79993x = obj;
        this.f79995z |= Integer.MIN_VALUE;
        return C21103h.m58926j(this.f79994y, this);
    }
}
