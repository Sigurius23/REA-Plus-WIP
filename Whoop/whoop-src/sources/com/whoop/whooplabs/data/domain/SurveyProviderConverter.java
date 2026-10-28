package com.whoop.whooplabs.data.domain;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\t"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/SurveyProviderConverter;", "", "<init>", "()V", "fromSurveyProvider", "", "value", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "toSurveyProvider", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SurveyProviderConverter {
    public static final int $stable = 0;

    public final String fromSurveyProvider(SurveyProvider value) {
        if (value != null) {
            return value.name();
        }
        return null;
    }

    public final SurveyProvider toSurveyProvider(String value) {
        return SurveyProvider.INSTANCE.valueOfOrDefault(value);
    }
}
