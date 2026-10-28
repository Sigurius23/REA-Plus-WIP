package com.whoop.weeklyplan.hubandspoke.domain.api;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kt2.C22831a;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ@\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010\u001a¨\u0006."}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;", "", "", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/GoalKotlinx;", "targetGoals", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivityKotlinx;", "activityGoals", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorKotlinx;", "behaviorGoals", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTargetGoals", "getActivityGoals", "getBehaviorGoals", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InitialSelectionKotlinx {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<ActivityKotlinx> activityGoals;
    private final List<BehaviorKotlinx> behaviorGoals;
    private final List<GoalKotlinx> targetGoals;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InitialSelectionKotlinx$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C22831a(3)), AbstractC30060g.m92087G(enumC23463i, new C22831a(4)), AbstractC30060g.m92087G(enumC23463i, new C22831a(5))};
    }

    public /* synthetic */ InitialSelectionKotlinx(int i13, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, InitialSelectionKotlinx$$serializer.INSTANCE.getDescriptor());
        }
        this.targetGoals = list;
        this.activityGoals = list2;
        this.behaviorGoals = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(GoalKotlinx$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ActivityKotlinx$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(BehaviorKotlinx$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitialSelectionKotlinx copy$default(InitialSelectionKotlinx initialSelectionKotlinx, List list, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = initialSelectionKotlinx.targetGoals;
        }
        if ((i13 & 2) != 0) {
            list2 = initialSelectionKotlinx.activityGoals;
        }
        if ((i13 & 4) != 0) {
            list3 = initialSelectionKotlinx.behaviorGoals;
        }
        return initialSelectionKotlinx.copy(list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(InitialSelectionKotlinx self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.targetGoals);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.activityGoals);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.behaviorGoals);
    }

    public final List<GoalKotlinx> component1() {
        return this.targetGoals;
    }

    public final List<ActivityKotlinx> component2() {
        return this.activityGoals;
    }

    public final List<BehaviorKotlinx> component3() {
        return this.behaviorGoals;
    }

    public final InitialSelectionKotlinx copy(List<GoalKotlinx> targetGoals, List<ActivityKotlinx> activityGoals, List<BehaviorKotlinx> behaviorGoals) {
        AbstractC22676k.m65750j(targetGoals, "targetGoals");
        AbstractC22676k.m65750j(activityGoals, "activityGoals");
        AbstractC22676k.m65750j(behaviorGoals, "behaviorGoals");
        return new InitialSelectionKotlinx(targetGoals, activityGoals, behaviorGoals);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialSelectionKotlinx)) {
            return false;
        }
        InitialSelectionKotlinx initialSelectionKotlinx = (InitialSelectionKotlinx) other;
        return AbstractC22676k.m65745e(this.targetGoals, initialSelectionKotlinx.targetGoals) && AbstractC22676k.m65745e(this.activityGoals, initialSelectionKotlinx.activityGoals) && AbstractC22676k.m65745e(this.behaviorGoals, initialSelectionKotlinx.behaviorGoals);
    }

    public final List<ActivityKotlinx> getActivityGoals() {
        return this.activityGoals;
    }

    public final List<BehaviorKotlinx> getBehaviorGoals() {
        return this.behaviorGoals;
    }

    public final List<GoalKotlinx> getTargetGoals() {
        return this.targetGoals;
    }

    public int hashCode() {
        return this.behaviorGoals.hashCode() + AbstractC11895b.m31983b(this.targetGoals.hashCode() * 31, 31, this.activityGoals);
    }

    public String toString() {
        List<GoalKotlinx> list = this.targetGoals;
        List<ActivityKotlinx> list2 = this.activityGoals;
        return AbstractC3855a.m11829m(AbstractC38963t7.m124380j("InitialSelectionKotlinx(targetGoals=", ", activityGoals=", list, ", behaviorGoals=", list2), this.behaviorGoals, ")");
    }

    public InitialSelectionKotlinx(List<GoalKotlinx> targetGoals, List<ActivityKotlinx> activityGoals, List<BehaviorKotlinx> behaviorGoals) {
        AbstractC22676k.m65750j(targetGoals, "targetGoals");
        AbstractC22676k.m65750j(activityGoals, "activityGoals");
        AbstractC22676k.m65750j(behaviorGoals, "behaviorGoals");
        this.targetGoals = targetGoals;
        this.activityGoals = activityGoals;
        this.behaviorGoals = behaviorGoals;
    }
}
