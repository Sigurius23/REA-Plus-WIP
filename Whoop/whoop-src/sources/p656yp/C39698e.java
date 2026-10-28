package p656yp;

import android.os.IBinder;
import android.os.IInterface;
import p529uo.AbstractC35117h;

/* JADX INFO: renamed from: yp.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C39698e extends AbstractC35117h {
    @Override // p529uo.AbstractC35107c, com.google.android.gms.common.api.InterfaceC4973d
    /* JADX INFO: renamed from: b */
    public final int mo5666b() {
        return 12600000;
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IInterface mo5667d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        return iInterfaceQueryLocalInterface instanceof C39694a ? (C39694a) iInterfaceQueryLocalInterface : new C39694a(iBinder);
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: k */
    public final String mo5669k() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }

    @Override // p529uo.AbstractC35107c
    /* JADX INFO: renamed from: l */
    public final String mo5670l() {
        return "com.google.android.gms.oss.licenses.service.START";
    }
}
