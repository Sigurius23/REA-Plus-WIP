package p007a6;

import mc3.C25437c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0464y extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C25437c f1587w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f1588x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0429i0 f1589y;

    /* JADX INFO: renamed from: z */
    public int f1590z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0464y(C0429i0 c0429i0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1589y = c0429i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1588x = obj;
        this.f1590z |= Integer.MIN_VALUE;
        return C0429i0.m1108d(this.f1589y, this);
    }
}
