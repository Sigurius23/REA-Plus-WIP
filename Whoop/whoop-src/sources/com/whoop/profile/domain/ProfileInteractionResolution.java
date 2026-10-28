package com.whoop.profile.domain;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractionResolution;", "", "<init>", "()V", "analyticEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "()Lcom/whoop/analytics/AnalyticEventModel;", "PresentModal", "PerformAction", "Navigate", "None", "Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;", "Lcom/whoop/profile/domain/ProfileInteractionResolution$None;", "Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;", "Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class ProfileInteractionResolution {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;", "Lcom/whoop/profile/domain/ProfileInteractionResolution;", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V", "component1", "()Lcom/whoop/navigation/e;", "component2", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Navigate extends ProfileInteractionResolution {
        public static final int $stable = 8;
        private final AnalyticEventModel analyticEvent;
        private final C9598e destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Navigate(C9598e destination, AnalyticEventModel analyticEventModel) {
            super(null);
            AbstractC22676k.m65750j(destination, "destination");
            this.destination = destination;
            this.analyticEvent = analyticEventModel;
        }

        public static /* synthetic */ Navigate copy$default(Navigate navigate, C9598e c9598e, AnalyticEventModel analyticEventModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c9598e = navigate.destination;
            }
            if ((i13 & 2) != 0) {
                analyticEventModel = navigate.analyticEvent;
            }
            return navigate.copy(c9598e, analyticEventModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final Navigate copy(C9598e destination, AnalyticEventModel analyticEvent) {
            AbstractC22676k.m65750j(destination, "destination");
            return new Navigate(destination, analyticEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Navigate)) {
                return false;
            }
            Navigate navigate = (Navigate) other;
            return AbstractC22676k.m65745e(this.destination, navigate.destination) && AbstractC22676k.m65745e(this.analyticEvent, navigate.analyticEvent);
        }

        @Override // com.whoop.profile.domain.ProfileInteractionResolution
        public AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final C9598e getDestination() {
            return this.destination;
        }

        public int hashCode() {
            int iHashCode = this.destination.hashCode() * 31;
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            return iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
        }

        public String toString() {
            return "Navigate(destination=" + this.destination + ", analyticEvent=" + this.analyticEvent + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractionResolution$None;", "Lcom/whoop/profile/domain/ProfileInteractionResolution;", "analyticEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "getAnalyticEvent", "()Lcom/whoop/analytics/AnalyticEventModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class None extends ProfileInteractionResolution {
        public static final int $stable = 8;
        private final AnalyticEventModel analyticEvent;

        public None(AnalyticEventModel analyticEventModel) {
            super(null);
            this.analyticEvent = analyticEventModel;
        }

        public static /* synthetic */ None copy$default(None none, AnalyticEventModel analyticEventModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                analyticEventModel = none.analyticEvent;
            }
            return none.copy(analyticEventModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final None copy(AnalyticEventModel analyticEvent) {
            return new None(analyticEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && AbstractC22676k.m65745e(this.analyticEvent, ((None) other).analyticEvent);
        }

        @Override // com.whoop.profile.domain.ProfileInteractionResolution
        public AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public int hashCode() {
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            if (analyticEventModel == null) {
                return 0;
            }
            return analyticEventModel.hashCode();
        }

        public String toString() {
            return "None(analyticEvent=" + this.analyticEvent + ")";
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;", "Lcom/whoop/profile/domain/ProfileInteractionResolution;", "action", "Lcom/whoop/whoopaction/domain/models/Action;", "analyticEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;)V", "getAction", "()Lcom/whoop/whoopaction/domain/models/Action;", "getAnalyticEvent", "()Lcom/whoop/analytics/AnalyticEventModel;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PerformAction extends ProfileInteractionResolution {
        public static final int $stable = 8;
        private final Action action;
        private final AnalyticEventModel analyticEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PerformAction(Action action, AnalyticEventModel analyticEventModel) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
            this.analyticEvent = analyticEventModel;
        }

        public static /* synthetic */ PerformAction copy$default(PerformAction performAction, Action action, AnalyticEventModel analyticEventModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = performAction.action;
            }
            if ((i13 & 2) != 0) {
                analyticEventModel = performAction.analyticEvent;
            }
            return performAction.copy(action, analyticEventModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final PerformAction copy(Action action, AnalyticEventModel analyticEvent) {
            AbstractC22676k.m65750j(action, "action");
            return new PerformAction(action, analyticEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PerformAction)) {
                return false;
            }
            PerformAction performAction = (PerformAction) other;
            return AbstractC22676k.m65745e(this.action, performAction.action) && AbstractC22676k.m65745e(this.analyticEvent, performAction.analyticEvent);
        }

        public final Action getAction() {
            return this.action;
        }

        @Override // com.whoop.profile.domain.ProfileInteractionResolution
        public AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            return iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
        }

        public String toString() {
            return "PerformAction(action=" + this.action + ", analyticEvent=" + this.analyticEvent + ")";
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;", "Lcom/whoop/profile/domain/ProfileInteractionResolution;", "modal", "Lcom/whoop/design/models/modal/AnyModal;", "analyticEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;)V", "getModal", "()Lcom/whoop/design/models/modal/AnyModal;", "getAnalyticEvent", "()Lcom/whoop/analytics/AnalyticEventModel;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PresentModal extends ProfileInteractionResolution {
        public static final int $stable = 8;
        private final AnalyticEventModel analyticEvent;
        private final AnyModal modal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentModal(AnyModal modal, AnalyticEventModel analyticEventModel) {
            super(null);
            AbstractC22676k.m65750j(modal, "modal");
            this.modal = modal;
            this.analyticEvent = analyticEventModel;
        }

        public static /* synthetic */ PresentModal copy$default(PresentModal presentModal, AnyModal anyModal, AnalyticEventModel analyticEventModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                anyModal = presentModal.modal;
            }
            if ((i13 & 2) != 0) {
                analyticEventModel = presentModal.analyticEvent;
            }
            return presentModal.copy(anyModal, analyticEventModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AnyModal getModal() {
            return this.modal;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final PresentModal copy(AnyModal modal, AnalyticEventModel analyticEvent) {
            AbstractC22676k.m65750j(modal, "modal");
            return new PresentModal(modal, analyticEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PresentModal)) {
                return false;
            }
            PresentModal presentModal = (PresentModal) other;
            return AbstractC22676k.m65745e(this.modal, presentModal.modal) && AbstractC22676k.m65745e(this.analyticEvent, presentModal.analyticEvent);
        }

        @Override // com.whoop.profile.domain.ProfileInteractionResolution
        public AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final AnyModal getModal() {
            return this.modal;
        }

        public int hashCode() {
            int iHashCode = this.modal.hashCode() * 31;
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            return iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
        }

        public String toString() {
            return "PresentModal(modal=" + this.modal + ", analyticEvent=" + this.analyticEvent + ")";
        }
    }

    public /* synthetic */ ProfileInteractionResolution(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract AnalyticEventModel getAnalyticEvent();

    private ProfileInteractionResolution() {
    }
}
