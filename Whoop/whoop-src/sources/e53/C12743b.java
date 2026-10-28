package e53;

import qg3.C30352d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C12743b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C30352d f43622w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f43623x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C30352d f43624y;

    /* JADX INFO: renamed from: z */
    public int f43625z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12743b(C30352d c30352d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43624y = c30352d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43623x = obj;
        this.f43625z |= Integer.MIN_VALUE;
        return this.f43624y.m92822w(this);
    }
}
