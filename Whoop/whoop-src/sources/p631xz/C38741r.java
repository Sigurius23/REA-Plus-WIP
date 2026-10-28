package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C38741r extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166715w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38747x f166716x;

    /* JADX INFO: renamed from: y */
    public int f166717y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38741r(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166716x = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166715w = obj;
        this.f166717y |= Integer.MIN_VALUE;
        Object objM124168t = this.f166716x.m124168t(null, this);
        return objM124168t == EnumC31071a.f128113w ? objM124168t : new C23468n(objM124168t);
    }
}
