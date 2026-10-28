package gb1;

import java.util.List;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gb1.z */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15698z implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58938w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f58939x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f58940y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f58941z;

    public /* synthetic */ C15698z(float f13, List list, float f14) {
        this.f58940y = f13;
        this.f58939x = list;
        this.f58941z = f14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58938w) {
            case 0:
                return AbstractC15673b0.m44073y(this.f58940y, this.f58939x, this.f58941z, (InterfaceC22131e) obj);
            default:
                float f13 = this.f58940y;
                return AbstractC15673b0.m44009S0(this.f58939x, f13, this.f58941z, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C15698z(List list, float f13, float f14) {
        this.f58939x = list;
        this.f58940y = f13;
        this.f58941z = f14;
    }
}
