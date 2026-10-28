package p340nd;

import p300ld.C23841a;
import p522uf.C34896w;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: nd.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C26572a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C34896w f105677w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f105678x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23841a f105679y;

    /* JADX INFO: renamed from: z */
    public int f105680z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26572a(C23841a c23841a, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f105679y = c23841a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f105678x = obj;
        this.f105680z |= Integer.MIN_VALUE;
        return this.f105679y.mo8834c(null, this);
    }
}
