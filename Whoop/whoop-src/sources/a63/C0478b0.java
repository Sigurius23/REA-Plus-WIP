package a63;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a63.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0478b0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C0480c0 f1622w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f1623x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0480c0 f1624y;

    /* JADX INFO: renamed from: z */
    public int f1625z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0478b0(C0480c0 c0480c0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1624y = c0480c0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1623x = obj;
        this.f1625z |= Integer.MIN_VALUE;
        return this.f1624y.mo1199a(null, this);
    }
}
