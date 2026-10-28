package p180h0;

import p238j0.C21076b;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16370c1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f62928E;

    /* JADX INFO: renamed from: w */
    public C16401i0 f62929w;

    /* JADX INFO: renamed from: x */
    public C21076b f62930x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f62931y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC16387f1 f62932z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16370c1(AbstractC16387f1 abstractC16387f1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f62932z = abstractC16387f1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f62931y = obj;
        this.f62928E |= Integer.MIN_VALUE;
        return AbstractC16387f1.m46578b1(this.f62932z, null, this);
    }
}
