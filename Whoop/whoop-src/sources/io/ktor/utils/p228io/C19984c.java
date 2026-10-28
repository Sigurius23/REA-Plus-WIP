package io.ktor.utils.p228io;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C19984c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f74997E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C20020m f74998F;

    /* JADX INFO: renamed from: G */
    public int f74999G;

    /* JADX INFO: renamed from: w */
    public C20020m f75000w;

    /* JADX INFO: renamed from: x */
    public byte[] f75001x;

    /* JADX INFO: renamed from: y */
    public int f75002y;

    /* JADX INFO: renamed from: z */
    public int f75003z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19984c(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f74998F = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f74997E = obj;
        this.f74999G |= Integer.MIN_VALUE;
        return this.f74998F.m55856u(null, 0, 0, this);
    }
}
