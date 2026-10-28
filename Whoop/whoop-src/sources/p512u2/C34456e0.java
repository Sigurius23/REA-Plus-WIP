package p512u2;

import bc3.C2996c2;
import s83.AbstractC32267a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: u2.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34456e0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C2996c2 f144760w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f144761x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C34460g0 f144762y;

    /* JADX INFO: renamed from: z */
    public int f144763z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34456e0(C34460g0 c34460g0, AbstractC32267a abstractC32267a) {
        super(abstractC32267a);
        this.f144762y = c34460g0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f144761x = obj;
        this.f144763z |= Integer.MIN_VALUE;
        return this.f144762y.m108931k(0L, null, this);
    }
}
