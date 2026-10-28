package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C2264v extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8981w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8982x;

    /* JADX INFO: renamed from: y */
    public int f8983y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2264v(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8982x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8981w = obj;
        this.f8983y |= Integer.MIN_VALUE;
        Object objM7093p = this.f8982x.m7093p(null, null, this);
        return objM7093p == EnumC31071a.f128113w ? objM7093p : new C23468n(objM7093p);
    }
}
