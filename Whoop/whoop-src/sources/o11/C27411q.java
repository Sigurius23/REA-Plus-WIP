package o11;

import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: o11.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lo11/q;", "", "Lcom/whoop/design/util/TextResource;", "avgHrDisplay", "volumeDisplay", "weightDisplay", "intensityDisplay", "", "achievementIconRes", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "d", "c", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27411q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource avgHrDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource volumeDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource weightDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource intensityDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer achievementIconRes;

    public C27411q(TextResource avgHrDisplay, TextResource volumeDisplay, TextResource weightDisplay, TextResource textResource, Integer num) {
        AbstractC22676k.m65750j(avgHrDisplay, "avgHrDisplay");
        AbstractC22676k.m65750j(volumeDisplay, "volumeDisplay");
        AbstractC22676k.m65750j(weightDisplay, "weightDisplay");
        this.avgHrDisplay = avgHrDisplay;
        this.volumeDisplay = volumeDisplay;
        this.weightDisplay = weightDisplay;
        this.intensityDisplay = textResource;
        this.achievementIconRes = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAchievementIconRes() {
        return this.achievementIconRes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getAvgHrDisplay() {
        return this.avgHrDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getIntensityDisplay() {
        return this.intensityDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getVolumeDisplay() {
        return this.volumeDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getWeightDisplay() {
        return this.weightDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27411q)) {
            return false;
        }
        C27411q c27411q = (C27411q) other;
        return AbstractC22676k.m65745e(this.avgHrDisplay, c27411q.avgHrDisplay) && AbstractC22676k.m65745e(this.volumeDisplay, c27411q.volumeDisplay) && AbstractC22676k.m65745e(this.weightDisplay, c27411q.weightDisplay) && AbstractC22676k.m65745e(this.intensityDisplay, c27411q.intensityDisplay) && AbstractC22676k.m65745e(this.achievementIconRes, c27411q.achievementIconRes);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.avgHrDisplay.hashCode() * 31, this.volumeDisplay, 31), this.weightDisplay, 31);
        TextResource textResource = this.intensityDisplay;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        Integer num = this.achievementIconRes;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.avgHrDisplay;
        TextResource textResource2 = this.volumeDisplay;
        TextResource textResource3 = this.weightDisplay;
        TextResource textResource4 = this.intensityDisplay;
        Integer num = this.achievementIconRes;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("StatRow(avgHrDisplay=", textResource, ", volumeDisplay=", textResource2, ", weightDisplay=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", intensityDisplay=", textResource4, ", achievementIconRes=");
        return AbstractC11478a.m30859k(sbM106658q, num, ")");
    }

    public /* synthetic */ C27411q(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, textResource3, (i13 & 8) != 0 ? null : textResource4, (i13 & 16) != 0 ? null : num);
    }
}
