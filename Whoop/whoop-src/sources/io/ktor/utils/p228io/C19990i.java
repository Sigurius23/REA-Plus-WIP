package io.ktor.utils.p228io;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C19990i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f75033E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C20020m f75034F;

    /* JADX INFO: renamed from: G */
    public int f75035G;

    /* JADX INFO: renamed from: w */
    public C20020m f75036w;

    /* JADX INFO: renamed from: x */
    public byte[] f75037x;

    /* JADX INFO: renamed from: y */
    public int f75038y;

    /* JADX INFO: renamed from: z */
    public int f75039z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19990i(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f75034F = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f75033E = obj;
        this.f75035G |= Integer.MIN_VALUE;
        return this.f75034F.m55836O(null, 0, 0, this);
    }
}
