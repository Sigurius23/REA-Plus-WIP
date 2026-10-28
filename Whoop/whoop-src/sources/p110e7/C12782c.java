package p110e7;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C12782c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43751w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12786g f43752x;

    /* JADX INFO: renamed from: y */
    public int f43753y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12782c(C12786g c12786g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43752x = c12786g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43751w = obj;
        this.f43753y |= Integer.MIN_VALUE;
        return this.f43752x.mo7841f(null, this);
    }
}
