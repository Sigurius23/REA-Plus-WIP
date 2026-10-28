package com.whoop.domain.model;

import androidx.annotation.Keep;
import java.util.regex.Pattern;
import kk0.C22538a;
import no.nordicsemi.android.dfu.DfuBaseService;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0080\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010 R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b;\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b@\u0010\u0019R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010(R\u0017\u0010C\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010\u0017R\u0017\u0010E\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bE\u0010D\u001a\u0004\bE\u0010\u0017R\u0011\u0010G\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bF\u0010\u0019R\u0011\u0010I\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010\u0019¨\u0006J"}, m65681d2 = {"Lcom/whoop/domain/model/WhoopStrapInfo;", "", "", "deviceName", "commitHash", "Lkk0/a;", "batteryLevel", "rawSerialNumber", "rawCpuId", "Loh2/b;", "maximVersion", "bluetoothVersion", "Loh2/c;", "hardwareVersion", "Loh2/e;", "sigProcVersion", "strapSignature", "Lst0/v;", "whoopDeviceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkk0/a;Ljava/lang/String;Ljava/lang/String;Loh2/b;Loh2/b;Loh2/c;Loh2/e;Ljava/lang/String;Lst0/v;)V", "", "areCpuIdAndSerialValid", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkk0/a;", "component4", "component5", "component6", "()Loh2/b;", "component7", "component8", "()Loh2/c;", "component9", "()Loh2/e;", "component10", "component11", "()Lst0/v;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkk0/a;Ljava/lang/String;Ljava/lang/String;Loh2/b;Loh2/b;Loh2/c;Loh2/e;Ljava/lang/String;Lst0/v;)Lcom/whoop/domain/model/WhoopStrapInfo;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceName", "getCommitHash", "Lkk0/a;", "getBatteryLevel", "getRawSerialNumber", "getRawCpuId", "Loh2/b;", "getMaximVersion", "getBluetoothVersion", "Loh2/c;", "getHardwareVersion", "Loh2/e;", "getSigProcVersion", "getStrapSignature", "Lst0/v;", "getWhoopDeviceType", "isSerialNumberValid", "Z", "isCpuIdValid", "getSerialNumber", "serialNumber", "getCpuId", "cpuId", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WhoopStrapInfo {
    private final C22538a batteryLevel;
    private final InterfaceC27939b bluetoothVersion;
    private final String commitHash;
    private final String deviceName;
    private final C27940c hardwareVersion;
    private final boolean isCpuIdValid;
    private final boolean isSerialNumberValid;
    private final InterfaceC27939b maximVersion;
    private final String rawCpuId;
    private final String rawSerialNumber;
    private final C27942e sigProcVersion;
    private final String strapSignature;
    private final EnumC32978v whoopDeviceType;

    public WhoopStrapInfo(String deviceName, String commitHash, C22538a batteryLevel, String rawSerialNumber, String rawCpuId, InterfaceC27939b maximVersion, InterfaceC27939b bluetoothVersion, C27940c hardwareVersion, C27942e sigProcVersion, String str, EnumC32978v whoopDeviceType) {
        AbstractC22676k.m65750j(deviceName, "deviceName");
        AbstractC22676k.m65750j(commitHash, "commitHash");
        AbstractC22676k.m65750j(batteryLevel, "batteryLevel");
        AbstractC22676k.m65750j(rawSerialNumber, "rawSerialNumber");
        AbstractC22676k.m65750j(rawCpuId, "rawCpuId");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(bluetoothVersion, "bluetoothVersion");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(sigProcVersion, "sigProcVersion");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        this.deviceName = deviceName;
        this.commitHash = commitHash;
        this.batteryLevel = batteryLevel;
        this.rawSerialNumber = rawSerialNumber;
        this.rawCpuId = rawCpuId;
        this.maximVersion = maximVersion;
        this.bluetoothVersion = bluetoothVersion;
        this.hardwareVersion = hardwareVersion;
        this.sigProcVersion = sigProcVersion;
        this.strapSignature = str;
        this.whoopDeviceType = whoopDeviceType;
        Pattern patternCompile = Pattern.compile("[a-zA-Z0-9]+");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        this.isSerialNumberValid = patternCompile.matcher(rawSerialNumber).matches();
        this.isCpuIdValid = patternCompile.matcher(rawCpuId).matches();
    }

    public static /* synthetic */ WhoopStrapInfo copy$default(WhoopStrapInfo whoopStrapInfo, String str, String str2, C22538a c22538a, String str3, String str4, InterfaceC27939b interfaceC27939b, InterfaceC27939b interfaceC27939b2, C27940c c27940c, C27942e c27942e, String str5, EnumC32978v enumC32978v, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = whoopStrapInfo.deviceName;
        }
        if ((i13 & 2) != 0) {
            str2 = whoopStrapInfo.commitHash;
        }
        if ((i13 & 4) != 0) {
            c22538a = whoopStrapInfo.batteryLevel;
        }
        if ((i13 & 8) != 0) {
            str3 = whoopStrapInfo.rawSerialNumber;
        }
        if ((i13 & 16) != 0) {
            str4 = whoopStrapInfo.rawCpuId;
        }
        if ((i13 & 32) != 0) {
            interfaceC27939b = whoopStrapInfo.maximVersion;
        }
        if ((i13 & 64) != 0) {
            interfaceC27939b2 = whoopStrapInfo.bluetoothVersion;
        }
        if ((i13 & 128) != 0) {
            c27940c = whoopStrapInfo.hardwareVersion;
        }
        if ((i13 & 256) != 0) {
            c27942e = whoopStrapInfo.sigProcVersion;
        }
        if ((i13 & 512) != 0) {
            str5 = whoopStrapInfo.strapSignature;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            enumC32978v = whoopStrapInfo.whoopDeviceType;
        }
        String str6 = str5;
        EnumC32978v enumC32978v2 = enumC32978v;
        C27940c c27940c2 = c27940c;
        C27942e c27942e2 = c27942e;
        InterfaceC27939b interfaceC27939b3 = interfaceC27939b;
        InterfaceC27939b interfaceC27939b4 = interfaceC27939b2;
        String str7 = str4;
        C22538a c22538a2 = c22538a;
        return whoopStrapInfo.copy(str, str2, c22538a2, str3, str7, interfaceC27939b3, interfaceC27939b4, c27940c2, c27942e2, str6, enumC32978v2);
    }

    public final boolean areCpuIdAndSerialValid() {
        return this.isSerialNumberValid && this.isCpuIdValid;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStrapSignature() {
        return this.strapSignature;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final EnumC32978v getWhoopDeviceType() {
        return this.whoopDeviceType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCommitHash() {
        return this.commitHash;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C22538a getBatteryLevel() {
        return this.batteryLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRawSerialNumber() {
        return this.rawSerialNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRawCpuId() {
        return this.rawCpuId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InterfaceC27939b getMaximVersion() {
        return this.maximVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final InterfaceC27939b getBluetoothVersion() {
        return this.bluetoothVersion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C27940c getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C27942e getSigProcVersion() {
        return this.sigProcVersion;
    }

    public final WhoopStrapInfo copy(String deviceName, String commitHash, C22538a batteryLevel, String rawSerialNumber, String rawCpuId, InterfaceC27939b maximVersion, InterfaceC27939b bluetoothVersion, C27940c hardwareVersion, C27942e sigProcVersion, String strapSignature, EnumC32978v whoopDeviceType) {
        AbstractC22676k.m65750j(deviceName, "deviceName");
        AbstractC22676k.m65750j(commitHash, "commitHash");
        AbstractC22676k.m65750j(batteryLevel, "batteryLevel");
        AbstractC22676k.m65750j(rawSerialNumber, "rawSerialNumber");
        AbstractC22676k.m65750j(rawCpuId, "rawCpuId");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(bluetoothVersion, "bluetoothVersion");
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(sigProcVersion, "sigProcVersion");
        AbstractC22676k.m65750j(whoopDeviceType, "whoopDeviceType");
        return new WhoopStrapInfo(deviceName, commitHash, batteryLevel, rawSerialNumber, rawCpuId, maximVersion, bluetoothVersion, hardwareVersion, sigProcVersion, strapSignature, whoopDeviceType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopStrapInfo)) {
            return false;
        }
        WhoopStrapInfo whoopStrapInfo = (WhoopStrapInfo) other;
        return AbstractC22676k.m65745e(this.deviceName, whoopStrapInfo.deviceName) && AbstractC22676k.m65745e(this.commitHash, whoopStrapInfo.commitHash) && AbstractC22676k.m65745e(this.batteryLevel, whoopStrapInfo.batteryLevel) && AbstractC22676k.m65745e(this.rawSerialNumber, whoopStrapInfo.rawSerialNumber) && AbstractC22676k.m65745e(this.rawCpuId, whoopStrapInfo.rawCpuId) && AbstractC22676k.m65745e(this.maximVersion, whoopStrapInfo.maximVersion) && AbstractC22676k.m65745e(this.bluetoothVersion, whoopStrapInfo.bluetoothVersion) && AbstractC22676k.m65745e(this.hardwareVersion, whoopStrapInfo.hardwareVersion) && AbstractC22676k.m65745e(this.sigProcVersion, whoopStrapInfo.sigProcVersion) && AbstractC22676k.m65745e(this.strapSignature, whoopStrapInfo.strapSignature) && this.whoopDeviceType == whoopStrapInfo.whoopDeviceType;
    }

    public final C22538a getBatteryLevel() {
        return this.batteryLevel;
    }

    public final InterfaceC27939b getBluetoothVersion() {
        return this.bluetoothVersion;
    }

    public final String getCommitHash() {
        return this.commitHash;
    }

    public final String getCpuId() {
        return this.isCpuIdValid ? this.rawCpuId : "FFFFFFFFFFFFFFFFFFFFFFFF";
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final C27940c getHardwareVersion() {
        return this.hardwareVersion;
    }

    public final InterfaceC27939b getMaximVersion() {
        return this.maximVersion;
    }

    public final String getRawCpuId() {
        return this.rawCpuId;
    }

    public final String getRawSerialNumber() {
        return this.rawSerialNumber;
    }

    public final String getSerialNumber() {
        return this.isSerialNumberValid ? this.rawSerialNumber : "FFFFFFFF";
    }

    public final C27942e getSigProcVersion() {
        return this.sigProcVersion;
    }

    public final String getStrapSignature() {
        return this.strapSignature;
    }

    public final EnumC32978v getWhoopDeviceType() {
        return this.whoopDeviceType;
    }

    public int hashCode() {
        int iHashCode = (this.sigProcVersion.hashCode() + ((this.hardwareVersion.hashCode() + ((this.bluetoothVersion.hashCode() + ((this.maximVersion.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.batteryLevel.hashCode() + AbstractC11266d.m30450d(this.deviceName.hashCode() * 31, 31, this.commitHash)) * 31, 31, this.rawSerialNumber), 31, this.rawCpuId)) * 31)) * 31)) * 31)) * 31;
        String str = this.strapSignature;
        return this.whoopDeviceType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: isCpuIdValid, reason: from getter */
    public final boolean getIsCpuIdValid() {
        return this.isCpuIdValid;
    }

    /* JADX INFO: renamed from: isSerialNumberValid, reason: from getter */
    public final boolean getIsSerialNumberValid() {
        return this.isSerialNumberValid;
    }

    public String toString() {
        String str = this.deviceName;
        String str2 = this.commitHash;
        C22538a c22538a = this.batteryLevel;
        String str3 = this.rawSerialNumber;
        String str4 = this.rawCpuId;
        InterfaceC27939b interfaceC27939b = this.maximVersion;
        InterfaceC27939b interfaceC27939b2 = this.bluetoothVersion;
        C27940c c27940c = this.hardwareVersion;
        C27942e c27942e = this.sigProcVersion;
        String str5 = this.strapSignature;
        EnumC32978v enumC32978v = this.whoopDeviceType;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WhoopStrapInfo(deviceName=", str, ", commitHash=", str2, ", batteryLevel=");
        sbM32001t.append(c22538a);
        sbM32001t.append(", rawSerialNumber=");
        sbM32001t.append(str3);
        sbM32001t.append(", rawCpuId=");
        sbM32001t.append(str4);
        sbM32001t.append(", maximVersion=");
        sbM32001t.append(interfaceC27939b);
        sbM32001t.append(", bluetoothVersion=");
        sbM32001t.append(interfaceC27939b2);
        sbM32001t.append(", hardwareVersion=");
        sbM32001t.append(c27940c);
        sbM32001t.append(", sigProcVersion=");
        sbM32001t.append(c27942e);
        sbM32001t.append(", strapSignature=");
        sbM32001t.append(str5);
        sbM32001t.append(", whoopDeviceType=");
        sbM32001t.append(enumC32978v);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
