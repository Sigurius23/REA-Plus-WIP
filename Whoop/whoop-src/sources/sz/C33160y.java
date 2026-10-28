package sz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sz.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C33160y extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C33161z f138276w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f138277x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33161z f138278y;

    /* JADX INFO: renamed from: z */
    public int f138279z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33160y(C33161z c33161z, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138278y = c33161z;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138277x = obj;
        this.f138279z |= Integer.MIN_VALUE;
        Object objM105020g = C33161z.m105020g(this.f138278y, this);
        return objM105020g == EnumC31071a.f128113w ? objM105020g : new C23468n(objM105020g);
    }
}
