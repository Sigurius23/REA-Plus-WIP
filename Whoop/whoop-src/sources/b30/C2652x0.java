package b30;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: b30.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2652x0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C2659y0 f10360w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f10361x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2659y0 f10362y;

    /* JADX INFO: renamed from: z */
    public int f10363z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2652x0(C2659y0 c2659y0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f10362y = c2659y0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f10361x = obj;
        this.f10363z |= Integer.MIN_VALUE;
        return C2659y0.m7524a(this.f10362y, this);
    }
}
