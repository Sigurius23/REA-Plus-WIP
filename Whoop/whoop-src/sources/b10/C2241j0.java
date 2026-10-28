package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38928q;

/* JADX INFO: renamed from: b10.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2241j0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38928q f8904w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f8905x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2273z0 f8906y;

    /* JADX INFO: renamed from: z */
    public int f8907z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2241j0(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8906y = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8905x = obj;
        this.f8907z |= Integer.MIN_VALUE;
        Object objM7063I = this.f8906y.m7063I(null, null, this);
        return objM7063I == EnumC31071a.f128113w ? objM7063I : new C23468n(objM7063I);
    }
}
