package p133f1;

import c93.InterfaceC4339a;
import mz0.AbstractC26037b;
import mz0.EnumC26036a;
import ny0.AbstractC27248d1;
import ny0.EnumC27247d0;
import p134f2.C14015d;
import p208i2.C17903p;
import p270k2.InterfaceC22131e;
import p702ch0.C4614e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f1.e */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13933e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49672w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f49673x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f49674y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f49675z;

    public /* synthetic */ C13933e(long j7, InterfaceC4339a interfaceC4339a, boolean z4) {
        this.f49674y = j7;
        this.f49675z = interfaceC4339a;
        this.f49673x = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f49672w) {
            case 0:
                C14015d c14015d = (C14015d) obj;
                return c14015d.m39910a(new C4614e((InterfaceC4339a) this.f49675z, this.f49673x, AbstractC13994y0.m39829r(c14015d, Float.intBitsToFloat((int) (c14015d.f50036w.mo468d() >> 32)) / 2.0f), new C17903p(this.f49674y, 5), 6));
            case 1:
                return AbstractC26037b.m77458d((EnumC26036a) this.f49675z, this.f49673x, this.f49674y, (InterfaceC22131e) obj);
            default:
                return AbstractC27248d1.m82116h(this.f49673x, (EnumC27247d0) this.f49675z, this.f49674y, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C13933e(EnumC26036a enumC26036a, boolean z4, long j7) {
        this.f49675z = enumC26036a;
        this.f49673x = z4;
        this.f49674y = j7;
    }

    public /* synthetic */ C13933e(boolean z4, EnumC27247d0 enumC27247d0, long j7) {
        this.f49673x = z4;
        this.f49675z = enumC27247d0;
        this.f49674y = j7;
    }
}
