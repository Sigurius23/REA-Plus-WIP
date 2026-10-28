package b10;

import l83.C23468n;
import p598wy.InterfaceC37689b;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2226c0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC37689b f8863w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f8864x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2273z0 f8865y;

    /* JADX INFO: renamed from: z */
    public int f8866z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2226c0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8865y = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8864x = obj;
        this.f8866z |= Integer.MIN_VALUE;
        Object objM7100w = this.f8865y.m7100w(null, null, null, this);
        return objM7100w == EnumC31071a.f128113w ? objM7100w : new C23468n(objM7100w);
    }
}
