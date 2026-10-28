package com.whoop.trackactivity.domain.models;

import com.whoop.hrZones.network.ZoneID;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0004H\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"toSessionTargets", "Lcom/whoop/trackactivity/domain/models/SessionTargets;", "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;", "BFF_HR_ZONE_PREFIX", "", "BFF_HR_ZONE_DURATION_UNIT", "toZoneIDOrNull", "Lcom/whoop/hrZones/network/ZoneID;", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SessionTargetsKt {
    private static final String BFF_HR_ZONE_DURATION_UNIT = "SECONDS";
    private static final String BFF_HR_ZONE_PREFIX = "HR_";

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public static final SessionTargets toSessionTargets(LiveActivityTargetsResponse liveActivityTargetsResponse) {
        Float fValueOf;
        Long lValueOf;
        Double targetValue;
        List<LiveActivityHrzZone> zones;
        C23465k c23465k;
        ZoneID zoneIDOrNull;
        Double targetValue2;
        Double targetValue3;
        Double targetValue4;
        AbstractC22676k.m65750j(liveActivityTargetsResponse, "<this>");
        LiveActivityTargetSection strainTarget = liveActivityTargetsResponse.getStrainTarget();
        if (strainTarget == null || (targetValue4 = strainTarget.getTargetValue()) == null) {
            fValueOf = null;
        } else {
            fValueOf = Float.valueOf((float) targetValue4.doubleValue());
            if (fValueOf.floatValue() <= 0.0f) {
                fValueOf = null;
            }
        }
        LiveActivityTargetSection durationTarget = liveActivityTargetsResponse.getDurationTarget();
        if (durationTarget == null) {
            lValueOf = null;
        } else {
            if (!AbstractC39421y.m125921F(durationTarget.getUnit(), BFF_HR_ZONE_DURATION_UNIT, true)) {
                durationTarget = null;
            }
            if (durationTarget == null || (targetValue3 = durationTarget.getTargetValue()) == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf((long) targetValue3.doubleValue());
                if (lValueOf.longValue() <= 0) {
                    lValueOf = null;
                }
            }
        }
        LiveActivityTargetSection distanceTarget = liveActivityTargetsResponse.getDistanceTarget();
        if (distanceTarget == null || (targetValue = distanceTarget.getTargetValue()) == null || targetValue.doubleValue() <= 0.0d) {
            targetValue = null;
        }
        LiveActivityHrzTargetSection hrzTarget = liveActivityTargetsResponse.getHrzTarget();
        if (hrzTarget == null) {
            zones = null;
        } else {
            if (hrzTarget.getUnit() != null && !AbstractC39421y.m125921F(hrzTarget.getUnit(), BFF_HR_ZONE_DURATION_UNIT, true)) {
                hrzTarget = null;
            }
            if (hrzTarget != null) {
                zones = hrzTarget.getZones();
            } else {
                zones = null;
            }
        }
        if (zones == null) {
            zones = C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        for (LiveActivityHrzZone liveActivityHrzZone : zones) {
            String zone = liveActivityHrzZone.getZone();
            if (zone == null || (zoneIDOrNull = toZoneIDOrNull(zone)) == null || (targetValue2 = liveActivityHrzZone.getTargetValue()) == null) {
                c23465k = null;
            } else {
                Long lValueOf2 = Long.valueOf((long) targetValue2.doubleValue());
                if (lValueOf2.longValue() <= 0) {
                    lValueOf2 = null;
                }
                if (lValueOf2 != null) {
                    c23465k = new C23465k(zoneIDOrNull, Duration.ofSeconds(lValueOf2.longValue()));
                } else {
                    c23465k = null;
                }
            }
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return new SessionTargets(fValueOf, lValueOf, targetValue, AbstractC25247g0.m74000i0(arrayList));
    }

    private static final ZoneID toZoneIDOrNull(String str) {
        Object next;
        Iterator<E> it = ZoneID.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC22676k.m65745e(((ZoneID) next).name(), AbstractC39414r.m125898q0(str, BFF_HR_ZONE_PREFIX))) {
                return (ZoneID) next;
            }
        }
        next = null;
        return (ZoneID) next;
    }
}
