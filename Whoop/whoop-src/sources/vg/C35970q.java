package vg;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: vg.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C35970q extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f153155w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35971r f153156x;

    /* JADX INFO: renamed from: y */
    public int f153157y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35970q(C35971r c35971r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f153156x = c35971r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f153155w = obj;
        this.f153157y |= Integer.MIN_VALUE;
        return this.f153156x.m114209d(null, this);
    }
}
