package com.whoop.trackactivity.domain.models;

import com.whoop.hrZones.network.ZoneID;
import java.time.Duration;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003JH\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/models/SessionTargets;", "", "strain", "", "durationSeconds", "", "distanceMeters", "", "hrZoneTargets", "", "Lcom/whoop/hrZones/network/ZoneID;", "Ljava/time/Duration;", "<init>", "(Ljava/lang/Float;Ljava/lang/Long;Ljava/lang/Double;Ljava/util/Map;)V", "getStrain", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getDurationSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDistanceMeters", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHrZoneTargets", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Float;Ljava/lang/Long;Ljava/lang/Double;Ljava/util/Map;)Lcom/whoop/trackactivity/domain/models/SessionTargets;", "equals", "", "other", "hashCode", "", "toString", "", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SessionTargets {
    public static final int $stable = 8;
    private final Double distanceMeters;
    private final Long durationSeconds;
    private final Map<ZoneID, Duration> hrZoneTargets;
    private final Float strain;

    public SessionTargets() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionTargets copy$default(SessionTargets sessionTargets, Float f13, Long l7, Double d3, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = sessionTargets.strain;
        }
        if ((i13 & 2) != 0) {
            l7 = sessionTargets.durationSeconds;
        }
        if ((i13 & 4) != 0) {
            d3 = sessionTargets.distanceMeters;
        }
        if ((i13 & 8) != 0) {
            map = sessionTargets.hrZoneTargets;
        }
        return sessionTargets.copy(f13, l7, d3, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getStrain() {
        return this.strain;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getDistanceMeters() {
        return this.distanceMeters;
    }

    public final Map<ZoneID, Duration> component4() {
        return this.hrZoneTargets;
    }

    public final SessionTargets copy(Float strain, Long durationSeconds, Double distanceMeters, Map<ZoneID, Duration> hrZoneTargets) {
        AbstractC22676k.m65750j(hrZoneTargets, "hrZoneTargets");
        return new SessionTargets(strain, durationSeconds, distanceMeters, hrZoneTargets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionTargets)) {
            return false;
        }
        SessionTargets sessionTargets = (SessionTargets) other;
        return AbstractC22676k.m65745e(this.strain, sessionTargets.strain) && AbstractC22676k.m65745e(this.durationSeconds, sessionTargets.durationSeconds) && AbstractC22676k.m65745e(this.distanceMeters, sessionTargets.distanceMeters) && AbstractC22676k.m65745e(this.hrZoneTargets, sessionTargets.hrZoneTargets);
    }

    public final Double getDistanceMeters() {
        return this.distanceMeters;
    }

    public final Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public final Map<ZoneID, Duration> getHrZoneTargets() {
        return this.hrZoneTargets;
    }

    public final Float getStrain() {
        return this.strain;
    }

    public int hashCode() {
        Float f13 = this.strain;
        int iHashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        Long l7 = this.durationSeconds;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        Double d3 = this.distanceMeters;
        return this.hrZoneTargets.hashCode() + ((iHashCode2 + (d3 != null ? d3.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "SessionTargets(strain=" + this.strain + ", durationSeconds=" + this.durationSeconds + ", distanceMeters=" + this.distanceMeters + ", hrZoneTargets=" + this.hrZoneTargets + ")";
    }

    public SessionTargets(Float f13, Long l7, Double d3, Map<ZoneID, Duration> hrZoneTargets) {
        AbstractC22676k.m65750j(hrZoneTargets, "hrZoneTargets");
        this.strain = f13;
        this.durationSeconds = l7;
        this.distanceMeters = d3;
        this.hrZoneTargets = hrZoneTargets;
    }

    public /* synthetic */ SessionTargets(Float f13, Long l7, Double d3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : f13, (i13 & 2) != 0 ? null : l7, (i13 & 4) != 0 ? null : d3, (i13 & 8) != 0 ? C25272z.f99163w : map);
    }
}
