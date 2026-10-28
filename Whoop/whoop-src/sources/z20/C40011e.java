package z20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: z20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C40011e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f172612w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C40013g f172613x;

    /* JADX INFO: renamed from: y */
    public int f172614y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40011e(C40013g c40013g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172613x = c40013g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172612w = obj;
        this.f172614y |= Integer.MIN_VALUE;
        Object objM128243e = this.f172613x.m128243e(null, null, this);
        return objM128243e == EnumC31071a.f128113w ? objM128243e : new C23468n(objM128243e);
    }
}
