package i92;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.C13022c;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l73.AbstractC23412c;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i92.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0010\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001f¨\u0006!"}, m65681d2 = {"Li92/g;", "Li92/e;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lbc3/c0;", "applicationScope", "<init>", "(Landroid/net/ConnectivityManager;Lbc3/c0;)V", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "Li92/h;", "g", "(Landroid/net/NetworkCapabilities;)Li92/h;", "Ll73/c;", "b", "()Ll73/c;", "a", "Landroid/net/ConnectivityManager;", "Lec3/l;", "Lec3/l;", "networkStateSource", "c", "()Lec3/l;", "networkFlow", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Landroid/net/NetworkCapabilities;", "activeNetworkCapabilities", "", "isConnected", "()Z", "", "()Ljava/lang/String;", "currentNetworkDebugString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18262g implements InterfaceC18260e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SuppressLint({"MissingPermission"})
    private final InterfaceC13058l networkStateSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13058l networkFlow;

    /* JADX INFO: renamed from: i92.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.NetworkMonitorImpl$networkStateSource$1", m100430f = "NetworkMonitor.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Li92/h;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f71089w;

        /* JADX INFO: renamed from: x */
        Object f71090x;

        /* JADX INFO: renamed from: y */
        int f71091y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f71092z;

        /* JADX INFO: renamed from: i92.g$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"i92/g$a$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Ll83/a0;", "onAvailable", "(Landroid/net/Network;)V", "onUnavailable", "()V", "onLost", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41732a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC11936u f71093a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C18262g f71094b;

            public C41732a(InterfaceC11936u interfaceC11936u, C18262g c18262g) {
                this.f71093a = interfaceC11936u;
                this.f71094b = c18262g;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                AbstractC22676k.m65750j(network, "network");
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                AbstractC22676k.m65750j(network, "network");
                AbstractC22676k.m65750j(networkCapabilities, "networkCapabilities");
                ((C11935t) this.f71093a).mo32218s(this.f71094b.m52610g(networkCapabilities));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                AbstractC22676k.m65750j(network, "network");
                ((C11935t) this.f71093a).mo32218s(AbstractC18263h.b.f71096a);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                ((C11935t) this.f71093a).mo32218s(AbstractC18263h.b.f71096a);
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m52613h(C18262g c18262g, C41732a c41732a) {
            c18262g.connectivityManager.unregisterNetworkCallback(c41732a);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C18262g.this.new a(interfaceC30057d);
            aVar.f71092z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f71092z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71091y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final C41732a c41732a = new C41732a(interfaceC11936u, C18262g.this);
                C18262g c18262g = C18262g.this;
                ((C11935t) interfaceC11936u).mo32218s(c18262g.m52610g(c18262g.m52611h()));
                C18262g.this.connectivityManager.registerDefaultNetworkCallback(c41732a);
                final C18262g c18262g2 = C18262g.this;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: i92.f
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return C18262g.a.m52613h(c18262g2, c41732a);
                    }
                };
                this.f71092z = null;
                this.f71089w = null;
                this.f71090x = null;
                this.f71091y = 1;
                if (AbstractC37056f.m118984h(interfaceC11936u, interfaceC4339a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public C18262g(ConnectivityManager connectivityManager, InterfaceC2994c0 applicationScope) {
        AbstractC22676k.m65750j(connectivityManager, "connectivityManager");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        this.connectivityManager = connectivityManager;
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new a(null));
        this.networkStateSource = c13022cM36600j;
        this.networkFlow = AbstractC13091v.m36586L(c13022cM36600j, applicationScope, C13105z1.m36630a(2, 5000L), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final AbstractC18263h m52610g(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
            return new AbstractC18263h.a(!networkCapabilities.hasCapability(11));
        }
        return AbstractC18263h.b.f71096a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: h */
    public final NetworkCapabilities m52611h() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        return connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
    }

    @Override // i92.InterfaceC18260e
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC13058l getNetworkFlow() {
        return this.networkFlow;
    }

    @Override // i92.InterfaceC18260e
    /* JADX INFO: renamed from: b */
    public AbstractC23412c mo52605b() {
        return AbstractC37056f.m118982g(getNetworkFlow());
    }

    @Override // i92.InterfaceC18260e
    /* JADX INFO: renamed from: c */
    public String mo52606c() {
        NetworkCapabilities networkCapabilitiesM52611h = m52611h();
        if (networkCapabilitiesM52611h == null || !networkCapabilitiesM52611h.hasCapability(16)) {
            return "Disconnected";
        }
        return "Connected and ".concat(!networkCapabilitiesM52611h.hasCapability(11) ? "metered" : "unmetered");
    }

    @Override // i92.InterfaceC18260e
    public boolean isConnected() {
        NetworkCapabilities networkCapabilitiesM52611h = m52611h();
        return networkCapabilitiesM52611h != null && networkCapabilitiesM52611h.hasCapability(16);
    }
}
