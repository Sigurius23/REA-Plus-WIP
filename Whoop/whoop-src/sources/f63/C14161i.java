package f63;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: f63.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C14161i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f51021w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14162j f51022x;

    /* JADX INFO: renamed from: y */
    public int f51023y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14161i(C14162j c14162j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f51022x = c14162j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f51021w = obj;
        this.f51023y |= Integer.MIN_VALUE;
        return this.f51022x.m40348c(this);
    }
}
