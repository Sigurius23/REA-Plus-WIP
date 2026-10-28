package cu0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: cu0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\"\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001e\u0010!¨\u0006#"}, m65681d2 = {"Lcu0/a;", "", "", "hardwareVersion", "maximVersion", "dspVersion", "strapId", "", "binaryVersion", "binaryFlags", "rawDataVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "e", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "f", "g", "", "S", "()S", "revision", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11113a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String hardwareVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String maximVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String dspVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String strapId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int binaryVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int binaryFlags;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String rawDataVersion;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final short revision;

    public C11113a(String hardwareVersion, String maximVersion, String dspVersion, String strapId, int i13, int i14, String rawDataVersion) {
        AbstractC22676k.m65750j(hardwareVersion, "hardwareVersion");
        AbstractC22676k.m65750j(maximVersion, "maximVersion");
        AbstractC22676k.m65750j(dspVersion, "dspVersion");
        AbstractC22676k.m65750j(strapId, "strapId");
        AbstractC22676k.m65750j(rawDataVersion, "rawDataVersion");
        this.hardwareVersion = hardwareVersion;
        this.maximVersion = maximVersion;
        this.dspVersion = dspVersion;
        this.strapId = strapId;
        this.binaryVersion = i13;
        this.binaryFlags = i14;
        this.rawDataVersion = rawDataVersion;
        this.revision = Short.parseShort(AbstractC39414r.m125878W(1, rawDataVersion));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBinaryFlags() {
        return this.binaryFlags;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBinaryVersion() {
        return this.binaryVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDspVersion() {
        return this.dspVersion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMaximVersion() {
        return this.maximVersion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11113a)) {
            return false;
        }
        C11113a c11113a = (C11113a) other;
        return AbstractC22676k.m65745e(this.hardwareVersion, c11113a.hardwareVersion) && AbstractC22676k.m65745e(this.maximVersion, c11113a.maximVersion) && AbstractC22676k.m65745e(this.dspVersion, c11113a.dspVersion) && AbstractC22676k.m65745e(this.strapId, c11113a.strapId) && this.binaryVersion == c11113a.binaryVersion && this.binaryFlags == c11113a.binaryFlags && AbstractC22676k.m65745e(this.rawDataVersion, c11113a.rawDataVersion);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRawDataVersion() {
        return this.rawDataVersion;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final short getRevision() {
        return this.revision;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStrapId() {
        return this.strapId;
    }

    public int hashCode() {
        return this.rawDataVersion.hashCode() + AbstractC11266d.m30448b(this.binaryFlags, AbstractC11266d.m30448b(this.binaryVersion, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.hardwareVersion.hashCode() * 31, 31, this.maximVersion), 31, this.dspVersion), 31, this.strapId), 31), 31);
    }

    public String toString() {
        String str = this.hardwareVersion;
        String str2 = this.maximVersion;
        String str3 = this.dspVersion;
        String str4 = this.strapId;
        int i13 = this.binaryVersion;
        int i14 = this.binaryFlags;
        String str5 = this.rawDataVersion;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RawDataMetadata(hardwareVersion=", str, ", maximVersion=", str2, ", dspVersion=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", strapId=", str4, ", binaryVersion=");
        AbstractC30802r.m94773v(sbM32001t, i13, ", binaryFlags=", i14, ", rawDataVersion=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }
}
