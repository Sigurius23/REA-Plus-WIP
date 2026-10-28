package p229ip;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.crypto.tink.internal.C5099k0;
import io.sentry.internal.debugmeta.C20378c;
import p374oo.C28053b;
import p529uo.AbstractC35117h;

/* JADX INFO: renamed from: ip.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C20799j extends AbstractC35117h {

    /* JADX INFO: renamed from: z */
    public final C28053b f78090z;

    public C20799j(Context context, Looper looper, C5099k0 c5099k0, C28053b c28053b, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j) {
        super(context, looper, 68, c5099k0, interfaceC4978i, interfaceC4979j, 0);
        c28053b = c28053b == null ? C28053b.f113196y : c28053b;
        C20378c c20378c = new C20378c(29, (char) 0);
        c20378c.f76422x = Boolean.FALSE;
        C28053b c28053b2 = C28053b.f113196y;
        c28053b.getClass();
        c20378c.f76422x = Boolean.valueOf(c28053b.f113197w);
        c20378c.f76423y = c28053b.f113198x;
        c20378c.f76423y = AbstractC20796g.m57331a();
        this.f78090z = new C28053b(c20378c);
    }

    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: b */
    public final int mo5666b() {
        return 12800000;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: d */
    public final IInterface mo5667d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof C20800k ? (C20800k) iInterfaceQueryLocalInterface : new C20800k(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 0);
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: h */
    public final Bundle mo5668h() {
        C28053b c28053b = this.f78090z;
        c28053b.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c28053b.f113197w);
        bundle.putString("log_session_id", c28053b.f113198x);
        return bundle;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: k */
    public final String mo5669k() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: l */
    public final String mo5670l() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
