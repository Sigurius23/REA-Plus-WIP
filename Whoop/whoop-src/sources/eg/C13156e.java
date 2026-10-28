package eg;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: eg.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C13156e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public int f45576w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f45577x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13157f f45578y;

    /* JADX INFO: renamed from: z */
    public int f45579z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13156e(C13157f c13157f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f45578y = c13157f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45577x = obj;
        this.f45579z |= Integer.MIN_VALUE;
        return this.f45578y.mo36843c(0, this);
    }
}
