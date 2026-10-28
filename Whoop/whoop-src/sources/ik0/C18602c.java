package ik0;

import java.util.UUID;
import mj0.C25615d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ik0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, m65681d2 = {"Lik0/c;", "", "Lmj0/d;", "deviceId", "", "serial", "advertisingName", "Ljava/util/UUID;", "serviceId", "", "pairedAtMs", "lastConnectedMs", "Lik0/a;", "lastKnownFirmware", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;JJLik0/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getSerial", "c", "getAdvertisingName", "d", "Ljava/util/UUID;", "()Ljava/util/UUID;", "e", "J", "getPairedAtMs", "()J", "f", "getLastConnectedMs", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18602c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String deviceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String serial;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String advertisingName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final UUID serviceId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long pairedAtMs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long lastConnectedMs;

    public /* synthetic */ C18602c(String str, String str2, String str3, UUID uuid, long j7, long j13, AbstractC18600a abstractC18600a, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, uuid, j7, j13, abstractC18600a);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getServiceId() {
        return this.serviceId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18602c)) {
            return false;
        }
        C18602c c18602c = (C18602c) other;
        return C25615d.m75339d(this.deviceId, c18602c.deviceId) && AbstractC22676k.m65745e(this.serial, c18602c.serial) && AbstractC22676k.m65745e(this.advertisingName, c18602c.advertisingName) && AbstractC22676k.m65745e(this.serviceId, c18602c.serviceId) && this.pairedAtMs == c18602c.pairedAtMs && this.lastConnectedMs == c18602c.lastConnectedMs;
    }

    public int hashCode() {
        return AbstractC11266d.m30451e(AbstractC11266d.m30451e((this.serviceId.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(C25615d.m75340e(this.deviceId) * 31, 31, this.serial), 31, this.advertisingName)) * 31, this.pairedAtMs, 31), this.lastConnectedMs, 31);
    }

    public String toString() {
        String strM75341f = C25615d.m75341f(this.deviceId);
        String str = this.serial;
        String str2 = this.advertisingName;
        UUID uuid = this.serviceId;
        long j7 = this.pairedAtMs;
        long j13 = this.lastConnectedMs;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PairedDeviceRecord(deviceId=", strM75341f, ", serial=", str, ", advertisingName=");
        sbM32001t.append(str2);
        sbM32001t.append(", serviceId=");
        sbM32001t.append(uuid);
        sbM32001t.append(", pairedAtMs=");
        sbM32001t.append(j7);
        sbM32001t.append(", lastConnectedMs=");
        sbM32001t.append(j13);
        sbM32001t.append(", lastKnownFirmware=null)");
        return sbM32001t.toString();
    }

    private C18602c(String deviceId, String serial, String advertisingName, UUID serviceId, long j7, long j13, AbstractC18600a abstractC18600a) {
        AbstractC22676k.m65750j(deviceId, "deviceId");
        AbstractC22676k.m65750j(serial, "serial");
        AbstractC22676k.m65750j(advertisingName, "advertisingName");
        AbstractC22676k.m65750j(serviceId, "serviceId");
        this.deviceId = deviceId;
        this.serial = serial;
        this.advertisingName = advertisingName;
        this.serviceId = serviceId;
        this.pairedAtMs = j7;
        this.lastConnectedMs = j13;
    }

    public /* synthetic */ C18602c(String str, String str2, String str3, UUID uuid, long j7, long j13, AbstractC18600a abstractC18600a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, uuid, j7, j13, (i13 & 64) != 0 ? null : abstractC18600a, null);
    }
}
