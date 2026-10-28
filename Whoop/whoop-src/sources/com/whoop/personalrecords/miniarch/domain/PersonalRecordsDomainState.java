package com.whoop.personalrecords.miniarch.domain;

import com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsModel;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;", "", "currentDialogType", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;", "response", "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;", "isLoadingMore", "", "<init>", "(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;Z)V", "getCurrentDialogType", "()Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;", "getResponse", "()Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class PersonalRecordsDomainState {
    public static final int $stable = 8;
    private final PersonalRecordsDialogType currentDialogType;
    private final boolean isLoadingMore;
    private final PersonalRecordsModel response;

    public PersonalRecordsDomainState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ PersonalRecordsDomainState copy$default(PersonalRecordsDomainState personalRecordsDomainState, PersonalRecordsDialogType personalRecordsDialogType, PersonalRecordsModel personalRecordsModel, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            personalRecordsDialogType = personalRecordsDomainState.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            personalRecordsModel = personalRecordsDomainState.response;
        }
        if ((i13 & 4) != 0) {
            z4 = personalRecordsDomainState.isLoadingMore;
        }
        return personalRecordsDomainState.copy(personalRecordsDialogType, personalRecordsModel, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PersonalRecordsDialogType getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PersonalRecordsModel getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    public final PersonalRecordsDomainState copy(PersonalRecordsDialogType currentDialogType, PersonalRecordsModel response, boolean isLoadingMore) {
        return new PersonalRecordsDomainState(currentDialogType, response, isLoadingMore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalRecordsDomainState)) {
            return false;
        }
        PersonalRecordsDomainState personalRecordsDomainState = (PersonalRecordsDomainState) other;
        return AbstractC22676k.m65745e(this.currentDialogType, personalRecordsDomainState.currentDialogType) && AbstractC22676k.m65745e(this.response, personalRecordsDomainState.response) && this.isLoadingMore == personalRecordsDomainState.isLoadingMore;
    }

    public final PersonalRecordsDialogType getCurrentDialogType() {
        return this.currentDialogType;
    }

    public final PersonalRecordsModel getResponse() {
        return this.response;
    }

    public int hashCode() {
        PersonalRecordsDialogType personalRecordsDialogType = this.currentDialogType;
        int iHashCode = (personalRecordsDialogType == null ? 0 : personalRecordsDialogType.hashCode()) * 31;
        PersonalRecordsModel personalRecordsModel = this.response;
        return Boolean.hashCode(this.isLoadingMore) + ((iHashCode + (personalRecordsModel != null ? personalRecordsModel.hashCode() : 0)) * 31);
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public String toString() {
        PersonalRecordsDialogType personalRecordsDialogType = this.currentDialogType;
        PersonalRecordsModel personalRecordsModel = this.response;
        boolean z4 = this.isLoadingMore;
        StringBuilder sb4 = new StringBuilder("PersonalRecordsDomainState(currentDialogType=");
        sb4.append(personalRecordsDialogType);
        sb4.append(", response=");
        sb4.append(personalRecordsModel);
        sb4.append(", isLoadingMore=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public PersonalRecordsDomainState(PersonalRecordsDialogType personalRecordsDialogType, PersonalRecordsModel personalRecordsModel, boolean z4) {
        this.currentDialogType = personalRecordsDialogType;
        this.response = personalRecordsModel;
        this.isLoadingMore = z4;
    }

    public /* synthetic */ PersonalRecordsDomainState(PersonalRecordsDialogType personalRecordsDialogType, PersonalRecordsModel personalRecordsModel, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : personalRecordsDialogType, (i13 & 2) != 0 ? null : personalRecordsModel, (i13 & 4) != 0 ? false : z4);
    }
}
