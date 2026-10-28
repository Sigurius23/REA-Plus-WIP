package z20;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.InterfaceC38786b2;

/* JADX INFO: renamed from: z20.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C40017k extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f172634E;

    /* JADX INFO: renamed from: w */
    public C40018l f172635w;

    /* JADX INFO: renamed from: x */
    public InterfaceC38786b2 f172636x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f172637y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C40018l f172638z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40017k(C40018l c40018l, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172638z = c40018l;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172637y = obj;
        this.f172634E |= Integer.MIN_VALUE;
        Object objM128246b = this.f172638z.m128246b(null, null, null, null, null, null, null, this);
        return objM128246b == EnumC31071a.f128113w ? objM128246b : new C23468n(objM128246b);
    }
}
