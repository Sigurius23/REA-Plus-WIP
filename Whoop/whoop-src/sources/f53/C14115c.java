package f53;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: f53.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14115c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C14122j f50725w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f50726x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14122j f50727y;

    /* JADX INFO: renamed from: z */
    public int f50728z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14115c(C14122j c14122j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f50727y = c14122j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f50726x = obj;
        this.f50728z |= Integer.MIN_VALUE;
        return C14122j.m40209a(this.f50727y, this);
    }
}
