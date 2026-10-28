package iw0;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33210q;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: iw0.d0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b\u001f\u0010+R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b'\u0010+R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010+R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b/\u0010+R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010+R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b1\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b,\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b-\u0010+R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b%\u00104¨\u00065"}, m65681d2 = {"Liw0/d0;", "", "Lsz0/q;", "tonnageStat", "intensityStat", "repsStat", "", "Liw0/y;", "exerciseCardGroups", "Lcom/whoop/design/util/TextResource;", "avgHrTitleDisplay", "hrUnitsDisplay", "repsTitleDisplay", "titleDisplay", "tonnageUnitsDisplay", "weightTitleDisplay", "oneRepMaxIntensityTitleDisplay", "oneRepMaxIntensityUnitDisplay", "", "hasSessionIntensity", "<init>", "(Lsz0/q;Lsz0/q;Lsz0/q;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q;", "j", "()Lsz0/q;", "b", "e", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "f", "g", "getRepsTitleDisplay", "i", "k", "l", "m", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20964d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33210q tonnageStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C33210q intensityStat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33210q repsStat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C20993y> exerciseCardGroups;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource avgHrTitleDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource hrUnitsDisplay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource repsTitleDisplay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource tonnageUnitsDisplay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource weightTitleDisplay;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource oneRepMaxIntensityTitleDisplay;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource oneRepMaxIntensityUnitDisplay;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean hasSessionIntensity;

    public C20964d0(C33210q tonnageStat, C33210q c33210q, C33210q repsStat, List<C20993y> exerciseCardGroups, TextResource avgHrTitleDisplay, TextResource hrUnitsDisplay, TextResource repsTitleDisplay, TextResource titleDisplay, TextResource tonnageUnitsDisplay, TextResource weightTitleDisplay, TextResource textResource, TextResource textResource2, boolean z4) {
        AbstractC22676k.m65750j(tonnageStat, "tonnageStat");
        AbstractC22676k.m65750j(repsStat, "repsStat");
        AbstractC22676k.m65750j(exerciseCardGroups, "exerciseCardGroups");
        AbstractC22676k.m65750j(avgHrTitleDisplay, "avgHrTitleDisplay");
        AbstractC22676k.m65750j(hrUnitsDisplay, "hrUnitsDisplay");
        AbstractC22676k.m65750j(repsTitleDisplay, "repsTitleDisplay");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tonnageUnitsDisplay, "tonnageUnitsDisplay");
        AbstractC22676k.m65750j(weightTitleDisplay, "weightTitleDisplay");
        this.tonnageStat = tonnageStat;
        this.intensityStat = c33210q;
        this.repsStat = repsStat;
        this.exerciseCardGroups = exerciseCardGroups;
        this.avgHrTitleDisplay = avgHrTitleDisplay;
        this.hrUnitsDisplay = hrUnitsDisplay;
        this.repsTitleDisplay = repsTitleDisplay;
        this.titleDisplay = titleDisplay;
        this.tonnageUnitsDisplay = tonnageUnitsDisplay;
        this.weightTitleDisplay = weightTitleDisplay;
        this.oneRepMaxIntensityTitleDisplay = textResource;
        this.oneRepMaxIntensityUnitDisplay = textResource2;
        this.hasSessionIntensity = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getAvgHrTitleDisplay() {
        return this.avgHrTitleDisplay;
    }

    /* JADX INFO: renamed from: b */
    public final List<C20993y> m58264b() {
        return this.exerciseCardGroups;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasSessionIntensity() {
        return this.hasSessionIntensity;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getHrUnitsDisplay() {
        return this.hrUnitsDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C33210q getIntensityStat() {
        return this.intensityStat;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20964d0)) {
            return false;
        }
        C20964d0 c20964d0 = (C20964d0) other;
        return AbstractC22676k.m65745e(this.tonnageStat, c20964d0.tonnageStat) && AbstractC22676k.m65745e(this.intensityStat, c20964d0.intensityStat) && AbstractC22676k.m65745e(this.repsStat, c20964d0.repsStat) && AbstractC22676k.m65745e(this.exerciseCardGroups, c20964d0.exerciseCardGroups) && AbstractC22676k.m65745e(this.avgHrTitleDisplay, c20964d0.avgHrTitleDisplay) && AbstractC22676k.m65745e(this.hrUnitsDisplay, c20964d0.hrUnitsDisplay) && AbstractC22676k.m65745e(this.repsTitleDisplay, c20964d0.repsTitleDisplay) && AbstractC22676k.m65745e(this.titleDisplay, c20964d0.titleDisplay) && AbstractC22676k.m65745e(this.tonnageUnitsDisplay, c20964d0.tonnageUnitsDisplay) && AbstractC22676k.m65745e(this.weightTitleDisplay, c20964d0.weightTitleDisplay) && AbstractC22676k.m65745e(this.oneRepMaxIntensityTitleDisplay, c20964d0.oneRepMaxIntensityTitleDisplay) && AbstractC22676k.m65745e(this.oneRepMaxIntensityUnitDisplay, c20964d0.oneRepMaxIntensityUnitDisplay) && this.hasSessionIntensity == c20964d0.hasSessionIntensity;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getOneRepMaxIntensityTitleDisplay() {
        return this.oneRepMaxIntensityTitleDisplay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getOneRepMaxIntensityUnitDisplay() {
        return this.oneRepMaxIntensityUnitDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C33210q getRepsStat() {
        return this.repsStat;
    }

    public int hashCode() {
        int iHashCode = this.tonnageStat.hashCode() * 31;
        C33210q c33210q = this.intensityStat;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b((this.repsStat.hashCode() + ((iHashCode + (c33210q == null ? 0 : c33210q.hashCode())) * 31)) * 31, 31, this.exerciseCardGroups), this.avgHrTitleDisplay, 31), this.hrUnitsDisplay, 31), this.repsTitleDisplay, 31), this.titleDisplay, 31), this.tonnageUnitsDisplay, 31), this.weightTitleDisplay, 31);
        TextResource textResource = this.oneRepMaxIntensityTitleDisplay;
        int iHashCode2 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.oneRepMaxIntensityUnitDisplay;
        return Boolean.hashCode(this.hasSessionIntensity) + ((iHashCode2 + (textResource2 != null ? textResource2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C33210q getTonnageStat() {
        return this.tonnageStat;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getTonnageUnitsDisplay() {
        return this.tonnageUnitsDisplay;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getWeightTitleDisplay() {
        return this.weightTitleDisplay;
    }

    public String toString() {
        C33210q c33210q = this.tonnageStat;
        C33210q c33210q2 = this.intensityStat;
        C33210q c33210q3 = this.repsStat;
        List<C20993y> list = this.exerciseCardGroups;
        TextResource textResource = this.avgHrTitleDisplay;
        TextResource textResource2 = this.hrUnitsDisplay;
        TextResource textResource3 = this.repsTitleDisplay;
        TextResource textResource4 = this.titleDisplay;
        TextResource textResource5 = this.tonnageUnitsDisplay;
        TextResource textResource6 = this.weightTitleDisplay;
        TextResource textResource7 = this.oneRepMaxIntensityTitleDisplay;
        TextResource textResource8 = this.oneRepMaxIntensityUnitDisplay;
        boolean z4 = this.hasSessionIntensity;
        StringBuilder sb4 = new StringBuilder("ExerciseSummary(tonnageStat=");
        sb4.append(c33210q);
        sb4.append(", intensityStat=");
        sb4.append(c33210q2);
        sb4.append(", repsStat=");
        sb4.append(c33210q3);
        sb4.append(", exerciseCardGroups=");
        sb4.append(list);
        sb4.append(", avgHrTitleDisplay=");
        AbstractC30007c.m91855y(sb4, textResource, ", hrUnitsDisplay=", textResource2, ", repsTitleDisplay=");
        AbstractC30007c.m91855y(sb4, textResource3, ", titleDisplay=", textResource4, ", tonnageUnitsDisplay=");
        AbstractC30007c.m91855y(sb4, textResource5, ", weightTitleDisplay=", textResource6, ", oneRepMaxIntensityTitleDisplay=");
        AbstractC30007c.m91855y(sb4, textResource7, ", oneRepMaxIntensityUnitDisplay=", textResource8, ", hasSessionIntensity=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
