package eg;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: eg.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C13165n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f45612E;

    /* JADX INFO: renamed from: w */
    public Object f45613w;

    /* JADX INFO: renamed from: x */
    public int f45614x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f45615y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13166o f45616z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13165n(C13166o c13166o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f45616z = c13166o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45615y = obj;
        this.f45612E |= Integer.MIN_VALUE;
        return this.f45616z.m36848h(null, 0, null, this);
    }
}
