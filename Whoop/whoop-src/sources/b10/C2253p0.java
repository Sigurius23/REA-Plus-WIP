package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2253p0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8945w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8946x;

    /* JADX INFO: renamed from: y */
    public int f8947y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2253p0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8946x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f8945w = obj;
        this.f8947y |= Integer.MIN_VALUE;
        Object objM7069O = this.f8946x.m7069O(null, null, this);
        return objM7069O == EnumC31071a.f128113w ? objM7069O : new C23468n(objM7069O);
    }
}
