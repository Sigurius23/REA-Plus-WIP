package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C38734m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166697w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38747x f166698x;

    /* JADX INFO: renamed from: y */
    public int f166699y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38734m(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166698x = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166697w = obj;
        this.f166699y |= Integer.MIN_VALUE;
        Object objM124162m = this.f166698x.m124162m(false, this);
        return objM124162m == EnumC31071a.f128113w ? objM124162m : new C23468n(objM124162m);
    }
}
