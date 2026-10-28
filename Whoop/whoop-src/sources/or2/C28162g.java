package or2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: or2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b \b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001\u001cB\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b)\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b\r\u0010!R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b$\u0010-R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b\"\u0010\u0016¨\u00060"}, m65681d2 = {"Lor2/g;", "", "", "applicationId", "", "debuggable", "buildType", "buildFlavor", "", "sdkInt", "release", "brand", "model", "isPlayStoreBuild", "versionName", "versionCode", "", "buildEpochMillis", "buildDistribution", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IJLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "g", "()Z", "c", "f", "d", "e", "I", "j", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "l", "k", "J", "()J", "m", "n", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28162g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String applicationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean debuggable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String buildType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String buildFlavor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int sdkInt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String release;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String brand;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String model;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isPlayStoreBuild;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String versionName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int versionCode;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long buildEpochMillis;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String buildDistribution;

    public C28162g(String applicationId, boolean z4, String buildType, String buildFlavor, int i13, String release, String brand, String model, boolean z13, String versionName, int i14, long j7, String buildDistribution) {
        AbstractC22676k.m65750j(applicationId, "applicationId");
        AbstractC22676k.m65750j(buildType, "buildType");
        AbstractC22676k.m65750j(buildFlavor, "buildFlavor");
        AbstractC22676k.m65750j(release, "release");
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(versionName, "versionName");
        AbstractC22676k.m65750j(buildDistribution, "buildDistribution");
        this.applicationId = applicationId;
        this.debuggable = z4;
        this.buildType = buildType;
        this.buildFlavor = buildFlavor;
        this.sdkInt = i13;
        this.release = release;
        this.brand = brand;
        this.model = model;
        this.isPlayStoreBuild = z13;
        this.versionName = versionName;
        this.versionCode = i14;
        this.buildEpochMillis = j7;
        this.buildDistribution = buildDistribution;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBuildDistribution() {
        return this.buildDistribution;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getBuildEpochMillis() {
        return this.buildEpochMillis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBuildFlavor() {
        return this.buildFlavor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28162g)) {
            return false;
        }
        C28162g c28162g = (C28162g) other;
        return AbstractC22676k.m65745e(this.applicationId, c28162g.applicationId) && this.debuggable == c28162g.debuggable && AbstractC22676k.m65745e(this.buildType, c28162g.buildType) && AbstractC22676k.m65745e(this.buildFlavor, c28162g.buildFlavor) && this.sdkInt == c28162g.sdkInt && AbstractC22676k.m65745e(this.release, c28162g.release) && AbstractC22676k.m65745e(this.brand, c28162g.brand) && AbstractC22676k.m65745e(this.model, c28162g.model) && this.isPlayStoreBuild == c28162g.isPlayStoreBuild && AbstractC22676k.m65745e(this.versionName, c28162g.versionName) && this.versionCode == c28162g.versionCode && this.buildEpochMillis == c28162g.buildEpochMillis && AbstractC22676k.m65745e(this.buildDistribution, c28162g.buildDistribution);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBuildType() {
        return this.buildType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDebuggable() {
        return this.debuggable;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return this.buildDistribution.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.versionCode, AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.sdkInt, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(this.applicationId.hashCode() * 31, 31, this.debuggable), 31, this.buildType), 31, this.buildFlavor), 31), 31, this.release), 31, this.brand), 31, this.model), 31, this.isPlayStoreBuild), 31, this.versionName), 31), this.buildEpochMillis, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRelease() {
        return this.release;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSdkInt() {
        return this.sdkInt;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    public String toString() {
        String str = this.applicationId;
        boolean z4 = this.debuggable;
        String str2 = this.buildType;
        String str3 = this.buildFlavor;
        int i13 = this.sdkInt;
        String str4 = this.release;
        String str5 = this.brand;
        String str6 = this.model;
        boolean z13 = this.isPlayStoreBuild;
        String str7 = this.versionName;
        int i14 = this.versionCode;
        long j7 = this.buildEpochMillis;
        String str8 = this.buildDistribution;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("BuildConfigProvider(applicationId=", str, ", debuggable=", ", buildType=", z4);
        AbstractC11266d.m30444B(sbM73379l, str2, ", buildFlavor=", str3, ", sdkInt=");
        AbstractC11895b.m31979B(i13, ", release=", str4, ", brand=", sbM73379l);
        AbstractC11266d.m30444B(sbM73379l, str5, ", model=", str6, ", isPlayStoreBuild=");
        AbstractC38963t7.m124391u(sbM73379l, z13, ", versionName=", str7, ", versionCode=");
        sbM73379l.append(i14);
        sbM73379l.append(", buildEpochMillis=");
        sbM73379l.append(j7);
        return AbstractC2875y.m8304q(sbM73379l, ", buildDistribution=", str8, ")");
    }

    public /* synthetic */ C28162g(String str, boolean z4, String str2, String str3, int i13, String str4, String str5, String str6, boolean z13, String str7, int i14, long j7, String str8, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? false : z4, (i15 & 4) != 0 ? "" : str2, (i15 & 8) != 0 ? "" : str3, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? "" : str4, (i15 & 64) != 0 ? "" : str5, (i15 & 128) != 0 ? "" : str6, (i15 & 256) != 0 ? false : z13, (i15 & 512) != 0 ? "" : str7, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? i14 : 0, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? 0L : j7, (i15 & 4096) != 0 ? "" : str8);
    }
}
