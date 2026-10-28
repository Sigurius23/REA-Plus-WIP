package p191hd;

import p145fd.C14396b;
import p522uf.C34896w;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: hd.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C17194a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C34896w f66015w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f66016x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14396b f66017y;

    /* JADX INFO: renamed from: z */
    public int f66018z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17194a(C14396b c14396b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f66017y = c14396b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f66016x = obj;
        this.f66018z |= Integer.MIN_VALUE;
        return this.f66017y.mo8834c(null, this);
    }
}
