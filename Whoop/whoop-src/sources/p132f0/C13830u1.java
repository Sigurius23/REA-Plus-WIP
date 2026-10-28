package p132f0;

import p181h2.C16618c;
import p208i2.AbstractC17904p0;
import p208i2.C17900n0;
import p208i2.InterfaceC17869a1;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: f0.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C13830u1 implements InterfaceC17869a1 {

    /* JADX INFO: renamed from: a */
    public static final C13830u1 f49353a = new C13830u1();

    @Override // p208i2.InterfaceC17869a1
    /* JADX INFO: renamed from: a */
    public final AbstractC17904p0 mo39171a(long j7, EnumC39181m enumC39181m, InterfaceC39171c interfaceC39171c) {
        float fMo724F = interfaceC39171c.mo724F(AbstractC13837y.f49372a);
        return new C17900n0(new C16618c(-fMo724F, 0.0f, Float.intBitsToFloat((int) (j7 >> 32)) + fMo724F, Float.intBitsToFloat((int) (j7 & 4294967295L))));
    }
}
