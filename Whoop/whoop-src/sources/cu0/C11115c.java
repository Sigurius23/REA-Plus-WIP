package cu0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cu0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Lcu0/c;", "", "", "hardwareVersion", "maximVersion", "sigProcVersion", "serialNumber", "", "binaryVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "e", "d", "I", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11115c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String hardwareVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String maximVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String sigProcVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String serialNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int binaryVersion;

    public C11115c(String hardwareVersion, String maximVersion, String str, String serialNumber, int i13) {
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(serialNumber, "serialNumber");
        this.hardwareVersion = hardwareVersion;
        this.maximVersion = maximVersion;
        this.sigProcVersion = str;
        this.serialNumber = serialNumber;
        this.binaryVersion = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBinaryVersion() {
        return this.binaryVersion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMaximVersion() {
        return this.maximVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSigProcVersion() {
        return this.sigProcVersion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11115c)) {
            return false;
        }
        C11115c c11115c = (C11115c) other;
        return AbstractC22676k.m65745e(this.hardwareVersion, c11115c.hardwareVersion) && AbstractC22676k.m65745e(this.maximVersion, c11115c.maximVersion) && AbstractC22676k.m65745e(this.sigProcVersion, c11115c.sigProcVersion) && AbstractC22676k.m65745e(this.serialNumber, c11115c.serialNumber) && this.binaryVersion == c11115c.binaryVersion;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.hardwareVersion.hashCode() * 31, 31, this.maximVersion);
        String str = this.sigProcVersion;
        return Integer.hashCode(this.binaryVersion) + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.serialNumber);
    }

    public String toString() {
        String str = this.hardwareVersion;
        String str2 = this.maximVersion;
        String str3 = this.sigProcVersion;
        String str4 = this.serialNumber;
        int i13 = this.binaryVersion;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RawDataStrapInfo(hardwareVersion=", str, ", maximVersion=", str2, ", sigProcVersion=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", serialNumber=", str4, ", binaryVersion=");
        return AbstractC18489d0.m53371l(sbM32001t, i13, ")");
    }
}
