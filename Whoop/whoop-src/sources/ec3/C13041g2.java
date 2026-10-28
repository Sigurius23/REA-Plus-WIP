package ec3;

import bc3.InterfaceC3027k1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.g2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13041g2 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Object f45073E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f45074F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C13045h2 f45075G;

    /* JADX INFO: renamed from: H */
    public int f45076H;

    /* JADX INFO: renamed from: w */
    public C13045h2 f45077w;

    /* JADX INFO: renamed from: x */
    public InterfaceC13062m f45078x;

    /* JADX INFO: renamed from: y */
    public C13049i2 f45079y;

    /* JADX INFO: renamed from: z */
    public InterfaceC3027k1 f45080z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13041g2(C13045h2 c13045h2, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45075G = c13045h2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45074F = obj;
        this.f45076H |= Integer.MIN_VALUE;
        this.f45075G.collect(null, this);
        return EnumC31071a.f128113w;
    }
}
