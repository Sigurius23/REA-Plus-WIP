package com.whoop.bot.models.conversation;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21179y0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;", "", "", "indicatorPosition", "Lcom/whoop/design/util/TextResource;", "targetZonesTitle", "", "Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;", "targetZones", "<init>", "(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Float;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Float;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Ljava/util/List;)Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", "getIndicatorPosition", "Lcom/whoop/design/util/TextResource;", "getTargetZonesTitle", "Ljava/util/List;", "getTargetZones", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityRecommendationTargetZones {
    private final Float indicatorPosition;
    private final List<WorkoutRecommendationZone> targetZones;
    private final TextResource targetZonesTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21179y0(22))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityRecommendationTargetZones$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivityRecommendationTargetZones(int i13, Float f13, TextResource textResource, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ActivityRecommendationTargetZones$$serializer.INSTANCE.getDescriptor());
        }
        this.indicatorPosition = f13;
        this.targetZonesTitle = textResource;
        this.targetZones = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WorkoutRecommendationZone$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityRecommendationTargetZones copy$default(ActivityRecommendationTargetZones activityRecommendationTargetZones, Float f13, TextResource textResource, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = activityRecommendationTargetZones.indicatorPosition;
        }
        if ((i13 & 2) != 0) {
            textResource = activityRecommendationTargetZones.targetZonesTitle;
        }
        if ((i13 & 4) != 0) {
            list = activityRecommendationTargetZones.targetZones;
        }
        return activityRecommendationTargetZones.copy(f13, textResource, list);
    }

    public static final /* synthetic */ void write$Self$bot_release(ActivityRecommendationTargetZones self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.indicatorPosition);
        output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.targetZonesTitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.targetZones);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getIndicatorPosition() {
        return this.indicatorPosition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTargetZonesTitle() {
        return this.targetZonesTitle;
    }

    public final List<WorkoutRecommendationZone> component3() {
        return this.targetZones;
    }

    public final ActivityRecommendationTargetZones copy(Float indicatorPosition, TextResource targetZonesTitle, List<WorkoutRecommendationZone> targetZones) {
        AbstractC22676k.m65750j(targetZonesTitle, "targetZonesTitle");
        AbstractC22676k.m65750j(targetZones, "targetZones");
        return new ActivityRecommendationTargetZones(indicatorPosition, targetZonesTitle, targetZones);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityRecommendationTargetZones)) {
            return false;
        }
        ActivityRecommendationTargetZones activityRecommendationTargetZones = (ActivityRecommendationTargetZones) other;
        return AbstractC22676k.m65745e(this.indicatorPosition, activityRecommendationTargetZones.indicatorPosition) && AbstractC22676k.m65745e(this.targetZonesTitle, activityRecommendationTargetZones.targetZonesTitle) && AbstractC22676k.m65745e(this.targetZones, activityRecommendationTargetZones.targetZones);
    }

    public final Float getIndicatorPosition() {
        return this.indicatorPosition;
    }

    public final List<WorkoutRecommendationZone> getTargetZones() {
        return this.targetZones;
    }

    public final TextResource getTargetZonesTitle() {
        return this.targetZonesTitle;
    }

    public int hashCode() {
        Float f13 = this.indicatorPosition;
        return this.targetZones.hashCode() + AbstractC31061c.m95625a((f13 == null ? 0 : f13.hashCode()) * 31, this.targetZonesTitle, 31);
    }

    public String toString() {
        Float f13 = this.indicatorPosition;
        TextResource textResource = this.targetZonesTitle;
        List<WorkoutRecommendationZone> list = this.targetZones;
        StringBuilder sb4 = new StringBuilder("ActivityRecommendationTargetZones(indicatorPosition=");
        sb4.append(f13);
        sb4.append(", targetZonesTitle=");
        sb4.append(textResource);
        sb4.append(", targetZones=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public ActivityRecommendationTargetZones(Float f13, TextResource targetZonesTitle, List<WorkoutRecommendationZone> targetZones) {
        AbstractC22676k.m65750j(targetZonesTitle, "targetZonesTitle");
        AbstractC22676k.m65750j(targetZones, "targetZones");
        this.indicatorPosition = f13;
        this.targetZonesTitle = targetZonesTitle;
        this.targetZones = targetZones;
    }
}
