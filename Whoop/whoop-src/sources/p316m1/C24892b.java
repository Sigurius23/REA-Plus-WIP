package p316m1;

import bc3.InterfaceC3027k1;
import p163g1.C15125r;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: m1.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C24892b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f97512E;

    /* JADX INFO: renamed from: w */
    public Object f97513w;

    /* JADX INFO: renamed from: x */
    public InterfaceC3027k1 f97514x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f97515y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15125r f97516z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24892b(C15125r c15125r, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f97516z = c15125r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f97515y = obj;
        this.f97512E |= Integer.MIN_VALUE;
        return this.f97516z.emit(null, this);
    }
}
