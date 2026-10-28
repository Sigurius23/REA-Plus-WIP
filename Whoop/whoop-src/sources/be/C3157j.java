package be;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: be.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C3157j extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f12357w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3158k f12358x;

    /* JADX INFO: renamed from: y */
    public int f12359y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3157j(C3158k c3158k, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f12358x = c3158k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12357w = obj;
        this.f12359y |= Integer.MIN_VALUE;
        return this.f12358x.m9057d(this);
    }
}
