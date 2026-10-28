package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C12495r extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42669w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42670x;

    /* JADX INFO: renamed from: y */
    public int f42671y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12495r(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42670x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f42669w = obj;
        this.f42671y |= Integer.MIN_VALUE;
        Object objM35129q = this.f42670x.m35129q(null, null, null, this);
        return objM35129q == EnumC31071a.f128113w ? objM35129q : new C23468n(objM35129q);
    }
}
