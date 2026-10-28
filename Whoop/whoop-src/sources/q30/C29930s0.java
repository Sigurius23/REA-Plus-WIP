package q30;

import r30.C30897b;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q30.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29930s0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C30897b f122232w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f122233x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29932t0 f122234y;

    /* JADX INFO: renamed from: z */
    public int f122235z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29930s0(C29932t0 c29932t0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f122234y = c29932t0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f122233x = obj;
        this.f122235z |= Integer.MIN_VALUE;
        return this.f122234y.m91524b(null, this);
    }
}
