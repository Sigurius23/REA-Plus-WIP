package p110e7;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C12795p extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43789w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12797r f43790x;

    /* JADX INFO: renamed from: y */
    public int f43791y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12795p(C12797r c12797r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43790x = c12797r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43789w = obj;
        this.f43791y |= Integer.MIN_VALUE;
        return this.f43790x.mo7837a(null, this);
    }
}
