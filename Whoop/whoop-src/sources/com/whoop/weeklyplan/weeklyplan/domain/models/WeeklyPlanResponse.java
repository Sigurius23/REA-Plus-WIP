package com.whoop.weeklyplan.weeklyplan.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "plan", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;", "summary", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;", "metadata", "<init>", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "component2", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;", "component3", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;", "copy", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "getPlan", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;", "getSummary", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;", "getMetadata", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeeklyPlanResponse {
    private final MetaData metadata;
    private final WeeklyPlanModel plan;
    private final SummaryState summary;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeeklyPlanResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeeklyPlanResponse(int i13, WeeklyPlanModel weeklyPlanModel, SummaryState summaryState, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, WeeklyPlanResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.plan = weeklyPlanModel;
        this.summary = summaryState;
        if ((i13 & 4) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
    }

    public static /* synthetic */ WeeklyPlanResponse copy$default(WeeklyPlanResponse weeklyPlanResponse, WeeklyPlanModel weeklyPlanModel, SummaryState summaryState, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            weeklyPlanModel = weeklyPlanResponse.plan;
        }
        if ((i13 & 2) != 0) {
            summaryState = weeklyPlanResponse.summary;
        }
        if ((i13 & 4) != 0) {
            metaData = weeklyPlanResponse.metadata;
        }
        return weeklyPlanResponse.copy(weeklyPlanModel, summaryState, metaData);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(WeeklyPlanResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, WeeklyPlanModel$$serializer.INSTANCE, self.plan);
        output.encodeNullableSerializableElement(serialDesc, 1, SummaryState$$serializer.INSTANCE, self.summary);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WeeklyPlanModel getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SummaryState getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final WeeklyPlanResponse copy(WeeklyPlanModel plan, SummaryState summary, MetaData metadata) {
        AbstractC22676k.m65750j(plan, "plan");
        return new WeeklyPlanResponse(plan, summary, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyPlanResponse)) {
            return false;
        }
        WeeklyPlanResponse weeklyPlanResponse = (WeeklyPlanResponse) other;
        return AbstractC22676k.m65745e(this.plan, weeklyPlanResponse.plan) && AbstractC22676k.m65745e(this.summary, weeklyPlanResponse.summary) && AbstractC22676k.m65745e(this.metadata, weeklyPlanResponse.metadata);
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final WeeklyPlanModel getPlan() {
        return this.plan;
    }

    public final SummaryState getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int iHashCode = this.plan.hashCode() * 31;
        SummaryState summaryState = this.summary;
        int iHashCode2 = (iHashCode + (summaryState == null ? 0 : summaryState.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode2 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        return "WeeklyPlanResponse(plan=" + this.plan + ", summary=" + this.summary + ", metadata=" + this.metadata + ")";
    }

    public WeeklyPlanResponse(WeeklyPlanModel plan, SummaryState summaryState, MetaData metaData) {
        AbstractC22676k.m65750j(plan, "plan");
        this.plan = plan;
        this.summary = summaryState;
        this.metadata = metaData;
    }

    public /* synthetic */ WeeklyPlanResponse(WeeklyPlanModel weeklyPlanModel, SummaryState summaryState, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(weeklyPlanModel, summaryState, (i13 & 4) != 0 ? null : metaData);
    }
}
