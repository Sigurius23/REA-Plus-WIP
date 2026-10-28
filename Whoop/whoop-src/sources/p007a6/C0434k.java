package p007a6;

import p692zt.C41113q;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0434k extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f1490w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C41113q f1491x;

    /* JADX INFO: renamed from: y */
    public int f1492y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0434k(C41113q c41113q, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1491x = c41113q;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1490w = obj;
        this.f1492y |= Integer.MIN_VALUE;
        return this.f1491x.m133472s(this);
    }
}
