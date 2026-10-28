package c52;

import oh2.InterfaceC27939b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pt0.EnumC29510a;

/* JADX INFO: renamed from: c52.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b\u0018\u0010\r¨\u0006!"}, m65681d2 = {"Lc52/d;", "", "", "deviceName", "serialNumber", "Loh2/b;", "firmwareVersion", "Lpt0/a;", "colorway", "macAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Loh2/b;Lpt0/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDeviceName", "b", "c", "Loh2/b;", "()Loh2/b;", "d", "Lpt0/a;", "getColorway", "()Lpt0/a;", "e", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4253d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String deviceName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String serialNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27939b firmwareVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC29510a colorway;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String macAddress;

    public C4253d(String deviceName, String serialNumber, InterfaceC27939b firmwareVersion, EnumC29510a colorway, String macAddress) {
        AbstractC22676k.m65750j(deviceName, "deviceName");
        AbstractC22676k.m65750j(serialNumber, "serialNumber");
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        AbstractC22676k.m65750j(colorway, "colorway");
        AbstractC22676k.m65750j(macAddress, "macAddress");
        this.deviceName = deviceName;
        this.serialNumber = serialNumber;
        this.firmwareVersion = firmwareVersion;
        this.colorway = colorway;
        this.macAddress = macAddress;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC27939b getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4253d)) {
            return false;
        }
        C4253d c4253d = (C4253d) other;
        return AbstractC22676k.m65745e(this.deviceName, c4253d.deviceName) && AbstractC22676k.m65745e(this.serialNumber, c4253d.serialNumber) && AbstractC22676k.m65745e(this.firmwareVersion, c4253d.firmwareVersion) && this.colorway == c4253d.colorway && AbstractC22676k.m65745e(this.macAddress, c4253d.macAddress);
    }

    public int hashCode() {
        return this.macAddress.hashCode() + ((this.colorway.hashCode() + ((this.firmwareVersion.hashCode() + AbstractC11266d.m30450d(this.deviceName.hashCode() * 31, 31, this.serialNumber)) * 31)) * 31);
    }

    public String toString() {
        String str = this.deviceName;
        String str2 = this.serialNumber;
        InterfaceC27939b interfaceC27939b = this.firmwareVersion;
        EnumC29510a enumC29510a = this.colorway;
        String str3 = this.macAddress;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BatteryPackMetadata(deviceName=", str, ", serialNumber=", str2, ", firmwareVersion=");
        sbM32001t.append(interfaceC27939b);
        sbM32001t.append(", colorway=");
        sbM32001t.append(enumC29510a);
        sbM32001t.append(", macAddress=");
        return AbstractC25012a.m73376i(str3, ")", sbM32001t);
    }
}
