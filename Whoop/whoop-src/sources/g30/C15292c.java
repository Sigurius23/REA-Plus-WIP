package g30;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C15292c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f57441w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15296g f57442x;

    /* JADX INFO: renamed from: y */
    public int f57443y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15292c(C15296g c15296g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f57442x = c15296g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f57441w = obj;
        this.f57443y |= Integer.MIN_VALUE;
        Object objM43406f = this.f57442x.m43406f(null, null, this);
        return objM43406f == EnumC31071a.f128113w ? objM43406f : new C23468n(objM43406f);
    }
}
