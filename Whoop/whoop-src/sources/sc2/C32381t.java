package sc2;

import p715kotlin.jvm.functions.Function1;
import td1.EnumC33707e;
import tj0.EnumC33865b;

/* JADX INFO: renamed from: sc2.t */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32381t implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134084w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32380s f134085x;

    public /* synthetic */ C32381t(C32380s c32380s, int i13) {
        this.f134084w = i13;
        this.f134085x = c32380s;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134084w) {
            case 0:
                return C32380s.e.m100914i(this.f134085x, (C32366e) obj);
            case 1:
                return C32380s.m100864Z0(this.f134085x, (EnumC33707e) obj);
            case 2:
                return C32380s.m100837L0(this.f134085x, (Byte) obj);
            case 3:
                return C32380s.m100851S0(this.f134085x, (EnumC33865b) obj);
            case 4:
                return C32380s.m100854U0(this.f134085x, (Throwable) obj);
            default:
                return C32380s.m100830H0(this.f134085x, (Boolean) obj);
        }
    }
}
