package p422qe;

import p522uf.C34896w;
import q30.C29934u0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: qe.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C30298a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C34896w f123987w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f123988x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29934u0 f123989y;

    /* JADX INFO: renamed from: z */
    public int f123990z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30298a(C29934u0 c29934u0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f123989y = c29934u0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f123988x = obj;
        this.f123990z |= Integer.MIN_VALUE;
        return this.f123989y.mo8834c(null, this);
    }
}
