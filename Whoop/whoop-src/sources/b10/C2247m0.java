package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2247m0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8924w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8925x;

    /* JADX INFO: renamed from: y */
    public int f8926y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247m0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8925x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8924w = obj;
        this.f8926y |= Integer.MIN_VALUE;
        Object objM7066L = this.f8925x.m7066L(null, null, this);
        return objM7066L == EnumC31071a.f128113w ? objM7066L : new C23468n(objM7066L);
    }
}
