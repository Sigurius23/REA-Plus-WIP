package io.ktor.utils.p228io;

import p715kotlin.jvm.internal.C22667f0;
import s83.AbstractC32269c;
import v63.C35746d;
import w63.C36866a;

/* JADX INFO: renamed from: io.ktor.utils.io.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C19986e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public C36866a f75010E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f75011F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C20020m f75012G;

    /* JADX INFO: renamed from: H */
    public int f75013H;

    /* JADX INFO: renamed from: w */
    public C20020m f75014w;

    /* JADX INFO: renamed from: x */
    public C35746d f75015x;

    /* JADX INFO: renamed from: y */
    public C22667f0 f75016y;

    /* JADX INFO: renamed from: z */
    public C35746d f75017z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19986e(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f75012G = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f75011F = obj;
        this.f75013H |= Integer.MIN_VALUE;
        return this.f75012G.m55858w(0L, this);
    }
}
