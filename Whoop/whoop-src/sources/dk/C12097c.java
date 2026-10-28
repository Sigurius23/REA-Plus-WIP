package dk;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: dk.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12097c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C12096b f40278w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f40279x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12096b f40280y;

    /* JADX INFO: renamed from: z */
    public int f40281z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12097c(C12096b c12096b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f40280y = c12096b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f40279x = obj;
        this.f40281z |= Integer.MIN_VALUE;
        return this.f40280y.m33423b(this);
    }
}
