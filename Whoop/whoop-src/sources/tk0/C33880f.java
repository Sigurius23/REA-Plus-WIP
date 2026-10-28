package tk0;

import java.util.List;
import java.util.UUID;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tk0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ltk0/f;", "", "", "address", "advertisingName", "", "rssi", "", "Ljava/util/UUID;", "serviceIds", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "d", "Ljava/util/List;", "()Ljava/util/List;", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33880f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String address;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String advertisingName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int rssi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<UUID> serviceIds;

    public C33880f(String address, String str, int i13, List<UUID> serviceIds) {
        AbstractC22676k.m65750j(address, "address");
        AbstractC22676k.m65750j(serviceIds, "serviceIds");
        this.address = address;
        this.advertisingName = str;
        this.rssi = i13;
        this.serviceIds = serviceIds;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdvertisingName() {
        return this.advertisingName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    /* JADX INFO: renamed from: d */
    public final List<UUID> m107138d() {
        return this.serviceIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33880f)) {
            return false;
        }
        C33880f c33880f = (C33880f) other;
        return AbstractC22676k.m65745e(this.address, c33880f.address) && AbstractC22676k.m65745e(this.advertisingName, c33880f.advertisingName) && this.rssi == c33880f.rssi && AbstractC22676k.m65745e(this.serviceIds, c33880f.serviceIds);
    }

    public int hashCode() {
        int iHashCode = this.address.hashCode() * 31;
        String str = this.advertisingName;
        return this.serviceIds.hashCode() + AbstractC11266d.m30448b(this.rssi, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        String str = this.address;
        String str2 = this.advertisingName;
        int i13 = this.rssi;
        List<UUID> list = this.serviceIds;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ScanReport(address=", str, ", advertisingName=", str2, ", rssi=");
        sbM32001t.append(i13);
        sbM32001t.append(", serviceIds=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
