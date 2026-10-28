package lk;

import p005a3.C0237p;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: lk.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C24482a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C0237p f95510w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f95511x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0237p f95512y;

    /* JADX INFO: renamed from: z */
    public int f95513z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24482a(C0237p c0237p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f95512y = c0237p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f95511x = obj;
        this.f95513z |= Integer.MIN_VALUE;
        return this.f95512y.mo704j(this);
    }
}
