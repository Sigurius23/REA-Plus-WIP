package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b\u0003\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "isInPlan", "", "scrollId", "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/navigation/AiAction;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Ljava/lang/String;", "getScrollId", "getSource", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeeklyPlanOverviewScreenModel implements CommonNavigationScreenModel {
    private final AiAction aiAction;
    private final Boolean isInPlan;
    private final String scrollId;
    private final String source;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.WeeklyPlanOverviewScreenModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeeklyPlanOverviewScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WeeklyPlanOverviewScreenModel() {
        this((Boolean) null, (String) null, (String) null, (AiAction) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ WeeklyPlanOverviewScreenModel copy$default(WeeklyPlanOverviewScreenModel weeklyPlanOverviewScreenModel, Boolean bool, String str, String str2, AiAction aiAction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = weeklyPlanOverviewScreenModel.isInPlan;
        }
        if ((i13 & 2) != 0) {
            str = weeklyPlanOverviewScreenModel.scrollId;
        }
        if ((i13 & 4) != 0) {
            str2 = weeklyPlanOverviewScreenModel.source;
        }
        if ((i13 & 8) != 0) {
            aiAction = weeklyPlanOverviewScreenModel.aiAction;
        }
        return weeklyPlanOverviewScreenModel.copy(bool, str, str2, aiAction);
    }

    public static final /* synthetic */ void write$Self$navigation_release(WeeklyPlanOverviewScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isInPlan != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isInPlan);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.scrollId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.scrollId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.source);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.aiAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, AiAction$$serializer.INSTANCE, self.aiAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsInPlan() {
        return this.isInPlan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScrollId() {
        return this.scrollId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final WeeklyPlanOverviewScreenModel copy(Boolean isInPlan, String scrollId, String source, AiAction aiAction) {
        return new WeeklyPlanOverviewScreenModel(isInPlan, scrollId, source, aiAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyPlanOverviewScreenModel)) {
            return false;
        }
        WeeklyPlanOverviewScreenModel weeklyPlanOverviewScreenModel = (WeeklyPlanOverviewScreenModel) other;
        return AbstractC22676k.m65745e(this.isInPlan, weeklyPlanOverviewScreenModel.isInPlan) && AbstractC22676k.m65745e(this.scrollId, weeklyPlanOverviewScreenModel.scrollId) && AbstractC22676k.m65745e(this.source, weeklyPlanOverviewScreenModel.source) && AbstractC22676k.m65745e(this.aiAction, weeklyPlanOverviewScreenModel.aiAction);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final String getScrollId() {
        return this.scrollId;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        Boolean bool = this.isInPlan;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.scrollId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AiAction aiAction = this.aiAction;
        return iHashCode3 + (aiAction != null ? aiAction.hashCode() : 0);
    }

    public final Boolean isInPlan() {
        return this.isInPlan;
    }

    public String toString() {
        return "WeeklyPlanOverviewScreenModel(isInPlan=" + this.isInPlan + ", scrollId=" + this.scrollId + ", source=" + this.source + ", aiAction=" + this.aiAction + ")";
    }

    public /* synthetic */ WeeklyPlanOverviewScreenModel(int i13, Boolean bool, String str, String str2, AiAction aiAction, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.isInPlan = null;
        } else {
            this.isInPlan = bool;
        }
        if ((i13 & 2) == 0) {
            this.scrollId = null;
        } else {
            this.scrollId = str;
        }
        if ((i13 & 4) == 0) {
            this.source = null;
        } else {
            this.source = str2;
        }
        if ((i13 & 8) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
    }

    public WeeklyPlanOverviewScreenModel(Boolean bool, String str, String str2, AiAction aiAction) {
        this.isInPlan = bool;
        this.scrollId = str;
        this.source = str2;
        this.aiAction = aiAction;
    }

    public /* synthetic */ WeeklyPlanOverviewScreenModel(Boolean bool, String str, String str2, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : aiAction);
    }
}
