package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DEBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bu\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,Jt\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010\"J\u0010\u00100\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b0\u0010%J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010%R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010)R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b@\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010,¨\u0006F"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyRatingMeta;", "", "Lcom/amplitude/android/engagement/types/SurveyRatingType;", "type", "", "lowerLabel", "upperLabel", "", "options", "", "emojis", "Lcom/amplitude/android/engagement/types/ValidationConfig;", "validation", "Lcom/amplitude/android/engagement/types/NudgeConditionalAction;", "conditionalActions", "Lcom/amplitude/android/engagement/types/Action;", "defaultAction", "<init>", "(Lcom/amplitude/android/engagement/types/SurveyRatingType;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/amplitude/android/engagement/types/ValidationConfig;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/SurveyRatingType;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/amplitude/android/engagement/types/ValidationConfig;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyRatingMeta;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/SurveyRatingType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()I", "component5", "()Ljava/util/List;", "component6", "()Lcom/amplitude/android/engagement/types/ValidationConfig;", "component7", "component8", "()Lcom/amplitude/android/engagement/types/Action;", "copy", "(Lcom/amplitude/android/engagement/types/SurveyRatingType;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/amplitude/android/engagement/types/ValidationConfig;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)Lcom/amplitude/android/engagement/types/SurveyRatingMeta;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/SurveyRatingType;", "getType", "Ljava/lang/String;", "getLowerLabel", "getUpperLabel", "I", "getOptions", "Ljava/util/List;", "getEmojis", "Lcom/amplitude/android/engagement/types/ValidationConfig;", "getValidation", "getConditionalActions", "Lcom/amplitude/android/engagement/types/Action;", "getDefaultAction", "Companion", "$serializer", "com/amplitude/android/engagement/types/n1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SurveyRatingMeta {
    public static final int $stable = 8;
    private final List<NudgeConditionalAction> conditionalActions;
    private final Action defaultAction;
    private final List<String> emojis;
    private final String lowerLabel;
    private final int options;
    private final SurveyRatingType type;
    private final String upperLabel;
    private final ValidationConfig validation;
    public static final C4918n1 Companion = new C4918n1();
    private static final InterfaceC37138c[] $childSerializers = {SurveyRatingType.Companion.serializer(), null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(NudgeConditionalAction$$serializer.INSTANCE), Action.Companion.serializer()};

    @InterfaceC23457c
    public /* synthetic */ SurveyRatingMeta(int i13, SurveyRatingType surveyRatingType, String str, String str2, int i14, List list, ValidationConfig validationConfig, List list2, Action action, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SurveyRatingMeta$$serializer.INSTANCE.getDescriptor());
        }
        this.type = surveyRatingType;
        this.lowerLabel = str;
        this.upperLabel = str2;
        this.options = i14;
        if ((i13 & 16) == 0) {
            this.emojis = null;
        } else {
            this.emojis = list;
        }
        if ((i13 & 32) == 0) {
            this.validation = null;
        } else {
            this.validation = validationConfig;
        }
        if ((i13 & 64) == 0) {
            this.conditionalActions = null;
        } else {
            this.conditionalActions = list2;
        }
        if ((i13 & 128) == 0) {
            this.defaultAction = null;
        } else {
            this.defaultAction = action;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyRatingMeta copy$default(SurveyRatingMeta surveyRatingMeta, SurveyRatingType surveyRatingType, String str, String str2, int i13, List list, ValidationConfig validationConfig, List list2, Action action, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            surveyRatingType = surveyRatingMeta.type;
        }
        if ((i14 & 2) != 0) {
            str = surveyRatingMeta.lowerLabel;
        }
        if ((i14 & 4) != 0) {
            str2 = surveyRatingMeta.upperLabel;
        }
        if ((i14 & 8) != 0) {
            i13 = surveyRatingMeta.options;
        }
        if ((i14 & 16) != 0) {
            list = surveyRatingMeta.emojis;
        }
        if ((i14 & 32) != 0) {
            validationConfig = surveyRatingMeta.validation;
        }
        if ((i14 & 64) != 0) {
            list2 = surveyRatingMeta.conditionalActions;
        }
        if ((i14 & 128) != 0) {
            action = surveyRatingMeta.defaultAction;
        }
        List list3 = list2;
        Action action2 = action;
        List list4 = list;
        ValidationConfig validationConfig2 = validationConfig;
        return surveyRatingMeta.copy(surveyRatingType, str, str2, i13, list4, validationConfig2, list3, action2);
    }

    public static final /* synthetic */ void write$Self(SurveyRatingMeta self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.type);
        output.encodeStringElement(serialDesc, 1, self.lowerLabel);
        output.encodeStringElement(serialDesc, 2, self.upperLabel);
        output.encodeIntElement(serialDesc, 3, self.options);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.emojis != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, interfaceC37138cArr[4], self.emojis);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.validation != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ValidationConfig$$serializer.INSTANCE, self.validation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.conditionalActions != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, interfaceC37138cArr[6], self.conditionalActions);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.defaultAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, interfaceC37138cArr[7], self.defaultAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SurveyRatingType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLowerLabel() {
        return this.lowerLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpperLabel() {
        return this.upperLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOptions() {
        return this.options;
    }

    public final List<String> component5() {
        return this.emojis;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ValidationConfig getValidation() {
        return this.validation;
    }

    public final List<NudgeConditionalAction> component7() {
        return this.conditionalActions;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Action getDefaultAction() {
        return this.defaultAction;
    }

    public final SurveyRatingMeta copy(SurveyRatingType type, String lowerLabel, String upperLabel, int options, List<String> emojis, ValidationConfig validation, List<NudgeConditionalAction> conditionalActions, Action defaultAction) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(lowerLabel, "lowerLabel");
        AbstractC22676k.m65750j(upperLabel, "upperLabel");
        return new SurveyRatingMeta(type, lowerLabel, upperLabel, options, emojis, validation, conditionalActions, defaultAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyRatingMeta)) {
            return false;
        }
        SurveyRatingMeta surveyRatingMeta = (SurveyRatingMeta) other;
        return this.type == surveyRatingMeta.type && AbstractC22676k.m65745e(this.lowerLabel, surveyRatingMeta.lowerLabel) && AbstractC22676k.m65745e(this.upperLabel, surveyRatingMeta.upperLabel) && this.options == surveyRatingMeta.options && AbstractC22676k.m65745e(this.emojis, surveyRatingMeta.emojis) && AbstractC22676k.m65745e(this.validation, surveyRatingMeta.validation) && AbstractC22676k.m65745e(this.conditionalActions, surveyRatingMeta.conditionalActions) && AbstractC22676k.m65745e(this.defaultAction, surveyRatingMeta.defaultAction);
    }

    public final List<NudgeConditionalAction> getConditionalActions() {
        return this.conditionalActions;
    }

    public final Action getDefaultAction() {
        return this.defaultAction;
    }

    public final List<String> getEmojis() {
        return this.emojis;
    }

    public final String getLowerLabel() {
        return this.lowerLabel;
    }

    public final int getOptions() {
        return this.options;
    }

    public final SurveyRatingType getType() {
        return this.type;
    }

    public final String getUpperLabel() {
        return this.upperLabel;
    }

    public final ValidationConfig getValidation() {
        return this.validation;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.options, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.lowerLabel), 31, this.upperLabel), 31);
        List<String> list = this.emojis;
        int iHashCode = (iM30448b + (list == null ? 0 : list.hashCode())) * 31;
        ValidationConfig validationConfig = this.validation;
        int iHashCode2 = (iHashCode + (validationConfig == null ? 0 : validationConfig.hashCode())) * 31;
        List<NudgeConditionalAction> list2 = this.conditionalActions;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Action action = this.defaultAction;
        return iHashCode3 + (action != null ? action.hashCode() : 0);
    }

    public String toString() {
        return "SurveyRatingMeta(type=" + this.type + ", lowerLabel=" + this.lowerLabel + ", upperLabel=" + this.upperLabel + ", options=" + this.options + ", emojis=" + this.emojis + ", validation=" + this.validation + ", conditionalActions=" + this.conditionalActions + ", defaultAction=" + this.defaultAction + ')';
    }

    public SurveyRatingMeta(SurveyRatingType type, String lowerLabel, String upperLabel, int i13, List<String> list, ValidationConfig validationConfig, List<NudgeConditionalAction> list2, Action action) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(lowerLabel, "lowerLabel");
        AbstractC22676k.m65750j(upperLabel, "upperLabel");
        this.type = type;
        this.lowerLabel = lowerLabel;
        this.upperLabel = upperLabel;
        this.options = i13;
        this.emojis = list;
        this.validation = validationConfig;
        this.conditionalActions = list2;
        this.defaultAction = action;
    }

    public /* synthetic */ SurveyRatingMeta(SurveyRatingType surveyRatingType, String str, String str2, int i13, List list, ValidationConfig validationConfig, List list2, Action action, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(surveyRatingType, str, str2, i13, (i14 & 16) != 0 ? null : list, (i14 & 32) != 0 ? null : validationConfig, (i14 & 64) != 0 ? null : list2, (i14 & 128) != 0 ? null : action);
    }
}
