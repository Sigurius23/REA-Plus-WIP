package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C2258s extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8963w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8964x;

    /* JADX INFO: renamed from: y */
    public int f8965y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2258s(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8964x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8963w = obj;
        this.f8965y |= Integer.MIN_VALUE;
        Object objM7090m = this.f8964x.m7090m(null, null, this);
        return objM7090m == EnumC31071a.f128113w ? objM7090m : new C23468n(objM7090m);
    }
}
