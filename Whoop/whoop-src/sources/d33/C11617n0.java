package d33;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11617n0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37506w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37507x;

    /* JADX INFO: renamed from: y */
    public int f37508y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11617n0(C11602h1 c11602h1, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f37507x = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37506w = obj;
        this.f37508y |= Integer.MIN_VALUE;
        return this.f37507x.m31049y(this);
    }
}
