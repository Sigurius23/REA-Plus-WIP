package d33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e33.C12645n;
import e33.C12662v0;
import ec3.C13045h2;
import i53.C18129a;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25260n;
import org.webrtc.PeerConnection;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.C33368c0;
import t23.C33397h2;
import t23.C33432o2;
import t23.C33450s0;
import t23.InterfaceC33442q2;

/* JADX INFO: renamed from: d33.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11590d1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37387w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37388x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11590d1(C11602h1 c11602h1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37388x = c11602h1;
    }

    /* JADX INFO: renamed from: f */
    public static final void m31013f(C11602h1 c11602h1, Set set, Set set2) {
        C13045h2 c13045h2;
        C13045h2 c13045h3;
        C33368c0 c33368c0 = c11602h1.f37440b;
        C33450s0 c33450s0 = c33368c0.f139302p;
        C33450s0 c33450s1 = c33368c0.f139302p;
        InterfaceC33442q2 interfaceC33442q2 = (InterfaceC33442q2) c33450s0.f139652h.getValue();
        C12645n c12645n = (C12645n) c11602h1.f37421A.getValue();
        PeerConnection.IceConnectionState iceConnectionState = (c12645n == null || (c13045h3 = c12645n.f43279s) == null) ? null : (PeerConnection.IceConnectionState) c13045h3.getValue();
        C12662v0 c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
        PeerConnection.IceConnectionState iceConnectionState2 = (c12662v0 == null || (c13045h2 = c12662v0.f43279s) == null) ? null : (PeerConnection.IceConnectionState) c13045h2.getValue();
        boolean z4 = iceConnectionState != null && set.contains(iceConnectionState);
        boolean z13 = iceConnectionState2 != null && set.contains(iceConnectionState2);
        if ((z4 || z13) && (interfaceC33442q2 instanceof C33397h2)) {
            C2345k c2345kM31043s = c11602h1.m31043s();
            InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
            String str = c2345kM31043s.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM31043s.f9274b.log(enumC2341g, str, "[iceMonitor] ICE degraded (pub=" + iceConnectionState + ", sub=" + iceConnectionState2 + ") — marking Reconnecting", null);
            }
            C13045h2 c13045h4 = c33450s1.f139650g;
            c13045h4.getClass();
            c13045h4.m36571k(null, C33432o2.f139567a);
            return;
        }
        if ((interfaceC33442q2 instanceof C33432o2) && (c11602h1.f37424D.getValue() instanceof C18129a)) {
            boolean z14 = iceConnectionState == null || set2.contains(iceConnectionState);
            boolean z15 = iceConnectionState2 == null || set2.contains(iceConnectionState2);
            if (z14 && z15) {
                C2345k c2345kM31043s2 = c11602h1.m31043s();
                InterfaceC2339e interfaceC2339e2 = c2345kM31043s2.f9275c;
                String str2 = c2345kM31043s2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.INFO;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    c2345kM31043s2.f9274b.log(enumC2341g2, str2, "[iceMonitor] ICE recovered (pub=" + iceConnectionState + ", sub=" + iceConnectionState2 + ") — marking Connected", null);
                }
                C13045h2 c13045h5 = c33450s1.f139650g;
                c13045h5.getClass();
                c13045h5.m36571k(null, C33397h2.f139460a);
            }
        }
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C11590d1 c11590d1 = new C11590d1(this.f37388x, interfaceC30057d);
        c11590d1.f37387w = obj;
        return c11590d1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C11590d1 c11590d1 = (C11590d1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c11590d1.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f37387w;
        Set setM74059b1 = AbstractC25260n.m74059b1(new PeerConnection.IceConnectionState[]{PeerConnection.IceConnectionState.DISCONNECTED, PeerConnection.IceConnectionState.FAILED});
        Set setM74059b2 = AbstractC25260n.m74059b1(new PeerConnection.IceConnectionState[]{PeerConnection.IceConnectionState.CONNECTED, PeerConnection.IceConnectionState.COMPLETED});
        C11602h1 c11602h1 = this.f37388x;
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C11639y0(c11602h1, setM74059b1, setM74059b2, null), 3);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C11587c1(c11602h1, setM74059b1, setM74059b2, null), 3);
        return C23454a0.f92919a;
    }
}
