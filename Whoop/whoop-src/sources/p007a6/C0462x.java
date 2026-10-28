package p007a6;

import bc3.C3058t;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0462x extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C3058t f1579w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f1580x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0429i0 f1581y;

    /* JADX INFO: renamed from: z */
    public int f1582z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462x(C0429i0 c0429i0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1581y = c0429i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1580x = obj;
        this.f1582z |= Integer.MIN_VALUE;
        return C0429i0.m1107c(this.f1581y, null, this);
    }
}
