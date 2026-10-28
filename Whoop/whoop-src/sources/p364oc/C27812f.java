package p364oc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import io.sentry.android.core.internal.util.C20101b;
import mc.C25408e;
import p114eb.AbstractC12979o0;
import p218ic.C18389w;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc.C32352b;
import se.AbstractC32416g;

/* JADX INFO: renamed from: oc.f */
/* JADX INFO: loaded from: classes.dex */
public final class C27812f extends AbstractC12979o0 {

    /* JADX INFO: renamed from: f */
    public final ConnectivityManager f112056f;

    /* JADX INFO: renamed from: g */
    public final Object f112057g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f112058h;

    /* JADX INFO: renamed from: i */
    public final C20101b f112059i;

    public C27812f(Context context, C32352b c32352b) {
        super(context, c32352b);
        Object systemService = ((Context) this.f44828b).getSystemService("connectivity");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f112056f = (ConnectivityManager) systemService;
        this.f112057g = new Object();
        this.f112059i = new C20101b(this, 2);
    }

    @Override // p114eb.AbstractC12979o0
    /* JADX INFO: renamed from: c */
    public final Object mo36475c() {
        boolean zHasCapability;
        ConnectivityManager connectivityManager = this.f112056f;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return AbstractC27813g.m83891a(networkCapabilities, this.f112058h);
        }
        ConnectivityManager connectivityManager2 = this.f112056f;
        boolean z4 = this.f112058h;
        String str = AbstractC27813g.f112060a;
        AbstractC22676k.m65750j(connectivityManager2, "connectivityManager");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager2.getActiveNetworkInfo();
            boolean z13 = true;
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z13 = false;
            }
            try {
                NetworkCapabilities networkCapabilities2 = connectivityManager2.getNetworkCapabilities(connectivityManager2.getActiveNetwork());
                zHasCapability = networkCapabilities2 != null ? networkCapabilities2.hasCapability(16) : false;
            } catch (SecurityException e5) {
                C18389w.m52886d().m52890c(str, "Unable to validate active network", e5);
            }
            return new C25408e(z13, zHasCapability, AbstractC32416g.m101136E(connectivityManager2), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true, z4);
        } catch (SecurityException e13) {
            C18389w.m52886d().m52890c(str, "Unable to get active network state", e13);
            return new C25408e(false, false, false, true, z4);
        }
    }

    @Override // p114eb.AbstractC12979o0
    /* JADX INFO: renamed from: e */
    public final void mo36477e() {
        try {
            C18389w.m52886d().m52888a(AbstractC27813g.f112060a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f112056f;
            C20101b networkCallback = this.f112059i;
            AbstractC22676k.m65750j(connectivityManager, "<this>");
            AbstractC22676k.m65750j(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e5) {
            C18389w.m52886d().m52890c(AbstractC27813g.f112060a, "Received exception while registering network callback", e5);
        } catch (SecurityException e13) {
            C18389w.m52886d().m52890c(AbstractC27813g.f112060a, "Received exception while registering network callback", e13);
        }
    }

    @Override // p114eb.AbstractC12979o0
    /* JADX INFO: renamed from: f */
    public final void mo36478f() {
        try {
            C18389w.m52886d().m52888a(AbstractC27813g.f112060a, "Unregistering network callback");
            this.f112056f.unregisterNetworkCallback(this.f112059i);
        } catch (IllegalArgumentException e5) {
            C18389w.m52886d().m52890c(AbstractC27813g.f112060a, "Received exception while unregistering network callback", e5);
        } catch (SecurityException e13) {
            C18389w.m52886d().m52890c(AbstractC27813g.f112060a, "Received exception while unregistering network callback", e13);
        }
    }
}
