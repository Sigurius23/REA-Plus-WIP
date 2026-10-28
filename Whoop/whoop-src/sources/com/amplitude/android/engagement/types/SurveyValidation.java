package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006%"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyValidation;", "", "Lcom/amplitude/android/engagement/types/ValidationConfig;", "validation", "<init>", "(Lcom/amplitude/android/engagement/types/ValidationConfig;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/ValidationConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyValidation;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/ValidationConfig;", "copy", "(Lcom/amplitude/android/engagement/types/ValidationConfig;)Lcom/amplitude/android/engagement/types/SurveyValidation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/ValidationConfig;", "getValidation", "Companion", "$serializer", "com/amplitude/android/engagement/types/x1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SurveyValidation {
    public static final int $stable = 0;
    public static final C4948x1 Companion = new C4948x1();
    private final ValidationConfig validation;

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyValidation() {
        this((ValidationConfig) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ SurveyValidation copy$default(SurveyValidation surveyValidation, ValidationConfig validationConfig, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            validationConfig = surveyValidation.validation;
        }
        return surveyValidation.copy(validationConfig);
    }

    public static final /* synthetic */ void write$Self(SurveyValidation self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.validation == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, ValidationConfig$$serializer.INSTANCE, self.validation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ValidationConfig getValidation() {
        return this.validation;
    }

    public final SurveyValidation copy(ValidationConfig validation) {
        return new SurveyValidation(validation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SurveyValidation) && AbstractC22676k.m65745e(this.validation, ((SurveyValidation) other).validation);
    }

    public final ValidationConfig getValidation() {
        return this.validation;
    }

    public int hashCode() {
        ValidationConfig validationConfig = this.validation;
        if (validationConfig == null) {
            return 0;
        }
        return validationConfig.hashCode();
    }

    public String toString() {
        return "SurveyValidation(validation=" + this.validation + ')';
    }

    @InterfaceC23457c
    public /* synthetic */ SurveyValidation(int i13, ValidationConfig validationConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.validation = null;
        } else {
            this.validation = validationConfig;
        }
    }

    public SurveyValidation(ValidationConfig validationConfig) {
        this.validation = validationConfig;
    }

    public /* synthetic */ SurveyValidation(ValidationConfig validationConfig, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : validationConfig);
    }
}
