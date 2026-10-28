package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C2262u extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8975w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8976x;

    /* JADX INFO: renamed from: y */
    public int f8977y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262u(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8976x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8975w = obj;
        this.f8977y |= Integer.MIN_VALUE;
        Object objM7092o = this.f8976x.m7092o(null, null, null, this);
        return objM7092o == EnumC31071a.f128113w ? objM7092o : new C23468n(objM7092o);
    }
}
