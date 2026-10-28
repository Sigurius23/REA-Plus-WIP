package v11;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: v11.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b\u001e\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\"\u0010(¨\u0006)"}, m65681d2 = {"Lv11/k;", "", "Lcom/whoop/design/util/TextResource;", "title", "description", "primaryTitle", "Lcom/whoop/whoopaction/domain/models/Action;", "confirmAction", "secondaryTitle", "", "showCloseButton", "Lcom/whoop/analytics/AnalyticEventModel;", "primaryAnalyticEvent", "secondaryAnalyticEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/util/TextResource;ZLcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "e", "f", "Z", "g", "()Z", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35553k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource primaryTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Action confirmAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource secondaryTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean showCloseButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AnalyticEventModel primaryAnalyticEvent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AnalyticEventModel secondaryAnalyticEvent;

    public C35553k(TextResource title, TextResource textResource, TextResource primaryTitle, Action confirmAction, TextResource textResource2, boolean z4, AnalyticEventModel analyticEventModel, AnalyticEventModel analyticEventModel2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(primaryTitle, "primaryTitle");
        AbstractC22676k.m65750j(confirmAction, "confirmAction");
        this.title = title;
        this.description = textResource;
        this.primaryTitle = primaryTitle;
        this.confirmAction = confirmAction;
        this.secondaryTitle = textResource2;
        this.showCloseButton = z4;
        this.primaryAnalyticEvent = analyticEventModel;
        this.secondaryAnalyticEvent = analyticEventModel2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Action getConfirmAction() {
        return this.confirmAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AnalyticEventModel getPrimaryAnalyticEvent() {
        return this.primaryAnalyticEvent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getPrimaryTitle() {
        return this.primaryTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AnalyticEventModel getSecondaryAnalyticEvent() {
        return this.secondaryAnalyticEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35553k)) {
            return false;
        }
        C35553k c35553k = (C35553k) other;
        return AbstractC22676k.m65745e(this.title, c35553k.title) && AbstractC22676k.m65745e(this.description, c35553k.description) && AbstractC22676k.m65745e(this.primaryTitle, c35553k.primaryTitle) && AbstractC22676k.m65745e(this.confirmAction, c35553k.confirmAction) && AbstractC22676k.m65745e(this.secondaryTitle, c35553k.secondaryTitle) && this.showCloseButton == c35553k.showCloseButton && AbstractC22676k.m65745e(this.primaryAnalyticEvent, c35553k.primaryAnalyticEvent) && AbstractC22676k.m65745e(this.secondaryAnalyticEvent, c35553k.secondaryAnalyticEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSecondaryTitle() {
        return this.secondaryTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.description;
        int iHashCode2 = (this.confirmAction.hashCode() + AbstractC31061c.m95625a((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, this.primaryTitle, 31)) * 31;
        TextResource textResource2 = this.secondaryTitle;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.showCloseButton);
        AnalyticEventModel analyticEventModel = this.primaryAnalyticEvent;
        int iHashCode3 = (iM8289b + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        AnalyticEventModel analyticEventModel2 = this.secondaryAnalyticEvent;
        return iHashCode3 + (analyticEventModel2 != null ? analyticEventModel2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        TextResource textResource3 = this.primaryTitle;
        Action action = this.confirmAction;
        TextResource textResource4 = this.secondaryTitle;
        boolean z4 = this.showCloseButton;
        AnalyticEventModel analyticEventModel = this.primaryAnalyticEvent;
        AnalyticEventModel analyticEventModel2 = this.secondaryAnalyticEvent;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("FollowerRequestConfirmationDialog(title=", textResource, ", description=", textResource2, ", primaryTitle=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", confirmAction=");
        sbM106658q.append(action);
        sbM106658q.append(", secondaryTitle=");
        AbstractC33745d.m106664w(textResource4, ", showCloseButton=", ", primaryAnalyticEvent=", sbM106658q, z4);
        sbM106658q.append(analyticEventModel);
        sbM106658q.append(", secondaryAnalyticEvent=");
        sbM106658q.append(analyticEventModel2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
