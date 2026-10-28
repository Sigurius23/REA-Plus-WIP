package p537ux;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ux.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35351p0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f150588w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35357s0 f150589x;

    /* JADX INFO: renamed from: y */
    public int f150590y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35351p0(C35357s0 c35357s0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f150589x = c35357s0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f150588w = obj;
        this.f150590y |= Integer.MIN_VALUE;
        Object objM112199c = this.f150589x.m112199c(null, this);
        return objM112199c == EnumC31071a.f128113w ? objM112199c : new C23468n(objM112199c);
    }
}
