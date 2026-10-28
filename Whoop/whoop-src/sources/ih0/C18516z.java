package ih0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ih0.z */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18516z implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72151w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f72152x;

    public /* synthetic */ C18516z(InterfaceC4339a interfaceC4339a, int i13) {
        this.f72151w = i13;
        this.f72152x = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f72151w;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i13) {
            case 0:
                return AbstractC18491e0.m53435Q0(this.f72152x, zBooleanValue);
            default:
                return AbstractC18491e0.m53411I0(this.f72152x, zBooleanValue);
        }
    }
}
