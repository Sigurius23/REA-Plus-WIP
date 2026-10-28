package p291l0;

import c93.InterfaceC4351m;
import p026b2.C2306l;
import p026b2.InterfaceC2301g;
import p636y3.C39178j;
import p636y3.C39180l;

/* JADX INFO: renamed from: l0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22945d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90575w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2301g f90576x;

    public /* synthetic */ C22945d(InterfaceC2301g interfaceC2301g, int i13) {
        this.f90575w = i13;
        this.f90576x = interfaceC2301g;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f90575w) {
            case 0:
                return Integer.valueOf(((C2306l) this.f90576x).m7157a(0, ((Integer) obj).intValue()));
            default:
                return new C39178j((((long) ((C2306l) this.f90576x).m7157a(0, (int) (((C39180l) obj).f168422a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
        }
    }
}
