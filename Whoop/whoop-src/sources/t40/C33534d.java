package t40;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t40.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C33534d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f139983E;

    /* JADX INFO: renamed from: w */
    public C33536f f139984w;

    /* JADX INFO: renamed from: x */
    public C33536f f139985x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f139986y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33536f f139987z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33534d(C33536f c33536f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139987z = c33536f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139986y = obj;
        this.f139983E |= Integer.MIN_VALUE;
        Object objM105907b = this.f139987z.m105907b(this);
        return objM105907b == EnumC31071a.f128113w ? objM105907b : new C23468n(objM105907b);
    }
}
