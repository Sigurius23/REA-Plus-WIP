package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C12482e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42616w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42617x;

    /* JADX INFO: renamed from: y */
    public int f42618y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12482e(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42617x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f42616w = obj;
        this.f42618y |= Integer.MIN_VALUE;
        Object objM35118f = this.f42617x.m35118f(null, null, null, null, this);
        return objM35118f == EnumC31071a.f128113w ? objM35118f : new C23468n(objM35118f);
    }
}
