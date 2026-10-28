package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyListOther;", "", "", "enabled", "", "label", "placeholderLabel", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyListOther;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/SurveyListOther;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled", "Ljava/lang/String;", "getLabel", "getPlaceholderLabel", "Companion", "$serializer", "com/amplitude/android/engagement/types/l1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SurveyListOther {
    public static final int $stable = 0;
    public static final C4910l1 Companion = new C4910l1();
    private final Boolean enabled;
    private final String label;
    private final String placeholderLabel;

    public SurveyListOther() {
        this((Boolean) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SurveyListOther copy$default(SurveyListOther surveyListOther, Boolean bool, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = surveyListOther.enabled;
        }
        if ((i13 & 2) != 0) {
            str = surveyListOther.label;
        }
        if ((i13 & 4) != 0) {
            str2 = surveyListOther.placeholderLabel;
        }
        return surveyListOther.copy(bool, str, str2);
    }

    public static final /* synthetic */ void write$Self(SurveyListOther self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.enabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.enabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.label);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.placeholderLabel == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.placeholderLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlaceholderLabel() {
        return this.placeholderLabel;
    }

    public final SurveyListOther copy(Boolean enabled, String label, String placeholderLabel) {
        return new SurveyListOther(enabled, label, placeholderLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyListOther)) {
            return false;
        }
        SurveyListOther surveyListOther = (SurveyListOther) other;
        return AbstractC22676k.m65745e(this.enabled, surveyListOther.enabled) && AbstractC22676k.m65745e(this.label, surveyListOther.label) && AbstractC22676k.m65745e(this.placeholderLabel, surveyListOther.placeholderLabel);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPlaceholderLabel() {
        return this.placeholderLabel;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholderLabel;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SurveyListOther(enabled=");
        sb4.append(this.enabled);
        sb4.append(", label=");
        sb4.append(this.label);
        sb4.append(", placeholderLabel=");
        return AbstractC25012a.m73377j(sb4, this.placeholderLabel, ')');
    }

    @InterfaceC23457c
    public /* synthetic */ SurveyListOther(int i13, Boolean bool, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.enabled = null;
        } else {
            this.enabled = bool;
        }
        if ((i13 & 2) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i13 & 4) == 0) {
            this.placeholderLabel = null;
        } else {
            this.placeholderLabel = str2;
        }
    }

    public SurveyListOther(Boolean bool, String str, String str2) {
        this.enabled = bool;
        this.label = str;
        this.placeholderLabel = str2;
    }

    public /* synthetic */ SurveyListOther(Boolean bool, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2);
    }
}
