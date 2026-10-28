package q30;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: q30.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29904f0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C29906g0 f122173w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f122174x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29906g0 f122175y;

    /* JADX INFO: renamed from: z */
    public int f122176z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29904f0(C29906g0 c29906g0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f122175y = c29906g0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f122174x = obj;
        this.f122176z |= Integer.MIN_VALUE;
        return this.f122175y.m91516a(this);
    }
}
