package p007a6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0405a0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public int f1385w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f1386x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0429i0 f1387y;

    /* JADX INFO: renamed from: z */
    public int f1388z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0405a0(C0429i0 c0429i0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1387y = c0429i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1386x = obj;
        this.f1388z |= Integer.MIN_VALUE;
        return C0429i0.m1109e(this.f1387y, this);
    }
}
