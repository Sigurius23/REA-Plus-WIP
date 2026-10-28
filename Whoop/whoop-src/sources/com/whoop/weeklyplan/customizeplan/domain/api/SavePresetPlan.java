package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.design.models.items.PlanStyle;
import com.whoop.design.models.modal.C8527a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JJ\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010 ¨\u00064"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;", "", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;", "targetGoals", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;", "activityGoals", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;", "behaviorGoals", "Lcom/whoop/design/models/items/PlanStyle;", "presetName", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/PlanStyle;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTargetGoals", "getActivityGoals", "getBehaviorGoals", "Lcom/whoop/design/models/items/PlanStyle;", "getPresetName", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SavePresetPlan {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<ActivityTarget> activityGoals;
    private final List<BehaviorTarget> behaviorGoals;
    private final PlanStyle presetName;
    private final List<ConfirmTarget.ConfirmMetricTarget> targetGoals;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SavePresetPlan$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C8527a(24)), AbstractC30060g.m92087G(enumC23463i, new C8527a(25)), AbstractC30060g.m92087G(enumC23463i, new C8527a(26)), AbstractC30060g.m92087G(enumC23463i, new C8527a(27))};
    }

    public /* synthetic */ SavePresetPlan(int i13, List list, List list2, List list3, PlanStyle planStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SavePresetPlan$$serializer.INSTANCE.getDescriptor());
        }
        this.targetGoals = list;
        this.activityGoals = list2;
        this.behaviorGoals = list3;
        this.presetName = planStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ConfirmTarget$ConfirmMetricTarget$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ActivityTarget$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(BehaviorTarget$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.PlanStyle", PlanStyle.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavePresetPlan copy$default(SavePresetPlan savePresetPlan, List list, List list2, List list3, PlanStyle planStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = savePresetPlan.targetGoals;
        }
        if ((i13 & 2) != 0) {
            list2 = savePresetPlan.activityGoals;
        }
        if ((i13 & 4) != 0) {
            list3 = savePresetPlan.behaviorGoals;
        }
        if ((i13 & 8) != 0) {
            planStyle = savePresetPlan.presetName;
        }
        return savePresetPlan.copy(list, list2, list3, planStyle);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(SavePresetPlan self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.targetGoals);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.activityGoals);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.behaviorGoals);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.presetName);
    }

    public final List<ConfirmTarget.ConfirmMetricTarget> component1() {
        return this.targetGoals;
    }

    public final List<ActivityTarget> component2() {
        return this.activityGoals;
    }

    public final List<BehaviorTarget> component3() {
        return this.behaviorGoals;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PlanStyle getPresetName() {
        return this.presetName;
    }

    public final SavePresetPlan copy(List<ConfirmTarget.ConfirmMetricTarget> targetGoals, List<ActivityTarget> activityGoals, List<BehaviorTarget> behaviorGoals, PlanStyle presetName) {
        AbstractC22676k.m65750j(targetGoals, "targetGoals");
        AbstractC22676k.m65750j(activityGoals, "activityGoals");
        AbstractC22676k.m65750j(behaviorGoals, "behaviorGoals");
        AbstractC22676k.m65750j(presetName, "presetName");
        return new SavePresetPlan(targetGoals, activityGoals, behaviorGoals, presetName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavePresetPlan)) {
            return false;
        }
        SavePresetPlan savePresetPlan = (SavePresetPlan) other;
        return AbstractC22676k.m65745e(this.targetGoals, savePresetPlan.targetGoals) && AbstractC22676k.m65745e(this.activityGoals, savePresetPlan.activityGoals) && AbstractC22676k.m65745e(this.behaviorGoals, savePresetPlan.behaviorGoals) && this.presetName == savePresetPlan.presetName;
    }

    public final List<ActivityTarget> getActivityGoals() {
        return this.activityGoals;
    }

    public final List<BehaviorTarget> getBehaviorGoals() {
        return this.behaviorGoals;
    }

    public final PlanStyle getPresetName() {
        return this.presetName;
    }

    public final List<ConfirmTarget.ConfirmMetricTarget> getTargetGoals() {
        return this.targetGoals;
    }

    public int hashCode() {
        return this.presetName.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.targetGoals.hashCode() * 31, 31, this.activityGoals), 31, this.behaviorGoals);
    }

    public String toString() {
        List<ConfirmTarget.ConfirmMetricTarget> list = this.targetGoals;
        List<ActivityTarget> list2 = this.activityGoals;
        List<BehaviorTarget> list3 = this.behaviorGoals;
        PlanStyle planStyle = this.presetName;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("SavePresetPlan(targetGoals=", ", activityGoals=", list, ", behaviorGoals=", list2);
        sbM124380j.append(list3);
        sbM124380j.append(", presetName=");
        sbM124380j.append(planStyle);
        sbM124380j.append(")");
        return sbM124380j.toString();
    }

    public SavePresetPlan(List<ConfirmTarget.ConfirmMetricTarget> targetGoals, List<ActivityTarget> activityGoals, List<BehaviorTarget> behaviorGoals, PlanStyle presetName) {
        AbstractC22676k.m65750j(targetGoals, "targetGoals");
        AbstractC22676k.m65750j(activityGoals, "activityGoals");
        AbstractC22676k.m65750j(behaviorGoals, "behaviorGoals");
        AbstractC22676k.m65750j(presetName, "presetName");
        this.targetGoals = targetGoals;
        this.activityGoals = activityGoals;
        this.behaviorGoals = behaviorGoals;
        this.presetName = presetName;
    }
}
