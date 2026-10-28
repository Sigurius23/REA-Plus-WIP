package a30;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a30.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0283d0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f1000w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0286e0 f1001x;

    /* JADX INFO: renamed from: y */
    public int f1002y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283d0(C0286e0 c0286e0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1001x = c0286e0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1000w = obj;
        this.f1002y |= Integer.MIN_VALUE;
        return this.f1001x.m818a(null, null, this);
    }
}
