package p309lo;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: lo.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C24559q extends PhoneStateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C24560r f95851a;

    public C24559q(C24560r c24560r) {
        this.f95851a = c24560r;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        C24560r.m71617a(this.f95851a, overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        String string = serviceState == null ? "" : serviceState.toString();
        C24560r.m71617a(this.f95851a, string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
    }
}
