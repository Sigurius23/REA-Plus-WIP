package g30;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C15291b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f57438w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15296g f57439x;

    /* JADX INFO: renamed from: y */
    public int f57440y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15291b(C15296g c15296g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f57439x = c15296g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f57438w = obj;
        this.f57440y |= Integer.MIN_VALUE;
        Object objM43403c = this.f57439x.m43403c(null, null, null, null, this);
        return objM43403c == EnumC31071a.f128113w ? objM43403c : new C23468n(objM43403c);
    }
}
