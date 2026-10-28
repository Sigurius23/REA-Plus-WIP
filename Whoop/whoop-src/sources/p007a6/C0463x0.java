package p007a6;

import mc3.InterfaceC25435a;
import p692zt.C41113q;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0463x0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC25435a f1583w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f1584x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C41113q f1585y;

    /* JADX INFO: renamed from: z */
    public int f1586z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0463x0(C41113q c41113q, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1585y = c41113q;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1584x = obj;
        this.f1586z |= Integer.MIN_VALUE;
        return this.f1585y.m133454F(this);
    }
}
