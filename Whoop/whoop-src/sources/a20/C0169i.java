package a20;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C0169i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f501E;

    /* JADX INFO: renamed from: w */
    public Object f502w;

    /* JADX INFO: renamed from: x */
    public Object f503x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f504y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0170j f505z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0169i(C0170j c0170j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f505z = c0170j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f504y = obj;
        this.f501E |= Integer.MIN_VALUE;
        return C0170j.m403g(this.f505z, this);
    }
}
