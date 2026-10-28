package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C12494q extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42666w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42667x;

    /* JADX INFO: renamed from: y */
    public int f42668y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12494q(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42667x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f42666w = obj;
        this.f42668y |= Integer.MIN_VALUE;
        Object objM35128p = this.f42667x.m35128p(null, false, this);
        return objM35128p == EnumC31071a.f128113w ? objM35128p : new C23468n(objM35128p);
    }
}
