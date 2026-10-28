package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2237h0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8891w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8892x;

    /* JADX INFO: renamed from: y */
    public int f8893y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2237h0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8892x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8891w = obj;
        this.f8893y |= Integer.MIN_VALUE;
        Object objM7060F = this.f8892x.m7060F(null, null, this);
        return objM7060F == EnumC31071a.f128113w ? objM7060F : new C23468n(objM7060F);
    }
}
