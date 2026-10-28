package h20;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h20.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C16753w extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f64341w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16759x f64342x;

    /* JADX INFO: renamed from: y */
    public int f64343y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16753w(C16759x c16759x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64342x = c16759x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64341w = obj;
        this.f64343y |= Integer.MIN_VALUE;
        return this.f64342x.m47276a(null, this);
    }
}
