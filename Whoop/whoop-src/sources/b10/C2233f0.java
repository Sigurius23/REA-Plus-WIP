package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2233f0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8883w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8884x;

    /* JADX INFO: renamed from: y */
    public int f8885y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2233f0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8884x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8883w = obj;
        this.f8885y |= Integer.MIN_VALUE;
        Object objM7058D = this.f8884x.m7058D(null, null, this, null);
        return objM7058D == EnumC31071a.f128113w ? objM7058D : new C23468n(objM7058D);
    }
}
