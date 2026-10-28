package be;

import p522uf.C34894u;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: be.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C3163p extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C34894u f12375w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f12376x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3164q f12377y;

    /* JADX INFO: renamed from: z */
    public int f12378z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3163p(C3164q c3164q, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12377y = c3164q;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12376x = obj;
        this.f12378z |= Integer.MIN_VALUE;
        return this.f12377y.mo9062d(null, this);
    }
}
