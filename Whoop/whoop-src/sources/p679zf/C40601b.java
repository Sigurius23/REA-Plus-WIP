package p679zf;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: zf.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C40601b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public int f174954w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f174955x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C40602c f174956y;

    /* JADX INFO: renamed from: z */
    public int f174957z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40601b(C40602c c40602c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f174956y = c40602c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f174955x = obj;
        this.f174957z |= Integer.MIN_VALUE;
        return this.f174956y.m131681c(null, this);
    }
}
