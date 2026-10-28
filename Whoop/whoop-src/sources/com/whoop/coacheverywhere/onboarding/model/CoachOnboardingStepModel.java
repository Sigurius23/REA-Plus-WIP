package com.whoop.coacheverywhere.onboarding.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wl2.C37358a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010&J\\\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010 R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b:\u0010&¨\u0006>"}, m65681d2 = {"Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;", "", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;", "stepId", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;", "highlight", "", "", "lines", "buttonText", "", "showsBottomBar", "autoAdvance", "<init>", "(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$coach_everywhere_release", "(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;", "component2", "()Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Boolean;", "component6", "copy", "(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepID;", "getStepId", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;", "getHighlight", "Ljava/util/List;", "getLines", "Ljava/lang/String;", "getButtonText", "Ljava/lang/Boolean;", "getShowsBottomBar", "getAutoAdvance", "Companion", "$serializer", "a", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CoachOnboardingStepModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Boolean autoAdvance;
    private final String buttonText;
    private final CoachOnboardingHighlightID highlight;
    private final List<String> lines;
    private final Boolean showsBottomBar;
    private final CoachOnboardingStepID stepId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingStepModel;", "serializer", "()Lwc3/c;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CoachOnboardingStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C37358a(23)), AbstractC30060g.m92087G(enumC23463i, new C37358a(24)), AbstractC30060g.m92087G(enumC23463i, new C37358a(25)), null, null, null};
    }

    public /* synthetic */ CoachOnboardingStepModel(int i13, CoachOnboardingStepID coachOnboardingStepID, CoachOnboardingHighlightID coachOnboardingHighlightID, List list, String str, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, CoachOnboardingStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.stepId = coachOnboardingStepID;
        if ((i13 & 2) == 0) {
            this.highlight = null;
        } else {
            this.highlight = coachOnboardingHighlightID;
        }
        if ((i13 & 4) == 0) {
            this.lines = null;
        } else {
            this.lines = list;
        }
        if ((i13 & 8) == 0) {
            this.buttonText = null;
        } else {
            this.buttonText = str;
        }
        if ((i13 & 16) == 0) {
            this.showsBottomBar = null;
        } else {
            this.showsBottomBar = bool;
        }
        if ((i13 & 32) == 0) {
            this.autoAdvance = null;
        } else {
            this.autoAdvance = bool2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return CoachOnboardingStepID.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return CoachOnboardingHighlightID.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoachOnboardingStepModel copy$default(CoachOnboardingStepModel coachOnboardingStepModel, CoachOnboardingStepID coachOnboardingStepID, CoachOnboardingHighlightID coachOnboardingHighlightID, List list, String str, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            coachOnboardingStepID = coachOnboardingStepModel.stepId;
        }
        if ((i13 & 2) != 0) {
            coachOnboardingHighlightID = coachOnboardingStepModel.highlight;
        }
        if ((i13 & 4) != 0) {
            list = coachOnboardingStepModel.lines;
        }
        if ((i13 & 8) != 0) {
            str = coachOnboardingStepModel.buttonText;
        }
        if ((i13 & 16) != 0) {
            bool = coachOnboardingStepModel.showsBottomBar;
        }
        if ((i13 & 32) != 0) {
            bool2 = coachOnboardingStepModel.autoAdvance;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return coachOnboardingStepModel.copy(coachOnboardingStepID, coachOnboardingHighlightID, list, str, bool3, bool4);
    }

    public static final /* synthetic */ void write$Self$coach_everywhere_release(CoachOnboardingStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.stepId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.highlight != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.highlight);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.lines != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.lines);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.buttonText != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.buttonText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.showsBottomBar != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.showsBottomBar);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.autoAdvance == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.autoAdvance);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CoachOnboardingStepID getStepId() {
        return this.stepId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CoachOnboardingHighlightID getHighlight() {
        return this.highlight;
    }

    public final List<String> component3() {
        return this.lines;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShowsBottomBar() {
        return this.showsBottomBar;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getAutoAdvance() {
        return this.autoAdvance;
    }

    public final CoachOnboardingStepModel copy(CoachOnboardingStepID stepId, CoachOnboardingHighlightID highlight, List<String> lines, String buttonText, Boolean showsBottomBar, Boolean autoAdvance) {
        AbstractC22676k.m65750j(stepId, "stepId");
        return new CoachOnboardingStepModel(stepId, highlight, lines, buttonText, showsBottomBar, autoAdvance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachOnboardingStepModel)) {
            return false;
        }
        CoachOnboardingStepModel coachOnboardingStepModel = (CoachOnboardingStepModel) other;
        return this.stepId == coachOnboardingStepModel.stepId && this.highlight == coachOnboardingStepModel.highlight && AbstractC22676k.m65745e(this.lines, coachOnboardingStepModel.lines) && AbstractC22676k.m65745e(this.buttonText, coachOnboardingStepModel.buttonText) && AbstractC22676k.m65745e(this.showsBottomBar, coachOnboardingStepModel.showsBottomBar) && AbstractC22676k.m65745e(this.autoAdvance, coachOnboardingStepModel.autoAdvance);
    }

    public final Boolean getAutoAdvance() {
        return this.autoAdvance;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final CoachOnboardingHighlightID getHighlight() {
        return this.highlight;
    }

    public final List<String> getLines() {
        return this.lines;
    }

    public final Boolean getShowsBottomBar() {
        return this.showsBottomBar;
    }

    public final CoachOnboardingStepID getStepId() {
        return this.stepId;
    }

    public int hashCode() {
        int iHashCode = this.stepId.hashCode() * 31;
        CoachOnboardingHighlightID coachOnboardingHighlightID = this.highlight;
        int iHashCode2 = (iHashCode + (coachOnboardingHighlightID == null ? 0 : coachOnboardingHighlightID.hashCode())) * 31;
        List<String> list = this.lines;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.buttonText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.showsBottomBar;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.autoAdvance;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        CoachOnboardingStepID coachOnboardingStepID = this.stepId;
        CoachOnboardingHighlightID coachOnboardingHighlightID = this.highlight;
        List<String> list = this.lines;
        String str = this.buttonText;
        Boolean bool = this.showsBottomBar;
        Boolean bool2 = this.autoAdvance;
        StringBuilder sb4 = new StringBuilder("CoachOnboardingStepModel(stepId=");
        sb4.append(coachOnboardingStepID);
        sb4.append(", highlight=");
        sb4.append(coachOnboardingHighlightID);
        sb4.append(", lines=");
        AbstractC17176i.m48511m(", buttonText=", str, ", showsBottomBar=", sb4, list);
        sb4.append(bool);
        sb4.append(", autoAdvance=");
        sb4.append(bool2);
        sb4.append(")");
        return sb4.toString();
    }

    public CoachOnboardingStepModel(CoachOnboardingStepID stepId, CoachOnboardingHighlightID coachOnboardingHighlightID, List<String> list, String str, Boolean bool, Boolean bool2) {
        AbstractC22676k.m65750j(stepId, "stepId");
        this.stepId = stepId;
        this.highlight = coachOnboardingHighlightID;
        this.lines = list;
        this.buttonText = str;
        this.showsBottomBar = bool;
        this.autoAdvance = bool2;
    }

    public /* synthetic */ CoachOnboardingStepModel(CoachOnboardingStepID coachOnboardingStepID, CoachOnboardingHighlightID coachOnboardingHighlightID, List list, String str, Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(coachOnboardingStepID, (i13 & 2) != 0 ? null : coachOnboardingHighlightID, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : bool, (i13 & 32) != 0 ? null : bool2);
    }
}
