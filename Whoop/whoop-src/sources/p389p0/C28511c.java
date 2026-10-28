package p389p0;

import p715kotlin.jvm.internal.C22669g0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C28511c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C22669g0 f115405w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f115406x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28514d f115407y;

    /* JADX INFO: renamed from: z */
    public int f115408z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28511c(C28514d c28514d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f115407y = c28514d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f115406x = obj;
        this.f115408z |= Integer.MIN_VALUE;
        return this.f115407y.m86821j(this);
    }
}
