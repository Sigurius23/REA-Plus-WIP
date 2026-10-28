package com.whoop.profile.domain;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.whoopaction.domain.models.Action;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDomainAction;", "", "<init>", "()V", "Refresh", "Report", "DismissReportDialog", "PerformAction", "PresentModal", "DismissModal", "ConsumeSideEffects", "Lcom/whoop/profile/domain/ProfileDomainAction$ConsumeSideEffects;", "Lcom/whoop/profile/domain/ProfileDomainAction$DismissModal;", "Lcom/whoop/profile/domain/ProfileDomainAction$DismissReportDialog;", "Lcom/whoop/profile/domain/ProfileDomainAction$PerformAction;", "Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;", "Lcom/whoop/profile/domain/ProfileDomainAction$Refresh;", "Lcom/whoop/profile/domain/ProfileDomainAction$Report;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class ProfileDomainAction {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDomainAction$ConsumeSideEffects;", "Lcom/whoop/profile/domain/ProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ConsumeSideEffects extends ProfileDomainAction {
        public static final int $stable = 0;
        public static final ConsumeSideEffects INSTANCE = new ConsumeSideEffects();

        private ConsumeSideEffects() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDomainAction$DismissModal;", "Lcom/whoop/profile/domain/ProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DismissModal extends ProfileDomainAction {
        public static final int $stable = 0;
        public static final DismissModal INSTANCE = new DismissModal();

        private DismissModal() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDomainAction$DismissReportDialog;", "Lcom/whoop/profile/domain/ProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DismissReportDialog extends ProfileDomainAction {
        public static final int $stable = 0;
        public static final DismissReportDialog INSTANCE = new DismissReportDialog();

        private DismissReportDialog() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDomainAction$PerformAction;", "Lcom/whoop/profile/domain/ProfileDomainAction;", "action", "Lcom/whoop/whoopaction/domain/models/Action;", "cardButtonId", "", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V", "getAction", "()Lcom/whoop/whoopaction/domain/models/Action;", "getCardButtonId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PerformAction extends ProfileDomainAction {
        public static final int $stable = 8;
        private final Action action;
        private final String cardButtonId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PerformAction(Action action, String str) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
            this.cardButtonId = str;
        }

        public static /* synthetic */ PerformAction copy$default(PerformAction performAction, Action action, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = performAction.action;
            }
            if ((i13 & 2) != 0) {
                str = performAction.cardButtonId;
            }
            return performAction.copy(action, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardButtonId() {
            return this.cardButtonId;
        }

        public final PerformAction copy(Action action, String cardButtonId) {
            AbstractC22676k.m65750j(action, "action");
            return new PerformAction(action, cardButtonId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PerformAction)) {
                return false;
            }
            PerformAction performAction = (PerformAction) other;
            return AbstractC22676k.m65745e(this.action, performAction.action) && AbstractC22676k.m65745e(this.cardButtonId, performAction.cardButtonId);
        }

        public final Action getAction() {
            return this.action;
        }

        public final String getCardButtonId() {
            return this.cardButtonId;
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            String str = this.cardButtonId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PerformAction(action=" + this.action + ", cardButtonId=" + this.cardButtonId + ")";
        }

        public /* synthetic */ PerformAction(Action action, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(action, (i13 & 2) != 0 ? null : str);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;", "Lcom/whoop/profile/domain/ProfileDomainAction;", "modal", "Lcom/whoop/design/models/modal/AnyModal;", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;)V", "getModal", "()Lcom/whoop/design/models/modal/AnyModal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PresentModal extends ProfileDomainAction {
        public static final int $stable = AnyModal.$stable;
        private final AnyModal modal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PresentModal(AnyModal modal) {
            super(null);
            AbstractC22676k.m65750j(modal, "modal");
            this.modal = modal;
        }

        public static /* synthetic */ PresentModal copy$default(PresentModal presentModal, AnyModal anyModal, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                anyModal = presentModal.modal;
            }
            return presentModal.copy(anyModal);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AnyModal getModal() {
            return this.modal;
        }

        public final PresentModal copy(AnyModal modal) {
            AbstractC22676k.m65750j(modal, "modal");
            return new PresentModal(modal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PresentModal) && AbstractC22676k.m65745e(this.modal, ((PresentModal) other).modal);
        }

        public final AnyModal getModal() {
            return this.modal;
        }

        public int hashCode() {
            return this.modal.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61135f("PresentModal(modal=", ")", this.modal);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDomainAction$Refresh;", "Lcom/whoop/profile/domain/ProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Refresh extends ProfileDomainAction {
        public static final int $stable = 0;
        public static final Refresh INSTANCE = new Refresh();

        private Refresh() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileDomainAction$Report;", "Lcom/whoop/profile/domain/ProfileDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Report extends ProfileDomainAction {
        public static final int $stable = 0;
        public static final Report INSTANCE = new Report();

        private Report() {
            super(null);
        }
    }

    public /* synthetic */ ProfileDomainAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProfileDomainAction() {
    }
}
