package lu0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import oh2.InterfaceC27939b;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lu0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001f\u0012\u0004\b(\u0010)\u001a\u0004\b%\u0010\u0019R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001f\u0012\u0004\b+\u0010)\u001a\u0004\b'\u0010\u0019R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\u001f\u0012\u0004\b-\u0010)\u001a\u0004\b#\u0010\u0019R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001f\u0012\u0004\b.\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b,\u00100R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b1\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b!\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00105\u001a\u0004\b4\u0010\u0017¨\u00066"}, m65681d2 = {"Llu0/c;", "", "", "versionId", "hardwareFamily", "pcbaRevision", "opticalRevision", "firmwareMajor", "firmwareMinor", "firmwareBuild", "firmwareUnreleased", "Loh2/b;", "firmwareVersion", "sigProcMajor", "sigProcMinor", "sigProcPatch", "binaryVersion", "binaryFlags", "", "strapId", "<init>", "(IIIIIIIILoh2/b;IIIIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "o", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "j", "d", "i", "e", "getFirmwareMajor$annotations", "()V", "f", "getFirmwareMinor$annotations", "g", "getFirmwareBuild$annotations", "getFirmwareUnreleased$annotations", "Loh2/b;", "()Loh2/b;", "k", "l", "m", "n", "Ljava/lang/String;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24747c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int versionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int hardwareFamily;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pcbaRevision;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int opticalRevision;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int firmwareMajor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int firmwareMinor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int firmwareBuild;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int firmwareUnreleased;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC27939b firmwareVersion;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int sigProcMajor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int sigProcMinor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int sigProcPatch;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int binaryVersion;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int binaryFlags;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String strapId;

    public C24747c(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, InterfaceC27939b firmwareVersion, int i25, int i26, int i27, int i28, int i29, String strapId) {
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        AbstractC22676k.m65750j(strapId, "strapId");
        this.versionId = i13;
        this.hardwareFamily = i14;
        this.pcbaRevision = i15;
        this.opticalRevision = i16;
        this.firmwareMajor = i17;
        this.firmwareMinor = i18;
        this.firmwareBuild = i19;
        this.firmwareUnreleased = i24;
        this.firmwareVersion = firmwareVersion;
        this.sigProcMajor = i25;
        this.sigProcMinor = i26;
        this.sigProcPatch = i27;
        this.binaryVersion = i28;
        this.binaryFlags = i29;
        this.strapId = strapId;
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
    public final int getFirmwareBuild() {
        return this.firmwareBuild;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFirmwareMajor() {
        return this.firmwareMajor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFirmwareMinor() {
        return this.firmwareMinor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24747c)) {
            return false;
        }
        C24747c c24747c = (C24747c) other;
        return this.versionId == c24747c.versionId && this.hardwareFamily == c24747c.hardwareFamily && this.pcbaRevision == c24747c.pcbaRevision && this.opticalRevision == c24747c.opticalRevision && this.firmwareMajor == c24747c.firmwareMajor && this.firmwareMinor == c24747c.firmwareMinor && this.firmwareBuild == c24747c.firmwareBuild && this.firmwareUnreleased == c24747c.firmwareUnreleased && AbstractC22676k.m65745e(this.firmwareVersion, c24747c.firmwareVersion) && this.sigProcMajor == c24747c.sigProcMajor && this.sigProcMinor == c24747c.sigProcMinor && this.sigProcPatch == c24747c.sigProcPatch && this.binaryVersion == c24747c.binaryVersion && this.binaryFlags == c24747c.binaryFlags && AbstractC22676k.m65745e(this.strapId, c24747c.strapId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getFirmwareUnreleased() {
        return this.firmwareUnreleased;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC27939b getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getHardwareFamily() {
        return this.hardwareFamily;
    }

    public int hashCode() {
        return this.strapId.hashCode() + AbstractC11266d.m30448b(this.binaryFlags, AbstractC11266d.m30448b(this.binaryVersion, AbstractC11266d.m30448b(this.sigProcPatch, AbstractC11266d.m30448b(this.sigProcMinor, AbstractC11266d.m30448b(this.sigProcMajor, (this.firmwareVersion.hashCode() + AbstractC11266d.m30448b(this.firmwareUnreleased, AbstractC11266d.m30448b(this.firmwareBuild, AbstractC11266d.m30448b(this.firmwareMinor, AbstractC11266d.m30448b(this.firmwareMajor, AbstractC11266d.m30448b(this.opticalRevision, AbstractC11266d.m30448b(this.pcbaRevision, AbstractC11266d.m30448b(this.hardwareFamily, Integer.hashCode(this.versionId) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getOpticalRevision() {
        return this.opticalRevision;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getPcbaRevision() {
        return this.pcbaRevision;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSigProcMajor() {
        return this.sigProcMajor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getSigProcMinor() {
        return this.sigProcMinor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getSigProcPatch() {
        return this.sigProcPatch;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getStrapId() {
        return this.strapId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getVersionId() {
        return this.versionId;
    }

    public String toString() {
        int i13 = this.versionId;
        int i14 = this.hardwareFamily;
        int i15 = this.pcbaRevision;
        int i16 = this.opticalRevision;
        int i17 = this.firmwareMajor;
        int i18 = this.firmwareMinor;
        int i19 = this.firmwareBuild;
        int i24 = this.firmwareUnreleased;
        InterfaceC27939b interfaceC27939b = this.firmwareVersion;
        int i25 = this.sigProcMajor;
        int i26 = this.sigProcMinor;
        int i27 = this.sigProcPatch;
        int i28 = this.binaryVersion;
        int i29 = this.binaryFlags;
        String str = this.strapId;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "StrapMetadataDto(versionId=", ", hardwareFamily=", ", pcbaRevision=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", opticalRevision=", i16, ", firmwareMajor=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", firmwareMinor=", i18, ", firmwareBuild=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", firmwareUnreleased=", i24, ", firmwareVersion=");
        sbM30465s.append(interfaceC27939b);
        sbM30465s.append(", sigProcMajor=");
        sbM30465s.append(i25);
        sbM30465s.append(", sigProcMinor=");
        AbstractC30802r.m94773v(sbM30465s, i26, ", sigProcPatch=", i27, ", binaryVersion=");
        AbstractC30802r.m94773v(sbM30465s, i28, ", binaryFlags=", i29, ", strapId=");
        return AbstractC25012a.m73376i(str, ")", sbM30465s);
    }

    public /* synthetic */ C24747c(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, InterfaceC27939b interfaceC27939b, int i25, int i26, int i27, int i28, int i29, String str, int i34, DefaultConstructorMarker defaultConstructorMarker) {
        this((i34 & 1) != 0 ? 0 : i13, i14, i15, i16, i17, i18, i19, i24, interfaceC27939b, i25, i26, i27, i28, i29, str);
    }
}
