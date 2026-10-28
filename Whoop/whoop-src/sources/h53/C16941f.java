package h53;

import a30.C0323s;
import a43.C0381c;
import a43.C0384f;
import androidx.lifecycle.AbstractC1638x;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import b30.C2570m;
import bc3.AbstractC3006f0;
import c53.C4255a;
import c93.InterfaceC4351m;
import dc3.EnumC11916a;
import e53.C12745d;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13096w1;
import g73.C15553a;
import i53.C18143o;
import io.getstream.android.video.generated.models.VideoEvent;
import io.sentry.internal.debugmeta.C20378c;
import java.util.LinkedHashSet;
import java.util.UUID;
import l83.C23454a0;
import l83.C23470p;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import p000.AbstractC11266d;
import p007a6.C0416e;
import p021av.C2088b;
import p027b3.C2471z0;
import p077d0.C11340d;
import p087db.C11856j0;
import p408q.C29662f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qg3.C30352d;
import r83.EnumC31071a;
import s40.AbstractC32145e0;
import u33.C34509b;
import ud3.C34826l0;
import v33.AbstractC35638w;
import v33.C35629n;
import x43.AbstractC37979k;
import x43.C37976h;
import x43.C37981m;
import x43.InterfaceC37977i;
import z33.C40053b;

/* JADX INFO: renamed from: h53.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C16941f extends AbstractC37979k implements InterfaceC37977i {

    /* JADX INFO: renamed from: a */
    public final C4255a f65015a;

    /* JADX INFO: renamed from: b */
    public final C23470p f65016b;

    /* JADX INFO: renamed from: c */
    public final C16940e f65017c;

    /* JADX INFO: renamed from: d */
    public final C13045h2 f65018d;

    /* JADX INFO: renamed from: e */
    public final C13096w1 f65019e;

    /* JADX INFO: renamed from: f */
    public final C13096w1 f65020f;

    public C16941f(String apiKey, String wssUrl, C34826l0 c34826l0, C40053b networkStateProvider, C4255a c4255a, AbstractC1638x lifecycle, C11856j0 c11856j0, C12745d c12745d, C2570m sfuAnalytics) {
        Object c26203f;
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(wssUrl, "url");
        AbstractC22676k.m65750j(networkStateProvider, "networkStateProvider");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        AbstractC22676k.m65750j(sfuAnalytics, "sfuAnalytics");
        this.f65015a = c4255a;
        this.f65016b = AbstractC1772c1.m5382S(this, "Video:SfuSocket");
        C30352d c30352d = new C30352d(c12745d);
        C29662f c29662f = new C29662f(new C15553a(3), c34826l0);
        C0384f c0384f = new C0384f(c4255a, lifecycle);
        AbstractC22676k.m65750j(wssUrl, "wssUrl");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(networkStateProvider, "networkStateProvider");
        AbstractC22676k.m65750j(sfuAnalytics, "sfuAnalytics");
        C16940e c16940e = new C16940e();
        c16940e.f64998a = wssUrl;
        c16940e.f64999b = apiKey;
        c16940e.f65000c = c30352d;
        c16940e.f65001d = c29662f;
        c16940e.f65002e = c4255a;
        c16940e.f65003f = c0384f;
        c16940e.f65004g = networkStateProvider;
        c16940e.f65005h = sfuAnalytics;
        c16940e.f65007j = AbstractC1772c1.m5382S(c16940e, "Video:SfuSocket");
        try {
            c26203f = new C26204g(UUID.randomUUID().toString());
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
            c26203f = new C26203f(new C26201d(AbstractC11266d.m30461o("Safe call failed with ", e5.getMessage()), e5));
        }
        c16940e.f65008k = c26203f;
        c16940e.f65009l = new LinkedHashSet();
        c16940e.f65010m = new C30352d(15, (byte) 0);
        c16940e.f65013p = new C37976h((C4255a) c16940e.f65002e, new C11340d(c16940e, null, 2), new C0416e(c16940e, null, 5), new C2088b(c16940e, 20), 25);
        c16940e.f65014q = new C0381c();
        synchronized (((LinkedHashSet) c16940e.f65009l)) {
            ((LinkedHashSet) c16940e.f65009l).add(this);
        }
        this.f65017c = c16940e;
        this.f65018d = ((C30352d) c16940e.f65010m).m92819s().f168690e;
        EnumC11916a enumC11916a = EnumC11916a.f38982w;
        this.f65019e = AbstractC13091v.m36591a(1, 100, enumC11916a);
        this.f65020f = AbstractC13091v.m36591a(1, 100, enumC11916a);
        AbstractC13091v.m36593c(null);
        c30352d.f124536y = new C20378c(c11856j0, c12745d);
    }

    @Override // x43.InterfaceC37977i
    /* JADX INFO: renamed from: b */
    public final void mo40217b(C2471z0 c2471z0, InterfaceC4351m interfaceC4351m) {
        AbstractC3006f0.m8732z(this.f65015a, null, null, new C0323s(this, c2471z0, interfaceC4351m, null), 3);
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: c */
    public final void mo40218c(VideoEvent videoEvent) {
        C35629n event = (C35629n) videoEvent;
        AbstractC22676k.m65750j(event, "event");
        C2345k c2345kM47702j = m47702j();
        InterfaceC2339e interfaceC2339e = c2345kM47702j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM47702j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM47702j.f9274b.log(enumC2341g, str, "[onConnected] Socket connected with event: " + event, null);
        }
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: d */
    public final void mo40219d() {
        C2345k c2345kM47702j = m47702j();
        InterfaceC2339e interfaceC2339e = c2345kM47702j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM47702j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM47702j.f9274b.log(enumC2341g, str, "[onConnecting] Socket is connecting", null);
        }
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: e */
    public final void mo40220e() {
        C2345k c2345kM47702j = m47702j();
        InterfaceC2339e interfaceC2339e = c2345kM47702j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM47702j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM47702j.f9274b.log(enumC2341g, str, "[onCreated] Socket is created", null);
        }
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: f */
    public final void mo40221f(AbstractC32145e0 abstractC32145e0) {
        C2345k c2345kM47702j = m47702j();
        InterfaceC2339e interfaceC2339e = c2345kM47702j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM47702j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = c2345kM47702j.f9274b;
            C34509b c34509b = abstractC32145e0 instanceof C34509b ? (C34509b) abstractC32145e0 : null;
            interfaceC2344j.log(enumC2341g, str, "[onDisconnected] Socket disconnected. Cause: " + (c34509b != null ? c34509b.f145072w : null), null);
        }
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: g */
    public final void mo40222g(C37981m error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k c2345kM47702j = m47702j();
        InterfaceC2339e interfaceC2339e = c2345kM47702j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = c2345kM47702j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM47702j.f9274b.log(enumC2341g, str, "[onError] Socket error: " + error, null);
        }
        if (this.f65020f.mo36564a(error)) {
            return;
        }
        C2345k c2345kM47702j2 = m47702j();
        InterfaceC2339e interfaceC2339e2 = c2345kM47702j2.f9275c;
        String str2 = c2345kM47702j2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
            c2345kM47702j2.f9274b.log(enumC2341g, str2, "[onError] Failed to emit error: " + error, null);
        }
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: h */
    public final void mo40223h(Object obj) {
        AbstractC35638w event = (AbstractC35638w) obj;
        AbstractC22676k.m65750j(event, "event");
        C2345k c2345kM47702j = m47702j();
        InterfaceC2339e interfaceC2339e = c2345kM47702j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM47702j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM47702j.f9274b.log(enumC2341g, str, "[onEvent] Received event: " + event, null);
        }
        if (this.f65019e.mo36564a(event)) {
            return;
        }
        C2345k c2345kM47702j2 = m47702j();
        InterfaceC2339e interfaceC2339e2 = c2345kM47702j2.f9275c;
        String str2 = c2345kM47702j2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345kM47702j2.f9274b.log(enumC2341g2, str2, "[onEvent] Failed to emit event: " + event, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final Object m47701i(InterfaceC30057d interfaceC30057d) {
        C2345k c2345kM47702j = m47702j();
        InterfaceC2339e interfaceC2339e = c2345kM47702j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM47702j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM47702j.f9274b.log(enumC2341g, str, "[disconnect] Disconnecting socket", null);
        }
        C16940e c16940e = this.f65017c;
        C2345k c2345kM47699d = c16940e.m47699d();
        InterfaceC2339e interfaceC2339e2 = c2345kM47699d.f9275c;
        String str2 = c2345kM47699d.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
            c2345kM47699d.f9274b.log(enumC2341g, str2, "[disconnect] no args", null);
        }
        C30352d c30352d = (C30352d) c16940e.f65010m;
        C2345k c2345kM92818r = c30352d.m92818r();
        InterfaceC2339e interfaceC2339e3 = c2345kM92818r.f9275c;
        String str3 = c2345kM92818r.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e3.isLoggable(enumC2341g2, str3)) {
            c2345kM92818r.f9274b.log(enumC2341g2, str3, "[onRequiredDisconnect] no args", null);
        }
        Object objM124995a = c30352d.m92819s().m124995a(C18143o.f70440a, interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objM124995a != enumC31071a) {
            objM124995a = c23454a0;
        }
        if (objM124995a != enumC31071a) {
            objM124995a = c23454a0;
        }
        return objM124995a == enumC31071a ? objM124995a : c23454a0;
    }

    /* JADX INFO: renamed from: j */
    public final C2345k m47702j() {
        return (C2345k) this.f65016b.getValue();
    }
}
