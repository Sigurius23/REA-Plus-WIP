package p007a6;

import mc3.C25437c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0406a1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f1389E;

    /* JADX INFO: renamed from: w */
    public Object f1390w;

    /* JADX INFO: renamed from: x */
    public C25437c f1391x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1392y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0415d1 f1393z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0406a1(C0415d1 c0415d1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1393z = c0415d1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1392y = obj;
        this.f1389E |= Integer.MIN_VALUE;
        return this.f1393z.m1099b(null, this);
    }
}
