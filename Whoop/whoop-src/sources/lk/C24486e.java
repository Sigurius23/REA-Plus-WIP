package lk;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: lk.e */
/* JADX INFO: loaded from: classes.dex */
public final class C24486e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C24488g f95527w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f95528x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C24488g f95529y;

    /* JADX INFO: renamed from: z */
    public int f95530z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24486e(C24488g c24488g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f95529y = c24488g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f95528x = obj;
        this.f95530z |= Integer.MIN_VALUE;
        return this.f95529y.m71259b(null, this);
    }
}
