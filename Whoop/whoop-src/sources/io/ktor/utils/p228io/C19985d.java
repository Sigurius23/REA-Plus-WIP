package io.ktor.utils.p228io;

import s83.AbstractC32269c;
import w63.C36866a;

/* JADX INFO: renamed from: io.ktor.utils.io.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C19985d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f75005E;

    /* JADX INFO: renamed from: w */
    public C20020m f75006w;

    /* JADX INFO: renamed from: x */
    public C36866a f75007x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f75008y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C20020m f75009z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19985d(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f75009z = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f75008y = obj;
        this.f75005E |= Integer.MIN_VALUE;
        return this.f75009z.m55855t(null, this);
    }
}
