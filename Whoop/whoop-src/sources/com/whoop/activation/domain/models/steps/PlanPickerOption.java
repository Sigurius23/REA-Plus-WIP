package com.whoop.activation.domain.models.steps;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/PlanPickerOption;", "", "commitmentType", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "getCommitmentType", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "isSelected", "", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface PlanPickerOption {
    CommitmentType getCommitmentType();

    boolean isSelected();
}
