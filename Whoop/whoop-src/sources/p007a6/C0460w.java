package p007a6;

import mc3.C25437c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C0460w extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C25437c f1575w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f1576x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0429i0 f1577y;

    /* JADX INFO: renamed from: z */
    public int f1578z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0460w(C0429i0 c0429i0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1577y = c0429i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1576x = obj;
        this.f1578z |= Integer.MIN_VALUE;
        return C0429i0.m1106b(this.f1577y, this);
    }
}
