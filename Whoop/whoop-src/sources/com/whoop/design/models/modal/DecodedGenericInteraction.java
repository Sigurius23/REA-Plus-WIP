package com.whoop.design.models.modal;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import j02.C21166s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0017R\u0011\u0010.\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "Lj02/s;", "dismissEvent", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/e;Lj02/s;)V", "component1", "()Lcom/whoop/design/models/modal/AnyModal;", "component2", "()Lcom/whoop/whoopaction/domain/models/Action;", "component3", "()Lcom/whoop/analytics/AnalyticEventModel;", "component4", "()Lcom/whoop/navigation/e;", "component5", "()Lj02/s;", "copy", "(Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/e;Lj02/s;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Lcom/whoop/navigation/e;", "getNavigation", "Lj02/s;", "getDismissEvent", "isEmpty", "()Z", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DecodedGenericInteraction {
    public static final int $stable = 8;
    private final Action action;
    private final AnalyticEventModel analyticEvent;
    private final C21166s dismissEvent;
    private final AnyModal modal;
    private final C9598e navigation;

    public DecodedGenericInteraction() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ DecodedGenericInteraction copy$default(DecodedGenericInteraction decodedGenericInteraction, AnyModal anyModal, Action action, AnalyticEventModel analyticEventModel, C9598e c9598e, C21166s c21166s, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            anyModal = decodedGenericInteraction.modal;
        }
        if ((i13 & 2) != 0) {
            action = decodedGenericInteraction.action;
        }
        if ((i13 & 4) != 0) {
            analyticEventModel = decodedGenericInteraction.analyticEvent;
        }
        if ((i13 & 8) != 0) {
            c9598e = decodedGenericInteraction.navigation;
        }
        if ((i13 & 16) != 0) {
            c21166s = decodedGenericInteraction.dismissEvent;
        }
        C21166s c21166s2 = c21166s;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        return decodedGenericInteraction.copy(anyModal, action, analyticEventModel2, c9598e, c21166s2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C21166s getDismissEvent() {
        return this.dismissEvent;
    }

    public final DecodedGenericInteraction copy(AnyModal modal, Action action, AnalyticEventModel analyticEvent, C9598e navigation, C21166s dismissEvent) {
        return new DecodedGenericInteraction(modal, action, analyticEvent, navigation, dismissEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecodedGenericInteraction)) {
            return false;
        }
        DecodedGenericInteraction decodedGenericInteraction = (DecodedGenericInteraction) other;
        return AbstractC22676k.m65745e(this.modal, decodedGenericInteraction.modal) && AbstractC22676k.m65745e(this.action, decodedGenericInteraction.action) && AbstractC22676k.m65745e(this.analyticEvent, decodedGenericInteraction.analyticEvent) && AbstractC22676k.m65745e(this.navigation, decodedGenericInteraction.navigation) && AbstractC22676k.m65745e(this.dismissEvent, decodedGenericInteraction.dismissEvent);
    }

    public final Action getAction() {
        return this.action;
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final C21166s getDismissEvent() {
        return this.dismissEvent;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public int hashCode() {
        AnyModal anyModal = this.modal;
        int iHashCode = (anyModal == null ? 0 : anyModal.hashCode()) * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode3 = (iHashCode2 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        C21166s c21166s = this.dismissEvent;
        return iHashCode4 + (c21166s != null ? c21166s.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.modal == null && this.action == null && this.analyticEvent == null && this.navigation == null && this.dismissEvent == null;
    }

    public String toString() {
        return "DecodedGenericInteraction(modal=" + this.modal + ", action=" + this.action + ", analyticEvent=" + this.analyticEvent + ", navigation=" + this.navigation + ", dismissEvent=" + this.dismissEvent + ")";
    }

    public DecodedGenericInteraction(AnyModal anyModal, Action action, AnalyticEventModel analyticEventModel, C9598e c9598e, C21166s c21166s) {
        this.modal = anyModal;
        this.action = action;
        this.analyticEvent = analyticEventModel;
        this.navigation = c9598e;
        this.dismissEvent = c21166s;
    }

    public /* synthetic */ DecodedGenericInteraction(AnyModal anyModal, Action action, AnalyticEventModel analyticEventModel, C9598e c9598e, C21166s c21166s, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : anyModal, (i13 & 2) != 0 ? null : action, (i13 & 4) != 0 ? null : analyticEventModel, (i13 & 8) != 0 ? null : c9598e, (i13 & 16) != 0 ? null : c21166s);
    }
}
