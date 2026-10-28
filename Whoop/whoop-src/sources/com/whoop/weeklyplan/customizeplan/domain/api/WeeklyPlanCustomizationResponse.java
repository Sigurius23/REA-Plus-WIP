package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import o91.C27690g;
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
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B0\u0012\u0019\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB5\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010\u001f\u001a\u00020\u00002\u001b\b\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R*\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "", "Ljava/util/UUID;", "Lcom/whoop/design/json/serializers/SerializableUUID;", "Lwc3/i;", "with", "Lj93/d;", "planId", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "screens", "<init>", "(Ljava/util/UUID;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/util/List;", "copy", "(Ljava/util/UUID;Ljava/util/List;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getPlanId", "Ljava/util/List;", "getScreens", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeeklyPlanCustomizationResponse {
    private final UUID planId;
    private final List<WeeklyPlanCustomizationScreenModel> screens;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C10717a(5))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeeklyPlanCustomizationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeeklyPlanCustomizationResponse(int i13, UUID uuid, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, WeeklyPlanCustomizationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.planId = uuid;
        this.screens = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WeeklyPlanCustomizationScreenModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeeklyPlanCustomizationResponse copy$default(WeeklyPlanCustomizationResponse weeklyPlanCustomizationResponse, UUID uuid, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            uuid = weeklyPlanCustomizationResponse.planId;
        }
        if ((i13 & 2) != 0) {
            list = weeklyPlanCustomizationResponse.screens;
        }
        return weeklyPlanCustomizationResponse.copy(uuid, list);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(WeeklyPlanCustomizationResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C27690g.f111466a, self.planId);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.screens);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getPlanId() {
        return this.planId;
    }

    public final List<WeeklyPlanCustomizationScreenModel> component2() {
        return this.screens;
    }

    public final WeeklyPlanCustomizationResponse copy(UUID planId, List<WeeklyPlanCustomizationScreenModel> screens) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(screens, "screens");
        return new WeeklyPlanCustomizationResponse(planId, screens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyPlanCustomizationResponse)) {
            return false;
        }
        WeeklyPlanCustomizationResponse weeklyPlanCustomizationResponse = (WeeklyPlanCustomizationResponse) other;
        return AbstractC22676k.m65745e(this.planId, weeklyPlanCustomizationResponse.planId) && AbstractC22676k.m65745e(this.screens, weeklyPlanCustomizationResponse.screens);
    }

    public final UUID getPlanId() {
        return this.planId;
    }

    public final List<WeeklyPlanCustomizationScreenModel> getScreens() {
        return this.screens;
    }

    public int hashCode() {
        return this.screens.hashCode() + (this.planId.hashCode() * 31);
    }

    public String toString() {
        return "WeeklyPlanCustomizationResponse(planId=" + this.planId + ", screens=" + this.screens + ")";
    }

    public WeeklyPlanCustomizationResponse(UUID planId, List<WeeklyPlanCustomizationScreenModel> screens) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(screens, "screens");
        this.planId = planId;
        this.screens = screens;
    }
}
