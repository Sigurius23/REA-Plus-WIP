package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C2260t extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8969w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8970x;

    /* JADX INFO: renamed from: y */
    public int f8971y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2260t(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8970x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8969w = obj;
        this.f8971y |= Integer.MIN_VALUE;
        Object objM7091n = this.f8970x.m7091n(null, null, this);
        return objM7091n == EnumC31071a.f128113w ? objM7091n : new C23468n(objM7091n);
    }
}
