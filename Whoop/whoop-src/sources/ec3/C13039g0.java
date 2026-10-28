package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13039g0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public InterfaceC13062m f45064E;

    /* JADX INFO: renamed from: F */
    public Throwable f45065F;

    /* JADX INFO: renamed from: G */
    public long f45066G;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45067w;

    /* JADX INFO: renamed from: x */
    public int f45068x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13015a0 f45069y;

    /* JADX INFO: renamed from: z */
    public C13015a0 f45070z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13039g0(C13015a0 c13015a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45069y = c13015a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45067w = obj;
        this.f45068x |= Integer.MIN_VALUE;
        return this.f45069y.collect(null, this);
    }
}
