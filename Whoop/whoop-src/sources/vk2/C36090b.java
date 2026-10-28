package vk2;

import com.whoop.activitysession.PauseSegment;
import com.whoop.hrZones.network.ZoneID;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import mk2.AbstractC25646m;
import mk2.C25637d;
import mk2.C25638e;
import mk2.C25639f;
import mk2.C25642i;
import mk2.C25645l;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wk2.C37341b;
import wk2.C37345f;
import wk2.C37350k;
import xk2.C38440f;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: vk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\"\b\u0082\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJz\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b/\u00108R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\b9\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\b3\u0010@R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, m65681d2 = {"Lvk2/b;", "", "", "sessionStartTimeMs", "sessionStartElapsedMs", "", "activityInternalName", "", "Lcom/whoop/activitysession/PauseSegment;", "pauseSegments", "Lmk2/e;", "heartRate", "Lwk2/b;", "averageHeartRate", "Lwk2/k;", "zoneAccumulation", "Lxk2/f;", "strainAccumulation", "Lwk2/f;", "gpsRouteAccumulation", "", "gpsTrackingEnabled", "<init>", "(JJLjava/lang/String;Ljava/util/List;Lmk2/e;Lwk2/b;Lwk2/k;Lxk2/f;Lwk2/f;Z)V", "nowElapsedMs", "i", "(J)J", "Lmk2/l;", "j", "(J)Lmk2/l;", "a", "(JJLjava/lang/String;Ljava/util/List;Lmk2/e;Lwk2/b;Lwk2/k;Lxk2/f;Lwk2/f;Z)Lvk2/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getSessionStartTimeMs", "()J", "b", "getSessionStartElapsedMs", "c", "Ljava/lang/String;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lmk2/e;", "getHeartRate", "()Lmk2/e;", "Lwk2/b;", "()Lwk2/b;", "g", "Lwk2/k;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lwk2/k;", "Lxk2/f;", "()Lxk2/f;", "Lwk2/f;", "()Lwk2/f;", "Z", "getGpsTrackingEnabled", "()Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C36090b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long sessionStartTimeMs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long sessionStartElapsedMs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String activityInternalName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<PauseSegment> pauseSegments;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C25638e heartRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C37341b averageHeartRate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C37350k zoneAccumulation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C38440f strainAccumulation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C37345f gpsRouteAccumulation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean gpsTrackingEnabled;

    public C36090b(long j7, long j13, String activityInternalName, List<PauseSegment> pauseSegments, C25638e heartRate, C37341b averageHeartRate, C37350k zoneAccumulation, C38440f strainAccumulation, C37345f gpsRouteAccumulation, boolean z4) {
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(pauseSegments, "pauseSegments");
        AbstractC22676k.m65750j(heartRate, "heartRate");
        AbstractC22676k.m65750j(averageHeartRate, "averageHeartRate");
        AbstractC22676k.m65750j(zoneAccumulation, "zoneAccumulation");
        AbstractC22676k.m65750j(strainAccumulation, "strainAccumulation");
        AbstractC22676k.m65750j(gpsRouteAccumulation, "gpsRouteAccumulation");
        this.sessionStartTimeMs = j7;
        this.sessionStartElapsedMs = j13;
        this.activityInternalName = activityInternalName;
        this.pauseSegments = pauseSegments;
        this.heartRate = heartRate;
        this.averageHeartRate = averageHeartRate;
        this.zoneAccumulation = zoneAccumulation;
        this.strainAccumulation = strainAccumulation;
        this.gpsRouteAccumulation = gpsRouteAccumulation;
        this.gpsTrackingEnabled = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36090b m114627b(C36090b c36090b, long j7, long j13, String str, List list, C25638e c25638e, C37341b c37341b, C37350k c37350k, C38440f c38440f, C37345f c37345f, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = c36090b.sessionStartTimeMs;
        }
        return c36090b.m114628a(j7, (i13 & 2) != 0 ? c36090b.sessionStartElapsedMs : j13, (i13 & 4) != 0 ? c36090b.activityInternalName : str, (i13 & 8) != 0 ? c36090b.pauseSegments : list, (i13 & 16) != 0 ? c36090b.heartRate : c25638e, (i13 & 32) != 0 ? c36090b.averageHeartRate : c37341b, (i13 & 64) != 0 ? c36090b.zoneAccumulation : c37350k, (i13 & 128) != 0 ? c36090b.strainAccumulation : c38440f, (i13 & 256) != 0 ? c36090b.gpsRouteAccumulation : c37345f, (i13 & 512) != 0 ? c36090b.gpsTrackingEnabled : z4);
    }

    /* JADX INFO: renamed from: a */
    public final C36090b m114628a(long sessionStartTimeMs, long sessionStartElapsedMs, String activityInternalName, List<PauseSegment> pauseSegments, C25638e heartRate, C37341b averageHeartRate, C37350k zoneAccumulation, C38440f strainAccumulation, C37345f gpsRouteAccumulation, boolean gpsTrackingEnabled) {
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(pauseSegments, "pauseSegments");
        AbstractC22676k.m65750j(heartRate, "heartRate");
        AbstractC22676k.m65750j(averageHeartRate, "averageHeartRate");
        AbstractC22676k.m65750j(zoneAccumulation, "zoneAccumulation");
        AbstractC22676k.m65750j(strainAccumulation, "strainAccumulation");
        AbstractC22676k.m65750j(gpsRouteAccumulation, "gpsRouteAccumulation");
        return new C36090b(sessionStartTimeMs, sessionStartElapsedMs, activityInternalName, pauseSegments, heartRate, averageHeartRate, zoneAccumulation, strainAccumulation, gpsRouteAccumulation, gpsTrackingEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityInternalName() {
        return this.activityInternalName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C37341b getAverageHeartRate() {
        return this.averageHeartRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C37345f getGpsRouteAccumulation() {
        return this.gpsRouteAccumulation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36090b)) {
            return false;
        }
        C36090b c36090b = (C36090b) other;
        return this.sessionStartTimeMs == c36090b.sessionStartTimeMs && this.sessionStartElapsedMs == c36090b.sessionStartElapsedMs && AbstractC22676k.m65745e(this.activityInternalName, c36090b.activityInternalName) && AbstractC22676k.m65745e(this.pauseSegments, c36090b.pauseSegments) && AbstractC22676k.m65745e(this.heartRate, c36090b.heartRate) && AbstractC22676k.m65745e(this.averageHeartRate, c36090b.averageHeartRate) && AbstractC22676k.m65745e(this.zoneAccumulation, c36090b.zoneAccumulation) && AbstractC22676k.m65745e(this.strainAccumulation, c36090b.strainAccumulation) && AbstractC22676k.m65745e(this.gpsRouteAccumulation, c36090b.gpsRouteAccumulation) && this.gpsTrackingEnabled == c36090b.gpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: f */
    public final List<PauseSegment> m114632f() {
        return this.pauseSegments;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C38440f getStrainAccumulation() {
        return this.strainAccumulation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C37350k getZoneAccumulation() {
        return this.zoneAccumulation;
    }

    public int hashCode() {
        return Boolean.hashCode(this.gpsTrackingEnabled) + ((this.gpsRouteAccumulation.hashCode() + ((this.strainAccumulation.hashCode() + ((this.zoneAccumulation.hashCode() + ((this.averageHeartRate.hashCode() + ((this.heartRate.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30451e(Long.hashCode(this.sessionStartTimeMs) * 31, this.sessionStartElapsedMs, 31), 31, this.activityInternalName), 31, this.pauseSegments)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final long m114635i(long nowElapsedMs) {
        return nowElapsedMs - this.sessionStartElapsedMs;
    }

    /* JADX INFO: renamed from: j */
    public final C25645l m114636j(long nowElapsedMs) {
        C25642i strain = this.strainAccumulation.getStrain();
        C25638e c25638e = this.heartRate;
        Map<ZoneID, Duration> mapM119604c = this.zoneAccumulation.m119604c();
        C25637d c25637dM75463a = AbstractC25646m.m75463a(this.pauseSegments, m114635i(nowElapsedMs));
        C25639f c25639fM119590f = this.gpsRouteAccumulation.m119590f();
        if (!this.gpsTrackingEnabled) {
            c25639fM119590f = null;
        }
        return new C25645l(strain, c25638e, mapM119604c, c25637dM75463a, c25639fM119590f);
    }

    public String toString() {
        long j7 = this.sessionStartTimeMs;
        long j13 = this.sessionStartElapsedMs;
        String str = this.activityInternalName;
        List<PauseSegment> list = this.pauseSegments;
        C25638e c25638e = this.heartRate;
        C37341b c37341b = this.averageHeartRate;
        C37350k c37350k = this.zoneAccumulation;
        C38440f c38440f = this.strainAccumulation;
        C37345f c37345f = this.gpsRouteAccumulation;
        boolean z4 = this.gpsTrackingEnabled;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "SessionProgress(sessionStartTimeMs=", ", sessionStartElapsedMs=");
        sbM125596b.append(j13);
        sbM125596b.append(", activityInternalName=");
        sbM125596b.append(str);
        sbM125596b.append(", pauseSegments=");
        sbM125596b.append(list);
        sbM125596b.append(", heartRate=");
        sbM125596b.append(c25638e);
        sbM125596b.append(", averageHeartRate=");
        sbM125596b.append(c37341b);
        sbM125596b.append(", zoneAccumulation=");
        sbM125596b.append(c37350k);
        sbM125596b.append(", strainAccumulation=");
        sbM125596b.append(c38440f);
        sbM125596b.append(", gpsRouteAccumulation=");
        sbM125596b.append(c37345f);
        sbM125596b.append(", gpsTrackingEnabled=");
        sbM125596b.append(z4);
        sbM125596b.append(")");
        return sbM125596b.toString();
    }

    public /* synthetic */ C36090b(long j7, long j13, String str, List list, C25638e c25638e, C37341b c37341b, C37350k c37350k, C38440f c38440f, C37345f c37345f, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j13, str, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? new C25638e(null, null, 3, null) : c25638e, (i13 & 32) != 0 ? new C37341b(0L, 0, 3, null) : c37341b, (i13 & 64) != 0 ? new C37350k(null, null, null, 7, null) : c37350k, (i13 & 128) != 0 ? new C38440f(null, null, null, null, 15, null) : c38440f, (i13 & 256) != 0 ? new C37345f(null, null, 0.0d, null, 15, null) : c37345f, (i13 & 512) != 0 ? false : z4);
    }
}
