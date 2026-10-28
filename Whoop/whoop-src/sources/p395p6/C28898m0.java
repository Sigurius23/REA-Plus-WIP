package p395p6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28898m0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C28901n0 f116975w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f116976x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28901n0 f116977y;

    /* JADX INFO: renamed from: z */
    public int f116978z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28898m0(C28901n0 c28901n0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f116977y = c28901n0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116976x = obj;
        this.f116978z |= Integer.MIN_VALUE;
        return this.f116977y.m87821c(this);
    }
}
