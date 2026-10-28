package p492t2;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t2.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C33318f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public long f138986w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f138987x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33319g f138988y;

    /* JADX INFO: renamed from: z */
    public int f138989z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33318f(C33319g c33319g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138988y = c33319g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138987x = obj;
        this.f138989z |= Integer.MIN_VALUE;
        return this.f138988y.mo29342p0(0L, this);
    }
}
