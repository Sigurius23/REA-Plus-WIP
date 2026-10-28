package p192he;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: he.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C17206a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f66097w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17208c f66098x;

    /* JADX INFO: renamed from: y */
    public int f66099y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17206a(C17208c c17208c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f66098x = c17208c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f66097w = obj;
        this.f66099y |= Integer.MIN_VALUE;
        Object objMo14173g = this.f66098x.mo14173g(null, this);
        return objMo14173g == EnumC31071a.f128113w ? objMo14173g : new C23468n(objMo14173g);
    }
}
