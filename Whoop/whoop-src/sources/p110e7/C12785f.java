package p110e7;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C12785f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43762w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12786g f43763x;

    /* JADX INFO: renamed from: y */
    public int f43764y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12785f(C12786g c12786g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43763x = c12786g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43762w = obj;
        this.f43764y |= Integer.MIN_VALUE;
        return this.f43763x.mo7837a(null, this);
    }
}
