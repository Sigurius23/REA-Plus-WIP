package io.ktor.utils.p228io;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C20018k extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f75102E;

    /* JADX INFO: renamed from: w */
    public C20020m f75103w;

    /* JADX INFO: renamed from: x */
    public int f75104x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f75105y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C20020m f75106z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20018k(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f75106z = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f75105y = obj;
        this.f75102E |= Integer.MIN_VALUE;
        return this.f75106z.m55837P(0, this);
    }
}
