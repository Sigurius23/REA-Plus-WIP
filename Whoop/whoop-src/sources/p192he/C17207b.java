package p192he;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: he.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C17207b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f66100w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17208c f66101x;

    /* JADX INFO: renamed from: y */
    public int f66102y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17207b(C17208c c17208c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f66101x = c17208c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f66100w = obj;
        this.f66102y |= Integer.MIN_VALUE;
        Object objMo14171e = this.f66101x.mo14171e(null, this);
        return objMo14171e == EnumC31071a.f128113w ? objMo14171e : new C23468n(objMo14171e);
    }
}
