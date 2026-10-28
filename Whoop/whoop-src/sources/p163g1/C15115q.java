package p163g1;

import bc3.InterfaceC3027k1;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C15115q extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f56626E;

    /* JADX INFO: renamed from: w */
    public Object f56627w;

    /* JADX INFO: renamed from: x */
    public InterfaceC3027k1 f56628x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f56629y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15125r f56630z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15115q(C15125r c15125r, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f56630z = c15125r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f56629y = obj;
        this.f56626E |= Integer.MIN_VALUE;
        return this.f56630z.emit(null, this);
    }
}
