package ok2;

import com.whoop.design.util.TextResource;
import com.whoop.hrZones.network.ZoneID;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: ok2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b&\u0010-R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b5\u0010%R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b\u001f\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b*\u00109¨\u0006:"}, m65681d2 = {"Lok2/a;", "", "Lcom/whoop/hrZones/network/ZoneID;", "zoneID", "Ly81/f;", "color", "", "isActive", "", "thumbPercent", "Lok2/j;", "timeLabel", "", "durationMillis", "fillFraction", "showFillBar", "timeLabelColorKey", "barPaintAlpha", "Lok2/d;", WeeklyPlanApiKt.GOAL, "<init>", "(Lcom/whoop/hrZones/network/ZoneID;Ly81/f;ZFLok2/j;JFZLy81/f;FLok2/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hrZones/network/ZoneID;", "getZoneID", "()Lcom/whoop/hrZones/network/ZoneID;", "b", "Ly81/f;", "()Ly81/f;", "c", "Z", "i", "()Z", "d", "F", "f", "()F", "e", "Lok2/j;", "g", "()Lok2/j;", "J", "getDurationMillis", "()J", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "k", "Lok2/d;", "()Lok2/d;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27995a {

    /* JADX INFO: renamed from: l */
    public static final int f112894l = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ZoneID zoneID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isActive;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float thumbPercent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28004j timeLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long durationMillis;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float fillFraction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean showFillBar;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC39333f timeLabelColorKey;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float barPaintAlpha;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C27998d goal;

    public C27995a(ZoneID zoneID, EnumC39333f color, boolean z4, float f13, C28004j timeLabel, long j7, float f14, boolean z13, EnumC39333f timeLabelColorKey, float f15, C27998d c27998d) {
        AbstractC22676k.m65750j(zoneID, "zoneID");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(timeLabel, "timeLabel");
        AbstractC22676k.m65750j(timeLabelColorKey, "timeLabelColorKey");
        this.zoneID = zoneID;
        this.color = color;
        this.isActive = z4;
        this.thumbPercent = f13;
        this.timeLabel = timeLabel;
        this.durationMillis = j7;
        this.fillFraction = f14;
        this.showFillBar = z13;
        this.timeLabelColorKey = timeLabelColorKey;
        this.barPaintAlpha = f15;
        this.goal = c27998d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBarPaintAlpha() {
        return this.barPaintAlpha;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getFillFraction() {
        return this.fillFraction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C27998d getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowFillBar() {
        return this.showFillBar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27995a)) {
            return false;
        }
        C27995a c27995a = (C27995a) other;
        return this.zoneID == c27995a.zoneID && this.color == c27995a.color && this.isActive == c27995a.isActive && Float.compare(this.thumbPercent, c27995a.thumbPercent) == 0 && AbstractC22676k.m65745e(this.timeLabel, c27995a.timeLabel) && this.durationMillis == c27995a.durationMillis && Float.compare(this.fillFraction, c27995a.fillFraction) == 0 && this.showFillBar == c27995a.showFillBar && this.timeLabelColorKey == c27995a.timeLabelColorKey && Float.compare(this.barPaintAlpha, c27995a.barPaintAlpha) == 0 && AbstractC22676k.m65745e(this.goal, c27995a.goal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getThumbPercent() {
        return this.thumbPercent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C28004j getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC39333f getTimeLabelColorKey() {
        return this.timeLabelColorKey;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.barPaintAlpha, AbstractC21702c.m61132c(this.timeLabelColorKey, AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.fillFraction, AbstractC11266d.m30451e((this.timeLabel.hashCode() + AbstractC11266d.m30447a(this.thumbPercent, AbstractC2875y.m8289b(AbstractC21702c.m61132c(this.color, this.zoneID.hashCode() * 31, 31), 31, this.isActive), 31)) * 31, this.durationMillis, 31), 31), 31, this.showFillBar), 31), 31);
        C27998d c27998d = this.goal;
        return iM30447a + (c27998d == null ? 0 : c27998d.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public String toString() {
        return "HrZoneBarState(zoneID=" + this.zoneID + ", color=" + this.color + ", isActive=" + this.isActive + ", thumbPercent=" + this.thumbPercent + ", timeLabel=" + this.timeLabel + ", durationMillis=" + this.durationMillis + ", fillFraction=" + this.fillFraction + ", showFillBar=" + this.showFillBar + ", timeLabelColorKey=" + this.timeLabelColorKey + ", barPaintAlpha=" + this.barPaintAlpha + ", goal=" + this.goal + ")";
    }
}
