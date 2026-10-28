package p294l3;

import hg3.AbstractC17269i;
import j93.AbstractC21478l0;
import p181h2.C16620e;
import p208i2.AbstractC17904p0;
import p208i2.C17902o0;
import p208i2.InterfaceC17869a1;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: l3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C23270o implements InterfaceC17869a1 {

    /* JADX INFO: renamed from: a */
    public static final C23270o f92212a = new C23270o();

    @Override // p208i2.InterfaceC17869a1
    /* JADX INFO: renamed from: a */
    public final AbstractC17904p0 mo39171a(long j7, EnumC39181m enumC39181m, InterfaceC39171c interfaceC39171c) {
        float fM47212d = C16620e.m47212d(j7) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM47212d)) << 32) | (((long) Float.floatToRawIntBits(fM47212d)) & 4294967295L);
        return new C17902o0(AbstractC21478l0.m60425c(AbstractC17269i.m48896j(0L, j7), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
    }
}
