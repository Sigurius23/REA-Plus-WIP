package com.whoop.data.remote.domain.dto;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, m65681d2 = {"convertToQuestionTypeEnum", "Lcom/whoop/data/remote/domain/dto/QuestionType;", "questionType", "", "convertToCircularProgressStyleEnum", "Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;", "style", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JournalResponseDtoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CircularProgressStyle convertToCircularProgressStyleEnum(String str) {
        return AbstractC22676k.m65745e(str, "WEEKLY_PLAN_IN_PROGRESS") ? CircularProgressStyle.WEEKLY_PLAN_IN_PROGRESS : CircularProgressStyle.WEEKLY_PLAN_COMPLETE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final QuestionType convertToQuestionTypeEnum(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1814974636:
                if (str.equals("TOGGLE")) {
                    return QuestionType.TOGGLE;
                }
                return null;
            case -1680683463:
                if (str.equals("YES_NO")) {
                    return QuestionType.YES_NO;
                }
                return null;
            case -755172048:
                if (str.equals("FREEFORM")) {
                    return QuestionType.FREEFORM;
                }
                return null;
            case 72328036:
                if (str.equals("LEVEL")) {
                    return QuestionType.LEVEL;
                }
                return null;
            case 769810928:
                if (str.equals("MAGNITUDE")) {
                    return QuestionType.MAGNITUDE;
                }
                return null;
            default:
                return null;
        }
    }
}
