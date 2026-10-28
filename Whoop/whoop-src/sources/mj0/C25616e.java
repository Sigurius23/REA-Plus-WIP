package mj0;

import nj0.InterfaceC26750f;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mj0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lmj0/e;", "", "Lmj0/f;", "address", "", "advertisingName", "", "rssi", "Lnj0/f;", "protocol", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILnj0/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "d", "Lnj0/f;", "()Lnj0/f;", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25616e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String address;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String advertisingName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int rssi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC26750f protocol;

    public /* synthetic */ C25616e(String str, String str2, int i13, InterfaceC26750f interfaceC26750f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i13, interfaceC26750f);
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
    public final InterfaceC26750f getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25616e)) {
            return false;
        }
        C25616e c25616e = (C25616e) other;
        return AbstractC25617f.m75348b(this.address, c25616e.address) && AbstractC22676k.m65745e(this.advertisingName, c25616e.advertisingName) && this.rssi == c25616e.rssi && AbstractC22676k.m65745e(this.protocol, c25616e.protocol);
    }

    public int hashCode() {
        return this.protocol.hashCode() + AbstractC11266d.m30448b(this.rssi, AbstractC11266d.m30450d(AbstractC25617f.m75349c(this.address) * 31, 31, this.advertisingName), 31);
    }

    public String toString() {
        String strM75350d = AbstractC25617f.m75350d(this.address);
        String str = this.advertisingName;
        int i13 = this.rssi;
        InterfaceC26750f interfaceC26750f = this.protocol;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DiscoveredDevice(address=", strM75350d, ", advertisingName=", str, ", rssi=");
        sbM32001t.append(i13);
        sbM32001t.append(", protocol=");
        sbM32001t.append(interfaceC26750f);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    private C25616e(String address, String advertisingName, int i13, InterfaceC26750f protocol) {
        AbstractC22676k.m65750j(address, "address");
        AbstractC22676k.m65750j(advertisingName, "advertisingName");
        AbstractC22676k.m65750j(protocol, "protocol");
        this.address = address;
        this.advertisingName = advertisingName;
        this.rssi = i13;
        this.protocol = protocol;
    }
}
