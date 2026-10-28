package p537ux;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: ux.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35337i0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f150545w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35339j0 f150546x;

    /* JADX INFO: renamed from: y */
    public int f150547y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35337i0(C35339j0 c35339j0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f150546x = c35339j0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f150545w = obj;
        this.f150547y |= Integer.MIN_VALUE;
        return this.f150546x.m112193c(null, this);
    }
}
