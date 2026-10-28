package be;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: be.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C3155h extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f12351w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3158k f12352x;

    /* JADX INFO: renamed from: y */
    public int f12353y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3155h(C3158k c3158k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12352x = c3158k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12351w = obj;
        this.f12353y |= Integer.MIN_VALUE;
        return this.f12352x.m9055a(this);
    }
}
