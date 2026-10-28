package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2263u0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8978w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8979x;

    /* JADX INFO: renamed from: y */
    public int f8980y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2263u0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8979x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8978w = obj;
        this.f8980y |= Integer.MIN_VALUE;
        Object objM7074T = this.f8979x.m7074T(null, null, this, null);
        return objM7074T == EnumC31071a.f128113w ? objM7074T : new C23468n(objM7074T);
    }
}
