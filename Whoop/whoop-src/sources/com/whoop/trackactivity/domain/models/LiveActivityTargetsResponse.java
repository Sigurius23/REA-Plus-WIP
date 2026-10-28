package com.whoop.trackactivity.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;", "", "", "activityType", "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;", "durationTarget", "strainTarget", "distanceTarget", "Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;", "hrzTarget", "<init>", "(Ljava/lang/String;Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$track_activity_release", "(Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;", "component3", "component4", "component5", "()Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;", "copy", "(Ljava/lang/String;Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;)Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivityType", "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;", "getDurationTarget", "getStrainTarget", "getDistanceTarget", "Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;", "getHrzTarget", "Companion", "$serializer", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LiveActivityTargetsResponse {
    private final String activityType;
    private final LiveActivityTargetSection distanceTarget;
    private final LiveActivityTargetSection durationTarget;
    private final LiveActivityHrzTargetSection hrzTarget;
    private final LiveActivityTargetSection strainTarget;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;", "serializer", "()Lwc3/c;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LiveActivityTargetsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LiveActivityTargetsResponse() {
        this((String) null, (LiveActivityTargetSection) null, (LiveActivityTargetSection) null, (LiveActivityTargetSection) null, (LiveActivityHrzTargetSection) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LiveActivityTargetsResponse copy$default(LiveActivityTargetsResponse liveActivityTargetsResponse, String str, LiveActivityTargetSection liveActivityTargetSection, LiveActivityTargetSection liveActivityTargetSection2, LiveActivityTargetSection liveActivityTargetSection3, LiveActivityHrzTargetSection liveActivityHrzTargetSection, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = liveActivityTargetsResponse.activityType;
        }
        if ((i13 & 2) != 0) {
            liveActivityTargetSection = liveActivityTargetsResponse.durationTarget;
        }
        if ((i13 & 4) != 0) {
            liveActivityTargetSection2 = liveActivityTargetsResponse.strainTarget;
        }
        if ((i13 & 8) != 0) {
            liveActivityTargetSection3 = liveActivityTargetsResponse.distanceTarget;
        }
        if ((i13 & 16) != 0) {
            liveActivityHrzTargetSection = liveActivityTargetsResponse.hrzTarget;
        }
        LiveActivityHrzTargetSection liveActivityHrzTargetSection2 = liveActivityHrzTargetSection;
        LiveActivityTargetSection liveActivityTargetSection4 = liveActivityTargetSection2;
        return liveActivityTargetsResponse.copy(str, liveActivityTargetSection, liveActivityTargetSection4, liveActivityTargetSection3, liveActivityHrzTargetSection2);
    }

    public static final /* synthetic */ void write$Self$track_activity_release(LiveActivityTargetsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.activityType != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.activityType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.durationTarget != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, LiveActivityTargetSection$$serializer.INSTANCE, self.durationTarget);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.strainTarget != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LiveActivityTargetSection$$serializer.INSTANCE, self.strainTarget);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.distanceTarget != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, LiveActivityTargetSection$$serializer.INSTANCE, self.distanceTarget);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.hrzTarget == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, LiveActivityHrzTargetSection$$serializer.INSTANCE, self.hrzTarget);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LiveActivityTargetSection getDurationTarget() {
        return this.durationTarget;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LiveActivityTargetSection getStrainTarget() {
        return this.strainTarget;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LiveActivityTargetSection getDistanceTarget() {
        return this.distanceTarget;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LiveActivityHrzTargetSection getHrzTarget() {
        return this.hrzTarget;
    }

    public final LiveActivityTargetsResponse copy(String activityType, LiveActivityTargetSection durationTarget, LiveActivityTargetSection strainTarget, LiveActivityTargetSection distanceTarget, LiveActivityHrzTargetSection hrzTarget) {
        return new LiveActivityTargetsResponse(activityType, durationTarget, strainTarget, distanceTarget, hrzTarget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveActivityTargetsResponse)) {
            return false;
        }
        LiveActivityTargetsResponse liveActivityTargetsResponse = (LiveActivityTargetsResponse) other;
        return AbstractC22676k.m65745e(this.activityType, liveActivityTargetsResponse.activityType) && AbstractC22676k.m65745e(this.durationTarget, liveActivityTargetsResponse.durationTarget) && AbstractC22676k.m65745e(this.strainTarget, liveActivityTargetsResponse.strainTarget) && AbstractC22676k.m65745e(this.distanceTarget, liveActivityTargetsResponse.distanceTarget) && AbstractC22676k.m65745e(this.hrzTarget, liveActivityTargetsResponse.hrzTarget);
    }

    public final String getActivityType() {
        return this.activityType;
    }

    public final LiveActivityTargetSection getDistanceTarget() {
        return this.distanceTarget;
    }

    public final LiveActivityTargetSection getDurationTarget() {
        return this.durationTarget;
    }

    public final LiveActivityHrzTargetSection getHrzTarget() {
        return this.hrzTarget;
    }

    public final LiveActivityTargetSection getStrainTarget() {
        return this.strainTarget;
    }

    public int hashCode() {
        String str = this.activityType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LiveActivityTargetSection liveActivityTargetSection = this.durationTarget;
        int iHashCode2 = (iHashCode + (liveActivityTargetSection == null ? 0 : liveActivityTargetSection.hashCode())) * 31;
        LiveActivityTargetSection liveActivityTargetSection2 = this.strainTarget;
        int iHashCode3 = (iHashCode2 + (liveActivityTargetSection2 == null ? 0 : liveActivityTargetSection2.hashCode())) * 31;
        LiveActivityTargetSection liveActivityTargetSection3 = this.distanceTarget;
        int iHashCode4 = (iHashCode3 + (liveActivityTargetSection3 == null ? 0 : liveActivityTargetSection3.hashCode())) * 31;
        LiveActivityHrzTargetSection liveActivityHrzTargetSection = this.hrzTarget;
        return iHashCode4 + (liveActivityHrzTargetSection != null ? liveActivityHrzTargetSection.hashCode() : 0);
    }

    public String toString() {
        return "LiveActivityTargetsResponse(activityType=" + this.activityType + ", durationTarget=" + this.durationTarget + ", strainTarget=" + this.strainTarget + ", distanceTarget=" + this.distanceTarget + ", hrzTarget=" + this.hrzTarget + ")";
    }

    public /* synthetic */ LiveActivityTargetsResponse(int i13, String str, LiveActivityTargetSection liveActivityTargetSection, LiveActivityTargetSection liveActivityTargetSection2, LiveActivityTargetSection liveActivityTargetSection3, LiveActivityHrzTargetSection liveActivityHrzTargetSection, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.activityType = null;
        } else {
            this.activityType = str;
        }
        if ((i13 & 2) == 0) {
            this.durationTarget = null;
        } else {
            this.durationTarget = liveActivityTargetSection;
        }
        if ((i13 & 4) == 0) {
            this.strainTarget = null;
        } else {
            this.strainTarget = liveActivityTargetSection2;
        }
        if ((i13 & 8) == 0) {
            this.distanceTarget = null;
        } else {
            this.distanceTarget = liveActivityTargetSection3;
        }
        if ((i13 & 16) == 0) {
            this.hrzTarget = null;
        } else {
            this.hrzTarget = liveActivityHrzTargetSection;
        }
    }

    public LiveActivityTargetsResponse(String str, LiveActivityTargetSection liveActivityTargetSection, LiveActivityTargetSection liveActivityTargetSection2, LiveActivityTargetSection liveActivityTargetSection3, LiveActivityHrzTargetSection liveActivityHrzTargetSection) {
        this.activityType = str;
        this.durationTarget = liveActivityTargetSection;
        this.strainTarget = liveActivityTargetSection2;
        this.distanceTarget = liveActivityTargetSection3;
        this.hrzTarget = liveActivityHrzTargetSection;
    }

    public /* synthetic */ LiveActivityTargetsResponse(String str, LiveActivityTargetSection liveActivityTargetSection, LiveActivityTargetSection liveActivityTargetSection2, LiveActivityTargetSection liveActivityTargetSection3, LiveActivityHrzTargetSection liveActivityHrzTargetSection, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : liveActivityTargetSection, (i13 & 4) != 0 ? null : liveActivityTargetSection2, (i13 & 8) != 0 ? null : liveActivityTargetSection3, (i13 & 16) != 0 ? null : liveActivityHrzTargetSection);
    }
}
