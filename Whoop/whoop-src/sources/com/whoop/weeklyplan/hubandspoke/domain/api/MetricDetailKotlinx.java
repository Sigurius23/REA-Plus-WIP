package com.whoop.weeklyplan.hubandspoke.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricCardModel;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricCardModel$$serializer;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricPlanTileModel;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricPlanTileModel$$serializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JB\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001cJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010$¨\u0006;"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;", "", "", "goalTypeId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalType", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;", "metricCard", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;", "metricPlanTile", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;", "associatedBehaviorsActivities", "<init>", "(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "component3", "()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;", "component4", "()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;", "component5", "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;", "copy", "(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getGoalTypeId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "getGoalType", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;", "getMetricCard", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;", "getMetricPlanTile", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;", "getAssociatedBehaviorsActivities", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetricDetailKotlinx {
    private final AssociatedBehaviorsActivitiesKotlinx associatedBehaviorsActivities;
    private final TargetGoalType goalType;
    private final int goalTypeId;
    private final MetricCardModel metricCard;
    private final MetricPlanTileModel metricPlanTile;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22831a(9)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetricDetailKotlinx$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetricDetailKotlinx(int i13, int i14, TargetGoalType targetGoalType, MetricCardModel metricCardModel, MetricPlanTileModel metricPlanTileModel, AssociatedBehaviorsActivitiesKotlinx associatedBehaviorsActivitiesKotlinx, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MetricDetailKotlinx$$serializer.INSTANCE.getDescriptor());
        }
        this.goalTypeId = i14;
        this.goalType = targetGoalType;
        this.metricCard = metricCardModel;
        this.metricPlanTile = metricPlanTileModel;
        this.associatedBehaviorsActivities = associatedBehaviorsActivitiesKotlinx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return TargetGoalType.INSTANCE.serializer();
    }

    public static /* synthetic */ MetricDetailKotlinx copy$default(MetricDetailKotlinx metricDetailKotlinx, int i13, TargetGoalType targetGoalType, MetricCardModel metricCardModel, MetricPlanTileModel metricPlanTileModel, AssociatedBehaviorsActivitiesKotlinx associatedBehaviorsActivitiesKotlinx, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = metricDetailKotlinx.goalTypeId;
        }
        if ((i14 & 2) != 0) {
            targetGoalType = metricDetailKotlinx.goalType;
        }
        if ((i14 & 4) != 0) {
            metricCardModel = metricDetailKotlinx.metricCard;
        }
        if ((i14 & 8) != 0) {
            metricPlanTileModel = metricDetailKotlinx.metricPlanTile;
        }
        if ((i14 & 16) != 0) {
            associatedBehaviorsActivitiesKotlinx = metricDetailKotlinx.associatedBehaviorsActivities;
        }
        AssociatedBehaviorsActivitiesKotlinx associatedBehaviorsActivitiesKotlinx2 = associatedBehaviorsActivitiesKotlinx;
        MetricCardModel metricCardModel2 = metricCardModel;
        return metricDetailKotlinx.copy(i13, targetGoalType, metricCardModel2, metricPlanTileModel, associatedBehaviorsActivitiesKotlinx2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(MetricDetailKotlinx self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.goalTypeId);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.goalType);
        output.encodeSerializableElement(serialDesc, 2, MetricCardModel$$serializer.INSTANCE, self.metricCard);
        output.encodeSerializableElement(serialDesc, 3, MetricPlanTileModel$$serializer.INSTANCE, self.metricPlanTile);
        output.encodeSerializableElement(serialDesc, 4, AssociatedBehaviorsActivitiesKotlinx$$serializer.INSTANCE, self.associatedBehaviorsActivities);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGoalTypeId() {
        return this.goalTypeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TargetGoalType getGoalType() {
        return this.goalType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MetricCardModel getMetricCard() {
        return this.metricCard;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MetricPlanTileModel getMetricPlanTile() {
        return this.metricPlanTile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AssociatedBehaviorsActivitiesKotlinx getAssociatedBehaviorsActivities() {
        return this.associatedBehaviorsActivities;
    }

    public final MetricDetailKotlinx copy(int goalTypeId, TargetGoalType goalType, MetricCardModel metricCard, MetricPlanTileModel metricPlanTile, AssociatedBehaviorsActivitiesKotlinx associatedBehaviorsActivities) {
        AbstractC22676k.m65750j(goalType, "goalType");
        AbstractC22676k.m65750j(metricCard, "metricCard");
        AbstractC22676k.m65750j(metricPlanTile, "metricPlanTile");
        AbstractC22676k.m65750j(associatedBehaviorsActivities, "associatedBehaviorsActivities");
        return new MetricDetailKotlinx(goalTypeId, goalType, metricCard, metricPlanTile, associatedBehaviorsActivities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricDetailKotlinx)) {
            return false;
        }
        MetricDetailKotlinx metricDetailKotlinx = (MetricDetailKotlinx) other;
        return this.goalTypeId == metricDetailKotlinx.goalTypeId && this.goalType == metricDetailKotlinx.goalType && AbstractC22676k.m65745e(this.metricCard, metricDetailKotlinx.metricCard) && AbstractC22676k.m65745e(this.metricPlanTile, metricDetailKotlinx.metricPlanTile) && AbstractC22676k.m65745e(this.associatedBehaviorsActivities, metricDetailKotlinx.associatedBehaviorsActivities);
    }

    public final AssociatedBehaviorsActivitiesKotlinx getAssociatedBehaviorsActivities() {
        return this.associatedBehaviorsActivities;
    }

    public final TargetGoalType getGoalType() {
        return this.goalType;
    }

    public final int getGoalTypeId() {
        return this.goalTypeId;
    }

    public final MetricCardModel getMetricCard() {
        return this.metricCard;
    }

    public final MetricPlanTileModel getMetricPlanTile() {
        return this.metricPlanTile;
    }

    public int hashCode() {
        return this.associatedBehaviorsActivities.hashCode() + ((this.metricPlanTile.hashCode() + ((this.metricCard.hashCode() + AbstractC36095b.m114674b(this.goalType, Integer.hashCode(this.goalTypeId) * 31, 31)) * 31)) * 31);
    }

    public String toString() {
        return "MetricDetailKotlinx(goalTypeId=" + this.goalTypeId + ", goalType=" + this.goalType + ", metricCard=" + this.metricCard + ", metricPlanTile=" + this.metricPlanTile + ", associatedBehaviorsActivities=" + this.associatedBehaviorsActivities + ")";
    }

    public MetricDetailKotlinx(int i13, TargetGoalType goalType, MetricCardModel metricCard, MetricPlanTileModel metricPlanTile, AssociatedBehaviorsActivitiesKotlinx associatedBehaviorsActivities) {
        AbstractC22676k.m65750j(goalType, "goalType");
        AbstractC22676k.m65750j(metricCard, "metricCard");
        AbstractC22676k.m65750j(metricPlanTile, "metricPlanTile");
        AbstractC22676k.m65750j(associatedBehaviorsActivities, "associatedBehaviorsActivities");
        this.goalTypeId = i13;
        this.goalType = goalType;
        this.metricCard = metricCard;
        this.metricPlanTile = metricPlanTile;
        this.associatedBehaviorsActivities = associatedBehaviorsActivities;
    }
}
