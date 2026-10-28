package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2261t0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8972w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8973x;

    /* JADX INFO: renamed from: y */
    public int f8974y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261t0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8973x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8972w = obj;
        this.f8974y |= Integer.MIN_VALUE;
        Object objM7073S = this.f8973x.m7073S(null, null, null, this);
        return objM7073S == EnumC31071a.f128113w ? objM7073S : new C23468n(objM7073S);
    }
}
