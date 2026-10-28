package y30;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: y30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39186a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C39188c f168432w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f168433x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C39188c f168434y;

    /* JADX INFO: renamed from: z */
    public int f168435z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39186a(C39188c c39188c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168434y = c39188c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168433x = obj;
        this.f168435z |= Integer.MIN_VALUE;
        Object objMo124820a = this.f168434y.mo124820a(null, this);
        return objMo124820a == EnumC31071a.f128113w ? objMo124820a : new C23468n(objMo124820a);
    }
}
