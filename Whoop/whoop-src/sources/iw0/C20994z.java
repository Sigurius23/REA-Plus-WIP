package iw0;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33210q;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: iw0.z */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b'\u0010.R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b%\u0010\u0017¨\u00064"}, m65681d2 = {"Liw0/z;", "", "", "", "achievementIconResources", "endIconResource", "", "exerciseId", "Liw0/i0;", "heartRateTimeline", "Lcom/whoop/design/util/TextResource;", "subtitleDisplay", "titleDisplay", "Lsz0/q;", "tonnageStat", "intensityStat", "volumeStat", "", "isFullWorkoutSummary", "imageUrl", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/q;Lsz0/q;Lsz0/q;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "d", "getHeartRateTimeline", "e", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "g", "Lsz0/q;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lsz0/q;", "i", "j", "Z", "()Z", "k", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20994z {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Integer> achievementIconResources;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer endIconResource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String exerciseId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C20974i0> heartRateTimeline;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource subtitleDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C33210q tonnageStat;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C33210q intensityStat;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C33210q volumeStat;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isFullWorkoutSummary;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String imageUrl;

    public C20994z(List<Integer> achievementIconResources, Integer num, String str, List<C20974i0> heartRateTimeline, TextResource subtitleDisplay, TextResource titleDisplay, C33210q tonnageStat, C33210q c33210q, C33210q volumeStat, boolean z4, String str2) {
        AbstractC22676k.m65750j(achievementIconResources, "achievementIconResources");
        AbstractC22676k.m65750j(heartRateTimeline, "heartRateTimeline");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(tonnageStat, "tonnageStat");
        AbstractC22676k.m65750j(volumeStat, "volumeStat");
        this.achievementIconResources = achievementIconResources;
        this.endIconResource = num;
        this.exerciseId = str;
        this.heartRateTimeline = heartRateTimeline;
        this.subtitleDisplay = subtitleDisplay;
        this.titleDisplay = titleDisplay;
        this.tonnageStat = tonnageStat;
        this.intensityStat = c33210q;
        this.volumeStat = volumeStat;
        this.isFullWorkoutSummary = z4;
        this.imageUrl = str2;
    }

    /* JADX INFO: renamed from: a */
    public final List<Integer> m58485a() {
        return this.achievementIconResources;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getEndIconResource() {
        return this.endIconResource;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C33210q getIntensityStat() {
        return this.intensityStat;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20994z)) {
            return false;
        }
        C20994z c20994z = (C20994z) other;
        return AbstractC22676k.m65745e(this.achievementIconResources, c20994z.achievementIconResources) && AbstractC22676k.m65745e(this.endIconResource, c20994z.endIconResource) && AbstractC22676k.m65745e(this.exerciseId, c20994z.exerciseId) && AbstractC22676k.m65745e(this.heartRateTimeline, c20994z.heartRateTimeline) && AbstractC22676k.m65745e(this.subtitleDisplay, c20994z.subtitleDisplay) && AbstractC22676k.m65745e(this.titleDisplay, c20994z.titleDisplay) && AbstractC22676k.m65745e(this.tonnageStat, c20994z.tonnageStat) && AbstractC22676k.m65745e(this.intensityStat, c20994z.intensityStat) && AbstractC22676k.m65745e(this.volumeStat, c20994z.volumeStat) && this.isFullWorkoutSummary == c20994z.isFullWorkoutSummary && AbstractC22676k.m65745e(this.imageUrl, c20994z.imageUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C33210q getTonnageStat() {
        return this.tonnageStat;
    }

    public int hashCode() {
        int iHashCode = this.achievementIconResources.hashCode() * 31;
        Integer num = this.endIconResource;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.exerciseId;
        int iHashCode3 = (this.tonnageStat.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.heartRateTimeline), this.subtitleDisplay, 31), this.titleDisplay, 31)) * 31;
        C33210q c33210q = this.intensityStat;
        int iM8289b = AbstractC2875y.m8289b((this.volumeStat.hashCode() + ((iHashCode3 + (c33210q == null ? 0 : c33210q.hashCode())) * 31)) * 31, 31, this.isFullWorkoutSummary);
        String str2 = this.imageUrl;
        return iM8289b + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C33210q getVolumeStat() {
        return this.volumeStat;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsFullWorkoutSummary() {
        return this.isFullWorkoutSummary;
    }

    public String toString() {
        List<Integer> list = this.achievementIconResources;
        Integer num = this.endIconResource;
        String str = this.exerciseId;
        List<C20974i0> list2 = this.heartRateTimeline;
        TextResource textResource = this.subtitleDisplay;
        TextResource textResource2 = this.titleDisplay;
        C33210q c33210q = this.tonnageStat;
        C33210q c33210q2 = this.intensityStat;
        C33210q c33210q3 = this.volumeStat;
        boolean z4 = this.isFullWorkoutSummary;
        String str2 = this.imageUrl;
        StringBuilder sb4 = new StringBuilder("ExerciseCardItem(achievementIconResources=");
        sb4.append(list);
        sb4.append(", endIconResource=");
        sb4.append(num);
        sb4.append(", exerciseId=");
        AbstractC36095b.m114694v(str, ", heartRateTimeline=", ", subtitleDisplay=", sb4, list2);
        AbstractC30007c.m91855y(sb4, textResource, ", titleDisplay=", textResource2, ", tonnageStat=");
        sb4.append(c33210q);
        sb4.append(", intensityStat=");
        sb4.append(c33210q2);
        sb4.append(", volumeStat=");
        sb4.append(c33210q3);
        sb4.append(", isFullWorkoutSummary=");
        sb4.append(z4);
        sb4.append(", imageUrl=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
