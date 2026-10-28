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
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DEBe\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bu\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-Jt\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b0\u0010#J\u0010\u00101\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u0010!R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010#R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b:\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b\b\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010*R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b@\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010-¨\u0006F"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SurveyListMeta;", "", "", "", "options", "listType", "displayType", "", "isOrderRandom", "Lcom/amplitude/android/engagement/types/SurveyListOther;", "otherOption", "Lcom/amplitude/android/engagement/types/ValidationConfig;", "validation", "Lcom/amplitude/android/engagement/types/NudgeConditionalAction;", "conditionalActions", "Lcom/amplitude/android/engagement/types/Action;", "defaultAction", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/amplitude/android/engagement/types/SurveyListOther;Lcom/amplitude/android/engagement/types/ValidationConfig;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/amplitude/android/engagement/types/SurveyListOther;Lcom/amplitude/android/engagement/types/ValidationConfig;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SurveyListMeta;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "()Lcom/amplitude/android/engagement/types/SurveyListOther;", "component6", "()Lcom/amplitude/android/engagement/types/ValidationConfig;", "component7", "component8", "()Lcom/amplitude/android/engagement/types/Action;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/amplitude/android/engagement/types/SurveyListOther;Lcom/amplitude/android/engagement/types/ValidationConfig;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)Lcom/amplitude/android/engagement/types/SurveyListMeta;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOptions", "Ljava/lang/String;", "getListType", "getDisplayType", "Z", "Lcom/amplitude/android/engagement/types/SurveyListOther;", "getOtherOption", "Lcom/amplitude/android/engagement/types/ValidationConfig;", "getValidation", "getConditionalActions", "Lcom/amplitude/android/engagement/types/Action;", "getDefaultAction", "Companion", "$serializer", "com/amplitude/android/engagement/types/k1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SurveyListMeta {
    public static final int $stable = 8;
    private final List<NudgeConditionalAction> conditionalActions;
    private final Action defaultAction;
    private final String displayType;
    private final boolean isOrderRandom;
    private final String listType;
    private final List<String> options;
    private final SurveyListOther otherOption;
    private final ValidationConfig validation;
    public static final C4906k1 Companion = new C4906k1();
    private static final InterfaceC37138c[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(NudgeConditionalAction$$serializer.INSTANCE), Action.Companion.serializer()};

    @InterfaceC23457c
    public /* synthetic */ SurveyListMeta(int i13, List list, String str, String str2, boolean z4, SurveyListOther surveyListOther, ValidationConfig validationConfig, List list2, Action action, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SurveyListMeta$$serializer.INSTANCE.getDescriptor());
        }
        this.options = list;
        this.listType = str;
        this.displayType = str2;
        if ((i13 & 8) == 0) {
            this.isOrderRandom = false;
        } else {
            this.isOrderRandom = z4;
        }
        if ((i13 & 16) == 0) {
            this.otherOption = null;
        } else {
            this.otherOption = surveyListOther;
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
    public static /* synthetic */ SurveyListMeta copy$default(SurveyListMeta surveyListMeta, List list, String str, String str2, boolean z4, SurveyListOther surveyListOther, ValidationConfig validationConfig, List list2, Action action, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = surveyListMeta.options;
        }
        if ((i13 & 2) != 0) {
            str = surveyListMeta.listType;
        }
        if ((i13 & 4) != 0) {
            str2 = surveyListMeta.displayType;
        }
        if ((i13 & 8) != 0) {
            z4 = surveyListMeta.isOrderRandom;
        }
        if ((i13 & 16) != 0) {
            surveyListOther = surveyListMeta.otherOption;
        }
        if ((i13 & 32) != 0) {
            validationConfig = surveyListMeta.validation;
        }
        if ((i13 & 64) != 0) {
            list2 = surveyListMeta.conditionalActions;
        }
        if ((i13 & 128) != 0) {
            action = surveyListMeta.defaultAction;
        }
        List list3 = list2;
        Action action2 = action;
        SurveyListOther surveyListOther2 = surveyListOther;
        ValidationConfig validationConfig2 = validationConfig;
        return surveyListMeta.copy(list, str, str2, z4, surveyListOther2, validationConfig2, list3, action2);
    }

    public static final /* synthetic */ void write$Self(SurveyListMeta self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.options);
        output.encodeStringElement(serialDesc, 1, self.listType);
        output.encodeStringElement(serialDesc, 2, self.displayType);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.isOrderRandom) {
            output.encodeBooleanElement(serialDesc, 3, self.isOrderRandom);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.otherOption != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SurveyListOther$$serializer.INSTANCE, self.otherOption);
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

    public final List<String> component1() {
        return this.options;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getListType() {
        return this.listType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsOrderRandom() {
        return this.isOrderRandom;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SurveyListOther getOtherOption() {
        return this.otherOption;
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

    public final SurveyListMeta copy(List<String> options, String listType, String displayType, boolean isOrderRandom, SurveyListOther otherOption, ValidationConfig validation, List<NudgeConditionalAction> conditionalActions, Action defaultAction) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(listType, "listType");
        AbstractC22676k.m65750j(displayType, "displayType");
        return new SurveyListMeta(options, listType, displayType, isOrderRandom, otherOption, validation, conditionalActions, defaultAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyListMeta)) {
            return false;
        }
        SurveyListMeta surveyListMeta = (SurveyListMeta) other;
        return AbstractC22676k.m65745e(this.options, surveyListMeta.options) && AbstractC22676k.m65745e(this.listType, surveyListMeta.listType) && AbstractC22676k.m65745e(this.displayType, surveyListMeta.displayType) && this.isOrderRandom == surveyListMeta.isOrderRandom && AbstractC22676k.m65745e(this.otherOption, surveyListMeta.otherOption) && AbstractC22676k.m65745e(this.validation, surveyListMeta.validation) && AbstractC22676k.m65745e(this.conditionalActions, surveyListMeta.conditionalActions) && AbstractC22676k.m65745e(this.defaultAction, surveyListMeta.defaultAction);
    }

    public final List<NudgeConditionalAction> getConditionalActions() {
        return this.conditionalActions;
    }

    public final Action getDefaultAction() {
        return this.defaultAction;
    }

    public final String getDisplayType() {
        return this.displayType;
    }

    public final String getListType() {
        return this.listType;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final SurveyListOther getOtherOption() {
        return this.otherOption;
    }

    public final ValidationConfig getValidation() {
        return this.validation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.options.hashCode() * 31, 31, this.listType), 31, this.displayType);
        boolean z4 = this.isOrderRandom;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = (iM30450d + r10) * 31;
        SurveyListOther surveyListOther = this.otherOption;
        int iHashCode = (i13 + (surveyListOther == null ? 0 : surveyListOther.hashCode())) * 31;
        ValidationConfig validationConfig = this.validation;
        int iHashCode2 = (iHashCode + (validationConfig == null ? 0 : validationConfig.hashCode())) * 31;
        List<NudgeConditionalAction> list = this.conditionalActions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Action action = this.defaultAction;
        return iHashCode3 + (action != null ? action.hashCode() : 0);
    }

    public final boolean isOrderRandom() {
        return this.isOrderRandom;
    }

    public String toString() {
        return "SurveyListMeta(options=" + this.options + ", listType=" + this.listType + ", displayType=" + this.displayType + ", isOrderRandom=" + this.isOrderRandom + ", otherOption=" + this.otherOption + ", validation=" + this.validation + ", conditionalActions=" + this.conditionalActions + ", defaultAction=" + this.defaultAction + ')';
    }

    public SurveyListMeta(List<String> options, String listType, String displayType, boolean z4, SurveyListOther surveyListOther, ValidationConfig validationConfig, List<NudgeConditionalAction> list, Action action) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(listType, "listType");
        AbstractC22676k.m65750j(displayType, "displayType");
        this.options = options;
        this.listType = listType;
        this.displayType = displayType;
        this.isOrderRandom = z4;
        this.otherOption = surveyListOther;
        this.validation = validationConfig;
        this.conditionalActions = list;
        this.defaultAction = action;
    }

    public /* synthetic */ SurveyListMeta(List list, String str, String str2, boolean z4, SurveyListOther surveyListOther, ValidationConfig validationConfig, List list2, Action action, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : surveyListOther, (i13 & 32) != 0 ? null : validationConfig, (i13 & 64) != 0 ? null : list2, (i13 & 128) != 0 ? null : action);
    }
}
