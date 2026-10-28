package be;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: be.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C3156i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f12354w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3158k f12355x;

    /* JADX INFO: renamed from: y */
    public int f12356y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3156i(C3158k c3158k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12355x = c3158k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12354w = obj;
        this.f12356y |= Integer.MIN_VALUE;
        return this.f12355x.m9056b(this);
    }
}
