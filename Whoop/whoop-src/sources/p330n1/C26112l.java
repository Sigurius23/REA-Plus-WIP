package p330n1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: n1.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C26112l extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f103450w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26114n f103451x;

    /* JADX INFO: renamed from: y */
    public int f103452y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26112l(C26114n c26114n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103451x = c26114n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103450w = obj;
        this.f103452y |= Integer.MIN_VALUE;
        return this.f103451x.mo29342p0(0L, this);
    }
}
