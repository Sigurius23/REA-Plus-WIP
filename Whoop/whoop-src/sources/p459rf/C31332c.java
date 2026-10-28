package p459rf;

import c93.InterfaceC4339a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import ud3.EnumC34828m0;

/* JADX INFO: renamed from: rf.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C31332c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128926w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InetSocketAddress f128927x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Proxy f128928y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ EnumC34828m0 f128929z;

    public /* synthetic */ C31332c(InetSocketAddress inetSocketAddress, Proxy proxy, EnumC34828m0 enumC34828m0, int i13) {
        this.f128926w = i13;
        this.f128927x = inetSocketAddress;
        this.f128928y = proxy;
        this.f128929z = enumC34828m0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f128926w) {
            case 0:
                return "connection established: addr=" + this.f128927x + "; proxy=" + this.f128928y + "; protocol=" + this.f128929z;
            default:
                return "connect failed: addr=" + this.f128927x + "; proxy=" + this.f128928y + "; protocol=" + this.f128929z;
        }
    }
}
