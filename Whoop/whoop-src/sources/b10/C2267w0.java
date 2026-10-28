package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2267w0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8993w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8994x;

    /* JADX INFO: renamed from: y */
    public int f8995y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2267w0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8994x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8993w = obj;
        this.f8995y |= Integer.MIN_VALUE;
        Object objM7076V = this.f8994x.m7076V(null, null, this);
        return objM7076V == EnumC31071a.f128113w ? objM7076V : new C23468n(objM7076V);
    }
}
