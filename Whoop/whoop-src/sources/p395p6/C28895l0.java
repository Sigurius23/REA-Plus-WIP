package p395p6;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28895l0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Class f116965w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f116966x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28901n0 f116967y;

    /* JADX INFO: renamed from: z */
    public int f116968z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28895l0(C28901n0 c28901n0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f116967y = c28901n0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116966x = obj;
        this.f116968z |= Integer.MIN_VALUE;
        return this.f116967y.m87820b(null, this);
    }
}
