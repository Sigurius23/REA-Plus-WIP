package y30;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: y30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39187b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f168436E;

    /* JADX INFO: renamed from: w */
    public C39188c f168437w;

    /* JADX INFO: renamed from: x */
    public int f168438x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f168439y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C39188c f168440z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39187b(C39188c c39188c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168440z = c39188c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168439y = obj;
        this.f168436E |= Integer.MIN_VALUE;
        Object objMo124821b = this.f168440z.mo124821b(null, null, 0, this);
        return objMo124821b == EnumC31071a.f128113w ? objMo124821b : new C23468n(objMo124821b);
    }
}
