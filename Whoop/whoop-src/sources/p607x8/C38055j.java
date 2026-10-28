package p607x8;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: x8.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C38055j extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a */
    public final C38058m f163004a;

    public C38055j(C38058m c38058m) {
        this.f163004a = c38058m;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.f163004a.m121840c(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
