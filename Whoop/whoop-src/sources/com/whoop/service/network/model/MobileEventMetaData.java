package com.whoop.service.network.model;

import com.google.gson.annotations.SerializedName;
import d13.AbstractC11478a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0084\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0002\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u0011¨\u00060"}, m65681d2 = {"Lcom/whoop/service/network/model/MobileEventMetaData;", "", "isAckSuccess", "", "devicePlatform", "", "deviceOs", "deviceModel", "strapId", "maximVersion", "nordicVersion", "batteryOptimizationOn", "phoneSetAlarmTime", "strapReportedAlarmTime", "isStrapConnected", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDevicePlatform", "()Ljava/lang/String;", "getDeviceOs", "getDeviceModel", "getStrapId", "getMaximVersion", "getNordicVersion", "getBatteryOptimizationOn", "()Z", "getPhoneSetAlarmTime", "getStrapReportedAlarmTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/service/network/model/MobileEventMetaData;", "equals", "other", "hashCode", "", "toString", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MobileEventMetaData {
    public static final int $stable = 0;

    @SerializedName("is_using_battery_optimizers")
    private final boolean batteryOptimizationOn;

    @SerializedName("device_model")
    private final String deviceModel;

    @SerializedName("device_os")
    private final String deviceOs;

    @SerializedName("device_platform")
    private final String devicePlatform;

    @SerializedName("is_ack_success")
    private final Boolean isAckSuccess;

    @SerializedName("is_strap_connected")
    private final Boolean isStrapConnected;

    @SerializedName("firmware_maxim_version")
    private final String maximVersion;

    @SerializedName("nordic_version")
    private final String nordicVersion;

    @SerializedName("phone_set_alarm_time")
    private final String phoneSetAlarmTime;

    @SerializedName("strap_id")
    private final String strapId;

    @SerializedName("strap_alarm_time")
    private final String strapReportedAlarmTime;

    public MobileEventMetaData(Boolean bool, String devicePlatform, String deviceOs, String deviceModel, String strapId, String maximVersion, String nordicVersion, boolean z4, String str, String str2, Boolean bool2) {
        AbstractC22676k.m65750j(devicePlatform, "devicePlatform");
        AbstractC22676k.m65750j(deviceOs, "deviceOs");
        AbstractC22676k.m65750j(deviceModel, "deviceModel");
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(nordicVersion, "nordicVersion");
        this.isAckSuccess = bool;
        this.devicePlatform = devicePlatform;
        this.deviceOs = deviceOs;
        this.deviceModel = deviceModel;
        this.strapId = strapId;
        this.maximVersion = maximVersion;
        this.nordicVersion = nordicVersion;
        this.batteryOptimizationOn = z4;
        this.phoneSetAlarmTime = str;
        this.strapReportedAlarmTime = str2;
        this.isStrapConnected = bool2;
    }

    public static /* synthetic */ MobileEventMetaData copy$default(MobileEventMetaData mobileEventMetaData, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, String str7, String str8, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = mobileEventMetaData.isAckSuccess;
        }
        if ((i13 & 2) != 0) {
            str = mobileEventMetaData.devicePlatform;
        }
        if ((i13 & 4) != 0) {
            str2 = mobileEventMetaData.deviceOs;
        }
        if ((i13 & 8) != 0) {
            str3 = mobileEventMetaData.deviceModel;
        }
        if ((i13 & 16) != 0) {
            str4 = mobileEventMetaData.strapId;
        }
        if ((i13 & 32) != 0) {
            str5 = mobileEventMetaData.maximVersion;
        }
        if ((i13 & 64) != 0) {
            str6 = mobileEventMetaData.nordicVersion;
        }
        if ((i13 & 128) != 0) {
            z4 = mobileEventMetaData.batteryOptimizationOn;
        }
        if ((i13 & 256) != 0) {
            str7 = mobileEventMetaData.phoneSetAlarmTime;
        }
        if ((i13 & 512) != 0) {
            str8 = mobileEventMetaData.strapReportedAlarmTime;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            bool2 = mobileEventMetaData.isStrapConnected;
        }
        String str9 = str8;
        Boolean bool3 = bool2;
        boolean z13 = z4;
        String str10 = str7;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        String str14 = str2;
        return mobileEventMetaData.copy(bool, str, str14, str3, str13, str11, str12, z13, str10, str9, bool3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsAckSuccess() {
        return this.isAckSuccess;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStrapReportedAlarmTime() {
        return this.strapReportedAlarmTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getIsStrapConnected() {
        return this.isStrapConnected;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDevicePlatform() {
        return this.devicePlatform;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceOs() {
        return this.deviceOs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStrapId() {
        return this.strapId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMaximVersion() {
        return this.maximVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNordicVersion() {
        return this.nordicVersion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getBatteryOptimizationOn() {
        return this.batteryOptimizationOn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPhoneSetAlarmTime() {
        return this.phoneSetAlarmTime;
    }

    public final MobileEventMetaData copy(Boolean isAckSuccess, String devicePlatform, String deviceOs, String deviceModel, String strapId, String maximVersion, String nordicVersion, boolean batteryOptimizationOn, String phoneSetAlarmTime, String strapReportedAlarmTime, Boolean isStrapConnected) {
        AbstractC22676k.m65750j(devicePlatform, "devicePlatform");
        AbstractC22676k.m65750j(deviceOs, "deviceOs");
        AbstractC22676k.m65750j(deviceModel, "deviceModel");
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(nordicVersion, "nordicVersion");
        return new MobileEventMetaData(isAckSuccess, devicePlatform, deviceOs, deviceModel, strapId, maximVersion, nordicVersion, batteryOptimizationOn, phoneSetAlarmTime, strapReportedAlarmTime, isStrapConnected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileEventMetaData)) {
            return false;
        }
        MobileEventMetaData mobileEventMetaData = (MobileEventMetaData) other;
        return AbstractC22676k.m65745e(this.isAckSuccess, mobileEventMetaData.isAckSuccess) && AbstractC22676k.m65745e(this.devicePlatform, mobileEventMetaData.devicePlatform) && AbstractC22676k.m65745e(this.deviceOs, mobileEventMetaData.deviceOs) && AbstractC22676k.m65745e(this.deviceModel, mobileEventMetaData.deviceModel) && AbstractC22676k.m65745e(this.strapId, mobileEventMetaData.strapId) && AbstractC22676k.m65745e(this.maximVersion, mobileEventMetaData.maximVersion) && AbstractC22676k.m65745e(this.nordicVersion, mobileEventMetaData.nordicVersion) && this.batteryOptimizationOn == mobileEventMetaData.batteryOptimizationOn && AbstractC22676k.m65745e(this.phoneSetAlarmTime, mobileEventMetaData.phoneSetAlarmTime) && AbstractC22676k.m65745e(this.strapReportedAlarmTime, mobileEventMetaData.strapReportedAlarmTime) && AbstractC22676k.m65745e(this.isStrapConnected, mobileEventMetaData.isStrapConnected);
    }

    public final boolean getBatteryOptimizationOn() {
        return this.batteryOptimizationOn;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOs() {
        return this.deviceOs;
    }

    public final String getDevicePlatform() {
        return this.devicePlatform;
    }

    public final String getMaximVersion() {
        return this.maximVersion;
    }

    public final String getNordicVersion() {
        return this.nordicVersion;
    }

    public final String getPhoneSetAlarmTime() {
        return this.phoneSetAlarmTime;
    }

    public final String getStrapId() {
        return this.strapId;
    }

    public final String getStrapReportedAlarmTime() {
        return this.strapReportedAlarmTime;
    }

    public int hashCode() {
        Boolean bool = this.isAckSuccess;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((bool == null ? 0 : bool.hashCode()) * 31, 31, this.devicePlatform), 31, this.deviceOs), 31, this.deviceModel), 31, this.strapId), 31, this.maximVersion), 31, this.nordicVersion), 31, this.batteryOptimizationOn);
        String str = this.phoneSetAlarmTime;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.strapReportedAlarmTime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.isStrapConnected;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isAckSuccess() {
        return this.isAckSuccess;
    }

    public final Boolean isStrapConnected() {
        return this.isStrapConnected;
    }

    public String toString() {
        Boolean bool = this.isAckSuccess;
        String str = this.devicePlatform;
        String str2 = this.deviceOs;
        String str3 = this.deviceModel;
        String str4 = this.strapId;
        String str5 = this.maximVersion;
        String str6 = this.nordicVersion;
        boolean z4 = this.batteryOptimizationOn;
        String str7 = this.phoneSetAlarmTime;
        String str8 = this.strapReportedAlarmTime;
        Boolean bool2 = this.isStrapConnected;
        StringBuilder sb4 = new StringBuilder("MobileEventMetaData(isAckSuccess=");
        sb4.append(bool);
        sb4.append(", devicePlatform=");
        sb4.append(str);
        sb4.append(", deviceOs=");
        AbstractC11266d.m30444B(sb4, str2, ", deviceModel=", str3, ", strapId=");
        AbstractC11266d.m30444B(sb4, str4, ", maximVersion=", str5, ", nordicVersion=");
        AbstractC38963t7.m124390t(sb4, str6, ", batteryOptimizationOn=", z4, ", phoneSetAlarmTime=");
        AbstractC11266d.m30444B(sb4, str7, ", strapReportedAlarmTime=", str8, ", isStrapConnected=");
        return AbstractC11478a.m30858j(sb4, bool2, ")");
    }

    public /* synthetic */ MobileEventMetaData(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, String str7, String str8, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i13 & 2) != 0 ? "Android" : str, str2, str3, str4, str5, str6, z4, str7, str8, bool2);
    }
}
