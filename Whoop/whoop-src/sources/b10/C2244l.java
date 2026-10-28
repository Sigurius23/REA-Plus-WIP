package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C2244l extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8915w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8916x;

    /* JADX INFO: renamed from: y */
    public int f8917y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2244l(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8916x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8915w = obj;
        this.f8917y |= Integer.MIN_VALUE;
        Object objM7083e = this.f8916x.m7083e(null, null, this, null);
        return objM7083e == EnumC31071a.f128113w ? objM7083e : new C23468n(objM7083e);
    }
}
