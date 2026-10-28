package p330n1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: n1.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C26109i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f103441w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26114n f103442x;

    /* JADX INFO: renamed from: y */
    public int f103443y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26109i(C26114n c26114n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103442x = c26114n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103441w = obj;
        this.f103443y |= Integer.MIN_VALUE;
        return this.f103442x.m77673b1(this);
    }
}
