package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C38712b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166624w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38747x f166625x;

    /* JADX INFO: renamed from: y */
    public int f166626y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38712b(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166625x = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166624w = obj;
        this.f166626y |= Integer.MIN_VALUE;
        Object objM124151b = this.f166625x.m124151b(null, this);
        return objM124151b == EnumC31071a.f128113w ? objM124151b : new C23468n(objM124151b);
    }
}
