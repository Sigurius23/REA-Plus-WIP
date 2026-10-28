package bm;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: bm.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C3393q extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C3396t f13239E;

    /* JADX INFO: renamed from: F */
    public int f13240F;

    /* JADX INFO: renamed from: w */
    public C3396t f13241w;

    /* JADX INFO: renamed from: x */
    public int f13242x;

    /* JADX INFO: renamed from: y */
    public int f13243y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f13244z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3393q(C3396t c3396t, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f13239E = c3396t;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f13244z = obj;
        this.f13240F |= Integer.MIN_VALUE;
        return this.f13239E.m9767f(0, this);
    }
}
