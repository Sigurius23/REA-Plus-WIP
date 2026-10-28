package so1;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: so1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, m65681d2 = {"Lso1/d;", "", "Lcom/whoop/design/util/TextResource;", "buttonTitle", "Lgz0/m0;", "buttonIcon", "Lcom/whoop/navigation/e;", "buttonDestination", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "c", "()Lgz0/m0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32808d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 buttonIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e buttonDestination;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    public C32808d(TextResource buttonTitle, EnumC16313m0 enumC16313m0, C9598e buttonDestination, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(buttonDestination, "buttonDestination");
        this.buttonTitle = buttonTitle;
        this.buttonIcon = enumC16313m0;
        this.buttonDestination = buttonDestination;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getButtonDestination() {
        return this.buttonDestination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getButtonIcon() {
        return this.buttonIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32808d)) {
            return false;
        }
        C32808d c32808d = (C32808d) other;
        return AbstractC22676k.m65745e(this.buttonTitle, c32808d.buttonTitle) && this.buttonIcon == c32808d.buttonIcon && AbstractC22676k.m65745e(this.buttonDestination, c32808d.buttonDestination) && AbstractC22676k.m65745e(this.analyticEvent, c32808d.analyticEvent);
    }

    public int hashCode() {
        int iHashCode = this.buttonTitle.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.buttonIcon;
        int iM114673a = AbstractC36095b.m114673a(this.buttonDestination, (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31);
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iM114673a + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.buttonTitle;
        EnumC16313m0 enumC16313m0 = this.buttonIcon;
        C9598e c9598e = this.buttonDestination;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("CyclePatternButton(buttonTitle=", textResource, ", buttonIcon=", enumC16313m0, ", buttonDestination=");
        sbM61140k.append(c9598e);
        sbM61140k.append(", analyticEvent=");
        sbM61140k.append(analyticEventModel);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }
}
