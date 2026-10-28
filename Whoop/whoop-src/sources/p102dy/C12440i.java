package p102dy;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: dy.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C12440i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C12441j f42375w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f42376x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12441j f42377y;

    /* JADX INFO: renamed from: z */
    public int f42378z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12440i(C12441j c12441j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42377y = c12441j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f42376x = obj;
        this.f42378z |= Integer.MIN_VALUE;
        return this.f42377y.m34996g(null, this);
    }
}
