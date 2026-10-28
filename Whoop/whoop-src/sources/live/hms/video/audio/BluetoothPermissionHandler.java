package live.hms.video.audio;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.HMSTrackSettings;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/audio/BluetoothPermissionHandler;", "", "hmsTrackSettings", "Llive/hms/video/media/settings/HMSTrackSettings;", "<init>", "(Llive/hms/video/media/settings/HMSTrackSettings;)V", "getHmsTrackSettings", "()Llive/hms/video/media/settings/HMSTrackSettings;", "BLUETOOTH_CONNECT_PERMISSION", "", "getBLUETOOTH_CONNECT_PERMISSION", "()Ljava/lang/String;", "hasPermission", "", "context", "Landroid/content/Context;", "permission", "hasBluetoothError", "Llive/hms/video/audio/BluetoothErrorType;", "isDeviceAndroid12AndAbove", "isTargetingAndroid12AndAbove", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class BluetoothPermissionHandler {
    private final String BLUETOOTH_CONNECT_PERMISSION;
    private final HMSTrackSettings hmsTrackSettings;

    public BluetoothPermissionHandler(HMSTrackSettings hmsTrackSettings) {
        AbstractC22676k.m65750j(hmsTrackSettings, "hmsTrackSettings");
        this.hmsTrackSettings = hmsTrackSettings;
        this.BLUETOOTH_CONNECT_PERMISSION = "android.permission.BLUETOOTH_CONNECT";
    }

    private final boolean hasPermission(Context context, String permission) {
        return context.checkPermission(permission, Process.myPid(), Process.myUid()) == 0;
    }

    private final boolean isDeviceAndroid12AndAbove() {
        return Build.VERSION.SDK_INT > 30;
    }

    private final boolean isTargetingAndroid12AndAbove(Context context) {
        return context.getApplicationInfo().targetSdkVersion > 30;
    }

    public final String getBLUETOOTH_CONNECT_PERMISSION() {
        return this.BLUETOOTH_CONNECT_PERMISSION;
    }

    public final HMSTrackSettings getHmsTrackSettings() {
        return this.hmsTrackSettings;
    }

    public final BluetoothErrorType hasBluetoothError(Context context) {
        AbstractC22676k.m65750j(context, "context");
        boolean zHasPermission = hasPermission(context, "android.permission.BLUETOOTH");
        HMSAudioTrackSettings audioSettings = this.hmsTrackSettings.getAudioSettings();
        if (audioSettings != null && audioSettings.getDisableInternalAudioManager()) {
            return null;
        }
        if (isDeviceAndroid12AndAbove() && isTargetingAndroid12AndAbove(context)) {
            if (!hasPermission(context, this.BLUETOOTH_CONNECT_PERMISSION)) {
                return BluetoothErrorType.NO_BLUETOOTH_CONNECT_PERMISSION;
            }
        } else if (!zHasPermission) {
            return BluetoothErrorType.NO_BLUETOOTH_PERMISSON;
        }
        return null;
    }
}
