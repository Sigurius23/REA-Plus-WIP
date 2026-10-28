package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.gson.annotations.SerializedName;
import com.mapbox.common.TelemetrySystemUtils;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 12\u00020\u0001:\u000212B\u0007\b\u0017¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0003J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u00100\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\t\"\u0004\b-\u0010\u000b¨\u00063"}, m65681d2 = {"Lcom/mapbox/maps/module/telemetry/PhoneState;", "", "()V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accessibilityFontScale", "", "getAccessibilityFontScale", "()F", "setAccessibilityFontScale", "(F)V", "batteryLevel", "", "getBatteryLevel", "()I", "setBatteryLevel", "(I)V", "carrier", "", "getCarrier", "()Ljava/lang/String;", "setCarrier", "(Ljava/lang/String;)V", "cellularNetworkType", "getCellularNetworkType", "setCellularNetworkType", AnalyticsRequestV2.PARAM_CREATED, "getCreated", "setCreated", "isPluggedIn", "", "()Z", "setPluggedIn", "(Z)V", "isWifi", "setWifi", "orientation", "Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;", "getOrientation", "()Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;", "setOrientation", "(Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;)V", "resolution", "getResolution", "setResolution", "isConnectedToWifi", "obtainCellularCarrier", "obtainDisplayDensity", "Companion", "Orientation", "module-telemetry_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class PhoneState {
    private static final String NO_CARRIER = "EMPTY_CARRIER";
    private static final int NO_NETWORK = -1;

    @SerializedName("accessibilityFontScale")
    private float accessibilityFontScale;

    @SerializedName("batteryLevel")
    private int batteryLevel;

    @SerializedName("carrier")
    private String carrier;

    @SerializedName("cellularNetworkType")
    private String cellularNetworkType;

    @SerializedName(AnalyticsRequestV2.PARAM_CREATED)
    private String created;

    @SerializedName("pluggedIn")
    private boolean isPluggedIn;

    @SerializedName("wifi")
    private boolean isWifi;

    @SerializedName("orientation")
    private Orientation orientation;

    @SerializedName("resolution")
    private float resolution;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m65681d2 = {"Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;", "", "orientation", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getOrientation", "()Ljava/lang/String;", "ORIENTATION_PORTRAIT", "ORIENTATION_LANDSCAPE", "Companion", "module-telemetry_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public enum Orientation {
        ORIENTATION_PORTRAIT("Portrait"),
        ORIENTATION_LANDSCAPE("Landscape");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String orientation;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation$Companion;", "", "()V", "getOrientation", "Lcom/mapbox/maps/module/telemetry/PhoneState$Orientation;", "index", "", "module-telemetry_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Orientation getOrientation(int index) {
                return 1 == index ? Orientation.ORIENTATION_PORTRAIT : Orientation.ORIENTATION_LANDSCAPE;
            }

            private Companion() {
            }
        }

        Orientation(String str) {
            this.orientation = str;
        }

        public final String getOrientation() {
            return this.orientation;
        }
    }

    public PhoneState() {
        this.created = "2020-07-12";
        this.orientation = Orientation.ORIENTATION_PORTRAIT;
    }

    @SuppressLint({"MissingPermission"})
    private final boolean isConnectedToWifi(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(1);
        } catch (Exception unused) {
            return false;
        }
    }

    private final String obtainCellularCarrier(Context context) {
        Object systemService = context.getSystemService("phone");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String carrierName = ((TelephonyManager) systemService).getNetworkOperatorName();
        if (TextUtils.isEmpty(carrierName)) {
            return NO_CARRIER;
        }
        AbstractC22676k.m65749i(carrierName, "carrierName");
        return carrierName;
    }

    private final float obtainDisplayDensity(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public final float getAccessibilityFontScale() {
        return this.accessibilityFontScale;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getCellularNetworkType() {
        return this.cellularNetworkType;
    }

    public final String getCreated() {
        return this.created;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final float getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: isPluggedIn, reason: from getter */
    public final boolean getIsPluggedIn() {
        return this.isPluggedIn;
    }

    /* JADX INFO: renamed from: isWifi, reason: from getter */
    public final boolean getIsWifi() {
        return this.isWifi;
    }

    public final void setAccessibilityFontScale(float f13) {
        this.accessibilityFontScale = f13;
    }

    public final void setBatteryLevel(int i13) {
        this.batteryLevel = i13;
    }

    public final void setCarrier(String str) {
        this.carrier = str;
    }

    public final void setCellularNetworkType(String str) {
        this.cellularNetworkType = str;
    }

    public final void setCreated(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.created = str;
    }

    public final void setOrientation(Orientation orientation) {
        AbstractC22676k.m65750j(orientation, "<set-?>");
        this.orientation = orientation;
    }

    public final void setPluggedIn(boolean z4) {
        this.isPluggedIn = z4;
    }

    public final void setResolution(float f13) {
        this.resolution = f13;
    }

    public final void setWifi(boolean z4) {
        this.isWifi = z4;
    }

    public PhoneState(Context context) {
        AbstractC22676k.m65750j(context, "context");
        String strObtainCurrentDate = TelemetrySystemUtils.obtainCurrentDate();
        AbstractC22676k.m65749i(strObtainCurrentDate, "obtainCurrentDate()");
        this.created = strObtainCurrentDate;
        this.batteryLevel = TelemetrySystemUtils.obtainBatteryLevel(context);
        this.isPluggedIn = TelemetrySystemUtils.isPluggedIn(context);
        this.cellularNetworkType = TelemetrySystemUtils.obtainCellularNetworkType(context);
        this.orientation = Orientation.INSTANCE.getOrientation(context.getResources().getConfiguration().orientation);
        this.accessibilityFontScale = context.getResources().getConfiguration().fontScale;
        this.carrier = obtainCellularCarrier(context);
        this.resolution = obtainDisplayDensity(context);
        this.isWifi = isConnectedToWifi(context);
    }
}
