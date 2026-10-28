package io.ktor.utils.p228io;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20006j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f75071E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C20020m f75072F;

    /* JADX INFO: renamed from: G */
    public int f75073G;

    /* JADX INFO: renamed from: w */
    public C20020m f75074w;

    /* JADX INFO: renamed from: x */
    public byte[] f75075x;

    /* JADX INFO: renamed from: y */
    public int f75076y;

    /* JADX INFO: renamed from: z */
    public int f75077z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20006j(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f75072F = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f75071E = obj;
        this.f75073G |= Integer.MIN_VALUE;
        return this.f75072F.m55838Q(null, 0, 0, this);
    }
}
