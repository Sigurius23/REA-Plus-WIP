package com.whoop.whooplabs.data.room.entity;

import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;", "", "hrDeviceId", "", "deviceName", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHrDeviceId", "()Ljava/lang/String;", "getDeviceName", "getFileName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WhoopLabsHrDevice {
    public static final int $stable = 0;
    private final String deviceName;
    private final String fileName;
    private final String hrDeviceId;

    public WhoopLabsHrDevice(String hrDeviceId, String str, String str2) {
        AbstractC22676k.m65750j(hrDeviceId, "hrDeviceId");
        this.hrDeviceId = hrDeviceId;
        this.deviceName = str;
        this.fileName = str2;
    }

    public static /* synthetic */ WhoopLabsHrDevice copy$default(WhoopLabsHrDevice whoopLabsHrDevice, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = whoopLabsHrDevice.hrDeviceId;
        }
        if ((i13 & 2) != 0) {
            str2 = whoopLabsHrDevice.deviceName;
        }
        if ((i13 & 4) != 0) {
            str3 = whoopLabsHrDevice.fileName;
        }
        return whoopLabsHrDevice.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHrDeviceId() {
        return this.hrDeviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    public final WhoopLabsHrDevice copy(String hrDeviceId, String deviceName, String fileName) {
        AbstractC22676k.m65750j(hrDeviceId, "hrDeviceId");
        return new WhoopLabsHrDevice(hrDeviceId, deviceName, fileName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopLabsHrDevice)) {
            return false;
        }
        WhoopLabsHrDevice whoopLabsHrDevice = (WhoopLabsHrDevice) other;
        return AbstractC22676k.m65745e(this.hrDeviceId, whoopLabsHrDevice.hrDeviceId) && AbstractC22676k.m65745e(this.deviceName, whoopLabsHrDevice.deviceName) && AbstractC22676k.m65745e(this.fileName, whoopLabsHrDevice.fileName);
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getHrDeviceId() {
        return this.hrDeviceId;
    }

    public int hashCode() {
        int iHashCode = this.hrDeviceId.hashCode() * 31;
        String str = this.deviceName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.fileName, ")", AbstractC11895b.m32001t("WhoopLabsHrDevice(hrDeviceId=", this.hrDeviceId, ", deviceName=", this.deviceName, ", fileName="));
    }
}
