package o10;

import g10.C15215a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: o10.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C27392e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f110102w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15215a f110103x;

    /* JADX INFO: renamed from: y */
    public int f110104y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27392e(C15215a c15215a, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f110103x = c15215a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f110102w = obj;
        this.f110104y |= Integer.MIN_VALUE;
        return this.f110103x.m43229i(null, this);
    }
}
