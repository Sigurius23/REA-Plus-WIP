package p615xh;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: xh.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C38298e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38304k f164131w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f164132x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38299f f164133y;

    /* JADX INFO: renamed from: z */
    public int f164134z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38298e(C38299f c38299f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f164133y = c38299f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f164132x = obj;
        this.f164134z |= Integer.MIN_VALUE;
        return this.f164133y.intercept(null, this);
    }
}
