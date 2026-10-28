package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C2248n extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8927w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8928x;

    /* JADX INFO: renamed from: y */
    public int f8929y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2248n(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8928x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8927w = obj;
        this.f8929y |= Integer.MIN_VALUE;
        Object objM7085g = this.f8928x.m7085g(null, null, this);
        return objM7085g == EnumC31071a.f128113w ? objM7085g : new C23468n(objM7085g);
    }
}
