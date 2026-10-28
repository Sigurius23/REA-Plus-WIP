package p007a6;

import mc3.C25437c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0409b1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f1401E;

    /* JADX INFO: renamed from: w */
    public C25437c f1402w;

    /* JADX INFO: renamed from: x */
    public boolean f1403x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1404y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0415d1 f1405z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0409b1(C0415d1 c0415d1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1405z = c0415d1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1404y = obj;
        this.f1401E |= Integer.MIN_VALUE;
        return this.f1405z.m1100c(null, this);
    }
}
