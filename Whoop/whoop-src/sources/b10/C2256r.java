package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C2256r extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8957w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8958x;

    /* JADX INFO: renamed from: y */
    public int f8959y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2256r(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8958x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8957w = obj;
        this.f8959y |= Integer.MIN_VALUE;
        Object objM7089k = this.f8958x.m7089k(null, null, null, this);
        return objM7089k == EnumC31071a.f128113w ? objM7089k : new C23468n(objM7089k);
    }
}
