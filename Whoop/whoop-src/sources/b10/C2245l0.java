package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2245l0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8918w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8919x;

    /* JADX INFO: renamed from: y */
    public int f8920y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2245l0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8919x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8918w = obj;
        this.f8920y |= Integer.MIN_VALUE;
        Object objM7065K = this.f8919x.m7065K(null, null, this);
        return objM7065K == EnumC31071a.f128113w ? objM7065K : new C23468n(objM7065K);
    }
}
