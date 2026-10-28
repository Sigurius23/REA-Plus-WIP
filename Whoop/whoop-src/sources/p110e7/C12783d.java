package p110e7;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C12783d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C12786g f43754w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f43755x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12786g f43756y;

    /* JADX INFO: renamed from: z */
    public int f43757z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12783d(C12786g c12786g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43756y = c12786g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43755x = obj;
        this.f43757z |= Integer.MIN_VALUE;
        return this.f43756y.mo7843d(this);
    }
}
