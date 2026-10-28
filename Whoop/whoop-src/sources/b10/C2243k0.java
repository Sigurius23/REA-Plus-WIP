package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38937r;

/* JADX INFO: renamed from: b10.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2243k0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38937r f8911w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f8912x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2273z0 f8913y;

    /* JADX INFO: renamed from: z */
    public int f8914z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2243k0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8913y = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8912x = obj;
        this.f8914z |= Integer.MIN_VALUE;
        Object objM7064J = this.f8913y.m7064J(null, null, this);
        return objM7064J == EnumC31071a.f128113w ? objM7064J : new C23468n(objM7064J);
    }
}
