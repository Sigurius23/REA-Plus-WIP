package ck;

import ad3.C0783z;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import bc3.AbstractC3006f0;
import ch3.C4685h;
import com.google.crypto.tink.internal.C5101l0;
import fk.InterfaceC14544a;
import p007a6.C0448q;
import p120ek.C13269c;
import p173gj.C15903d;
import p282kk.EnumC22535d;
import p282kk.InterfaceC22536e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ck.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4776f implements InterfaceC22536e {

    /* JADX INFO: renamed from: w */
    public C4685h f19672w;

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: b */
    public final void mo15043b(C15903d c15903d) {
        InterfaceC14544a interfaceC14544a = c15903d.f60138k;
        interfaceC14544a.debug("Installing AndroidNetworkConnectivityPlugin, offline feature should be supported.");
        Context context = c15903d.f60128a.f60153b;
        this.f19672w = new C4685h(context, interfaceC14544a);
        AbstractC3006f0.m8732z(c15903d.f60130c, c15903d.f60133f, null, new C0448q(c15903d, this, null, 5), 2);
        C5101l0 c5101l0 = new C5101l0(context, interfaceC14544a, new C0783z(c15903d, 5));
        try {
            Object systemService = context.getSystemService("connectivity");
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new C13269c(connectivityManager, c5101l0));
        } catch (Throwable th3) {
            ((InterfaceC14544a) c5101l0.f21443x).warn("Error starting network listener: " + th3.getMessage());
        }
    }

    @Override // p282kk.InterfaceC22536e
    public final EnumC22535d getType() {
        return EnumC22535d.f88573w;
    }
}
