package com.whoop.data.remote.domain.response;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponse;", "", "languagePreferences", "", "", "<init>", "(Ljava/util/List;)V", "getLanguagePreferences", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LanguagePreferencesResolutionResponse {
    private final List<String> languagePreferences;

    public LanguagePreferencesResolutionResponse(List<String> languagePreferences) {
        AbstractC22676k.m65750j(languagePreferences, "languagePreferences");
        this.languagePreferences = languagePreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LanguagePreferencesResolutionResponse copy$default(LanguagePreferencesResolutionResponse languagePreferencesResolutionResponse, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = languagePreferencesResolutionResponse.languagePreferences;
        }
        return languagePreferencesResolutionResponse.copy(list);
    }

    public final List<String> component1() {
        return this.languagePreferences;
    }

    public final LanguagePreferencesResolutionResponse copy(List<String> languagePreferences) {
        AbstractC22676k.m65750j(languagePreferences, "languagePreferences");
        return new LanguagePreferencesResolutionResponse(languagePreferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LanguagePreferencesResolutionResponse) && AbstractC22676k.m65745e(this.languagePreferences, ((LanguagePreferencesResolutionResponse) other).languagePreferences);
    }

    public final List<String> getLanguagePreferences() {
        return this.languagePreferences;
    }

    public int hashCode() {
        return this.languagePreferences.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("LanguagePreferencesResolutionResponse(languagePreferences=", ")", this.languagePreferences);
    }
}
