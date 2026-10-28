package fh0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.UpdateAction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: fh0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001c\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b*\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b+\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b(\u0010\u001f¨\u0006/"}, m65681d2 = {"Lfh0/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "activeLabel", "activeSublabel", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "activeAction", "Lcom/whoop/analytics/AnalyticEventModel;", "activeAnalyticEvent", "inactiveLabel", "inactiveSublabel", "inactiveAction", "inactiveAnalyticEvent", "", "isActive", "errorMessage", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lcom/whoop/analytics/AnalyticEventModel;ZLcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "e", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "()Lcom/whoop/whoopaction/domain/models/UpdateAction;", "d", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "i", "f", "j", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "k", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14486h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource activeLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource activeSublabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final UpdateAction activeAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AnalyticEventModel activeAnalyticEvent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource inactiveLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource inactiveSublabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final UpdateAction inactiveAction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AnalyticEventModel inactiveAnalyticEvent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isActive;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource errorMessage;

    public C14486h(TextResource activeLabel, TextResource textResource, UpdateAction activeAction, AnalyticEventModel analyticEventModel, TextResource inactiveLabel, TextResource textResource2, UpdateAction inactiveAction, AnalyticEventModel analyticEventModel2, boolean z4, TextResource errorMessage) {
        AbstractC22676k.m65750j(activeLabel, "activeLabel");
        AbstractC22676k.m65750j(activeAction, "activeAction");
        AbstractC22676k.m65750j(inactiveLabel, "inactiveLabel");
        AbstractC22676k.m65750j(inactiveAction, "inactiveAction");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.activeLabel = activeLabel;
        this.activeSublabel = textResource;
        this.activeAction = activeAction;
        this.activeAnalyticEvent = analyticEventModel;
        this.inactiveLabel = inactiveLabel;
        this.inactiveSublabel = textResource2;
        this.inactiveAction = inactiveAction;
        this.inactiveAnalyticEvent = analyticEventModel2;
        this.isActive = z4;
        this.errorMessage = errorMessage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UpdateAction getActiveAction() {
        return this.activeAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnalyticEventModel getActiveAnalyticEvent() {
        return this.activeAnalyticEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getActiveLabel() {
        return this.activeLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getActiveSublabel() {
        return this.activeSublabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14486h)) {
            return false;
        }
        C14486h c14486h = (C14486h) other;
        return AbstractC22676k.m65745e(this.activeLabel, c14486h.activeLabel) && AbstractC22676k.m65745e(this.activeSublabel, c14486h.activeSublabel) && AbstractC22676k.m65745e(this.activeAction, c14486h.activeAction) && AbstractC22676k.m65745e(this.activeAnalyticEvent, c14486h.activeAnalyticEvent) && AbstractC22676k.m65745e(this.inactiveLabel, c14486h.inactiveLabel) && AbstractC22676k.m65745e(this.inactiveSublabel, c14486h.inactiveSublabel) && AbstractC22676k.m65745e(this.inactiveAction, c14486h.inactiveAction) && AbstractC22676k.m65745e(this.inactiveAnalyticEvent, c14486h.inactiveAnalyticEvent) && this.isActive == c14486h.isActive && AbstractC22676k.m65745e(this.errorMessage, c14486h.errorMessage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final UpdateAction getInactiveAction() {
        return this.inactiveAction;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AnalyticEventModel getInactiveAnalyticEvent() {
        return this.inactiveAnalyticEvent;
    }

    public int hashCode() {
        int iHashCode = this.activeLabel.hashCode() * 31;
        TextResource textResource = this.activeSublabel;
        int iHashCode2 = (this.activeAction.hashCode() + ((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31;
        AnalyticEventModel analyticEventModel = this.activeAnalyticEvent;
        int iM95625a = AbstractC31061c.m95625a((iHashCode2 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31, this.inactiveLabel, 31);
        TextResource textResource2 = this.inactiveSublabel;
        int iHashCode3 = (this.inactiveAction.hashCode() + ((iM95625a + (textResource2 == null ? 0 : textResource2.hashCode())) * 31)) * 31;
        AnalyticEventModel analyticEventModel2 = this.inactiveAnalyticEvent;
        return this.errorMessage.hashCode() + AbstractC2875y.m8289b((iHashCode3 + (analyticEventModel2 != null ? analyticEventModel2.hashCode() : 0)) * 31, 31, this.isActive);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getInactiveLabel() {
        return this.inactiveLabel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getInactiveSublabel() {
        return this.inactiveSublabel;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public String toString() {
        TextResource textResource = this.activeLabel;
        TextResource textResource2 = this.activeSublabel;
        UpdateAction updateAction = this.activeAction;
        AnalyticEventModel analyticEventModel = this.activeAnalyticEvent;
        TextResource textResource3 = this.inactiveLabel;
        TextResource textResource4 = this.inactiveSublabel;
        UpdateAction updateAction2 = this.inactiveAction;
        AnalyticEventModel analyticEventModel2 = this.inactiveAnalyticEvent;
        boolean z4 = this.isActive;
        TextResource textResource5 = this.errorMessage;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ContextStatusToggleViewState(activeLabel=", textResource, ", activeSublabel=", textResource2, ", activeAction=");
        sbM106658q.append(updateAction);
        sbM106658q.append(", activeAnalyticEvent=");
        sbM106658q.append(analyticEventModel);
        sbM106658q.append(", inactiveLabel=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", inactiveSublabel=", textResource4, ", inactiveAction=");
        sbM106658q.append(updateAction2);
        sbM106658q.append(", inactiveAnalyticEvent=");
        sbM106658q.append(analyticEventModel2);
        sbM106658q.append(", isActive=");
        sbM106658q.append(z4);
        sbM106658q.append(", errorMessage=");
        sbM106658q.append(textResource5);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
