package p291l0;

import c93.InterfaceC4351m;
import p026b2.InterfaceC2300f;
import p636y3.C39178j;
import p636y3.C39180l;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: l0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22941c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90548w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2300f f90549x;

    public /* synthetic */ C22941c(InterfaceC2300f interfaceC2300f, int i13) {
        this.f90548w = i13;
        this.f90549x = interfaceC2300f;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f90548w) {
            case 0:
                return Integer.valueOf(this.f90549x.mo7155a(0, ((Integer) obj).intValue(), (EnumC39181m) obj2));
            default:
                int i13 = (int) (((C39180l) obj).f168422a >> 32);
                return new C39178j((((long) this.f90549x.mo7155a(0, i13, (EnumC39181m) obj2)) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
