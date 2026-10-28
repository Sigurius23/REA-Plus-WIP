package z20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: z20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C40009c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f172606w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C40013g f172607x;

    /* JADX INFO: renamed from: y */
    public int f172608y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40009c(C40013g c40013g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172607x = c40013g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172606w = obj;
        this.f172608y |= Integer.MIN_VALUE;
        Object objM128241c = this.f172607x.m128241c(null, null, false, this);
        return objM128241c == EnumC31071a.f128113w ? objM128241c : new C23468n(objM128241c);
    }
}
