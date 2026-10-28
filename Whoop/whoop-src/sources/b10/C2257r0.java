package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2257r0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8960w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8961x;

    /* JADX INFO: renamed from: y */
    public int f8962y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2257r0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8961x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8960w = obj;
        this.f8962y |= Integer.MIN_VALUE;
        Object objM7071Q = this.f8961x.m7071Q(null, null, null, this);
        return objM7071Q == EnumC31071a.f128113w ? objM7071Q : new C23468n(objM7071Q);
    }
}
