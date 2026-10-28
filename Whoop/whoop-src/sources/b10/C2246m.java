package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C2246m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8921w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8922x;

    /* JADX INFO: renamed from: y */
    public int f8923y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2246m(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8922x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8921w = obj;
        this.f8923y |= Integer.MIN_VALUE;
        Object objM7084f = this.f8922x.m7084f(null, null, this, null);
        return objM7084f == EnumC31071a.f128113w ? objM7084f : new C23468n(objM7084f);
    }
}
