package com.whoop.data.remote.domain.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0004HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponseDto;", "", "languagePreferences", "", "", "<init>", "(Ljava/util/List;)V", "getLanguagePreferences", "()Ljava/util/List;", "toLanguagePreferencesResolutionResponse", "Lcom/whoop/data/remote/domain/response/LanguagePreferencesResolutionResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LanguagePreferencesResolutionResponseDto {

    @SerializedName("language_preferences")
    private final List<String> languagePreferences;

    public LanguagePreferencesResolutionResponseDto(List<String> list) {
        this.languagePreferences = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LanguagePreferencesResolutionResponseDto copy$default(LanguagePreferencesResolutionResponseDto languagePreferencesResolutionResponseDto, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = languagePreferencesResolutionResponseDto.languagePreferences;
        }
        return languagePreferencesResolutionResponseDto.copy(list);
    }

    public final List<String> component1() {
        return this.languagePreferences;
    }

    public final LanguagePreferencesResolutionResponseDto copy(List<String> languagePreferences) {
        return new LanguagePreferencesResolutionResponseDto(languagePreferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LanguagePreferencesResolutionResponseDto) && AbstractC22676k.m65745e(this.languagePreferences, ((LanguagePreferencesResolutionResponseDto) other).languagePreferences);
    }

    public final List<String> getLanguagePreferences() {
        return this.languagePreferences;
    }

    public int hashCode() {
        List<String> list = this.languagePreferences;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final LanguagePreferencesResolutionResponse toLanguagePreferencesResolutionResponse() {
        List<String> list = this.languagePreferences;
        AbstractC22676k.m65747g(list);
        return new LanguagePreferencesResolutionResponse(list);
    }

    public String toString() {
        return AbstractC33745d.m106654m("LanguagePreferencesResolutionResponseDto(languagePreferences=", ")", this.languagePreferences);
    }
}
