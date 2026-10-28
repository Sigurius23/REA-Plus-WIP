package lk;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: lk.f */
/* JADX INFO: loaded from: classes.dex */
public final class C24487f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C24488g f95531w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f95532x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C24488g f95533y;

    /* JADX INFO: renamed from: z */
    public int f95534z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24487f(C24488g c24488g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f95533y = c24488g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f95532x = obj;
        this.f95534z |= Integer.MIN_VALUE;
        return this.f95533y.m71260c(this);
    }
}
