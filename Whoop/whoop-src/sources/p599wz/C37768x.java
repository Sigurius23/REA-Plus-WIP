package p599wz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wz.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C37768x extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f161752E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C37770y f161753F;

    /* JADX INFO: renamed from: G */
    public int f161754G;

    /* JADX INFO: renamed from: w */
    public C37770y f161755w;

    /* JADX INFO: renamed from: x */
    public Object f161756x;

    /* JADX INFO: renamed from: y */
    public boolean f161757y;

    /* JADX INFO: renamed from: z */
    public boolean f161758z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37768x(C37770y c37770y, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161753F = c37770y;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161752E = obj;
        this.f161754G |= Integer.MIN_VALUE;
        return this.f161753F.m121173r(false, null, false, this);
    }
}
