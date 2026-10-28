package k22;

import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qt0.C30586b;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: k22.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"}, m65681d2 = {"Lk22/d;", "", "", "cdmPairingNeeded", "", "Lqt0/b;", "devices", "startScan", "triggerRescan", "pairingDevice", "", "batteryPercent", "<init>", "(ZLjava/util/List;ZZLqt0/b;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getCdmPairingNeeded", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "e", "Lqt0/b;", "()Lqt0/b;", "f", "I", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22164d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean cdmPairingNeeded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C30586b> devices;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean startScan;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean triggerRescan;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C30586b pairingDevice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int batteryPercent;

    public C22164d(boolean z4, List<C30586b> devices, boolean z13, boolean z14, C30586b c30586b, int i13) {
        AbstractC22676k.m65750j(devices, "devices");
        this.cdmPairingNeeded = z4;
        this.devices = devices;
        this.startScan = z13;
        this.triggerRescan = z14;
        this.pairingDevice = c30586b;
        this.batteryPercent = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBatteryPercent() {
        return this.batteryPercent;
    }

    /* JADX INFO: renamed from: b */
    public final List<C30586b> m63442b() {
        return this.devices;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C30586b getPairingDevice() {
        return this.pairingDevice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getStartScan() {
        return this.startScan;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getTriggerRescan() {
        return this.triggerRescan;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22164d)) {
            return false;
        }
        C22164d c22164d = (C22164d) other;
        return this.cdmPairingNeeded == c22164d.cdmPairingNeeded && AbstractC22676k.m65745e(this.devices, c22164d.devices) && this.startScan == c22164d.startScan && this.triggerRescan == c22164d.triggerRescan && AbstractC22676k.m65745e(this.pairingDevice, c22164d.pairingDevice) && this.batteryPercent == c22164d.batteryPercent;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(Boolean.hashCode(this.cdmPairingNeeded) * 31, 31, this.devices), 31, this.startScan), 31, this.triggerRescan);
        C30586b c30586b = this.pairingDevice;
        return Integer.hashCode(this.batteryPercent) + ((iM8289b + (c30586b == null ? 0 : c30586b.hashCode())) * 31);
    }

    public String toString() {
        boolean z4 = this.cdmPairingNeeded;
        List<C30586b> list = this.devices;
        boolean z13 = this.startScan;
        boolean z14 = this.triggerRescan;
        C30586b c30586b = this.pairingDevice;
        int i13 = this.batteryPercent;
        StringBuilder sb4 = new StringBuilder("PairingUiViewState(cdmPairingNeeded=");
        sb4.append(z4);
        sb4.append(", devices=");
        sb4.append(list);
        sb4.append(", startScan=");
        AbstractC38963t7.m124392v(sb4, z13, ", triggerRescan=", z14, ", pairingDevice=");
        sb4.append(c30586b);
        sb4.append(", batteryPercent=");
        sb4.append(i13);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C22164d(boolean z4, List list, boolean z13, boolean z14, C30586b c30586b, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? false : z4, (i14 & 2) != 0 ? C25271y.f99162w : list, (i14 & 4) != 0 ? false : z13, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : c30586b, (i14 & 32) != 0 ? 0 : i13);
    }
}
