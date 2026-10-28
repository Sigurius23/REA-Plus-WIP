package g30;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C15290a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f57435w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15296g f57436x;

    /* JADX INFO: renamed from: y */
    public int f57437y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15290a(C15296g c15296g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f57436x = c15296g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f57435w = obj;
        this.f57437y |= Integer.MIN_VALUE;
        Object objM43402b = this.f57436x.m43402b(null, null, null, null, null, this);
        return objM43402b == EnumC31071a.f128113w ? objM43402b : new C23468n(objM43402b);
    }
}
