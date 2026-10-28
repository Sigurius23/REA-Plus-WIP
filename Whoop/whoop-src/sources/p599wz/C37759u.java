package p599wz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wz.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C37759u extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C37770y f161734w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f161735x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37770y f161736y;

    /* JADX INFO: renamed from: z */
    public int f161737z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37759u(C37770y c37770y, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161736y = c37770y;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161735x = obj;
        this.f161737z |= Integer.MIN_VALUE;
        return this.f161736y.m121171o(this);
    }
}
