package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2223b0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8856w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8857x;

    /* JADX INFO: renamed from: y */
    public int f8858y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2223b0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8857x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8856w = obj;
        this.f8858y |= Integer.MIN_VALUE;
        Object objM7099v = this.f8857x.m7099v(null, null, null, null, this);
        return objM7099v == EnumC31071a.f128113w ? objM7099v : new C23468n(objM7099v);
    }
}
