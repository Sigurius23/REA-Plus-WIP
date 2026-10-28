package p492t2;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t2.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C33317e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f138981E;

    /* JADX INFO: renamed from: w */
    public long f138982w;

    /* JADX INFO: renamed from: x */
    public long f138983x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f138984y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33319g f138985z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33317e(C33319g c33319g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138985z = c33319g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138984y = obj;
        this.f138981E |= Integer.MIN_VALUE;
        return this.f138985z.mo9762V(0L, 0L, this);
    }
}
