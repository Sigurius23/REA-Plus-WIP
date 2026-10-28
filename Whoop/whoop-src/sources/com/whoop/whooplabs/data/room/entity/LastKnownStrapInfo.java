package com.whoop.whooplabs.data.room.entity;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;", "", "whoopStrapId", "", "hardwareVersion", "firmwareVersion", "bluetoothVersion", "sigProcVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getWhoopStrapId", "()Ljava/lang/String;", "getHardwareVersion", "getFirmwareVersion", "getBluetoothVersion", "getSigProcVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LastKnownStrapInfo {
    public static final int $stable = 0;
    private final String bluetoothVersion;
    private final String firmwareVersion;
    private final String hardwareVersion;
    private final String sigProcVersion;
    private final String whoopStrapId;

    public LastKnownStrapInfo(String whoopStrapId, String hardwareVersion, String firmwareVersion, String bluetoothVersion, String sigProcVersion) {
        AbstractC22676k.m65750j(whoopStrapId, "whoopStrapId");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        AbstractC22676k.m65750j(bluetoothVersion, "bluetoothVersion");
        AbstractC22676k.m65750j(sigProcVersion, "sigProcVersion");
        this.whoopStrapId = whoopStrapId;
        this.hardwareVersion = hardwareVersion;
        this.firmwareVersion = firmwareVersion;
        this.bluetoothVersion = bluetoothVersion;
        this.sigProcVersion = sigProcVersion;
    }

    public static /* synthetic */ LastKnownStrapInfo copy$default(LastKnownStrapInfo lastKnownStrapInfo, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = lastKnownStrapInfo.whoopStrapId;
        }
        if ((i13 & 2) != 0) {
            str2 = lastKnownStrapInfo.hardwareVersion;
        }
        if ((i13 & 4) != 0) {
            str3 = lastKnownStrapInfo.firmwareVersion;
        }
        if ((i13 & 8) != 0) {
            str4 = lastKnownStrapInfo.bluetoothVersion;
        }
        if ((i13 & 16) != 0) {
            str5 = lastKnownStrapInfo.sigProcVersion;
        }
        String str6 = str5;
        String str7 = str3;
        return lastKnownStrapInfo.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWhoopStrapId() {
        return this.whoopStrapId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBluetoothVersion() {
        return this.bluetoothVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSigProcVersion() {
        return this.sigProcVersion;
    }

    public final LastKnownStrapInfo copy(String whoopStrapId, String hardwareVersion, String firmwareVersion, String bluetoothVersion, String sigProcVersion) {
        AbstractC22676k.m65750j(whoopStrapId, "whoopStrapId");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        AbstractC22676k.m65750j(bluetoothVersion, "bluetoothVersion");
        AbstractC22676k.m65750j(sigProcVersion, "sigProcVersion");
        return new LastKnownStrapInfo(whoopStrapId, hardwareVersion, firmwareVersion, bluetoothVersion, sigProcVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastKnownStrapInfo)) {
            return false;
        }
        LastKnownStrapInfo lastKnownStrapInfo = (LastKnownStrapInfo) other;
        return AbstractC22676k.m65745e(this.whoopStrapId, lastKnownStrapInfo.whoopStrapId) && AbstractC22676k.m65745e(this.hardwareVersion, lastKnownStrapInfo.hardwareVersion) && AbstractC22676k.m65745e(this.firmwareVersion, lastKnownStrapInfo.firmwareVersion) && AbstractC22676k.m65745e(this.bluetoothVersion, lastKnownStrapInfo.bluetoothVersion) && AbstractC22676k.m65745e(this.sigProcVersion, lastKnownStrapInfo.sigProcVersion);
    }

    public final String getBluetoothVersion() {
        return this.bluetoothVersion;
    }

    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public final String getSigProcVersion() {
        return this.sigProcVersion;
    }

    public final String getWhoopStrapId() {
        return this.whoopStrapId;
    }

    public int hashCode() {
        return this.sigProcVersion.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.whoopStrapId.hashCode() * 31, 31, this.hardwareVersion), 31, this.firmwareVersion), 31, this.bluetoothVersion);
    }

    public String toString() {
        String str = this.whoopStrapId;
        String str2 = this.hardwareVersion;
        String str3 = this.firmwareVersion;
        String str4 = this.bluetoothVersion;
        String str5 = this.sigProcVersion;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LastKnownStrapInfo(whoopStrapId=", str, ", hardwareVersion=", str2, ", firmwareVersion=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", bluetoothVersion=", str4, ", sigProcVersion=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }
}
