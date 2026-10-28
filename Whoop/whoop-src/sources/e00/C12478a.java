package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12478a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42598w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42599x;

    /* JADX INFO: renamed from: y */
    public int f42600y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12478a(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42599x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f42598w = obj;
        this.f42600y |= Integer.MIN_VALUE;
        Object objM35115c = this.f42599x.m35115c(null, null, null, this);
        return objM35115c == EnumC31071a.f128113w ? objM35115c : new C23468n(objM35115c);
    }
}
