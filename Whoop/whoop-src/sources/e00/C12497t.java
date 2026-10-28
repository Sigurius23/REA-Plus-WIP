package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C12497t extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42675w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42676x;

    /* JADX INFO: renamed from: y */
    public int f42677y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12497t(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42676x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f42675w = obj;
        this.f42677y |= Integer.MIN_VALUE;
        Object objM35131s = this.f42676x.m35131s(null, null, null, null, null, null, null, this);
        return objM35131s == EnumC31071a.f128113w ? objM35131s : new C23468n(objM35131s);
    }
}
