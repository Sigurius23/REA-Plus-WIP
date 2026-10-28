package o10;

import g10.C15215a;
import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: o10.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C27393f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f110105w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15215a f110106x;

    /* JADX INFO: renamed from: y */
    public int f110107y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27393f(C15215a c15215a, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f110106x = c15215a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f110105w = obj;
        this.f110107y |= Integer.MIN_VALUE;
        Object objM43230j = this.f110106x.m43230j(null, this);
        return objM43230j == EnumC31071a.f128113w ? objM43230j : new C23468n(objM43230j);
    }
}
