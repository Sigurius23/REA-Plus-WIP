package p537ux;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ux.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35347n0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f150570w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35357s0 f150571x;

    /* JADX INFO: renamed from: y */
    public int f150572y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35347n0(C35357s0 c35357s0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f150571x = c35357s0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f150570w = obj;
        this.f150572y |= Integer.MIN_VALUE;
        Object objM112197a = this.f150571x.m112197a(null, null, this);
        return objM112197a == EnumC31071a.f128113w ? objM112197a : new C23468n(objM112197a);
    }
}
