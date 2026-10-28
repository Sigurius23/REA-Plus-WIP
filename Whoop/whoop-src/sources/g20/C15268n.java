package g20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g20.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C15268n extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f57330w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15272r f57331x;

    /* JADX INFO: renamed from: y */
    public int f57332y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15268n(C15272r c15272r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f57331x = c15272r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f57330w = obj;
        this.f57332y |= Integer.MIN_VALUE;
        Object objM43368g = C15272r.m43368g(this.f57331x, null, null, this);
        return objM43368g == EnumC31071a.f128113w ? objM43368g : new C23468n(objM43368g);
    }
}
