package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2259s0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8966w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8967x;

    /* JADX INFO: renamed from: y */
    public int f8968y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2259s0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8967x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8966w = obj;
        this.f8968y |= Integer.MIN_VALUE;
        Object objM7072R = this.f8967x.m7072R(null, null, null, this);
        return objM7072R == EnumC31071a.f128113w ? objM7072R : new C23468n(objM7072R);
    }
}
