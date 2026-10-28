package bd;

import p522uf.C34896w;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bd.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C3079a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C34896w f12114w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f12115x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3080b f12116y;

    /* JADX INFO: renamed from: z */
    public int f12117z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3079a(C3080b c3080b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12116y = c3080b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12115x = obj;
        this.f12117z |= Integer.MIN_VALUE;
        return this.f12116y.mo8834c(null, this);
    }
}
