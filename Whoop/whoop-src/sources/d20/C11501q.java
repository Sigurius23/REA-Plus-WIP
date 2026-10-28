package d20;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d20.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C11501q extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C11502r f36987w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f36988x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11502r f36989y;

    /* JADX INFO: renamed from: z */
    public int f36990z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11501q(C11502r c11502r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36989y = c11502r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36988x = obj;
        this.f36990z |= Integer.MIN_VALUE;
        return this.f36989y.m30911l(this);
    }
}
