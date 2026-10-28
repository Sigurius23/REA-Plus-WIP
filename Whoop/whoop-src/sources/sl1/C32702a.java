package sl1;

import ca2.C4361a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import td1.EnumC33708f;

/* JADX INFO: renamed from: sl1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jj\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b\"\u0010)R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b+\u0010\u001d¨\u0006,"}, m65681d2 = {"Lsl1/a;", "", "", "isBluetoothOff", "networkDisconnected", "isConnected", "", "chargePercent", "isCharging", "Ltd1/f;", "strapStatus", "Lca2/a;", "dataCatchingUpDomainResult", "isOffBody", "isConnectivityIndicatorVisible", "<init>", "(ZZZIZLtd1/f;Lca2/a;ZZ)V", "a", "(ZZZIZLtd1/f;Lca2/a;ZZ)Lsl1/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "e", "c", "i", "d", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Ltd1/f;", "()Ltd1/f;", "Lca2/a;", "()Lca2/a;", "k", "j", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32702a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isBluetoothOff;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean networkDisconnected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isConnected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int chargePercent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isCharging;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC33708f strapStatus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C4361a dataCatchingUpDomainResult;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isOffBody;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isConnectivityIndicatorVisible;

    public C32702a(boolean z4, boolean z13, boolean z14, int i13, boolean z15, EnumC33708f strapStatus, C4361a dataCatchingUpDomainResult, boolean z16, boolean z17) {
        AbstractC22676k.m65750j(strapStatus, "strapStatus");
        AbstractC22676k.m65750j(dataCatchingUpDomainResult, "dataCatchingUpDomainResult");
        this.isBluetoothOff = z4;
        this.networkDisconnected = z13;
        this.isConnected = z14;
        this.chargePercent = i13;
        this.isCharging = z15;
        this.strapStatus = strapStatus;
        this.dataCatchingUpDomainResult = dataCatchingUpDomainResult;
        this.isOffBody = z16;
        this.isConnectivityIndicatorVisible = z17;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32702a m102626b(C32702a c32702a, boolean z4, boolean z13, boolean z14, int i13, boolean z15, EnumC33708f enumC33708f, C4361a c4361a, boolean z16, boolean z17, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z4 = c32702a.isBluetoothOff;
        }
        if ((i14 & 2) != 0) {
            z13 = c32702a.networkDisconnected;
        }
        if ((i14 & 4) != 0) {
            z14 = c32702a.isConnected;
        }
        if ((i14 & 8) != 0) {
            i13 = c32702a.chargePercent;
        }
        if ((i14 & 16) != 0) {
            z15 = c32702a.isCharging;
        }
        if ((i14 & 32) != 0) {
            enumC33708f = c32702a.strapStatus;
        }
        if ((i14 & 64) != 0) {
            c4361a = c32702a.dataCatchingUpDomainResult;
        }
        if ((i14 & 128) != 0) {
            z16 = c32702a.isOffBody;
        }
        if ((i14 & 256) != 0) {
            z17 = c32702a.isConnectivityIndicatorVisible;
        }
        boolean z18 = z16;
        boolean z19 = z17;
        EnumC33708f enumC33708f2 = enumC33708f;
        C4361a c4361a2 = c4361a;
        boolean z24 = z15;
        boolean z25 = z14;
        return c32702a.m102627a(z4, z13, z25, i13, z24, enumC33708f2, c4361a2, z18, z19);
    }

    /* JADX INFO: renamed from: a */
    public final C32702a m102627a(boolean isBluetoothOff, boolean networkDisconnected, boolean isConnected, int chargePercent, boolean isCharging, EnumC33708f strapStatus, C4361a dataCatchingUpDomainResult, boolean isOffBody, boolean isConnectivityIndicatorVisible) {
        AbstractC22676k.m65750j(strapStatus, "strapStatus");
        AbstractC22676k.m65750j(dataCatchingUpDomainResult, "dataCatchingUpDomainResult");
        return new C32702a(isBluetoothOff, networkDisconnected, isConnected, chargePercent, isCharging, strapStatus, dataCatchingUpDomainResult, isOffBody, isConnectivityIndicatorVisible);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getChargePercent() {
        return this.chargePercent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C4361a getDataCatchingUpDomainResult() {
        return this.dataCatchingUpDomainResult;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getNetworkDisconnected() {
        return this.networkDisconnected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32702a)) {
            return false;
        }
        C32702a c32702a = (C32702a) other;
        return this.isBluetoothOff == c32702a.isBluetoothOff && this.networkDisconnected == c32702a.networkDisconnected && this.isConnected == c32702a.isConnected && this.chargePercent == c32702a.chargePercent && this.isCharging == c32702a.isCharging && this.strapStatus == c32702a.strapStatus && AbstractC22676k.m65745e(this.dataCatchingUpDomainResult, c32702a.dataCatchingUpDomainResult) && this.isOffBody == c32702a.isOffBody && this.isConnectivityIndicatorVisible == c32702a.isConnectivityIndicatorVisible;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC33708f getStrapStatus() {
        return this.strapStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsBluetoothOff() {
        return this.isBluetoothOff;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isConnectivityIndicatorVisible) + AbstractC2875y.m8289b((this.dataCatchingUpDomainResult.hashCode() + ((this.strapStatus.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.chargePercent, AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isBluetoothOff) * 31, 31, this.networkDisconnected), 31, this.isConnected), 31), 31, this.isCharging)) * 31)) * 31, 31, this.isOffBody);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsConnectivityIndicatorVisible() {
        return this.isConnectivityIndicatorVisible;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsOffBody() {
        return this.isOffBody;
    }

    public String toString() {
        boolean z4 = this.isBluetoothOff;
        boolean z13 = this.networkDisconnected;
        boolean z14 = this.isConnected;
        int i13 = this.chargePercent;
        boolean z15 = this.isCharging;
        EnumC33708f enumC33708f = this.strapStatus;
        C4361a c4361a = this.dataCatchingUpDomainResult;
        boolean z16 = this.isOffBody;
        boolean z17 = this.isConnectivityIndicatorVisible;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ConnectivityIndicatorDomainResult(isBluetoothOff=", ", networkDisconnected=", ", isConnected=", z4, z13);
        AbstractC30802r.m94769r(i13, ", chargePercent=", ", isCharging=", sbM32002u, z14);
        sbM32002u.append(z15);
        sbM32002u.append(", strapStatus=");
        sbM32002u.append(enumC33708f);
        sbM32002u.append(", dataCatchingUpDomainResult=");
        sbM32002u.append(c4361a);
        sbM32002u.append(", isOffBody=");
        sbM32002u.append(z16);
        sbM32002u.append(", isConnectivityIndicatorVisible=");
        return AbstractC18489d0.m53372m(sbM32002u, z17, ")");
    }

    public /* synthetic */ C32702a(boolean z4, boolean z13, boolean z14, int i13, boolean z15, EnumC33708f enumC33708f, C4361a c4361a, boolean z16, boolean z17, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? false : z4, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? EnumC33708f.NA : enumC33708f, c4361a, (i14 & 128) != 0 ? false : z16, (i14 & 256) != 0 ? false : z17);
    }
}
