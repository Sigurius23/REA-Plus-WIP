package ot2;

import androidx.core.app.NotificationCompat;
import bu2.C3643d;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import live.hms.video.media.tracks.HMSTrackSource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import ws2.C37615g;
import ys2.C39756c;
import ys2.C39759f;

/* JADX INFO: renamed from: ot2.t */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u001d\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u000f\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Lot2/t;", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "Lys2/f;", "header", "Lbu2/d;", "metricSlider", "Lcom/whoop/design/util/TextResource;", "confirmTargetButtonDisplay", "", "saveValue", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "", "isSmartAlarmOverride", "Lys2/c;", "customizePlanDialogViewState", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lcom/whoop/design/util/TextResource;DLws2/g;ZLys2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "d", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "b", "Lys2/f;", "()Lys2/f;", "c", "Lbu2/d;", "()Lbu2/d;", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "e", "D", "getSaveValue", "()D", "f", "Lws2/g;", "getProgress", "()Lws2/g;", "g", "Z", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lys2/c;", "getCustomizePlanDialogViewState", "()Lys2/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28351t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TargetGoalType screen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39759f header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C3643d metricSlider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource confirmTargetButtonDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double saveValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C37615g progress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isSmartAlarmOverride;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C39756c customizePlanDialogViewState;

    public C28351t(TargetGoalType screen, C39759f header, C3643d metricSlider, TextResource confirmTargetButtonDisplay, double d3, C37615g progress, boolean z4, C39756c c39756c) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(metricSlider, "metricSlider");
        AbstractC22676k.m65750j(confirmTargetButtonDisplay, "confirmTargetButtonDisplay");
        AbstractC22676k.m65750j(progress, "progress");
        this.screen = screen;
        this.header = header;
        this.metricSlider = metricSlider;
        this.confirmTargetButtonDisplay = confirmTargetButtonDisplay;
        this.saveValue = d3;
        this.progress = progress;
        this.isSmartAlarmOverride = z4;
        this.customizePlanDialogViewState = c39756c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getConfirmTargetButtonDisplay() {
        return this.confirmTargetButtonDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39759f getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C3643d getMetricSlider() {
        return this.metricSlider;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TargetGoalType getScreen() {
        return this.screen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28351t)) {
            return false;
        }
        C28351t c28351t = (C28351t) other;
        return this.screen == c28351t.screen && AbstractC22676k.m65745e(this.header, c28351t.header) && AbstractC22676k.m65745e(this.metricSlider, c28351t.metricSlider) && AbstractC22676k.m65745e(this.confirmTargetButtonDisplay, c28351t.confirmTargetButtonDisplay) && Double.compare(this.saveValue, c28351t.saveValue) == 0 && AbstractC22676k.m65745e(this.progress, c28351t.progress) && this.isSmartAlarmOverride == c28351t.isSmartAlarmOverride && AbstractC22676k.m65745e(this.customizePlanDialogViewState, c28351t.customizePlanDialogViewState);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.progress.hashCode() + AbstractC17176i.m48499a(AbstractC31061c.m95625a((this.metricSlider.hashCode() + ((this.header.hashCode() + (this.screen.hashCode() * 31)) * 31)) * 31, this.confirmTargetButtonDisplay, 31), 31, this.saveValue)) * 31, 31, this.isSmartAlarmOverride);
        C39756c c39756c = this.customizePlanDialogViewState;
        return iM8289b + (c39756c == null ? 0 : c39756c.hashCode());
    }

    public String toString() {
        return "SliderViewState(screen=" + this.screen + ", header=" + this.header + ", metricSlider=" + this.metricSlider + ", confirmTargetButtonDisplay=" + this.confirmTargetButtonDisplay + ", saveValue=" + this.saveValue + ", progress=" + this.progress + ", isSmartAlarmOverride=" + this.isSmartAlarmOverride + ", customizePlanDialogViewState=" + this.customizePlanDialogViewState + ")";
    }
}
