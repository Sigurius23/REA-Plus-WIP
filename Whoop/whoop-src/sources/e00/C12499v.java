package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C12499v extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42681w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42682x;

    /* JADX INFO: renamed from: y */
    public int f42683y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12499v(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42682x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f42681w = obj;
        this.f42683y |= Integer.MIN_VALUE;
        Object objM35133u = this.f42682x.m35133u(null, null, this);
        return objM35133u == EnumC31071a.f128113w ? objM35133u : new C23468n(objM35133u);
    }
}
