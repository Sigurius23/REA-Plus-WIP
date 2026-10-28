package p537ux;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ux.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35349o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f150578w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35357s0 f150579x;

    /* JADX INFO: renamed from: y */
    public int f150580y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35349o0(C35357s0 c35357s0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f150579x = c35357s0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f150578w = obj;
        this.f150580y |= Integer.MIN_VALUE;
        Object objM112198b = this.f150579x.m112198b(null, null, this);
        return objM112198b == EnumC31071a.f128113w ? objM112198b : new C23468n(objM112198b);
    }
}
