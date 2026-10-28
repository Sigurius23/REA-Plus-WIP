package z20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: z20.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C40016j extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f172631w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C40018l f172632x;

    /* JADX INFO: renamed from: y */
    public int f172633y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40016j(C40018l c40018l, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172632x = c40018l;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172631w = obj;
        this.f172633y |= Integer.MIN_VALUE;
        Object objM128245a = this.f172632x.m128245a(null, null, this);
        return objM128245a == EnumC31071a.f128113w ? objM128245a : new C23468n(objM128245a);
    }
}
