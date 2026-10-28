package io.ktor.utils.p228io;

import p715kotlin.jvm.functions.Function1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C19982a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f74977E;

    /* JADX INFO: renamed from: w */
    public C20020m f74978w;

    /* JADX INFO: renamed from: x */
    public Function1 f74979x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f74980y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C20020m f74981z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19982a(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f74981z = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f74980y = obj;
        this.f74977E |= Integer.MIN_VALUE;
        return this.f74981z.m55841e(0, null, this);
    }
}
