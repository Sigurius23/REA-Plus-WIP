package com.whoop.bot.models.feedback;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, m65681d2 = {"feedbackFromString", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "value", "", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AiFeedbackTypeKt {
    public static final AiFeedbackType feedbackFromString(String str) {
        for (AiFeedbackType aiFeedbackType : AiFeedbackType.values()) {
            if (AbstractC22676k.m65745e(aiFeedbackType.getValue(), str)) {
                return aiFeedbackType;
            }
        }
        return null;
    }
}
