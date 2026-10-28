package t23;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import d33.C11602h1;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import org.webrtc.PeerConnection;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: t23.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C33474x implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C33368c0 f139751w;

    public C33474x(C33368c0 c33368c0) {
        this.f139751w = c33368c0;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        Object objM31049y;
        PeerConnection.IceConnectionState iceConnectionState = (PeerConnection.IceConnectionState) obj;
        int i13 = iceConnectionState == null ? -1 : AbstractC33469w.f139744a[iceConnectionState.ordinal()];
        C23454a0 c23454a0 = C23454a0.f92919a;
        C33368c0 c33368c0 = this.f139751w;
        if (i13 == 1 || i13 == 2) {
            C11602h1 c11602h1 = (C11602h1) c33368c0.f139268C.getValue();
            if (c11602h1 != null && (objM31049y = c11602h1.m31049y(interfaceC30057d)) == EnumC31071a.f128113w) {
                return objM31049y;
            }
        } else {
            C2345k c2345kM105816g = c33368c0.m105816g();
            InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
            String str = c2345kM105816g.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM105816g.f9274b.log(enumC2341g, str, "[monitorSubConnectionState] Ice connection state is " + iceConnectionState, null);
                return c23454a0;
            }
        }
        return c23454a0;
    }
}
