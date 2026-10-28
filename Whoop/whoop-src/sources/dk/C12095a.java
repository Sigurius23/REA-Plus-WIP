package dk;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: dk.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12095a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C12096b f40268w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f40269x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12096b f40270y;

    /* JADX INFO: renamed from: z */
    public int f40271z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12095a(C12096b c12096b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f40270y = c12096b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f40269x = obj;
        this.f40271z |= Integer.MIN_VALUE;
        return this.f40270y.m33423b(this);
    }
}
