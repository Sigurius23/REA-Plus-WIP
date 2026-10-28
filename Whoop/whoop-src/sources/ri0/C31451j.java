package ri0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import j02.C21166s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ri0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b&\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b\u001f\u0010,¨\u0006-"}, m65681d2 = {"Lri0/j;", "Lri0/h;", "Lcom/whoop/design/util/TextResource;", "text", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lj02/s;", "dismissAction", "Lcom/whoop/design/models/modal/AnyModal;", "dismissModal", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lj02/s;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "Lcom/whoop/navigation/e;", "e", "()Lcom/whoop/navigation/e;", "c", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "d", "Lj02/s;", "()Lj02/s;", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31451j implements InterfaceC31449h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21166s dismissAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AnyModal dismissModal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    public C31451j(TextResource textResource, C9598e c9598e, Action action, C21166s c21166s, AnyModal anyModal, AnalyticEventModel analyticEventModel) {
        this.text = textResource;
        this.destination = c9598e;
        this.action = action;
        this.dismissAction = c21166s;
        this.dismissModal = anyModal;
        this.analyticEvent = analyticEventModel;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: a, reason: from getter */
    public Action getAction() {
        return this.action;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: b, reason: from getter */
    public AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: c, reason: from getter */
    public C21166s getDismissAction() {
        return this.dismissAction;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: d, reason: from getter */
    public AnyModal getDismissModal() {
        return this.dismissModal;
    }

    @Override // ri0.InterfaceC31449h
    /* JADX INFO: renamed from: e, reason: from getter */
    public C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31451j)) {
            return false;
        }
        C31451j c31451j = (C31451j) other;
        return AbstractC22676k.m65745e(this.text, c31451j.text) && AbstractC22676k.m65745e(this.destination, c31451j.destination) && AbstractC22676k.m65745e(this.action, c31451j.action) && AbstractC22676k.m65745e(this.dismissAction, c31451j.dismissAction) && AbstractC22676k.m65745e(this.dismissModal, c31451j.dismissModal) && AbstractC22676k.m65745e(this.analyticEvent, c31451j.analyticEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public int hashCode() {
        TextResource textResource = this.text;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Action action = this.action;
        int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
        C21166s c21166s = this.dismissAction;
        int iHashCode4 = (iHashCode3 + (c21166s == null ? 0 : c21166s.hashCode())) * 31;
        AnyModal anyModal = this.dismissModal;
        int iHashCode5 = (iHashCode4 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode5 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        return "NavigationTextButtonState(text=" + this.text + ", destination=" + this.destination + ", action=" + this.action + ", dismissAction=" + this.dismissAction + ", dismissModal=" + this.dismissModal + ", analyticEvent=" + this.analyticEvent + ")";
    }
}
