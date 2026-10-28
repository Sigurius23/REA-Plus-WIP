package live.hms.video.network;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"live/hms/video/network/HMSNetworkManagerApi31$callback$1", "Landroid/telephony/TelephonyCallback;", "Landroid/telephony/TelephonyCallback$DisplayInfoListener;", "Landroid/telephony/TelephonyDisplayInfo;", "telephonyDisplayInfo", "Ll83/a0;", "onDisplayInfoChanged", "(Landroid/telephony/TelephonyDisplayInfo;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSNetworkManagerApi31$callback$1 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    final /* synthetic */ HMSNetworkManagerApi31 this$0;

    public HMSNetworkManagerApi31$callback$1(HMSNetworkManagerApi31 hMSNetworkManagerApi31) {
        this.this$0 = hMSNetworkManagerApi31;
    }

    public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        AbstractC22676k.m65750j(telephonyDisplayInfo, "telephonyDisplayInfo");
        HMSLogger.m71136d("HMSNetworkManager", "telephonyDisplayInfo :: " + telephonyDisplayInfo);
        this.this$0.setNetworkType(Integer.valueOf(telephonyDisplayInfo.getNetworkType()));
    }
}
