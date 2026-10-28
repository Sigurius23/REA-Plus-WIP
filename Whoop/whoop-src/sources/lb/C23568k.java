package lb;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: lb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C23568k extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public int f93467w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f93468x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23571n f93469y;

    /* JADX INFO: renamed from: z */
    public int f93470z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23568k(C23571n c23571n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f93469y = c23571n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f93468x = obj;
        this.f93470z |= Integer.MIN_VALUE;
        return this.f93469y.m68217e(null, null, this);
    }
}
