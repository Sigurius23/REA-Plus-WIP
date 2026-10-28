package io.ktor.utils.p228io.jvm.javaio;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20012f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C20013g f75091w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f75092x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C20013g f75093y;

    /* JADX INFO: renamed from: z */
    public int f75094z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20012f(C20013g c20013g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f75093y = c20013g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f75092x = obj;
        this.f75094z |= Integer.MIN_VALUE;
        return this.f75093y.mo55813a(this);
    }
}
