package g30;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C15295f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f57450w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15296g f57451x;

    /* JADX INFO: renamed from: y */
    public int f57452y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15295f(C15296g c15296g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f57451x = c15296g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f57450w = obj;
        this.f57452y |= Integer.MIN_VALUE;
        Object objM43410j = this.f57451x.m43410j(null, null, this);
        return objM43410j == EnumC31071a.f128113w ? objM43410j : new C23468n(objM43410j);
    }
}
