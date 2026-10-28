package io.ktor.utils.p228io;

import p715kotlin.jvm.functions.Function1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C19988g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C20020m f75022E;

    /* JADX INFO: renamed from: F */
    public int f75023F;

    /* JADX INFO: renamed from: w */
    public C20020m f75024w;

    /* JADX INFO: renamed from: x */
    public Function1 f75025x;

    /* JADX INFO: renamed from: y */
    public int f75026y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f75027z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19988g(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f75022E = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f75027z = obj;
        this.f75023F |= Integer.MIN_VALUE;
        return C20020m.m55818J(this.f75022E, 0, null, this);
    }
}
