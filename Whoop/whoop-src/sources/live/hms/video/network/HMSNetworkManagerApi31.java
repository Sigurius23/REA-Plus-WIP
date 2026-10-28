package live.hms.video.network;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.TelephonyUtil;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Llive/hms/video/network/HMSNetworkManagerApi31;", "Llive/hms/video/network/HMSNetworkManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getConnectedNetworkType", "()Ljava/lang/String;", "Ll83/a0;", "start", "()V", "stop", "Landroid/telephony/TelephonyManager;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "Ljava/util/concurrent/ExecutorService;", "exec", "Ljava/util/concurrent/ExecutorService;", "Landroid/telephony/TelephonyCallback;", "callback", "Landroid/telephony/TelephonyCallback;", "", "networkType", "Ljava/lang/Integer;", "getNetworkType", "()Ljava/lang/Integer;", "setNetworkType", "(Ljava/lang/Integer;)V", "", "isRegistered", "Z", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSNetworkManagerApi31 extends HMSNetworkManager {
    private final TelephonyCallback callback;
    private final ExecutorService exec;
    private boolean isRegistered;
    private Integer networkType;
    private final TelephonyManager telephonyManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSNetworkManagerApi31(Context context) {
        super(context);
        AbstractC22676k.m65750j(context, "context");
        Object systemService = context.getSystemService("phone");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        this.telephonyManager = (TelephonyManager) systemService;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC22676k.m65749i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.exec = executorServiceNewSingleThreadExecutor;
        this.callback = new HMSNetworkManagerApi31$callback$1(this);
    }

    @Override // live.hms.video.network.HMSNetworkManager
    public String getConnectedNetworkType() {
        int i13 = Build.VERSION.SDK_INT;
        if (isConnectedOverWifi()) {
            return "wifi";
        }
        return i13 >= 31 ? TelephonyUtil.INSTANCE.getNetworkType(this.networkType) : "cellular";
    }

    public final Integer getNetworkType() {
        return this.networkType;
    }

    public final void setNetworkType(Integer num) {
        this.networkType = num;
    }

    @Override // live.hms.video.network.HMSNetworkManager
    public void start() {
        if (this.isRegistered) {
            HMSLogger.m71136d("HMSNetworkManager", "TelephonyCallback already registered, skipping re-registering");
            return;
        }
        try {
            this.telephonyManager.registerTelephonyCallback(this.exec, this.callback);
            this.isRegistered = true;
        } catch (Exception e5) {
            HMSLogger.INSTANCE.m71138e("HMSNetworkManager", "Failed to register TelephonyCallback: " + e5.getMessage(), e5);
        }
    }

    @Override // live.hms.video.network.HMSNetworkManager
    public void stop() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.telephonyManager.unregisterTelephonyCallback(this.callback);
        }
    }
}
