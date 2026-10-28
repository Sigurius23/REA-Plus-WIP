package p579wc;

import gf.InterfaceC15761b;
import p115ed.C13106a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37109o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C37111p0 f158746E;

    /* JADX INFO: renamed from: F */
    public int f158747F;

    /* JADX INFO: renamed from: w */
    public InterfaceC15761b f158748w;

    /* JADX INFO: renamed from: x */
    public C37113q0 f158749x;

    /* JADX INFO: renamed from: y */
    public C13106a f158750y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f158751z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37109o0(C37111p0 c37111p0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158746E = c37111p0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158751z = obj;
        this.f158747F |= Integer.MIN_VALUE;
        return this.f158746E.mo79294b(null, this);
    }
}
