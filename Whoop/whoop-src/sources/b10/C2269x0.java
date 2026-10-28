package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2269x0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8999w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f9000x;

    /* JADX INFO: renamed from: y */
    public int f9001y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2269x0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f9000x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8999w = obj;
        this.f9001y |= Integer.MIN_VALUE;
        Object objM7077W = this.f9000x.m7077W(null, null, null, this);
        return objM7077W == EnumC31071a.f128113w ? objM7077W : new C23468n(objM7077W);
    }
}
