package p330n1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: n1.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C26110j extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f103444w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26114n f103445x;

    /* JADX INFO: renamed from: y */
    public int f103446y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26110j(C26114n c26114n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103445x = c26114n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103444w = obj;
        this.f103446y |= Integer.MIN_VALUE;
        return C26114n.m77672a1(this.f103445x, this);
    }
}
