package p613xf;

import p460rg.C31371f;
import s83.AbstractC32269c;
import ve.C35922g;

/* JADX INFO: renamed from: xf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C38258d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C31371f f164025w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f164026x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C35922g f164027y;

    /* JADX INFO: renamed from: z */
    public int f164028z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38258d(C35922g c35922g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f164027y = c35922g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f164026x = obj;
        this.f164028z |= Integer.MIN_VALUE;
        return C35922g.m114101h(this.f164027y, null, this);
    }
}
