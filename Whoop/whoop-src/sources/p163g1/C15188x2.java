package p163g1;

import p238j0.InterfaceC21082h;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.x2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15188x2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC21082h f57001w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f57002x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15208z2 f57003y;

    /* JADX INFO: renamed from: z */
    public int f57004z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15188x2(C15208z2 c15208z2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f57003y = c15208z2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f57002x = obj;
        this.f57004z |= Integer.MIN_VALUE;
        return this.f57003y.m43226a(null, this);
    }
}
