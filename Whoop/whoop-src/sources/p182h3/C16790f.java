package p182h3;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C16790f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f64540w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16791g f64541x;

    /* JADX INFO: renamed from: y */
    public int f64542y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16790f(C16791g c16791g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64541x = c16791g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64540w = obj;
        this.f64542y |= Integer.MIN_VALUE;
        return this.f64541x.m47337b(0.0f, this);
    }
}
