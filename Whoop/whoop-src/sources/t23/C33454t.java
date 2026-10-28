package t23;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import e33.C12645n;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import l83.C23465k;
import org.webrtc.PeerConnection;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: t23.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C33454t implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C33368c0 f139704w;

    public C33454t(C33368c0 c33368c0) {
        this.f139704w = c33368c0;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C23465k c23465k = (C23465k) obj;
        C12645n c12645n = (C12645n) c23465k.f92937w;
        PeerConnection.IceConnectionState iceConnectionState = (PeerConnection.IceConnectionState) c23465k.f92938x;
        int i13 = iceConnectionState == null ? -1 : AbstractC33449s.f139609a[iceConnectionState.ordinal()];
        if (i13 == 1 || i13 == 2) {
            c12645n.m35416e().restartIce();
        } else {
            C2345k c2345kM105816g = this.f139704w.m105816g();
            InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
            String str = c2345kM105816g.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM105816g.f9274b.log(enumC2341g, str, "[monitorPubConnectionState] Ice connection state is " + iceConnectionState, null);
            }
        }
        return C23454a0.f92919a;
    }
}
