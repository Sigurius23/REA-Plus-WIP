package z20;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: z20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C40010d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f172609w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C40013g f172610x;

    /* JADX INFO: renamed from: y */
    public int f172611y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40010d(C40013g c40013g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172610x = c40013g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172609w = obj;
        this.f172611y |= Integer.MIN_VALUE;
        return this.f172610x.m128242d(null, this);
    }
}
