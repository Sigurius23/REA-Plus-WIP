package t23;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.n3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33428n3 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C33423m3 f139557w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f139558x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33423m3 f139559y;

    /* JADX INFO: renamed from: z */
    public int f139560z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33428n3(C33423m3 c33423m3, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f139559y = c33423m3;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139558x = obj;
        this.f139560z |= Integer.MIN_VALUE;
        return this.f139559y.m105857b(null, this);
    }
}
