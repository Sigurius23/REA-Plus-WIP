package p180h0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h0.g2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16393g2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f63026w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16398h2 f63027x;

    /* JADX INFO: renamed from: y */
    public int f63028y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16393g2(C16398h2 c16398h2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f63027x = c16398h2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f63026w = obj;
        this.f63028y |= Integer.MIN_VALUE;
        return this.f63027x.m46590f(this);
    }
}
