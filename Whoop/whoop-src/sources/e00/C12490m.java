package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C12490m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42644w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42645x;

    /* JADX INFO: renamed from: y */
    public int f42646y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12490m(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42645x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f42644w = obj;
        this.f42646y |= Integer.MIN_VALUE;
        Object objM35125m = this.f42645x.m35125m(null, null, this);
        return objM35125m == EnumC31071a.f128113w ? objM35125m : new C23468n(objM35125m);
    }
}
