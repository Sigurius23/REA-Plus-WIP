package p537ux;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ux.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35353q0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f150599w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35357s0 f150600x;

    /* JADX INFO: renamed from: y */
    public int f150601y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35353q0(C35357s0 c35357s0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f150600x = c35357s0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f150599w = obj;
        this.f150601y |= Integer.MIN_VALUE;
        Object objM112200d = this.f150600x.m112200d(null, this);
        return objM112200d == EnumC31071a.f128113w ? objM112200d : new C23468n(objM112200d);
    }
}
