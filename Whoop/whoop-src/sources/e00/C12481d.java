package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C12481d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42613w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42614x;

    /* JADX INFO: renamed from: y */
    public int f42615y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12481d(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42614x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f42613w = obj;
        this.f42615y |= Integer.MIN_VALUE;
        Object objM35117e = this.f42614x.m35117e(null, null, null, null, this);
        return objM35117e == EnumC31071a.f128113w ? objM35117e : new C23468n(objM35117e);
    }
}
