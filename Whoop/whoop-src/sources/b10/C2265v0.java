package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2265v0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8984w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8985x;

    /* JADX INFO: renamed from: y */
    public int f8986y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265v0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8985x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8984w = obj;
        this.f8986y |= Integer.MIN_VALUE;
        Object objM7075U = this.f8985x.m7075U(null, null, null, null, this);
        return objM7075U == EnumC31071a.f128113w ? objM7075U : new C23468n(objM7075U);
    }
}
