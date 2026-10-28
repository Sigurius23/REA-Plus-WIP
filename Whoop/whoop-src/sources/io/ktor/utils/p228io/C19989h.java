package io.ktor.utils.p228io;

import io.seon.androidsdk.service.AbstractC20660e1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C19989h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f75028E;

    /* JADX INFO: renamed from: w */
    public C20020m f75029w;

    /* JADX INFO: renamed from: x */
    public AbstractC20660e1 f75030x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f75031y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C20020m f75032z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19989h(C20020m c20020m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f75032z = c20020m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f75031y = obj;
        this.f75028E |= Integer.MIN_VALUE;
        return this.f75032z.m55835N(null, this);
    }
}
