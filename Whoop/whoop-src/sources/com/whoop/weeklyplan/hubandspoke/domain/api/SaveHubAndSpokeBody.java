package com.whoop.weeklyplan.hubandspoke.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b\u0005\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b1\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b2\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b3\u0010\u001c¨\u00066"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;", "", "", "planName", "", "isCustomized", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;", "planSelections", "source", "presetPlanCategory", "templateId", "<init>", "(Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlanName", "Z", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;", "getPlanSelections", "getSource", "getPresetPlanCategory", "getTemplateId", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SaveHubAndSpokeBody {
    private final boolean isCustomized;
    private final String planName;
    private final PlanSelections planSelections;
    private final String presetPlanCategory;
    private final String source;
    private final String templateId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SaveHubAndSpokeBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SaveHubAndSpokeBody(int i13, String str, boolean z4, PlanSelections planSelections, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, SaveHubAndSpokeBody$$serializer.INSTANCE.getDescriptor());
        }
        this.planName = str;
        this.isCustomized = z4;
        this.planSelections = planSelections;
        this.source = str2;
        this.presetPlanCategory = str3;
        this.templateId = str4;
    }

    public static /* synthetic */ SaveHubAndSpokeBody copy$default(SaveHubAndSpokeBody saveHubAndSpokeBody, String str, boolean z4, PlanSelections planSelections, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = saveHubAndSpokeBody.planName;
        }
        if ((i13 & 2) != 0) {
            z4 = saveHubAndSpokeBody.isCustomized;
        }
        if ((i13 & 4) != 0) {
            planSelections = saveHubAndSpokeBody.planSelections;
        }
        if ((i13 & 8) != 0) {
            str2 = saveHubAndSpokeBody.source;
        }
        if ((i13 & 16) != 0) {
            str3 = saveHubAndSpokeBody.presetPlanCategory;
        }
        if ((i13 & 32) != 0) {
            str4 = saveHubAndSpokeBody.templateId;
        }
        String str5 = str3;
        String str6 = str4;
        return saveHubAndSpokeBody.copy(str, z4, planSelections, str2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(SaveHubAndSpokeBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.planName);
        output.encodeBooleanElement(serialDesc, 1, self.isCustomized);
        output.encodeSerializableElement(serialDesc, 2, PlanSelections$$serializer.INSTANCE, self.planSelections);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.source);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.presetPlanCategory);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.templateId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlanName() {
        return this.planName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCustomized() {
        return this.isCustomized;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PlanSelections getPlanSelections() {
        return this.planSelections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPresetPlanCategory() {
        return this.presetPlanCategory;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    public final SaveHubAndSpokeBody copy(String planName, boolean isCustomized, PlanSelections planSelections, String source, String presetPlanCategory, String templateId) {
        AbstractC22676k.m65750j(planName, "planName");
        AbstractC22676k.m65750j(planSelections, "planSelections");
        return new SaveHubAndSpokeBody(planName, isCustomized, planSelections, source, presetPlanCategory, templateId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveHubAndSpokeBody)) {
            return false;
        }
        SaveHubAndSpokeBody saveHubAndSpokeBody = (SaveHubAndSpokeBody) other;
        return AbstractC22676k.m65745e(this.planName, saveHubAndSpokeBody.planName) && this.isCustomized == saveHubAndSpokeBody.isCustomized && AbstractC22676k.m65745e(this.planSelections, saveHubAndSpokeBody.planSelections) && AbstractC22676k.m65745e(this.source, saveHubAndSpokeBody.source) && AbstractC22676k.m65745e(this.presetPlanCategory, saveHubAndSpokeBody.presetPlanCategory) && AbstractC22676k.m65745e(this.templateId, saveHubAndSpokeBody.templateId);
    }

    public final String getPlanName() {
        return this.planName;
    }

    public final PlanSelections getPlanSelections() {
        return this.planSelections;
    }

    public final String getPresetPlanCategory() {
        return this.presetPlanCategory;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        int iHashCode = (this.planSelections.hashCode() + AbstractC2875y.m8289b(this.planName.hashCode() * 31, 31, this.isCustomized)) * 31;
        String str = this.source;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.presetPlanCategory;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.templateId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isCustomized() {
        return this.isCustomized;
    }

    public String toString() {
        String str = this.planName;
        boolean z4 = this.isCustomized;
        PlanSelections planSelections = this.planSelections;
        String str2 = this.source;
        String str3 = this.presetPlanCategory;
        String str4 = this.templateId;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("SaveHubAndSpokeBody(planName=", str, ", isCustomized=", ", planSelections=", z4);
        sbM73379l.append(planSelections);
        sbM73379l.append(", source=");
        sbM73379l.append(str2);
        sbM73379l.append(", presetPlanCategory=");
        return AbstractC11266d.m30464r(sbM73379l, str3, ", templateId=", str4, ")");
    }

    public SaveHubAndSpokeBody(String planName, boolean z4, PlanSelections planSelections, String str, String str2, String str3) {
        AbstractC22676k.m65750j(planName, "planName");
        AbstractC22676k.m65750j(planSelections, "planSelections");
        this.planName = planName;
        this.isCustomized = z4;
        this.planSelections = planSelections;
        this.source = str;
        this.presetPlanCategory = str2;
        this.templateId = str3;
    }
}
