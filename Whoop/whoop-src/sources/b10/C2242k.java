package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C2242k extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8908w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8909x;

    /* JADX INFO: renamed from: y */
    public int f8910y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2242k(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8909x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8908w = obj;
        this.f8910y |= Integer.MIN_VALUE;
        Object objM7080b = this.f8909x.m7080b(null, null, null, null, null, this);
        return objM7080b == EnumC31071a.f128113w ? objM7080b : new C23468n(objM7080b);
    }
}
