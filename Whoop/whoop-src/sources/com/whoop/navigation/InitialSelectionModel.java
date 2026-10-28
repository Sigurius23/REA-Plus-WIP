package com.whoop.navigation;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j00.C21118u;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ@\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001aR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u001a¨\u00063"}, m65681d2 = {"Lcom/whoop/navigation/InitialSelectionModel;", "", "", "Lcom/whoop/navigation/TargetGoalModel;", "targetGoals", "Lcom/whoop/navigation/ActivityGoalModel;", "activityGoals", "Lcom/whoop/navigation/BehaviorGoalModel;", "behaviorGoals", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/InitialSelectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/navigation/InitialSelectionModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTargetGoals", "getTargetGoals$annotations", "()V", "getActivityGoals", "getActivityGoals$annotations", "getBehaviorGoals", "getBehaviorGoals$annotations", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InitialSelectionModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<ActivityGoalModel> activityGoals;
    private final List<BehaviorGoalModel> behaviorGoals;
    private final List<TargetGoalModel> targetGoals;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.InitialSelectionModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/InitialSelectionModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/InitialSelectionModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InitialSelectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C21118u(27)), AbstractC30060g.m92087G(enumC23463i, new C21118u(28)), AbstractC30060g.m92087G(enumC23463i, new C21118u(29))};
    }

    public InitialSelectionModel() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TargetGoalModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ActivityGoalModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(BehaviorGoalModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitialSelectionModel copy$default(InitialSelectionModel initialSelectionModel, List list, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = initialSelectionModel.targetGoals;
        }
        if ((i13 & 2) != 0) {
            list2 = initialSelectionModel.activityGoals;
        }
        if ((i13 & 4) != 0) {
            list3 = initialSelectionModel.behaviorGoals;
        }
        return initialSelectionModel.copy(list, list2, list3);
    }

    @InterfaceC37143h("activityGoals")
    public static /* synthetic */ void getActivityGoals$annotations() {
    }

    @InterfaceC37143h("behaviorGoals")
    public static /* synthetic */ void getBehaviorGoals$annotations() {
    }

    @InterfaceC37143h("targetGoals")
    public static /* synthetic */ void getTargetGoals$annotations() {
    }

    public static final /* synthetic */ void write$Self$navigation_release(InitialSelectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 0);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.targetGoals, c25271y)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.targetGoals);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.activityGoals, c25271y)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.activityGoals);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.behaviorGoals, c25271y)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.behaviorGoals);
    }

    public final List<TargetGoalModel> component1() {
        return this.targetGoals;
    }

    public final List<ActivityGoalModel> component2() {
        return this.activityGoals;
    }

    public final List<BehaviorGoalModel> component3() {
        return this.behaviorGoals;
    }

    public final InitialSelectionModel copy(List<TargetGoalModel> targetGoals, List<ActivityGoalModel> activityGoals, List<BehaviorGoalModel> behaviorGoals) {
        AbstractC22676k.m65750j(targetGoals, "targetGoals");
        AbstractC22676k.m65750j(activityGoals, "activityGoals");
        AbstractC22676k.m65750j(behaviorGoals, "behaviorGoals");
        return new InitialSelectionModel(targetGoals, activityGoals, behaviorGoals);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialSelectionModel)) {
            return false;
        }
        InitialSelectionModel initialSelectionModel = (InitialSelectionModel) other;
        return AbstractC22676k.m65745e(this.targetGoals, initialSelectionModel.targetGoals) && AbstractC22676k.m65745e(this.activityGoals, initialSelectionModel.activityGoals) && AbstractC22676k.m65745e(this.behaviorGoals, initialSelectionModel.behaviorGoals);
    }

    public final List<ActivityGoalModel> getActivityGoals() {
        return this.activityGoals;
    }

    public final List<BehaviorGoalModel> getBehaviorGoals() {
        return this.behaviorGoals;
    }

    public final List<TargetGoalModel> getTargetGoals() {
        return this.targetGoals;
    }

    public int hashCode() {
        return this.behaviorGoals.hashCode() + AbstractC11895b.m31983b(this.targetGoals.hashCode() * 31, 31, this.activityGoals);
    }

    public String toString() {
        List<TargetGoalModel> list = this.targetGoals;
        List<ActivityGoalModel> list2 = this.activityGoals;
        return AbstractC3855a.m11829m(AbstractC38963t7.m124380j("InitialSelectionModel(targetGoals=", ", activityGoals=", list, ", behaviorGoals=", list2), this.behaviorGoals, ")");
    }

    public /* synthetic */ InitialSelectionModel(int i13, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.targetGoals = c25271y;
        } else {
            this.targetGoals = list;
        }
        if ((i13 & 2) == 0) {
            this.activityGoals = c25271y;
        } else {
            this.activityGoals = list2;
        }
        if ((i13 & 4) == 0) {
            this.behaviorGoals = c25271y;
        } else {
            this.behaviorGoals = list3;
        }
    }

    public InitialSelectionModel(List<TargetGoalModel> targetGoals, List<ActivityGoalModel> activityGoals, List<BehaviorGoalModel> behaviorGoals) {
        AbstractC22676k.m65750j(targetGoals, "targetGoals");
        AbstractC22676k.m65750j(activityGoals, "activityGoals");
        AbstractC22676k.m65750j(behaviorGoals, "behaviorGoals");
        this.targetGoals = targetGoals;
        this.activityGoals = activityGoals;
        this.behaviorGoals = behaviorGoals;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InitialSelectionModel(List list, List list2, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2, (i13 & 4) != 0 ? c25271y : list3);
    }
}
