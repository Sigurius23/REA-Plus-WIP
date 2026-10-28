package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2235g0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8887w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8888x;

    /* JADX INFO: renamed from: y */
    public int f8889y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235g0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8888x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8887w = obj;
        this.f8889y |= Integer.MIN_VALUE;
        Object objM7059E = this.f8888x.m7059E(null, null, this);
        return objM7059E == EnumC31071a.f128113w ? objM7059E : new C23468n(objM7059E);
    }
}
