package p249jc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: jc.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21580h0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f82755w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21582i0 f82756x;

    /* JADX INFO: renamed from: y */
    public int f82757y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21580h0(C21582i0 c21582i0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f82756x = c21582i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f82755w = obj;
        this.f82757y |= Integer.MIN_VALUE;
        return C21582i0.m60626a(this.f82756x, this);
    }
}
