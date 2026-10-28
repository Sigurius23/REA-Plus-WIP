package p007a6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0445o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0447p0 f1534E;

    /* JADX INFO: renamed from: F */
    public int f1535F;

    /* JADX INFO: renamed from: w */
    public Object f1536w;

    /* JADX INFO: renamed from: x */
    public Object f1537x;

    /* JADX INFO: renamed from: y */
    public C0451r0 f1538y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f1539z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0445o0(C0447p0 c0447p0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1534E = c0447p0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1539z = obj;
        this.f1535F |= Integer.MIN_VALUE;
        return this.f1534E.mo1104c(null, this);
    }
}
