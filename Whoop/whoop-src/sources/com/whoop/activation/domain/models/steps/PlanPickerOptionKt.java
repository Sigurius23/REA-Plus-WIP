package com.whoop.activation.domain.models.steps;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"selectedFor", "T", "Lcom/whoop/activation/domain/models/steps/PlanPickerOption;", "", "commitmentType", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "(Ljava/util/List;Lcom/whoop/activation/domain/models/steps/CommitmentType;)Lcom/whoop/activation/domain/models/steps/PlanPickerOption;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PlanPickerOptionKt {
    public static final <T extends PlanPickerOption> T selectedFor(List<? extends T> list, CommitmentType commitmentType) {
        AbstractC22676k.m65750j(list, "<this>");
        Object obj = null;
        if (commitmentType == null) {
            for (Object obj2 : list) {
                if (((PlanPickerOption) obj2).isSelected()) {
                    obj = obj2;
                    break;
                }
            }
            return (T) obj;
        }
        for (Object obj3 : list) {
            if (((PlanPickerOption) obj3).getCommitmentType() == commitmentType) {
                obj = obj3;
                break;
            }
        }
        return (T) obj;
    }
}
