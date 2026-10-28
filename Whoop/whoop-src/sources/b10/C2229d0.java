package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2229d0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C2273z0 f8871w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f8872x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2273z0 f8873y;

    /* JADX INFO: renamed from: z */
    public int f8874z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2229d0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8873y = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8872x = obj;
        this.f8874z |= Integer.MIN_VALUE;
        Object objM7103z = this.f8873y.m7103z(null, null, this);
        return objM7103z == EnumC31071a.f128113w ? objM7103z : new C23468n(objM7103z);
    }
}
