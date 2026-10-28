package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C12496s extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42672w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42673x;

    /* JADX INFO: renamed from: y */
    public int f42674y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12496s(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42673x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f42672w = obj;
        this.f42674y |= Integer.MIN_VALUE;
        Object objM35130r = this.f42673x.m35130r(null, null, null, null, this);
        return objM35130r == EnumC31071a.f128113w ? objM35130r : new C23468n(objM35130r);
    }
}
