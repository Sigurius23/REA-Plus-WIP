package td;

import p458rd.C31238a;
import p522uf.C34896w;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: td.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C33700a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C34896w f140885w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f140886x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C31238a f140887y;

    /* JADX INFO: renamed from: z */
    public int f140888z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33700a(C31238a c31238a, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f140887y = c31238a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f140886x = obj;
        this.f140888z |= Integer.MIN_VALUE;
        return this.f140887y.mo8834c(null, this);
    }
}
