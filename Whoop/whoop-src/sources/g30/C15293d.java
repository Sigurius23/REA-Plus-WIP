package g30;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g30.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C15293d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f57444w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15296g f57445x;

    /* JADX INFO: renamed from: y */
    public int f57446y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15293d(C15296g c15296g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f57445x = c15296g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f57444w = obj;
        this.f57446y |= Integer.MIN_VALUE;
        Object objM43407g = this.f57445x.m43407g(null, false, null, null, this);
        return objM43407g == EnumC31071a.f128113w ? objM43407g : new C23468n(objM43407g);
    }
}
