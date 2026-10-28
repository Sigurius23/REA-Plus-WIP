package io.ktor.utils.p228io;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C19987f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C20020m f75018w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f75019x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C20020m f75020y;

    /* JADX INFO: renamed from: z */
    public int f75021z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19987f(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f75020y = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f75019x = obj;
        this.f75021z |= Integer.MIN_VALUE;
        return this.f75020y.m55860y(0, this);
    }
}
