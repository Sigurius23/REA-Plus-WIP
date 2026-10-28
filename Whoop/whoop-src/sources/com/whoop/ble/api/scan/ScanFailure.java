package com.whoop.ble.api.scan;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\t\n\u000b\f\r\u000eB\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/ble/api/scan/ScanFailure;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "BluetoothUnsupported", "BluetoothOff", "PermissionDenied", "LocationServicesOff", "Rejected", "Unexpected", "Lcom/whoop/ble/api/scan/ScanFailure$BluetoothOff;", "Lcom/whoop/ble/api/scan/ScanFailure$BluetoothUnsupported;", "Lcom/whoop/ble/api/scan/ScanFailure$LocationServicesOff;", "Lcom/whoop/ble/api/scan/ScanFailure$PermissionDenied;", "Lcom/whoop/ble/api/scan/ScanFailure$Rejected;", "Lcom/whoop/ble/api/scan/ScanFailure$Unexpected;", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class ScanFailure extends Exception {

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m65681d2 = {"Lcom/whoop/ble/api/scan/ScanFailure$BluetoothOff;", "Lcom/whoop/ble/api/scan/ScanFailure;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class BluetoothOff extends ScanFailure {

        /* JADX INFO: renamed from: w */
        public static final BluetoothOff f24067w = new BluetoothOff();

        /* JADX WARN: Multi-variable type inference failed */
        private BluetoothOff() {
            super("Scan failed (BluetoothOff)", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BluetoothOff);
        }

        public int hashCode() {
            return -54819760;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BluetoothOff";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m65681d2 = {"Lcom/whoop/ble/api/scan/ScanFailure$BluetoothUnsupported;", "Lcom/whoop/ble/api/scan/ScanFailure;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class BluetoothUnsupported extends ScanFailure {

        /* JADX INFO: renamed from: w */
        public static final BluetoothUnsupported f24068w = new BluetoothUnsupported();

        /* JADX WARN: Multi-variable type inference failed */
        private BluetoothUnsupported() {
            super("Scan failed (BluetoothUnsupported)", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BluetoothUnsupported);
        }

        public int hashCode() {
            return -1148221418;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BluetoothUnsupported";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m65681d2 = {"Lcom/whoop/ble/api/scan/ScanFailure$LocationServicesOff;", "Lcom/whoop/ble/api/scan/ScanFailure;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class LocationServicesOff extends ScanFailure {

        /* JADX INFO: renamed from: w */
        public static final LocationServicesOff f24069w = new LocationServicesOff();

        /* JADX WARN: Multi-variable type inference failed */
        private LocationServicesOff() {
            super("Scan failed (LocationServicesOff)", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LocationServicesOff);
        }

        public int hashCode() {
            return 556118509;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "LocationServicesOff";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m65681d2 = {"Lcom/whoop/ble/api/scan/ScanFailure$PermissionDenied;", "Lcom/whoop/ble/api/scan/ScanFailure;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PermissionDenied extends ScanFailure {

        /* JADX INFO: renamed from: w */
        public static final PermissionDenied f24070w = new PermissionDenied();

        /* JADX WARN: Multi-variable type inference failed */
        private PermissionDenied() {
            super("Scan failed (PermissionDenied)", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PermissionDenied);
        }

        public int hashCode() {
            return -1786134727;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PermissionDenied";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/ble/api/scan/ScanFailure$Rejected;", "Lcom/whoop/ble/api/scan/ScanFailure;", "", "code", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "a", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Rejected extends ScanFailure {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final int code;

        /* JADX WARN: Multi-variable type inference failed */
        public Rejected(int i13) {
            super(AbstractC2875y.m8296i(i13, "Scan failed (Rejected ", ")"), null, 2, 0 == true ? 1 : 0);
            this.code = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Rejected) && this.code == ((Rejected) other).code;
        }

        public int hashCode() {
            return Integer.hashCode(this.code);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return AbstractC2875y.m8296i(this.code, "Rejected(code=", ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/ble/api/scan/ScanFailure$Unexpected;", "Lcom/whoop/ble/api/scan/ScanFailure;", "", "underlying", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Throwable;", "getUnderlying", "()Ljava/lang/Throwable;", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Unexpected extends ScanFailure {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final Throwable underlying;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unexpected(Throwable underlying) {
            super("Scan failed (Unexpected)", underlying, null);
            AbstractC22676k.m65750j(underlying, "underlying");
            this.underlying = underlying;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unexpected) && AbstractC22676k.m65745e(this.underlying, ((Unexpected) other).underlying);
        }

        public int hashCode() {
            return this.underlying.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return AbstractC36095b.m114681i("Unexpected(underlying=", ")", this.underlying);
        }
    }

    public /* synthetic */ ScanFailure(String str, Throwable th3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th3);
    }

    private ScanFailure(String str, Throwable th3) {
        super(str, th3);
    }

    public /* synthetic */ ScanFailure(String str, Throwable th3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : th3, null);
    }
}
