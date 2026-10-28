package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006)"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyTextMeta;", "", "", "prompt", "Lcom/amplitude/android/engagement/types/ValidationConfig;", "validation", "<init>", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/ValidationConfig;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/ValidationConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyTextMeta;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/amplitude/android/engagement/types/ValidationConfig;", "copy", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/ValidationConfig;)Lcom/amplitude/android/engagement/types/SurveyTextMeta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrompt", "Lcom/amplitude/android/engagement/types/ValidationConfig;", "getValidation", "Companion", "$serializer", "com/amplitude/android/engagement/types/v1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SurveyTextMeta {
    public static final int $stable = 0;
    public static final C4942v1 Companion = new C4942v1();
    private final String prompt;
    private final ValidationConfig validation;

    @InterfaceC23457c
    public /* synthetic */ SurveyTextMeta(int i13, String str, ValidationConfig validationConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SurveyTextMeta$$serializer.INSTANCE.getDescriptor());
        }
        this.prompt = str;
        if ((i13 & 2) == 0) {
            this.validation = null;
        } else {
            this.validation = validationConfig;
        }
    }

    public static /* synthetic */ SurveyTextMeta copy$default(SurveyTextMeta surveyTextMeta, String str, ValidationConfig validationConfig, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = surveyTextMeta.prompt;
        }
        if ((i13 & 2) != 0) {
            validationConfig = surveyTextMeta.validation;
        }
        return surveyTextMeta.copy(str, validationConfig);
    }

    public static final /* synthetic */ void write$Self(SurveyTextMeta self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.prompt);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.validation == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, ValidationConfig$$serializer.INSTANCE, self.validation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ValidationConfig getValidation() {
        return this.validation;
    }

    public final SurveyTextMeta copy(String prompt, ValidationConfig validation) {
        AbstractC22676k.m65750j(prompt, "prompt");
        return new SurveyTextMeta(prompt, validation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyTextMeta)) {
            return false;
        }
        SurveyTextMeta surveyTextMeta = (SurveyTextMeta) other;
        return AbstractC22676k.m65745e(this.prompt, surveyTextMeta.prompt) && AbstractC22676k.m65745e(this.validation, surveyTextMeta.validation);
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final ValidationConfig getValidation() {
        return this.validation;
    }

    public int hashCode() {
        int iHashCode = this.prompt.hashCode() * 31;
        ValidationConfig validationConfig = this.validation;
        return iHashCode + (validationConfig == null ? 0 : validationConfig.hashCode());
    }

    public String toString() {
        return "SurveyTextMeta(prompt=" + this.prompt + ", validation=" + this.validation + ')';
    }

    public SurveyTextMeta(String prompt, ValidationConfig validationConfig) {
        AbstractC22676k.m65750j(prompt, "prompt");
        this.prompt = prompt;
        this.validation = validationConfig;
    }

    public /* synthetic */ SurveyTextMeta(String str, ValidationConfig validationConfig, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : validationConfig);
    }
}
