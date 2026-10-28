package com.whoop.profile.domain;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.modal.AnyModal;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "", "<init>", "()V", "LoadData", "UpdateModal", "UpdateDialogType", "UpdateNavigation", "UpdateReportResult", "SyncInFlightCardButton", "ClearSideEffects", "Lcom/whoop/profile/domain/ProfileInternalDomainAction$ClearSideEffects;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction$SyncInFlightCardButton;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateDialogType;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateModal;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateNavigation;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateReportResult;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
abstract class ProfileInternalDomainAction {

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInternalDomainAction$ClearSideEffects;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ClearSideEffects extends ProfileInternalDomainAction {
        public static final int $stable = 0;
        public static final ClearSideEffects INSTANCE = new ClearSideEffects();

        private ClearSideEffects() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "domainState", "Lcom/whoop/profile/domain/ProfileDomainState;", "<init>", "(Lcom/whoop/profile/domain/ProfileDomainState;)V", "getDomainState", "()Lcom/whoop/profile/domain/ProfileDomainState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class LoadData extends ProfileInternalDomainAction {
        public static final int $stable = 8;
        private final ProfileDomainState domainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadData(ProfileDomainState domainState) {
            super(null);
            AbstractC22676k.m65750j(domainState, "domainState");
            this.domainState = domainState;
        }

        public static /* synthetic */ LoadData copy$default(LoadData loadData, ProfileDomainState profileDomainState, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                profileDomainState = loadData.domainState;
            }
            return loadData.copy(profileDomainState);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProfileDomainState getDomainState() {
            return this.domainState;
        }

        public final LoadData copy(ProfileDomainState domainState) {
            AbstractC22676k.m65750j(domainState, "domainState");
            return new LoadData(domainState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadData) && AbstractC22676k.m65745e(this.domainState, ((LoadData) other).domainState);
        }

        public final ProfileDomainState getDomainState() {
            return this.domainState;
        }

        public int hashCode() {
            return this.domainState.hashCode();
        }

        public String toString() {
            return "LoadData(domainState=" + this.domainState + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInternalDomainAction$SyncInFlightCardButton;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class SyncInFlightCardButton extends ProfileInternalDomainAction {
        public static final int $stable = 0;
        public static final SyncInFlightCardButton INSTANCE = new SyncInFlightCardButton();

        private SyncInFlightCardButton() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateDialogType;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "dialogType", "Lcom/whoop/profile/domain/ProfileDialogType;", "<init>", "(Lcom/whoop/profile/domain/ProfileDialogType;)V", "getDialogType", "()Lcom/whoop/profile/domain/ProfileDialogType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UpdateDialogType extends ProfileInternalDomainAction {
        public static final int $stable = 8;
        private final ProfileDialogType dialogType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateDialogType(ProfileDialogType dialogType) {
            super(null);
            AbstractC22676k.m65750j(dialogType, "dialogType");
            this.dialogType = dialogType;
        }

        public static /* synthetic */ UpdateDialogType copy$default(UpdateDialogType updateDialogType, ProfileDialogType profileDialogType, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                profileDialogType = updateDialogType.dialogType;
            }
            return updateDialogType.copy(profileDialogType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProfileDialogType getDialogType() {
            return this.dialogType;
        }

        public final UpdateDialogType copy(ProfileDialogType dialogType) {
            AbstractC22676k.m65750j(dialogType, "dialogType");
            return new UpdateDialogType(dialogType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateDialogType) && AbstractC22676k.m65745e(this.dialogType, ((UpdateDialogType) other).dialogType);
        }

        public final ProfileDialogType getDialogType() {
            return this.dialogType;
        }

        public int hashCode() {
            return this.dialogType.hashCode();
        }

        public String toString() {
            return "UpdateDialogType(dialogType=" + this.dialogType + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateModal;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "modal", "Lcom/whoop/design/models/modal/AnyModal;", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;)V", "getModal", "()Lcom/whoop/design/models/modal/AnyModal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UpdateModal extends ProfileInternalDomainAction {
        public static final int $stable = AnyModal.$stable;
        private final AnyModal modal;

        public UpdateModal(AnyModal anyModal) {
            super(null);
            this.modal = anyModal;
        }

        public static /* synthetic */ UpdateModal copy$default(UpdateModal updateModal, AnyModal anyModal, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                anyModal = updateModal.modal;
            }
            return updateModal.copy(anyModal);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AnyModal getModal() {
            return this.modal;
        }

        public final UpdateModal copy(AnyModal modal) {
            return new UpdateModal(modal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateModal) && AbstractC22676k.m65745e(this.modal, ((UpdateModal) other).modal);
        }

        public final AnyModal getModal() {
            return this.modal;
        }

        public int hashCode() {
            AnyModal anyModal = this.modal;
            if (anyModal == null) {
                return 0;
            }
            return anyModal.hashCode();
        }

        public String toString() {
            return AbstractC21702c.m61135f("UpdateModal(modal=", ")", this.modal);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateNavigation;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", NotificationCompat.CATEGORY_NAVIGATION, "Lcom/whoop/profile/domain/ProfileNavigationEffect;", "<init>", "(Lcom/whoop/profile/domain/ProfileNavigationEffect;)V", "getNavigation", "()Lcom/whoop/profile/domain/ProfileNavigationEffect;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UpdateNavigation extends ProfileInternalDomainAction {
        public static final int $stable = 8;
        private final ProfileNavigationEffect navigation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateNavigation(ProfileNavigationEffect navigation) {
            super(null);
            AbstractC22676k.m65750j(navigation, "navigation");
            this.navigation = navigation;
        }

        public static /* synthetic */ UpdateNavigation copy$default(UpdateNavigation updateNavigation, ProfileNavigationEffect profileNavigationEffect, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                profileNavigationEffect = updateNavigation.navigation;
            }
            return updateNavigation.copy(profileNavigationEffect);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProfileNavigationEffect getNavigation() {
            return this.navigation;
        }

        public final UpdateNavigation copy(ProfileNavigationEffect navigation) {
            AbstractC22676k.m65750j(navigation, "navigation");
            return new UpdateNavigation(navigation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateNavigation) && AbstractC22676k.m65745e(this.navigation, ((UpdateNavigation) other).navigation);
        }

        public final ProfileNavigationEffect getNavigation() {
            return this.navigation;
        }

        public int hashCode() {
            return this.navigation.hashCode();
        }

        public String toString() {
            return "UpdateNavigation(navigation=" + this.navigation + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateReportResult;", "Lcom/whoop/profile/domain/ProfileInternalDomainAction;", "result", "Lcom/whoop/profile/domain/ProfileReportResult;", "<init>", "(Lcom/whoop/profile/domain/ProfileReportResult;)V", "getResult", "()Lcom/whoop/profile/domain/ProfileReportResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class UpdateReportResult extends ProfileInternalDomainAction {
        public static final int $stable = 0;
        private final ProfileReportResult result;

        public UpdateReportResult(ProfileReportResult profileReportResult) {
            super(null);
            this.result = profileReportResult;
        }

        public static /* synthetic */ UpdateReportResult copy$default(UpdateReportResult updateReportResult, ProfileReportResult profileReportResult, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                profileReportResult = updateReportResult.result;
            }
            return updateReportResult.copy(profileReportResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProfileReportResult getResult() {
            return this.result;
        }

        public final UpdateReportResult copy(ProfileReportResult result) {
            return new UpdateReportResult(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateReportResult) && this.result == ((UpdateReportResult) other).result;
        }

        public final ProfileReportResult getResult() {
            return this.result;
        }

        public int hashCode() {
            ProfileReportResult profileReportResult = this.result;
            if (profileReportResult == null) {
                return 0;
            }
            return profileReportResult.hashCode();
        }

        public String toString() {
            return "UpdateReportResult(result=" + this.result + ")";
        }
    }

    public /* synthetic */ ProfileInternalDomainAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProfileInternalDomainAction() {
    }
}
