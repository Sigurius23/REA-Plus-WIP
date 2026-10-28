package m40;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: m40.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C25044u extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f98120E;

    /* JADX INFO: renamed from: w */
    public C25046w f98121w;

    /* JADX INFO: renamed from: x */
    public String f98122x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f98123y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C25046w f98124z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25044u(C25046w c25046w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f98124z = c25046w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f98123y = obj;
        this.f98120E |= Integer.MIN_VALUE;
        Object objM73484d = C25046w.m73484d(this.f98124z, null, this);
        return objM73484d == EnumC31071a.f128113w ? objM73484d : new C23468n(objM73484d);
    }
}
