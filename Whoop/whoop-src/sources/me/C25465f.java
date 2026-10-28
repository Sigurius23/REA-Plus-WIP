package me;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: me.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C25465f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f99703w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25462c f99704x;

    /* JADX INFO: renamed from: y */
    public int f99705y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25465f(C25462c c25462c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f99704x = c25462c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f99703w = obj;
        this.f99705y |= Integer.MIN_VALUE;
        return this.f99704x.mo41126b(this);
    }
}
