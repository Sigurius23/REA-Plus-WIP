package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2255q0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8954w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8955x;

    /* JADX INFO: renamed from: y */
    public int f8956y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2255q0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8955x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f8954w = obj;
        this.f8956y |= Integer.MIN_VALUE;
        Object objM7070P = this.f8955x.m7070P(null, null, this);
        return objM7070P == EnumC31071a.f128113w ? objM7070P : new C23468n(objM7070P);
    }
}
