package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2220a0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8843w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8844x;

    /* JADX INFO: renamed from: y */
    public int f8845y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2220a0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8844x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8843w = obj;
        this.f8845y |= Integer.MIN_VALUE;
        Object objM7098u = this.f8844x.m7098u(null, null, this, null);
        return objM7098u == EnumC31071a.f128113w ? objM7098u : new C23468n(objM7098u);
    }
}
