package com.whoop.weeklyplan.weeklyplan.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;", "", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "plan", "", "cancelPlanButtonDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;", "cancelPlanModal", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;", "metadata", "<init>", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;", "component4", "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;", "copy", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;", "getPlan", "Ljava/lang/String;", "getCancelPlanButtonDisplay", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;", "getCancelPlanModal", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;", "getMetadata", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PresetLandingResponse {
    private final String cancelPlanButtonDisplay;
    private final CancelPlanModal cancelPlanModal;
    private final MetaData metadata;
    private final WeeklyPlanModel plan;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/PresetLandingResponse;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PresetLandingResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PresetLandingResponse(int i13, WeeklyPlanModel weeklyPlanModel, String str, CancelPlanModal cancelPlanModal, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PresetLandingResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.plan = weeklyPlanModel;
        this.cancelPlanButtonDisplay = str;
        this.cancelPlanModal = cancelPlanModal;
        if ((i13 & 8) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
    }

    public static /* synthetic */ PresetLandingResponse copy$default(PresetLandingResponse presetLandingResponse, WeeklyPlanModel weeklyPlanModel, String str, CancelPlanModal cancelPlanModal, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            weeklyPlanModel = presetLandingResponse.plan;
        }
        if ((i13 & 2) != 0) {
            str = presetLandingResponse.cancelPlanButtonDisplay;
        }
        if ((i13 & 4) != 0) {
            cancelPlanModal = presetLandingResponse.cancelPlanModal;
        }
        if ((i13 & 8) != 0) {
            metaData = presetLandingResponse.metadata;
        }
        return presetLandingResponse.copy(weeklyPlanModel, str, cancelPlanModal, metaData);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(PresetLandingResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, WeeklyPlanModel$$serializer.INSTANCE, self.plan);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.cancelPlanButtonDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, CancelPlanModal$$serializer.INSTANCE, self.cancelPlanModal);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WeeklyPlanModel getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCancelPlanButtonDisplay() {
        return this.cancelPlanButtonDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CancelPlanModal getCancelPlanModal() {
        return this.cancelPlanModal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final PresetLandingResponse copy(WeeklyPlanModel plan, String cancelPlanButtonDisplay, CancelPlanModal cancelPlanModal, MetaData metadata) {
        AbstractC22676k.m65750j(plan, "plan");
        return new PresetLandingResponse(plan, cancelPlanButtonDisplay, cancelPlanModal, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PresetLandingResponse)) {
            return false;
        }
        PresetLandingResponse presetLandingResponse = (PresetLandingResponse) other;
        return AbstractC22676k.m65745e(this.plan, presetLandingResponse.plan) && AbstractC22676k.m65745e(this.cancelPlanButtonDisplay, presetLandingResponse.cancelPlanButtonDisplay) && AbstractC22676k.m65745e(this.cancelPlanModal, presetLandingResponse.cancelPlanModal) && AbstractC22676k.m65745e(this.metadata, presetLandingResponse.metadata);
    }

    public final String getCancelPlanButtonDisplay() {
        return this.cancelPlanButtonDisplay;
    }

    public final CancelPlanModal getCancelPlanModal() {
        return this.cancelPlanModal;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final WeeklyPlanModel getPlan() {
        return this.plan;
    }

    public int hashCode() {
        int iHashCode = this.plan.hashCode() * 31;
        String str = this.cancelPlanButtonDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CancelPlanModal cancelPlanModal = this.cancelPlanModal;
        int iHashCode3 = (iHashCode2 + (cancelPlanModal == null ? 0 : cancelPlanModal.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode3 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        return "PresetLandingResponse(plan=" + this.plan + ", cancelPlanButtonDisplay=" + this.cancelPlanButtonDisplay + ", cancelPlanModal=" + this.cancelPlanModal + ", metadata=" + this.metadata + ")";
    }

    public PresetLandingResponse(WeeklyPlanModel plan, String str, CancelPlanModal cancelPlanModal, MetaData metaData) {
        AbstractC22676k.m65750j(plan, "plan");
        this.plan = plan;
        this.cancelPlanButtonDisplay = str;
        this.cancelPlanModal = cancelPlanModal;
        this.metadata = metaData;
    }

    public /* synthetic */ PresetLandingResponse(WeeklyPlanModel weeklyPlanModel, String str, CancelPlanModal cancelPlanModal, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(weeklyPlanModel, str, cancelPlanModal, (i13 & 8) != 0 ? null : metaData);
    }
}
