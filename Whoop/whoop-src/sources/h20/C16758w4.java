package h20;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h20.w4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16758w4 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f64386E;

    /* JADX INFO: renamed from: w */
    public C16776z4 f64387w;

    /* JADX INFO: renamed from: x */
    public String f64388x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f64389y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16776z4 f64390z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16758w4(C16776z4 c16776z4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64390z = c16776z4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64389y = obj;
        this.f64386E |= Integer.MIN_VALUE;
        return this.f64390z.m47281b(null, this);
    }
}
